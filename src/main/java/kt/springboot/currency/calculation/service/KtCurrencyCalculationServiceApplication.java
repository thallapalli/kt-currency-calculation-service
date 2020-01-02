package kt.springboot.currency.calculation.service;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.Bean;

import brave.sampler.Sampler;


@SpringBootApplication
@EnableFeignClients("kt.springboot.currency.calculation.service")
@EnableDiscoveryClient
public class KtCurrencyCalculationServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(KtCurrencyCalculationServiceApplication.class, args);
	}
	@Bean
	public Sampler defalutSample() {
		return Sampler.ALWAYS_SAMPLE;
	}
	
}
