package com.proyecto.apigateway.msapigateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class MsApigatewayApplication {

	public static void main(String[] args) {
		SpringApplication.run(MsApigatewayApplication.class, args);
	}

}
