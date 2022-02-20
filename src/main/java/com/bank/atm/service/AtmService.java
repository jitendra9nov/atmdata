package com.bank.atm.service;

import com.bank.atm.model.Atm;

/**
 * @author jitendrabhadouriya
 *
 */
public interface AtmService {

	Atm getAtm(String url, String identification );
}
