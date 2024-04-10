package com.example.department.departmentRepoGraph.controller;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.MutationMapping;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.stereotype.Controller;

import com.example.department.departmentRepoGraph.model.Department;
import com.example.department.departmentRepoGraph.service.DepartmentService;

@Controller
public class DepartmentController {
	
	@Autowired
	private DepartmentService service;
	
	@QueryMapping
	public List<Department> findAll(){
		return service.findAll();
	}
	
	@QueryMapping
	public Optional<Department> findOne(@Argument String departmentName){
		return service.findOne(departmentName);
	}
	
	@QueryMapping
	public Optional<Department> findById(@Argument UUID id){
		return service.findById(id);
	}
	
	@MutationMapping
	public Department create(@Argument Department department) {
		return service.createDepartment(department);
	}
}
