/**
 * 
 */
package com.maneeshsri.sample.spring3.service;

import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.maneeshsri.sample.spring3.model.Weather;

/**
 * @author maneeshkumar
 * 
 */

@Service
public class OurServiceImpl implements OurService {

	private RestTemplate restClient = new RestTemplate();

	private static final String API_KEY = "ed044d75b91fb500";

	private static final String REST_URL = "http://api.wunderground.com/api/"
			+ API_KEY + "/conditions/q/";

	
	public Weather getWeatherData(int zipCode) {

		return restClient.getForObject(REST_URL + zipCode + ".json",
				Weather.class);
	}

}
