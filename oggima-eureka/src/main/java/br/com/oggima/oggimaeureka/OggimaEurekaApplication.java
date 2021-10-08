package br.com.oggima.oggimaeureka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class OggimaEurekaApplication {

	public static void main(String[] args) {
		SpringApplication.run(OggimaEurekaApplication.class, args);
	}

}
