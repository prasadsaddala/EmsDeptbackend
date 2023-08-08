package com.crudems.crudems.Empcontroller;

import static org.mockito.Mockito.*;

import java.sql.Date;

import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;
//import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import com.crudems.crudems.controller.EmployeeController;
import com.crudems.crudems.entity.Department;
import com.crudems.crudems.entity.Employee;
import com.crudems.crudems.service.Employeeservice;

//@RunWith(MockitoJUnitRunner.class)
public class EmployeeTest {

    @InjectMocks
    private EmployeeController employeeController;
    @Mock
    private Employeeservice employeeservice;
    @Before
    public void setUp() {
        MockitoAnnotations.initMocks(this);
    }
    
    // Positive scenario: getEmployeeById(Long id)
    @Test
    public void testGetEmployeeByIdPositive() {
        Department department =new Department();
        Long employeeId = 1L;
        Employee mockEmployee = new Employee();
        mockEmployee.setEmpName("John Doe");
        mockEmployee.setEmpDob(new Date(1999-04-20));
        mockEmployee.setDepartment(department);
        mockEmployee.setSalary(8555000.50);
        mockEmployee.setManagerId(2L);
        mockEmployee.setMobile("7894561230");
        

        when(employeeservice.getEmployeeById(employeeId)).thenReturn(mockEmployee);
        Employee result = employeeController.getEmployeeById(employeeId);
        assertEquals(mockEmployee, result.getId());
        verify(employeeservice, times(1)).getEmployeeById(employeeId);
    }

    // Negative scenario: getEmployeeById(Long id) when employee doesn't exist
    @Test
    public void testGetEmployeeByIdNegative() {
        Long nonExistingEmployeeId = 999L;

        when(employeeservice.getEmployeeById(nonExistingEmployeeId)).thenReturn(null);

        Employee result = employeeController.getEmployeeById(nonExistingEmployeeId);

        assertNull(result);
        verify(employeeservice, times(1)).getEmployeeById(nonExistingEmployeeId);
    }
}


    
