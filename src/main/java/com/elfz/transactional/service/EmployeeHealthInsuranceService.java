package com.elfz.transactional.service;

import com.elfz.transactional.entity.EmployeeHealthInsurance;
import com.elfz.transactional.repository.EmployeeHealthInsuranceRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor
@Service
public class EmployeeHealthInsuranceService {

  private final EmployeeHealthInsuranceRepository employeeHealthInsuranceRepository;

  public void registerEmployeeHealthInsurance(final EmployeeHealthInsurance employeeHealthInsurance)
      throws InvalidInsuranceAmountException {
    if(employeeHealthInsurance.getCoverageAmount() < 0){
      throw new InvalidInsuranceAmountException("Coverage Amount Should not be negative");
    }
    employeeHealthInsuranceRepository.save(employeeHealthInsurance);
  }
}
