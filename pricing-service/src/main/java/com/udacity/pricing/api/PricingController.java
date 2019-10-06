package com.udacity.pricing.api;

import com.udacity.pricing.domain.price.Price;
import com.udacity.pricing.domain.price.PriceRepository;
import com.udacity.pricing.service.PriceException;
import com.udacity.pricing.service.PricingService;

import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.data.rest.webmvc.RepositoryRestController;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.server.ResponseStatusException;

/**
 * Implements a REST-based controller for the pricing service.
 */
//@RepositoryRestController
@RestController
@RequestMapping("/services/price")
public class PricingController {

	
	/*private final PriceRepository priceRepo;
	
	@Autowired
	public PricingController(PriceRepository priceRepo)
	{
		this.priceRepo = priceRepo;
	}
	
	@PostMapping("/save")
	public void save()
	{
		for(Price p : PricingService.getPrices().values())
		{
			this.priceRepo.save(p);
		}
	}*/
	
    /**
     * Gets the price for a requested vehicle.
     * @param vehicleId ID number of the vehicle for which the price is requested
     * @return price of the vehicle, or error that it was not found.
     */
    @GetMapping
    public Price get(@RequestParam Long vehicleId) {
        try {
            return PricingService.getPrice(vehicleId);
        } catch (PriceException ex) {
            throw new ResponseStatusException(
                    HttpStatus.NOT_FOUND, "Price Not Found", ex);
        }

    }
}
