package com.elfz.transactional.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity(name = "employeeHealthInsurance")
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Data
public class EmployeeHealthInsurance {


  @Id
  @Column(name="empId")
  private String empId;

  @Column(name="healthInsuranceSchemeName")
  private String healthInsuranceSchemeName;

  @Column(name="coverageAmount")
  private int coverageAmount;

}
