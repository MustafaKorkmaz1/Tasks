package com.vektorel.springboot.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.vektorel.springboot.entity.Task;
import com.vektorel.springboot.service.TaskService;

@RestController
@RequestMapping("/task")
public class TaskController {
	@Autowired
	private TaskService taskService;
	
	
	@GetMapping("/all")
	public ResponseEntity<List<Task>> getAll(){
		List<Task> tasks=taskService.allTaskList();
		return new ResponseEntity<>(tasks,HttpStatus.OK);
		
	}

}
