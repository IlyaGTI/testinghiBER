package com.example.testing.controller;

import com.example.testing.model.Employee;
import com.example.testing.service.EmployeeService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@RestController
@RequestMapping("/empl")
@Api
@Path("/empl")
public class EmployeeController {

    private final EmployeeService employeeService;

    public EmployeeController(EmployeeService employeeService) {
        this.employeeService = employeeService;
    }

    @PostMapping(path = "/cr", produces = MediaType.APPLICATION_JSON)
    @ApiOperation("создание работника")
    @POST()
    public Employee createEmpl(@RequestBody Employee employee) {
        return employeeService.createEmployee(employee);
    }
}
