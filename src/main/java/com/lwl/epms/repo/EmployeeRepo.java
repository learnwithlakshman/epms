package com.lwl.epms.repo;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.heraizen.ems.domain.Employee;

public interface EmployeeRepo extends MongoRepository<Employee,String>{

}
