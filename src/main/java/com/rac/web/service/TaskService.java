package com.rac.web.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import com.google.common.collect.Lists;
import com.rac.web.dao.TaskDAO;
import com.rac.web.domain.Task;

@Service
public class TaskService {

	@Autowired
	private TaskDAO taskDAO;

	public List<Task> getTasks() {
		return Lists.newArrayList(taskDAO.findAll());
	}

	public List<Task> findAllOrderByTitleAsc() {
		return Lists.newArrayList(taskDAO.findAllByOrderByTitleAsc());
	}

	private Sort sortByIdAsc() {
		return new Sort(Sort.Direction.ASC, "id");
	}

	public Task getTask(final long id) {
		return taskDAO.findOne(id);
	}

	public void save(final Task task) {
		taskDAO.save(task);
	}

	public void deleteAllTasks() {
		taskDAO.deleteAll();
	}

	public void deleteTask(final Task task) {
		taskDAO.delete(task);
	}

}
