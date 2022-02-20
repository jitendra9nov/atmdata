/* (C) 2022 */
package com.bank.atm.controller;

import static org.hamcrest.Matchers.equalTo;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import com.bank.atm.service.AtmService;
import com.bank.atm.utils.WebClientUtil;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.web.reactive.function.client.WebClient;


@ExtendWith(SpringExtension.class)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.DEFINED_PORT)
@AutoConfigureMockMvc
class AtmControllerTest {
	
	@Autowired
	private MockMvc mockMvc;
	

	@Autowired
	AtmService atmService;
	
	@Autowired
	WebClientUtil webClientUtil;
	
	@Autowired
	WebClient webClient;

	@Test
	@DisplayName("When one Atm is requested then only requested atm shall be returned")
	void RequestedAtmById() throws Exception {
		mockMvc.perform(get("/atms/?url=https://api.lloydsbank.com/open-banking/v2.2/atms&identification=LFFFAC11"))
		.andExpect(status().is2xxSuccessful())
				.andExpect(jsonPath("Identification", equalTo("LFFFAC11")));
	}

}
