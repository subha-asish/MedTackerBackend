package com.example.MedTracker.Repository;

import com.example.MedTracker.Entity.PatientNotification;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PatientNotificationRepository extends JpaRepository<PatientNotification, Long> {
}

