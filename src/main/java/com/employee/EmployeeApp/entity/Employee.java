package com.employee.EmployeeApp.entity;

import jakarta.persistence.*;

import java.util.List;

@Entity
public class Employee {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int employeeId;
    String employeeName;
    String employeeCity;

//    One to One mapping with Spouse Entity
    @OneToOne(cascade = {CascadeType.PERSIST,CascadeType.REMOVE})
    @JoinColumn(name = "FK_SPOUSE")/* used to change the name of foreign key for Spouse Entity */
    private Spouse spouse;

    @OneToMany(cascade = {CascadeType.PERSIST,CascadeType.REMOVE})
    private List<Address> addresses;

    @ManyToMany(cascade = {CascadeType.PERSIST,CascadeType.REMOVE})
    @JoinTable(name = "employee_project",
    joinColumns = @JoinColumn(name = "fk_emp"),inverseJoinColumns = @JoinColumn(name = "fk_proj"))
    private List<Project> projects;

    public Employee() {

    }

    public Employee(int employeeId, String employeeName, String employeeCity) {
        this.employeeId = employeeId;
        this.employeeName = employeeName;
        this.employeeCity = employeeCity;
    }
    public List<Project> getProjects() {
        return projects;
    }

    public void setProjects(List<Project> projects) {
        this.projects = projects;
    }

    public List<Address> getAddresses() {
        return addresses;
    }

    public void setAddresses(List<Address> addresses) {
        this.addresses = addresses;
    }

    public int getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    public String getEmployeeCity() {
        return employeeCity;
    }

    public void setEmployeeCity(String employeeCity) {
        this.employeeCity = employeeCity;
    }

    public Spouse getSpouse() {
        return spouse;
    }

    public void setSpouse(Spouse spouse) {
        this.spouse = spouse;
    }

    public void removeProject(Project project){
        this.projects.remove(project);
        project.getEmployees().remove(project);
    }

    public void addProject(Project project){
        this.projects.add(project);
        project.getEmployees().add(this);
    }

}
