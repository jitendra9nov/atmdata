/* (C) 2022 */
package com.bank.atm.service;

import static org.springframework.http.HttpStatus.NOT_FOUND;

import com.bank.atm.exception.ServiceException;
import com.bank.atm.model.Atm;
import com.bank.atm.model.OpenBankingResponse;
import com.bank.atm.utils.WebClientUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
public class AtmServiceImpl implements AtmService {

	private final WebClientUtil webClientUtil;

	@Autowired
	AtmServiceImpl(WebClientUtil webClientUtil) {
		this.webClientUtil = webClientUtil;
	}

	@Override
	public Atm getAtm(final String url, final String identification) {

		Atm atmD = null;

		ResponseEntity<OpenBankingResponse> resp = webClientUtil.callForResponse(url, OpenBankingResponse.class);

		if (null != resp && resp.getStatusCode().is2xxSuccessful() && null!=resp.getBody()) {
			atmD = resp.getBody().getData().stream().flatMap(data -> data.getBrand().stream())
					.flatMap(brand -> brand.getAtm().stream())
					.filter(atm -> identification.equalsIgnoreCase(atm.getIdentification())).findAny().orElse(atmD);
		}
		if(null==atmD) {
			throw new ServiceException(String.format("Could not find Atm with identification %s", identification),NOT_FOUND);
		}

		return atmD;
	}

}
