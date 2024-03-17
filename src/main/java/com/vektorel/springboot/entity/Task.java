package com.vektorel.springboot.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="tasks")
public class Task {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	private String title;
	private String description;
	private Boolean complate;
	
	public Task() {
		}
	
	public void setComplate(Boolean complate) {
		this.complate = complate;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public Boolean getComplate() {
		return complate;
	}
	public String getDescription() {
		return description;
	}
	public String getTitle() {
		return title;
	}
	public Integer getId() {
		return id;
	}

}
