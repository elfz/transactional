package com.elfz.transactional.service;

import com.elfz.transactional.entity.Employee;
import com.elfz.transactional.repository.EmployeeRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

@RequiredArgsConstructor
@Service
@Log4j2
public class EmployeeService {

  private final EmployeeRepository employeeRepository;

  @Transactional
  public void insertEmployee(final Employee employee) {
    log.info("insertEmployee started");
    employeeRepository.save(employee);
  }
}
