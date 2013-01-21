
package com.maneeshsri.sample.spring3.model;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import org.codehaus.jackson.annotate.JsonIgnoreProperties;
import org.codehaus.jackson.annotate.JsonProperty;

/**
 * @author maneeshkumar
 *
 */
@JsonIgnoreProperties(ignoreUnknown = true) //must be there all times most likely
public class Weather {
	
	private static final int SIZE_ZIP = 5;
	
	@NotNull
	@Size(max=SIZE_ZIP, min=SIZE_ZIP)
	@JsonProperty
	private int zip;
	
	@JsonProperty
	private float tempF;
	
	@JsonProperty
	private String city;
	
	@JsonProperty
	private String state;

	/**
	 * @return the zipCode
	 */
	public int getZip() {
		return zip;
	}

	/**
	 * @param zipCode the zipCode to set
	 */
	public void setZip(int zip) {
		this.zip = zip;
	}

	/**
	 * @return the temparature
	 */
	public float getTempF() {
		return tempF;
	}

	/**
	 * @param temparature the temparature to set
	 */
	public void setTemF(float tempF) {
		this.tempF = tempF;
	}

	/**
	 * @return the city
	 */
	public String getCity() {
		return city;
	}

	/**
	 * @param city the city to set
	 */
	public void setCity(String city) {
		this.city = city;
	}

	/**
	 * @return the state
	 */
	public String getState() {
		return state;
	}

	/**
	 * @param state the state to set
	 */
	public void setState(String state) {
		this.state = state;
	}

}
