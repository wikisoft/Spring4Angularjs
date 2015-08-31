package com.rac.web.dao;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.rac.web.domain.Task;

public interface TaskDAO extends CrudRepository<Task, Long> {

	public List<Task> findAllByOrderByTitleAsc();

}
