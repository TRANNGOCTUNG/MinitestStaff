package controller;

import model.Employee;
import model.EmployeeFullTime;
import model.EmployeePartTime;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class EmployeeManager {
    public List<Employee> employees;
    public EmployeeManager(List<Employee> employees){
        this.employees = employees;
    }
    public EmployeeManager() {
        employees = new ArrayList<>();
    }
    Scanner scanner = new Scanner(System.in);
    int index;
    public void  addEmployee(Employee employee) {
        employees.add(employee);
    }
    public void display(){
        for (Employee employee: employees
             ) {
            System.out.println(employee);
        }
    }
    public void editEmployee(Employee employee){
        System.out.println("Enter index need edit: ");
        index = scanner.nextInt();
        for (int i = 0; i < employees.size(); i++) {
            if(i == index){
                employees.set(i,employee);
            }
        }
    }
    public void removeEmployee(){
        System.out.println("Enter index need remove");
        index = scanner.nextInt();
        for (int i = 0; i < employees.size(); i++) {
            if(i == index){
                employees.remove(i);
            }

        }
    }
    public double averageSalary(){
        double total = 0;
        double averageSalary = 0;
        for (Employee employee: employees
             ) {
            if(employee instanceof EmployeeFullTime){
                total += ((EmployeeFullTime) employee).moneyFullTime();
            }
            if(employee instanceof EmployeePartTime){
                total += ((EmployeePartTime) employee).moneyPartTime();
            }
        }
return averageSalary += total / employees.size();
    }
    public String checkSalaryFullTime() {
        StringBuilder nameEmployeeFullTimes = new StringBuilder();
        for (Employee employee : employees) {
            if (employee instanceof EmployeeFullTime) {
                if (((EmployeeFullTime) employee).moneyFullTime() < averageSalary()) {
                    nameEmployeeFullTimes.append("\t").append(employee.getName()).append("\n");
                }
            }
        } return nameEmployeeFullTimes.toString();
    }
    public double totalSalaryPartTime() {
        double totalSalaryParttime = 0;
        for (Employee employee : employees) {
            if (employee instanceof EmployeePartTime) {
                totalSalaryParttime += ((EmployeePartTime) employee).moneyPartTime();
            }
        }
        return totalSalaryParttime;
    }
    public List<EmployeeFullTime> sortSalary(){
        List<EmployeeFullTime> employeeFullTimes = new ArrayList<>();
        for (Employee staff: employees) {
            if (staff instanceof EmployeeFullTime) {
                employeeFullTimes.add((EmployeeFullTime) staff);
            }
        }
        Collections.sort(employeeFullTimes);
        return employeeFullTimes;
    }

}
