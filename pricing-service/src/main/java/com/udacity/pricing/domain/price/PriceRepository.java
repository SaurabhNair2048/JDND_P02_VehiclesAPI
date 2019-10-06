package com.udacity.pricing.domain.price;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Map;
import java.util.concurrent.ThreadLocalRandom;
import java.util.stream.Collectors;
import java.util.stream.LongStream;

//import org.springframework.data.repository.CrudRepository;
//import org.springframework.data.rest.core.annotation.RepositoryRestResource;
//import org.springframework.data.rest.core.annotation.RestResource;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.RequestParam;

import com.udacity.pricing.service.PriceException;

//@RepositoryRestResource
public class PriceRepository/* extends CrudRepository<Price, Long>*/{
	
	/*static final Map<Long, Price> PRICES = LongStream
            .range(1, 20)
            .mapToObj(i -> new Price("USD", randomPrice(), i))
            .collect(Collectors.toMap(Price::getVehicleId, p -> p));
	
	static BigDecimal randomPrice() {
        return new BigDecimal(ThreadLocalRandom.current().nextDouble(1, 5))
                .multiply(new BigDecimal(5000d)).setScale(2, RoundingMode.HALF_UP);
    }
	
	@RestResource(path="price", rel="price", exported=true)
	public static Price getPrice(Long vehicleId) throws PriceException {

        if (!PRICES.containsKey(vehicleId)) {
            throw new PriceException("Cannot find price for Vehicle " + vehicleId);
        }
        System.out.println("The price method was called!");
        
        return PRICES.get(vehicleId);
    }*/
	//Price findByVehicleId(@RequestParam Long vehicleId);

}
