package com.rent.configlocal.rentcar;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer
public class ConfiglocalApplication {

	public static void main(String[] args) {
		SpringApplication.run(ConfiglocalApplication.class, args);
	}

}
