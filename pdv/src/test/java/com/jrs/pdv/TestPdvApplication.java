package com.jrs.pdv;

import org.springframework.boot.SpringApplication;

public class TestPdvApplication {

	public static void main(String[] args) {
		SpringApplication.from(PdvApplication::main).with(TestcontainersConfiguration.class).run(args);
	}

}
