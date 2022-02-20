/* (C) 2022 */
package com.bank.atm.controller;

import static com.bank.atm.utils.ApiUtil.isValidURL;
import static org.springframework.util.StringUtils.hasLength;

import com.bank.atm.exception.ServiceException;
import com.bank.atm.service.AtmService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/atms")
public class AtmController {
	
	
	private final AtmService atmService;

	  @Autowired
	  public AtmController(AtmService atmService) {
	    this.atmService = atmService;
	  }
	
	@GetMapping()
	  @ResponseStatus(HttpStatus.OK)
	  public Object getAtm(@RequestParam String url,@RequestParam String identification ) {
		
		if(!hasLength(url) || !isValidURL(url)) {
			throw new ServiceException("Provided url is not a valid URL",HttpStatus.BAD_REQUEST);
		}
		else if(!hasLength(identification) ) {
			throw new ServiceException("Invalid identification provided",HttpStatus.BAD_REQUEST);
		}
			 return atmService.getAtm(url, identification);
	   
	  }

}
