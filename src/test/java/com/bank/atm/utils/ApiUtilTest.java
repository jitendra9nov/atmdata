/* (C) 2022 */
package com.bank.atm.utils;

import static com.bank.atm.utils.ApiUtil.writeValueAsString;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.fail;

import com.bank.atm.model.Atm;
import org.junit.jupiter.api.Test;

class ApiUtilTest {

	
	@Test
	  void testWriteValueAsString_Failure() {
	    assertNotNull(writeValueAsString(null, false), "Unable to serialising");
	  }
	
	@Test
	  void testWriteValueAsString_Success() {
		 final Atm atm = new Atm();
		 atm.setIdentification("LFFFAC11");
		    assertNotNull(writeValueAsString(atm, false), "Unable to deserialising");
	  }
	
	@Test
	  void testIsValidURL_Success() {
	    assertTrue(ApiUtil.isValidURL("https://api.lloydsbank.com/open-banking/v2.2/atms"));
	  }
	
	@Test
	  void testIsValidURL_Failure() {
		assertFalse(ApiUtil.isValidURL("something"));
	  }

}
