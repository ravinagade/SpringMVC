package com.springmvcproject.spmvcprj.controller;

import com.springmvcproject.spmvcprj.model.Employee;
import com.springmvcproject.spmvcprj.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@Controller
public class MyController {

    @Autowired
    private EmployeeRepository employeeRepository;

    @GetMapping("/index")
    public String check(Model model){
        model.addAttribute("employee",new Employee());
        return "index";
    }

    @PostMapping("/saveEmployee")
    public String saveEmployee(@ModelAttribute Employee employee){
        employeeRepository.save(employee);
        return "Welcome";
    }
}
