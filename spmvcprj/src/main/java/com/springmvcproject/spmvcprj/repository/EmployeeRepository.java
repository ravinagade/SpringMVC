package com.springmvcproject.spmvcprj.repository;

import com.springmvcproject.spmvcprj.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employee,Integer> {

}
