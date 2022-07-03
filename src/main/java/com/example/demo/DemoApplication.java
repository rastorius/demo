package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		for(String arg : args) {
			System.out.println(arg);
		}

		if(args.length > 0 && args[0].equals("run")) {
			System.out.println("CLI run");
		} else {
			System.out.println("REST run");
			SpringApplication.run(DemoApplication.class, args);
		}
	}

}
