package com.example.MedTracker.Repository;

import com.example.MedTracker.Entity.MedicalCertificate;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MedicalCertificateRepository extends JpaRepository<MedicalCertificate, Long> {
}
