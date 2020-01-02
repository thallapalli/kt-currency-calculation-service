package kt.springboot.currency.calculation.service.proxy;

import org.springframework.cloud.netflix.ribbon.RibbonClient;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import kt.springboot.currency.calculation.service.bean.CurrencyCalculation;

//@FeignClient(name="currency-exchange-service",url="localhost:8000")
@FeignClient(name="currency-exchange-service")
@RibbonClient(name="currency-exchange-service")
public interface CurrencyExchangeServiceProxy {
	///currency-exchnage/from/{from}/to/{to}
	@GetMapping("/currency-exchnage/from/{from}/to/{to}")
	public CurrencyCalculation retrieveExchangeValue(@PathVariable String  from ,@PathVariable String to);
}
