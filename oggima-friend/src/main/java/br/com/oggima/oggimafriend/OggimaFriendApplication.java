package br.com.oggima.oggimafriend;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class OggimaFriendApplication {

	public static void main(String[] args) {
		SpringApplication.run(OggimaFriendApplication.class, args);
	}

}
