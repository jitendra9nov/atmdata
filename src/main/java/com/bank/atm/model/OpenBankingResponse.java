/* s (C)2022 */
package com.bank.atm.model;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

@JsonInclude(Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class OpenBankingResponse {
	
	
	private Meta meta;
	
	private List<Data> data;

	/**
	 * @return the meta
	 */
	public Meta getMeta() {
		return meta;
	}

	/**
	 * @return the data
	 */
	public List<Data> getData() {
		return data;
	}

	/**
	 * @param meta the meta to set
	 */
	public void setMeta(Meta meta) {
		this.meta = meta;
	}

	/**
	 * @param data the data to set
	 */
	public void setData(List<Data> data) {
		this.data = data;
	}

    
    
    
	
    
    
    

}
