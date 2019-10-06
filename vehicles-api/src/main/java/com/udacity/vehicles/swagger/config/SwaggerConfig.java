package com.udacity.vehicles.swagger.config;

import java.util.Collections;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;



@Configuration
@EnableSwagger2
public class SwaggerConfig {
	
	@Bean
	public Docket api()
	{
		return new Docket(DocumentationType.SWAGGER_2)
				.select()
				.apis(RequestHandlerSelectors.any())
				.paths(PathSelectors.any())
				.build()
				.useDefaultResponseMessages(false);
	}
	
	//this below function gives info about swagger in the responses
	private ApiInfo appInfo()
	{
		return new ApiInfo("Vehicle APIs", "APIs to return info about the cars",
				"1.0", "http://www.udacity.com/tos", new Contact("SN", 
						"www.udacity.com", "snudacity.com"), "Liscense of API",
				"http://www.udacity.com/license", Collections.emptyList());
	}

}
