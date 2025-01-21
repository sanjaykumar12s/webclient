package com.example.InvoiceService.DTO;

import java.math.BigDecimal;

public class InvoiceServiceDTO {
    private Long invoiceId;
    private Long employeeId;
    private String employeeName;
    private BigDecimal totalAmount;
    private BigDecimal taxAmount;
    private BigDecimal finalAmount;
    private BigDecimal grossAmount;
    public Long getInvoiceId() {
        return invoiceId;
    }

    public BigDecimal getGrossAmount() {
        return grossAmount;
    }

    public void setGrossAmount(BigDecimal grossAmount) {
        this.grossAmount = grossAmount;
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

    public InvoiceServiceDTO(Long invoiceId, Long employeeId, String employeeName, BigDecimal totalAmount, BigDecimal taxAmount, BigDecimal finalAmount, BigDecimal grossAmount) {
        this.invoiceId = invoiceId;
        this.employeeId = employeeId;
        this.employeeName = employeeName;
        this.totalAmount = totalAmount;
        this.taxAmount = taxAmount;
        this.finalAmount = finalAmount;
        this.grossAmount = grossAmount;
    }

    public InvoiceServiceDTO() {
    }
}
