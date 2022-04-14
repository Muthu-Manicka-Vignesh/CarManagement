package com.myprogramming.SpringBootApplicataion.RentalRecords;

import com.myprogramming.SpringBootApplicataion.model.Car;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RentalRecords extends JpaRepository<Car, Integer> {
}
