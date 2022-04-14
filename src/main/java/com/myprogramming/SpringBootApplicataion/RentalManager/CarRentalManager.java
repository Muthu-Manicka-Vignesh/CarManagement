package com.myprogramming.SpringBootApplicataion.RentalManager;


import com.myprogramming.SpringBootApplicataion.RentalRecords.RentalRecords;
import com.myprogramming.SpringBootApplicataion.model.Car;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class CarRentalManager {
    @Autowired
    private RentalRecords records;

    @PostMapping("saveCar")
    public Car addCar(@RequestBody Car car){
        return records.save(car);
    }

    @PutMapping("editCar/{id}")
    public Car editCar(@RequestBody Car car){
        return records.save(car);
    }

    @DeleteMapping("deleteCar/{id}")
    public String deleteById(@PathVariable int id){
        String result;
        try{
            records.deleteById(id);
            result="1 record deleted";
        }catch(Exception e){
            result="Error";
        }
        return result;
    }

    @GetMapping("getCars")
    public List<Car> getAllCars(){
        return records.findAll();
    }

    @GetMapping("getCars/{id}")
    public Optional<Car> getCarById(@PathVariable int id){
        return records.findById(id);
    }
}
