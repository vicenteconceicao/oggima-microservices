package br.com.oggima.oggimaconfig;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer
public class OggimaConfigApplication {

	public static void main(String[] args) {
		SpringApplication.run(OggimaConfigApplication.class, args);
	}

}
