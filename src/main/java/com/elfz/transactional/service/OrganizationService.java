package com.elfz.transactional.service;

import com.elfz.transactional.entity.Employee;
import com.elfz.transactional.entity.EmployeeHealthInsurance;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j;
import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

@Service
@RequiredArgsConstructor
@Log4j2
public class OrganizationService {

  private final EmployeeService employeeService;
  private final EmployeeHealthInsuranceService employeeHealthInsuranceService;

  @Transactional(propagation = Propagation.REQUIRED, rollbackFor = InvalidInsuranceAmountException.class)
  public void joinOrganization(final Employee employee, final EmployeeHealthInsurance employeeHealthInsurance)
      throws InvalidInsuranceAmountException {
    log.info("joinOrganization started");
    employeeService.insertEmployee(employee);
    if (employee.getEmpId().equals("emp2")) {
      throw new RuntimeException("thowing exception to test transaction rollback");
    }
    try {
      employeeHealthInsuranceService.registerEmployeeHealthInsurance(employeeHealthInsurance);
    } catch (InvalidInsuranceAmountException e) {
      throw new InvalidInsuranceAmountException("Exception is thrown");
    }
  }
}
