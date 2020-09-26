package kz.iitu.jd3.pizzaratings;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class PizzaRatingsApplication {

	public static void main(String[] args) {
		SpringApplication.run(PizzaRatingsApplication.class, args);
	}

}
