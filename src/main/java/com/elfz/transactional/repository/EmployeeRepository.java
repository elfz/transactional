package com.elfz.transactional.repository;

import com.elfz.transactional.entity.Employee;
import org.springframework.data.repository.CrudRepository;

public interface EmployeeRepository extends CrudRepository<Employee, String> { }
