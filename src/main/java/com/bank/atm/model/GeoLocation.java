/* s (C)2022 */
package com.bank.atm.model;


import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonInclude(Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class GeoLocation {
	
	   @JsonProperty("GeographicCoordinates") 
	   private GeographicCoordinates geographicCoordinates;

	/**
	 * @return the geographicCoordinates
	 */
	public GeographicCoordinates getGeographicCoordinates() {
		return geographicCoordinates;
	}

	/**
	 * @param geographicCoordinates the geographicCoordinates to set
	 */
	public void setGeographicCoordinates(GeographicCoordinates geographicCoordinates) {
		this.geographicCoordinates = geographicCoordinates;
	}
	   
	   



}
