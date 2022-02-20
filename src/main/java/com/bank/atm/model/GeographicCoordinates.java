/* s (C)2022 */
package com.bank.atm.model;


import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonInclude(Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class GeographicCoordinates {
	
	 @JsonProperty("Latitude") 
	 private String latitude;
	    @JsonProperty("Longitude") 
	    private String longitude;
		/**
		 * @return the latitude
		 */
		public String getLatitude() {
			return latitude;
		}
		/**
		 * @return the longitude
		 */
		public String getLongitude() {
			return longitude;
		}
		/**
		 * @param latitude the latitude to set
		 */
		public void setLatitude(String latitude) {
			this.latitude = latitude;
		}
		/**
		 * @param longitude the longitude to set
		 */
		public void setLongitude(String longitude) {
			this.longitude = longitude;
		}
	    
	    

}
