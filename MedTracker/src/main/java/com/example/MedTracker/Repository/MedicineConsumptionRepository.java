package com.example.MedTracker.Repository;

import com.example.MedTracker.Entity.MedicineConsumption;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MedicineConsumptionRepository extends JpaRepository<MedicineConsumption, Long> {
}

