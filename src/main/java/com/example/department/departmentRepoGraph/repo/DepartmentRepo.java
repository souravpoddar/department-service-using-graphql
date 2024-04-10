package com.example.department.departmentRepoGraph.repo;

import java.util.Optional;
import java.util.UUID;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.stereotype.Repository;

import com.example.department.departmentRepoGraph.model.Department;

@Repository
public interface DepartmentRepo extends MongoRepository<Department, UUID>{

	@Query("{ 'departmentName' : ?0 }")
	Optional<Department> findByTheDepartmentName(String name);
}
