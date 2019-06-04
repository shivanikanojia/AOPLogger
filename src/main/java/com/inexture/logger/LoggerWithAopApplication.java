package com.inexture.logger;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;

import com.inexture.logger.aopConfig.AopConfig;

@SpringBootApplication
public class LoggerWithAopApplication {

	public static void main(String[] args) {
		final SpringApplicationBuilder springApplicationBuilder = new SpringApplicationBuilder();
		
		springApplicationBuilder.sources(AopConfig.class);
//	    springApplicationBuilder.showBanner(true);
	    springApplicationBuilder.logStartupInfo(true);
	    springApplicationBuilder.run(args);
//		SpringApplication.run(LoggerWithAopApplication.class, args);
	}

}
