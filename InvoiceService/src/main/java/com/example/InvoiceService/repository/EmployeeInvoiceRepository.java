package com.example.InvoiceService.repository;


import com.example.InvoiceService.model.EmployeeInvoice;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeInvoiceRepository extends JpaRepository<EmployeeInvoice, Long> {
}
