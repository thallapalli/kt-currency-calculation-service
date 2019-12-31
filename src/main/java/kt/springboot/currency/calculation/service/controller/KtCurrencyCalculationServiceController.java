package kt.springboot.currency.calculation.service.controller;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Map;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import kt.springboot.currency.calculation.service.bean.CurrencyCalculation;

@RestController
public class KtCurrencyCalculationServiceController {
	//currency-calculation/from{from}/to/{to}/quantity/{quantity}
	@GetMapping("/currency-calculation/from/{from}/to/{to}/quantity/{quantity}")
	public CurrencyCalculation convertCurrency(@PathVariable String from ,@PathVariable String to,@PathVariable BigDecimal quantity ) {
		Map<String,String> uriVariables =new HashMap<String,String>();
		uriVariables.put("from",from);
		uriVariables.put("to",to);
		
		ResponseEntity<CurrencyCalculation> response = new RestTemplate().getForEntity("http://localhost:8000/currency-exchnage/from/{from}/to/{to}", CurrencyCalculation.class,uriVariables);
		CurrencyCalculation currencyCalculation = response.getBody();
		return new CurrencyCalculation(currencyCalculation.getId(),from ,to,currencyCalculation.getConversionMultiple() ,quantity ,quantity.multiply(currencyCalculation.getConversionMultiple()),0);
	}

}
