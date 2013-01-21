/**
 * 
 */
package com.maneeshsri.sample.spring3.service;

import com.maneeshsri.sample.spring3.model.Weather;

/**
 * @author maneeshkumar
 *
 */
public interface OurService {
	
	Weather getWeatherData(int zipCode);
    
}
