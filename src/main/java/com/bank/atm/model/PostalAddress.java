/* s (C)2022 */
package com.bank.atm.model;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonInclude(Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class PostalAddress {
	
	@JsonProperty("AddressLine") 
	private List<String> addressLine;
    @JsonProperty("BuildingNumber") 
    private String buildingNumber;
    @JsonProperty("StreetName") 
    private String streetName;
    @JsonProperty("TownName") 
    private String townName;
    @JsonProperty("CountrySubDivision") 
    private List<String> countrySubDivision;
    @JsonProperty("Country") 
    private String country;
    @JsonProperty("PostCode") 
    private String postCode;
    @JsonProperty("GeoLocation") 
    private GeoLocation geoLocation;
	/**
	 * @return the addressLine
	 */
	public List<String> getAddressLine() {
		return addressLine;
	}
	/**
	 * @return the buildingNumber
	 */
	public String getBuildingNumber() {
		return buildingNumber;
	}
	/**
	 * @return the streetName
	 */
	public String getStreetName() {
		return streetName;
	}
	/**
	 * @return the townName
	 */
	public String getTownName() {
		return townName;
	}
	/**
	 * @return the countrySubDivision
	 */
	public List<String> getCountrySubDivision() {
		return countrySubDivision;
	}
	/**
	 * @return the country
	 */
	public String getCountry() {
		return country;
	}
	/**
	 * @return the postCode
	 */
	public String getPostCode() {
		return postCode;
	}
	/**
	 * @return the geoLocation
	 */
	public GeoLocation getGeoLocation() {
		return geoLocation;
	}
	/**
	 * @param addressLine the addressLine to set
	 */
	public void setAddressLine(List<String> addressLine) {
		this.addressLine = addressLine;
	}
	/**
	 * @param buildingNumber the buildingNumber to set
	 */
	public void setBuildingNumber(String buildingNumber) {
		this.buildingNumber = buildingNumber;
	}
	/**
	 * @param streetName the streetName to set
	 */
	public void setStreetName(String streetName) {
		this.streetName = streetName;
	}
	/**
	 * @param townName the townName to set
	 */
	public void setTownName(String townName) {
		this.townName = townName;
	}
	/**
	 * @param countrySubDivision the countrySubDivision to set
	 */
	public void setCountrySubDivision(List<String> countrySubDivision) {
		this.countrySubDivision = countrySubDivision;
	}
	/**
	 * @param country the country to set
	 */
	public void setCountry(String country) {
		this.country = country;
	}
	/**
	 * @param postCode the postCode to set
	 */
	public void setPostCode(String postCode) {
		this.postCode = postCode;
	}
	/**
	 * @param geoLocation the geoLocation to set
	 */
	public void setGeoLocation(GeoLocation geoLocation) {
		this.geoLocation = geoLocation;
	}
    
    
    

}
