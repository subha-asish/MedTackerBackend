package com.example.MedTracker.Service;

import com.example.MedTracker.Entity.MedicineConsumption;
import com.example.MedTracker.Repository.MedicineConsumptionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MedicineConsumptionService {
    @Autowired
    private MedicineConsumptionRepository repository;

    public List<MedicineConsumption> getAllConsumptions() {
        return repository.findAll();
    }

    public MedicineConsumption createConsumption(MedicineConsumption consumption) {
        return repository.save(consumption);
    }

    public MedicineConsumption updateConsumption(Long id, MedicineConsumption consumption) throws Exception {
        if (repository.existsById(id)) {
            consumption.setId(id);
            return repository.save(consumption);
        }
        throw new Exception("Consumption not found");
    }

    public void deleteConsumption(Long id) {
        repository.deleteById(id);
    }
}

