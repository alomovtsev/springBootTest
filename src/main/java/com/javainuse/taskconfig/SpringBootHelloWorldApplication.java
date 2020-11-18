package com.javainuse.taskconfig;

import org.springframework.boot.Banner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringBootHelloWorldApplication {

	public static void main(String[] args) {

	    SpringApplication app = new SpringApplication(SpringBootHelloWorldApplication.class, args);
	    app.setBannerMode(Banner.Mode.OFF);
	    app.run(args);
	    
		//SpringApplication.run( new Object[] { SpringBootHelloWorldApplication.class }, args);
	}
}