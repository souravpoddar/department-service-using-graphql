package com.example.department.departmentRepoGraph.service;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.department.departmentRepoGraph.model.Department;
import com.example.department.departmentRepoGraph.repo.DepartmentRepo;


@Service
public class DepartmentService {
	
	@Autowired
	DepartmentRepo repo;
	
	public List<Department> findAll() {
		return repo.findAll();
	}
	
	public Optional<Department> findOne(String id){
		return repo.findByTheDepartmentName(id);
	}

	public Optional<Department> findById(UUID id){
		return repo.findById(id);
	}

	public Department createDepartment(Department department) {
		repo.save(department);
		return department;
	}
}
