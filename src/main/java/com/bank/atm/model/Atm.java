/* s (C)2022 */
package com.bank.atm.model;

import java.util.List;


import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonInclude(Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class Atm {

	
	@JsonProperty("Identification") 
	private String identification;
    @JsonProperty("SupportedLanguages") 
    private List<String> supportedLanguages;
    @JsonProperty("ATMServices") 
    private List<String> aTMServices;
    @JsonProperty("Accessibility") 
    private List<String> accessibility;
    @JsonProperty("Access24HoursIndicator") 
    private boolean access24HoursIndicator;
    @JsonProperty("SupportedCurrencies") 
    private List<String> supportedCurrencies;
    @JsonProperty("MinimumPossibleAmount") 
    private String minimumPossibleAmount;
    @JsonProperty("Note") 
    private List<String> note;
    @JsonProperty("OtherAccessibility") 
    private List<OtherDetails> otherAccessibility;
    @JsonProperty("OtherATMServices") 
    private List<OtherDetails> otherATMServices;
    @JsonProperty("Branch") 
    private Branch branch;
    @JsonProperty("Location") 
    private Location location;
    
    
	/**
	 * @return the identification
	 */
	public String getIdentification() {
		return identification;
	}
	/**
	 * @return the supportedLanguages
	 */
	public List<String> getSupportedLanguages() {
		return supportedLanguages;
	}
	/**
	 * @return the aTMServices
	 */
	public List<String> getaTMServices() {
		return aTMServices;
	}
	/**
	 * @return the accessibility
	 */
	public List<String> getAccessibility() {
		return accessibility;
	}
	/**
	 * @return the access24HoursIndicator
	 */
	public boolean isAccess24HoursIndicator() {
		return access24HoursIndicator;
	}
	/**
	 * @return the supportedCurrencies
	 */
	public List<String> getSupportedCurrencies() {
		return supportedCurrencies;
	}
	/**
	 * @return the minimumPossibleAmount
	 */
	public String getMinimumPossibleAmount() {
		return minimumPossibleAmount;
	}
	/**
	 * @return the note
	 */
	public List<String> getNote() {
		return note;
	}
	/**
	 * @return the otherAccessibility
	 */
	public List<OtherDetails> getOtherAccessibility() {
		return otherAccessibility;
	}
	/**
	 * @return the otherATMServices
	 */
	public List<OtherDetails> getOtherATMServices() {
		return otherATMServices;
	}
	/**
	 * @return the branch
	 */
	public Branch getBranch() {
		return branch;
	}
	/**
	 * @return the location
	 */
	public Location getLocation() {
		return location;
	}
	/**
	 * @param identification the identification to set
	 */
	public void setIdentification(String identification) {
		this.identification = identification;
	}
	/**
	 * @param supportedLanguages the supportedLanguages to set
	 */
	public void setSupportedLanguages(List<String> supportedLanguages) {
		this.supportedLanguages = supportedLanguages;
	}
	/**
	 * @param aTMServices the aTMServices to set
	 */
	public void setaTMServices(List<String> aTMServices) {
		this.aTMServices = aTMServices;
	}
	/**
	 * @param accessibility the accessibility to set
	 */
	public void setAccessibility(List<String> accessibility) {
		this.accessibility = accessibility;
	}
	/**
	 * @param access24HoursIndicator the access24HoursIndicator to set
	 */
	public void setAccess24HoursIndicator(boolean access24HoursIndicator) {
		this.access24HoursIndicator = access24HoursIndicator;
	}
	/**
	 * @param supportedCurrencies the supportedCurrencies to set
	 */
	public void setSupportedCurrencies(List<String> supportedCurrencies) {
		this.supportedCurrencies = supportedCurrencies;
	}
	/**
	 * @param minimumPossibleAmount the minimumPossibleAmount to set
	 */
	public void setMinimumPossibleAmount(String minimumPossibleAmount) {
		this.minimumPossibleAmount = minimumPossibleAmount;
	}
	/**
	 * @param note the note to set
	 */
	public void setNote(List<String> note) {
		this.note = note;
	}
	/**
	 * @param otherAccessibility the otherAccessibility to set
	 */
	public void setOtherAccessibility(List<OtherDetails> otherAccessibility) {
		this.otherAccessibility = otherAccessibility;
	}
	/**
	 * @param otherATMServices the otherATMServices to set
	 */
	public void setOtherATMServices(List<OtherDetails> otherATMServices) {
		this.otherATMServices = otherATMServices;
	}
	/**
	 * @param branch the branch to set
	 */
	public void setBranch(Branch branch) {
		this.branch = branch;
	}
	/**
	 * @param location the location to set
	 */
	public void setLocation(Location location) {
		this.location = location;
	}
    
    
    
    
}
