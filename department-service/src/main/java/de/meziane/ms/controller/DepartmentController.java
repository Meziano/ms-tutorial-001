package de.meziane.ms.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import de.meziane.ms.domain.Department;
import de.meziane.ms.repository.DepartmentRepository;

@RestController
public class DepartmentController {
	
	@Autowired
	DepartmentRepository departmentRepository;	
	
	@GetMapping("/departments")
	public List<Department> findAll() {
		List<Department> depts = departmentRepository.findAll();
		return depts;
	}
	
	@GetMapping("/departments/{id}")
	public Department findById(@PathVariable Long id) {
		Department dept = departmentRepository.getOne(id); 
		return dept;
	}
	

}
