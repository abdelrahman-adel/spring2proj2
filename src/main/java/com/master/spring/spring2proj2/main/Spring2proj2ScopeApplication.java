package com.master.spring.spring2proj2.main;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;

import com.master.spring.spring2proj2.scope.PersonDAO;

@ComponentScan(basePackages = { "com.master.spring.spring2proj1.scope" })
@SpringBootApplication
public class Spring2proj2ScopeApplication {

	private static Logger LOGGER = LoggerFactory.getLogger(Spring2proj2ScopeApplication.class);

	public static void main(String[] args) {
		ApplicationContext applicationContext = SpringApplication.run(Spring2proj2ScopeApplication.class, args);

		PersonDAO personDao1 = applicationContext.getBean(PersonDAO.class);
		PersonDAO personDao2 = applicationContext.getBean(PersonDAO.class);

		LOGGER.info("{}", personDao1);
		LOGGER.info("{}", personDao1.getJdbcConnection());

		LOGGER.info("{}", personDao2);
		LOGGER.info("{}", personDao2.getJdbcConnection());
		LOGGER.info("{}", personDao2.getJdbcConnection());
		LOGGER.info("{}", personDao2.getJdbcConnection());
	}

}
