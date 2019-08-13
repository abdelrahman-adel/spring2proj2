package com.master.spring.spring2proj2.main;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;

import com.master.spring.spring2proj2.componentscan.ComponentDAO;

@ComponentScan(basePackages = { "com.master.spring.spring2proj1.componentscan" })
@SpringBootApplication
public class Spring2proj2ComponentScanApplication {

	private static Logger LOGGER = LoggerFactory.getLogger(Spring2proj2ComponentScanApplication.class);

	public static void main(String[] args) {
		ApplicationContext applicationContext = SpringApplication.run(Spring2proj2ComponentScanApplication.class, args);

		ComponentDAO componentDAO1 = applicationContext.getBean(ComponentDAO.class);
		LOGGER.info("{}", componentDAO1);
	}

}
