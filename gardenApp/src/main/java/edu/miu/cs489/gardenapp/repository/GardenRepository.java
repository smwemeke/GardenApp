package edu.miu.cs489.gardenapp.repository;

import edu.miu.cs489.gardenapp.model.Garden;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GardenRepository extends JpaRepository<Garden, Integer> {

}
