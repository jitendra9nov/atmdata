/* s (C)2022 */
package com.bank.atm.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.reactive.function.client.ExchangeStrategies;
import org.springframework.web.reactive.function.client.WebClient;

@Configuration
public class AppConfig {

	@Bean
	public WebClient webClient() {
		return WebClient.builder()
				.exchangeStrategies(
						ExchangeStrategies.builder().codecs(c -> c.defaultCodecs().maxInMemorySize(-1)).build())
				.build();
	}

}
