/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package employeetest;

/**
 *
 * @author palic
 */
public class Manager extends Employee {

    private String username;
    private String password;

    // Constructor
    public Manager(String name, String email, String username, String password) {
        super(name, email); // the Employee constructor
        this.username = username;
        this.password = password;
    }

    // Username getter
    public String getUsername() {
        return username;
    }

    // Password getter
    public String getPassword() {
        return password;
    }

    // Username setter
    public void setUsername(String username) {
        this.username = username;
    }

    // Password setter
    public void setPassword(String password) {
        this.password = password;
    }
}
