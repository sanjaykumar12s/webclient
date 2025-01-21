package com.project2.employee_service.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.*;

import java.math.BigDecimal;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;

@Entity
public class Employee {

    @Id
    private Long employeeId;

    @NotNull(message = "Name cannot be null")
    @Size(min = 2, max = 100, message = "Name should be between 2 and 100 characters")
    private String name;

    @Email(message = "Email should be valid")
    private String email;

    @Pattern(regexp = "^\\+?[0-9]{10,15}$", message = "Phone number should be valid")
    private String phoneNumber;

    private String gender;
    private BigDecimal hourlyRate;
    private int workingHours;
    private List<String> skills;

    private String experience;
    private String availabilityStatus;
    private String salary;

    // New Fields
    @NotNull(message = "Bank Name cannot be null")
    private String bankName;

    @NotNull(message = "PAN Number cannot be null")
    @Pattern(regexp = "^[A-Z]{5}[0-9]{4}[A-Z]{1}$", message = "PAN Number should be valid")
    private String panNumber;

    @NotNull(message = "Bank Account Number cannot be null")
    @Pattern(regexp = "^[0-9]{9,18}$", message = "Bank Account Number should be valid")
    private String bankAccountNumber;

    // Getters and Setters

    public Long getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(Long employeeId) {
        this.employeeId = employeeId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public BigDecimal getHourlyRate() {
        return hourlyRate;
    }

    public void setHourlyRate(BigDecimal hourlyRate) {
        this.hourlyRate = hourlyRate;
    }

    public int getWorkingHours() {
        return workingHours;
    }

    public void setWorkingHours(int workingHours) {
        this.workingHours = workingHours;
    }

    public List<String> getSkills() {
        return skills;
    }

    public void setSkills(List<String> skills) {
        this.skills = skills;
    }

    public String getExperience() {
        return experience;
    }

    public void setExperience(String experience) {
        this.experience = experience;
    }

    public String getAvailabilityStatus() {
        return availabilityStatus;
    }

    public void setAvailabilityStatus(String availabilityStatus) {
        this.availabilityStatus = availabilityStatus;
    }

    public String getSalary() {
        return salary;
    }

    public void setSalary(String salary) {
        this.salary = salary;
    }

    public String getBankName() {
        return bankName;
    }

    public void setBankName(String bankName) {
        this.bankName = bankName;
    }

    public String getPanNumber() {
        return panNumber;
    }

    public void setPanNumber(String panNumber) {
        this.panNumber = panNumber;
    }

    public String getBankAccountNumber() {
        return bankAccountNumber;
    }

    public void setBankAccountNumber(String bankAccountNumber) {
        this.bankAccountNumber = bankAccountNumber;
    }

    // Custom method to generate a five-digit random employeeId
    @PrePersist
    private void generateEmployeeId() {
        this.employeeId = (long) ThreadLocalRandom.current().nextInt(10000, 100000); // Generates a 5-digit random number
    }

    // Constructors

    public Employee(Long employeeId, String name, String email, String phoneNumber, String gender, BigDecimal hourlyRate, int workingHours, List<String> skills, String experience, String availabilityStatus, String salary, String bankName, String panNumber, String bankAccountNumber) {
        this.employeeId = employeeId;
        this.name = name;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.gender = gender;
        this.hourlyRate = hourlyRate;
        this.workingHours = workingHours;
        this.skills = skills;
        this.experience = experience;
        this.availabilityStatus = availabilityStatus;
        this.salary = salary;
        this.bankName = bankName;
        this.panNumber = panNumber;
        this.bankAccountNumber = bankAccountNumber;
    }

    public Employee() {
    }
}
