package com.rac.web.dao;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.rac.web.config.DAOConfig;
import com.rac.web.service.TaskService;

@SpringApplicationConfiguration(classes = DAOConfig.class)
@RunWith(SpringJUnit4ClassRunner.class)
public class TaskTest {

	@Autowired
	private TaskService taskService;

	@Test
	public void getTasks() {
		System.err.println(taskService.getTasks().size());
	}

	@Test
	public void deleteAllTasks() {
		// taskService.deleteAllTasks();
		System.err.println(taskService.getTasks().size());
	}

}
