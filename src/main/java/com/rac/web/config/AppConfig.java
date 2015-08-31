package com.rac.web.config;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Import;

@EnableAutoConfiguration
@ComponentScan(basePackages = { "com.rac.web" })
@Import({ DAOConfig.class, WebConfig.class })
public class AppConfig {

}
