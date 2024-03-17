package com.vektorel.springboot.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.vektorel.springboot.entity.Task;
import com.vektorel.springboot.repository.TaskRepository;

@Service
public class TaskService {
	@Autowired
	private TaskRepository taskRepository;
	
	public List<Task> allTaskList(){
		 return taskRepository.findAll();
	}

}
