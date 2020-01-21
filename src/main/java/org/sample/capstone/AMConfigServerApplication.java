package org.sample.capstone;

import org.springframework.boot.SpringApplication;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;
@EnableConfigServer
@SpringBootApplication
public class AMConfigServerApplication {
	public static void main(String[] args) {
		SpringApplication.run(AMConfigServerApplication.class, args);
	}
}
