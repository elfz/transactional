package com.elfz.transactional.service;

import com.elfz.transactional.entity.Employee;
import com.elfz.transactional.repository.EmployeeRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor
@Service
public class EmployeeService {

  private final EmployeeRepository employeeRepository;

  public void insertEmployee(final Employee employee) {
    employeeRepository.save(employee);
  }
}
