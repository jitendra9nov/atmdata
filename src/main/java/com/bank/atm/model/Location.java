/* s (C)2022 */
package com.bank.atm.model;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonInclude(Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class Location {
	
	@JsonProperty("LocationCategory") 
	private List<String> locationCategory;
    @JsonProperty("OtherLocationCategory") 
    private List<OtherDetails> otherLocationCategory;
    @JsonProperty("Site") 
    private Site site;
    @JsonProperty("PostalAddress") 
    private PostalAddress postalAddress;
	/**
	 * @return the locationCategory
	 */
	public List<String> getLocationCategory() {
		return locationCategory;
	}
	/**
	 * @return the otherLocationCategory
	 */
	public List<OtherDetails> getOtherLocationCategory() {
		return otherLocationCategory;
	}
	/**
	 * @return the site
	 */
	public Site getSite() {
		return site;
	}
	/**
	 * @return the postalAddress
	 */
	public PostalAddress getPostalAddress() {
		return postalAddress;
	}
	/**
	 * @param locationCategory the locationCategory to set
	 */
	public void setLocationCategory(List<String> locationCategory) {
		this.locationCategory = locationCategory;
	}
	/**
	 * @param otherLocationCategory the otherLocationCategory to set
	 */
	public void setOtherLocationCategory(List<OtherDetails> otherLocationCategory) {
		this.otherLocationCategory = otherLocationCategory;
	}
	/**
	 * @param site the site to set
	 */
	public void setSite(Site site) {
		this.site = site;
	}
	/**
	 * @param postalAddress the postalAddress to set
	 */
	public void setPostalAddress(PostalAddress postalAddress) {
		this.postalAddress = postalAddress;
	}
	
	

}
