package com.example.MedTracker.Service;

import com.example.MedTracker.Entity.Medicine;
import com.example.MedTracker.Repository.MedicineRepository;
import jakarta.persistence.EntityNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MedicineService {
    @Autowired
    private MedicineRepository repository;

    public List<Medicine> getAllMedicines() {
        return repository.findAll();
    }

    public Medicine createMedicine(Medicine medicine) {
        return repository.save(medicine);
    }

    public Medicine updateMedicine(Long id, Medicine medicine) {
        if (repository.existsById(id)) {
            medicine.setId(id);
            return repository.save(medicine);
        }
        throw new EntityNotFoundException("Medicine not found");
    }

    public void deleteMedicine(Long id) {
        repository.deleteById(id);
    }
}

