package com.example.MedTracker.Controller;

import com.example.MedTracker.Entity.MedicalCertificate;
import com.example.MedTracker.Service.MedicalCertificateService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/certificate")
public class MedicalCertificateController {
    @Autowired
    private MedicalCertificateService service;

    @GetMapping
    public List<MedicalCertificate> getCertificates() {
        return service.getAllCertificates();
    }

    @PostMapping
    public MedicalCertificate createCertificate(@RequestBody MedicalCertificate certificate) {
        return service.createCertificate(certificate);
    }

    @PutMapping("/{id}")
    public MedicalCertificate updateCertificate(@PathVariable Long id, @RequestBody MedicalCertificate certificate) throws Exception {
        return service.updateCertificate(id, certificate);
    }

    @DeleteMapping("/{id}")
    public void deleteCertificate(@PathVariable Long id) {
        service.deleteCertificate(id);
    }
}

