package edu.miu.cs489.gardenapp.service;

import edu.miu.cs489.gardenapp.model.Plant;

import java.util.List;
import java.util.Optional;

public interface PlantService{
    Optional<Plant> addPlant(Plant plant);
    void deletePlant(Plant plant);
    Optional<Plant> updatePlant(String  plantName);
    List<Plant> getAllPlantsSortedByName();

}
