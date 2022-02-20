/* (C) 2022 */
package com.bank.atm.service;

import static java.util.stream.Stream.of;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;

import com.bank.atm.model.Atm;
import com.bank.atm.model.Brand;
import com.bank.atm.model.Data;
import com.bank.atm.model.OpenBankingResponse;
import com.bank.atm.utils.WebClientUtil;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.reactive.function.client.WebClient;

@ExtendWith(MockitoExtension.class)
class AtmServiceImplTest {

	@InjectMocks
	AtmServiceImpl atmService;

	@Mock
	WebClientUtil webClientUtil;

	@Mock
	WebClient webClient;
	
	

	@Test
	@DisplayName("When one Atm is requested then only requested atm shall be returned")
	void testGetAtm() {
		
		OpenBankingResponse ob=new OpenBankingResponse();
		Atm a=new Atm();
		a.setIdentification("LFFFAC11");
		Brand b=new Brand();
		b.setAtm(of(a).toList());
		Data d=new Data();
		d.setBrand(of(b).toList());
		ob.setData(of(d).toList());

		Mockito.when(webClientUtil.callForResponse("https://api.lloydsbank.com/open-banking/v2.2/atms",
				OpenBankingResponse.class)).thenReturn(new ResponseEntity<OpenBankingResponse>(ob, HttpStatus.OK));
		
		Atm atm = atmService.getAtm("https://api.lloydsbank.com/open-banking/v2.2/atms", "LFFFAC11");
		
		 assertThat(atm.getIdentification(), equalTo("LFFFAC11"));

	}

}
