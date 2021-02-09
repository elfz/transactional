package com.elfz.transactional;

import com.elfz.transactional.entity.Employee;
import com.elfz.transactional.entity.EmployeeHealthInsurance;
import com.elfz.transactional.service.EmployeeService;
import com.elfz.transactional.service.OrganizationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class TransactionalApplication implements CommandLineRunner {

  @Autowired
  private OrganizationService organizationService;

  @Autowired
  private EmployeeService employeeService;

  public static void main(String[] args) {
    SpringApplication.run(TransactionalApplication.class, args);
  }

  @Override
  public void run(String... args) throws Exception {

    var emp = "emp1";

    var employee = Employee.builder()
        .empId(emp)
        .empName(emp)
        .build();

    var employeeHealthInsurance = EmployeeHealthInsurance.builder()
        .empId(emp)
        .healthInsuranceSchemeName("premium")
        .coverageAmount(-5)
        .build();

    this.organizationService.joinOrganization(employee, employeeHealthInsurance);
//    this.employeeService.insertEmployee(employee);
  }
}
