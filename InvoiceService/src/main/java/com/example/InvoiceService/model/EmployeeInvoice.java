package com.example.InvoiceService.model;
import jakarta.persistence.*;

import java.math.BigDecimal;
@Entity
public class EmployeeInvoice {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long invoiceId;
    private Long employeeId;
    private String employeeName;
    private BigDecimal totalAmount;
    private BigDecimal taxAmount;
    private BigDecimal finalAmount;
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

    @Column(nullable = false)
    private BigDecimal grossAmount;


    public Long getInvoiceId() {
        return invoiceId;
    }

    public void setInvoiceId(Long invoiceId) {
        this.invoiceId = invoiceId;
    }

    public Long getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(Long employeeId) {
        this.employeeId = employeeId;
    }

    public BigDecimal getGrossAmount() {
        return grossAmount;
    }

    public void setGrossAmount(BigDecimal grossAmount) {
        this.grossAmount = grossAmount;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    public BigDecimal getTotalAmount() {
        return totalAmount;
    }

    public void setTotalAmount(BigDecimal totalAmount) {
        this.totalAmount = totalAmount;
    }

    public BigDecimal getTaxAmount() {
        return taxAmount;
    }

    public void setTaxAmount(BigDecimal taxAmount) {
        this.taxAmount = taxAmount;
    }

    public BigDecimal getFinalAmount() {
        return finalAmount;
    }

    public void setFinalAmount(BigDecimal finalAmount) {
        this.finalAmount = finalAmount;
    }

    public EmployeeInvoice() {
    }

    public EmployeeInvoice(Long invoiceId, Long employeeId, String employeeName, BigDecimal totalAmount, BigDecimal taxAmount, BigDecimal finalAmount, String bankAccountNumber, String panNumber, String bankName, BigDecimal grossAmount) {
        this.invoiceId = invoiceId;
        this.employeeId = employeeId;
        this.employeeName = employeeName;
        this.totalAmount = totalAmount;
        this.taxAmount = taxAmount;
        this.finalAmount = finalAmount;
        this.bankAccountNumber = bankAccountNumber;
        this.panNumber = panNumber;
        this.bankName = bankName;
        this.grossAmount = grossAmount;
    }
    // Getters and Setters
}
