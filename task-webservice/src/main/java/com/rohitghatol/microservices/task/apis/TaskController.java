package com.rohitghatol.microservices.task.apis;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.rohitghatol.microservices.task.dtos.TaskDTO;

@RestController
@RequestMapping("/task")
public class TaskController {

	private List<TaskDTO> tasks = new ArrayList<TaskDTO>();

	@RequestMapping(method = RequestMethod.GET, headers = "Accept=application/json")
	public List<TaskDTO> getTasks() {
		tasks = new ArrayList<TaskDTO>();
		tasks.add(new TaskDTO("task", "description"));
		return tasks;
	}

	@RequestMapping(value = "{taskId}", method = RequestMethod.GET, headers = "Accept=application/json")
	public TaskDTO getUserByUserName(@PathVariable("taskId") String taskId) {
		return new TaskDTO("task", "description");
	}
}
