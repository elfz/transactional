package com.elfz.transactional.service;

import com.elfz.transactional.entity.Employee;
import com.elfz.transactional.entity.EmployeeHealthInsurance;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class OrganizationService {

  private final EmployeeService employeeService;
  private final EmployeeHealthInsuranceService employeeHealthInsuranceService;

  public void joinOrganization(final Employee employee, final EmployeeHealthInsurance employeeHealthInsurance) {
    employeeService.insertEmployee(employee);
    employeeHealthInsuranceService.registerEmployeeHealthInsurance(employeeHealthInsurance);
  }
}
