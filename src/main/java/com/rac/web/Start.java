package com.rac.web;

import org.springframework.boot.SpringApplication;

import com.rac.web.config.AppConfig;

public class Start {

	/**
	 * @param args
	 */
	public static void main(final String[] args) {
		SpringApplication.run(AppConfig.class, args);

		// final TaskService taskService = context.getBean(TaskService.class);
		//
		// final List<Task> tasks = taskService.getTasks();
		// System.err.println(tasks.size());
	}

}
