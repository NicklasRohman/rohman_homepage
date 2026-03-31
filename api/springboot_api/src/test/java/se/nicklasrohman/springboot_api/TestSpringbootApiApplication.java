package se.nicklasrohman.springboot_api;

import org.springframework.boot.SpringApplication;

public class TestSpringbootApiApplication {

	public static void main(String[] args) {
		SpringApplication.from(SpringbootApiApplication::main).with(TestcontainersConfiguration.class).run(args);
	}

}
