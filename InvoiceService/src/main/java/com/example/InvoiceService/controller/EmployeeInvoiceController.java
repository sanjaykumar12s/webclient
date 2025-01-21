package com.example.InvoiceService.controller;

import com.example.InvoiceService.service.EmployeeInvoiceService;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/invoices")
public class EmployeeInvoiceController {

    private final EmployeeInvoiceService service;

    public EmployeeInvoiceController(EmployeeInvoiceService service) {
        this.service = service;
    }

    @GetMapping("/{id}/pdf")
    public ResponseEntity<byte[]> getInvoicePdf(@PathVariable Long id) {
        byte[] pdfBytes = service.generateInvoicePdf(id);
        HttpHeaders headers = new HttpHeaders();
        headers.add(HttpHeaders.CONTENT_DISPOSITION, "attachment; filename=employee-invoice.pdf");

        return ResponseEntity.ok()
                .headers(headers)
                .contentType(MediaType.APPLICATION_PDF)
                .body(pdfBytes);
    }
}
