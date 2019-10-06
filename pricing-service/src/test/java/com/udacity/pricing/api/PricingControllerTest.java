package com.udacity.pricing.api;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.web.servlet.MockMvc;

import com.udacity.pricing.domain.price.Price;
import com.udacity.pricing.service.PricingService;


import static org.mockito.Mockito.verify;
import static org.mockito.internal.verification.VerificationModeFactory.times;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.hamcrest.core.StringContains;


@RunWith(SpringJUnit4ClassRunner.class)
@WebMvcTest(PricingController.class)
public class PricingControllerTest {
	
	@Autowired
	MockMvc mockMvc;
	
	@MockBean
	PricingService pricingService;
	
	@Test
	public void getVehiclePriceById() throws Exception
	{
		
		String price = pricingService.getPrice(1L).getPrice().toString();
		
		//mockMvc.perform(get("/prices/findByVehicleId?vehicleId=1"))
		mockMvc.perform(get("/services/price?vehicleId=1"))
		.andExpect(status().isOk())
		.andExpect(content().contentType(MediaType.APPLICATION_JSON_UTF8))
		.andExpect(content().string(StringContains.containsString(price)));


	}
	
	

}
