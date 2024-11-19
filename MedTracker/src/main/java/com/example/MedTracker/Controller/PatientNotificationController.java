package com.example.MedTracker.Controller;

import com.example.MedTracker.Entity.PatientNotification;
import com.example.MedTracker.Service.PatientNotificationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/notification")
public class PatientNotificationController {
    @Autowired
    private PatientNotificationService service;

    @GetMapping
    public List<PatientNotification> getNotifications() {
        return service.getAllNotifications();
    }

    @PostMapping
    public PatientNotification createNotification(@RequestBody PatientNotification notification) {
        return service.createNotification(notification);
    }

    @PutMapping("/{id}")
    public PatientNotification updateNotification(@PathVariable Long id, @RequestBody PatientNotification notification) {
        return service.updateNotification(id, notification);
    }

    @DeleteMapping("/{id}")
    public void deleteNotification(@PathVariable Long id) {
        service.deleteNotification(id);
    }
}

