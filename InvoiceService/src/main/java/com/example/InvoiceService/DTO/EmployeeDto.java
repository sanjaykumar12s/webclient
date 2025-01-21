package com.example.InvoiceService.DTO;

import jakarta.persistence.ElementCollection;

import java.math.BigDecimal;
import java.util.List;

public class EmployeeDto {
    private Long employeeId;
    private String name;
    private String email;
    private String phoneNumber;
    private String gender;
    private BigDecimal hourlyRate;
    private int workingHours;
    private List<String> skills;

    private String experience;
    private String availabilityStatus;
    private String salary;
    private String bankAccountNumber;
    private String panNumber;
    private String bankName;

    public String getBankAccountNumber() {
        return bankAccountNumber;
    }

    public void setBankAccountNumber(String bankAccountNumber) {
        this.bankAccountNumber = bankAccountNumber;
    }

    public String getPanNumber() {
        return panNumber;
    }

    public void setPanNumber(String panNumber) {
        this.panNumber = panNumber;
    }

    public String getBankName() {
        return bankName;
    }

    public void setBankName(String bankName) {
        this.bankName = bankName;
    }

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

    public EmployeeDto(Long employeeId, String name, String email, String phoneNumber, String gender, BigDecimal hourlyRate, int workingHours, List<String> skills, String experience, String availabilityStatus, String salary, String bankAccountNumber, String panNumber, String bankName) {
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
        this.bankAccountNumber = bankAccountNumber;
        this.panNumber = panNumber;
        this.bankName = bankName;
    }

    public EmployeeDto() {
    }
}
