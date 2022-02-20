/* s (C)2022 */
package com.bank.atm.model;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonInclude(Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class Brand {
	
	@JsonProperty("BrandName") 
	private String brandName;
	
    @JsonProperty("ATM") 
    private List<Atm> atm;

	/**
	 * @return the brandName
	 */
	public String getBrandName() {
		return brandName;
	}

	/**
	 * @return the atm
	 */
	public List<Atm> getAtm() {
		return atm;
	}

	/**
	 * @param brandName the brandName to set
	 */
	public void setBrandName(String brandName) {
		this.brandName = brandName;
	}

	/**
	 * @param atm the atm to set
	 */
	public void setAtm(List<Atm> atm) {
		this.atm = atm;
	}
    
    
    
    

}
