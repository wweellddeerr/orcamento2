package br.com.mirante.web.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import br.com.mirante.services.TaskDao;
import br.com.mirante.web.model.Task;

@Component("taskBB")
@Scope("request")
public class TaskBackingBean {

		private Task task = new Task();
	private List<Task> tasks;

	@Autowired
	private TaskDao taskDao;

	public Task getTask() {
		return task;
	}

	public void saveTask() {
		taskDao.save(task);
		task = new Task();
		invalidateTasks();
	}

	private void invalidateTasks() {
		tasks = null;
	}

	public List<Task> getTasks() {
		if (tasks == null) {
			tasks = taskDao.list();
		}
		return tasks;
		
	}
}
