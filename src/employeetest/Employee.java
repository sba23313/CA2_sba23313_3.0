/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package employeetest;

/**
 *
 * @author palic
 */
public class Employee {

    private String name;
    private String email;
    private int empNum;
    private static int nextEmpNum = 1;

    // Constructor with default values
    public Employee() {
        this.name = "Default Name";
        this.email = "default@email.com";
        this.empNum = nextEmpNum++;
    }

    // Constructor with parameters
    public Employee(String name, String email) {
        this.name = name;
        this.email = email;
        this.empNum = nextEmpNum++;
    }

    // Returns
    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public int getEmpNum() {
        return empNum;
    }

    // setEmail with validation
    public void setEmail(String email) {
        if (email.length() > 3) {
            this.email = email;
        }
    }

    // Static method to get nextEmpNum
    public static int getNextEmpNum() {
        return nextEmpNum;
    }
}
