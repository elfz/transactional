package com.elfz.transactional;

import com.elfz.transactional.entity.Employee;
import com.elfz.transactional.entity.EmployeeHealthInsurance;
import com.elfz.transactional.service.OrganizationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class TransactionalApplication implements CommandLineRunner {

  @Autowired
  private OrganizationService organizationService;

  public static void main(String[] args) {
    SpringApplication.run(TransactionalApplication.class, args);
  }

  @Override
  public void run(String... args) throws Exception {
    var employee = Employee.builder()
        .empId("emp1")
        .empName("emp1")
        .build();

    var employeeHealthInsurance = EmployeeHealthInsurance.builder()
        .empId("emp1")
        .healthInsuranceSchemeName("premium")
        .coverageAmount(20000)
        .build();

    this.organizationService.joinOrganization(employee, employeeHealthInsurance);

  }
}
