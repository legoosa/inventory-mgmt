package org.inventory.mgmt;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
@EnableJpaAuditing
public class RunUserDbService {

	public static void main(String[] args) {
		SpringApplication.run(RunUserDbService.class, args);
	}
}
