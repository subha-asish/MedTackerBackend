package com.example.MedTracker.Service;

import com.example.MedTracker.Entity.MedicalCertificate;
import com.example.MedTracker.Repository.MedicalCertificateRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MedicalCertificateService {
    @Autowired
    private MedicalCertificateRepository repository;

    public List<MedicalCertificate> getAllCertificates() {
        return repository.findAll();
    }

    public MedicalCertificate createCertificate(MedicalCertificate certificate) {
        return repository.save(certificate);
    }

    public MedicalCertificate updateCertificate(Long id, MedicalCertificate certificate) throws Exception {
        if (repository.existsById(id)) {
            certificate.setId(id);
            return repository.save(certificate);
        }
        throw new Exception("Certificate not found");
    }

    public void deleteCertificate(Long id) {
        repository.deleteById(id);
    }
}
