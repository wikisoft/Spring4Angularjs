package com.rac.web.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.DispatcherServlet;

@Configuration
public class WebConfig {

	// configuration dispatcherservlet pour les headers CORS
	@Bean
	public DispatcherServlet dispatcherServlet() {
		final DispatcherServlet servlet = new DispatcherServlet();
		servlet.setDispatchOptionsRequest(true);
		return servlet;
	}

}
