package com.example.MedTracker.Controller;

import com.example.MedTracker.Entity.MedicineConsumption;
import com.example.MedTracker.Service.MedicineConsumptionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/consumption")
public class MedicineConsumptionController {
    @Autowired
    private MedicineConsumptionService service;

    @GetMapping
    public List<MedicineConsumption> getConsumptions() {
        return service.getAllConsumptions();
    }

    @PostMapping
    public MedicineConsumption createConsumption(@RequestBody MedicineConsumption consumption) {
        return service.createConsumption(consumption);
    }

    @PutMapping("/{id}")
    public MedicineConsumption updateConsumption(@PathVariable Long id, @RequestBody MedicineConsumption consumption) throws Exception {
        return service.updateConsumption(id, consumption);
    }

    @DeleteMapping("/{id}")
    public void deleteConsumption(@PathVariable Long id) {
        service.deleteConsumption(id);
    }
}

