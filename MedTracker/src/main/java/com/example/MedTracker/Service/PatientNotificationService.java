package com.example.MedTracker.Service;

import com.example.MedTracker.Entity.PatientNotification;
import com.example.MedTracker.Repository.PatientNotificationRepository;
import jakarta.persistence.EntityNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PatientNotificationService {
    @Autowired
    private PatientNotificationRepository repository;

    public List<PatientNotification> getAllNotifications() {
        return repository.findAll();
    }

    public PatientNotification createNotification(PatientNotification notification) {
        return repository.save(notification);
    }

    public PatientNotification updateNotification(Long id, PatientNotification notification) {
        if (repository.existsById(id)) {
            notification.setId(id);
            return repository.save(notification);
        }
        throw new EntityNotFoundException("Notification not found");
    }

    public void deleteNotification(Long id) {
        repository.deleteById(id);
    }
}

