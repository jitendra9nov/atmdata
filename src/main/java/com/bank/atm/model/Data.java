/* s (C)2022 */
package com.bank.atm.model;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

@JsonInclude(Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class Data {
	
	@JsonProperty("Brand") 
	private List<Brand> brand;

	/**
	 * @return the brand
	 */
	public List<Brand> getBrand() {
		return brand;
	}

	/**
	 * @param brand the brand to set
	 */
	public void setBrand(List<Brand> brand) {
		this.brand = brand;
	}
    
    

}
