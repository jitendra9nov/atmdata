/* s (C)2022 */
package com.bank.atm.model;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonInclude(Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class Meta {
	
	@JsonProperty("LastUpdated") 
	private Date lastUpdated;
	
    @JsonProperty("TotalResults") 
    private int totalResults;
    
    @JsonProperty("Agreement") 
    private String agreement;
    
    @JsonProperty("License") 
    private String license;
    
    @JsonProperty("TermsOfUse") 
    private String termsOfUse;

	/**
	 * @return the lastUpdated
	 */
    private Date getLastUpdated() {
		return lastUpdated;
	}

	/**
	 * @return the totalResults
	 */
	public int getTotalResults() {
		return totalResults;
	}

	/**
	 * @return the agreement
	 */
	public String getAgreement() {
		return agreement;
	}

	/**
	 * @return the license
	 */
	public String getLicense() {
		return license;
	}

	/**
	 * @return the termsOfUse
	 */
	public String getTermsOfUse() {
		return termsOfUse;
	}

	/**
	 * @param lastUpdated the lastUpdated to set
	 */
	public void setLastUpdated(Date lastUpdated) {
		this.lastUpdated = lastUpdated;
	}

	/**
	 * @param totalResults the totalResults to set
	 */
	public void setTotalResults(int totalResults) {
		this.totalResults = totalResults;
	}

	/**
	 * @param agreement the agreement to set
	 */
	public void setAgreement(String agreement) {
		this.agreement = agreement;
	}

	/**
	 * @param license the license to set
	 */
	public void setLicense(String license) {
		this.license = license;
	}

	/**
	 * @param termsOfUse the termsOfUse to set
	 */
	public void setTermsOfUse(String termsOfUse) {
		this.termsOfUse = termsOfUse;
	}
    
    
    

}
