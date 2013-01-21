/**
 * 
 */
package com.maneeshsri.sample.spring3.config;

import org.springframework.context.annotation.Bean;

import com.maneeshsri.sample.spring3.service.OurService;
import com.maneeshsri.sample.spring3.service.OurServiceImpl;

/**
 * @author maneeshkumar
 *
 */
public class OurAppConfig {
	
	@Bean
	OurService ourService(){
		return new OurServiceImpl();
	}

}
