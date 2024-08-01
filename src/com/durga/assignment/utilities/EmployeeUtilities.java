package com.durga.assignment.utilities;

import com.durga.assignment.Employee;

public class EmployeeUtilities {
    public static void increaseSalary(Employee employee, double percentage) {
        double newSalary = employee.getSalary() * (1 + percentage / 100);
        employee.setSalary(newSalary);
    }

    public static void printEmployeeDetails(Employee employee) {
        System.out.println("Employee ID: " + employee.getEmployeeId());
        System.out.println("Name: " + employee.getName());
        System.out.println("Salary: " + employee.getSalary());
    }
}
