package it.netgroup;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class ArticoliwebserviceApplication {

	public static void main(String[] args) {
		SpringApplication.run(ArticoliwebserviceApplication.class, args);
	}

}
