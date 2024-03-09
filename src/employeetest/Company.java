/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package employeetest;

import java.util.ArrayList;
import java.util.Iterator;

/**
 *
 * @author palic
 */
public class Company {

    private String companyName;
    // Create ArrayList objects
    ArrayList<Employee> employees = new ArrayList<>();
    private ArrayList<Employee> staff;

    // Default constructor
    public Company() {
        this.companyName = "";
        this.staff = new ArrayList<>();
    }

    // constructor
    public Company(String companyName) {
        this.companyName = companyName;
        this.staff = new ArrayList<>();
    }

    // Add new employee
    public void addNewStaff(Employee employee) {
        staff.add(employee);
    }

    // Get number of employees
    public int getStaffNumber() {
        return staff.size();
    }

    // List employees with empNum
    public void listEmployees(int empNum) {
        Iterator<Employee> iterator = staff.iterator();
        while (iterator.hasNext()) {
            Employee employee = iterator.next();
            if (employee.getEmpNum() > empNum) {
                System.out.println(employee.getName());
            }
        }
    }
}
