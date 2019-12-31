package kt.springboot.currency.calculation.service.controller;

import java.math.BigDecimal;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import kt.springboot.currency.calculation.service.bean.CurrencyCalculation;

@RestController
public class KtCurrencyCalculationServiceController {
	//currency-calculation/from{from}/to/{to}/quantity/{quantity}
	@GetMapping("/currency-calculation/from/{from}/to/{to}/quantity/{quantity}")
	public CurrencyCalculation convertCurrency(@PathVariable String from ,@PathVariable String to,@PathVariable BigDecimal quantity ) {
		return new CurrencyCalculation(1L,from ,to,BigDecimal.ONE ,quantity ,quantity,0);
	}

}
