package com.vektorel.springboot.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.vektorel.springboot.entity.Task;

public interface TaskRepository extends JpaRepository<Task, Integer>{
 
}
