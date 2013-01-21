/**
 * 
 */
package com.maneeshsri.sample.spring3.web;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.maneeshsri.sample.spring3.model.Weather;
import com.maneeshsri.sample.spring3.service.OurService;

/**
 * @author maneeshkumar
 * 
 */

@Controller
public class OurController {

	private OurService service;

	@RequestMapping(value = "/getData", method = RequestMethod.POST)
	public String getDetails(@Valid Weather data, Model model) {
        service.getWeatherData(data.getZip());
		return "";
	}

	@Autowired
	public void setService(OurService service) {
		this.service = service;
	}

}
