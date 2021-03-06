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

@Entity(name = "employee")
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Employee {

  @Id
  @Column(name="empId")
  private String empId;

  @Column(name="empName")
  private String empName;

}
