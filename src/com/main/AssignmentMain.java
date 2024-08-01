package com.main;

import com.durga.assignment.Developer;
import com.durga.assignment.Manager;
import com.durga.assignment.utilities.EmployeeUtilities;

public class AssignmentMain {
    public static void main(String[] args) {
        Manager manager = new Manager("Alice", 101, 90000, "Engineering");
        Developer developer = new Developer("Bob", 102, 80000, "Java");

        EmployeeUtilities.printEmployeeDetails(manager);
        EmployeeUtilities.printEmployeeDetails(developer);

        System.out.println("\nIncreasing salaries by 10%...\n");

        EmployeeUtilities.increaseSalary(manager, 10);
        EmployeeUtilities.increaseSalary(developer, 10);

        EmployeeUtilities.printEmployeeDetails(manager);
        EmployeeUtilities.printEmployeeDetails(developer);
    }
}
