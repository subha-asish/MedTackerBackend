package com.example.MedTracker.Controller;

import com.example.MedTracker.Entity.Medicine;
import com.example.MedTracker.Service.MedicineService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/medicine")
public class MedicineController {
    @Autowired
    private MedicineService service;

    @GetMapping
    public List<Medicine> getMedicines() {
        return service.getAllMedicines();
    }

    @PostMapping
    public Medicine createMedicine(@RequestBody Medicine medicine) {
        return service.createMedicine(medicine);
    }

    @PutMapping("/{id}")
    public Medicine updateMedicine(@PathVariable Long id, @RequestBody Medicine medicine) {
        return service.updateMedicine(id, medicine);
    }

    @DeleteMapping("/{id}")
    public void deleteMedicine(@PathVariable Long id) {
        service.deleteMedicine(id);
    }
}

