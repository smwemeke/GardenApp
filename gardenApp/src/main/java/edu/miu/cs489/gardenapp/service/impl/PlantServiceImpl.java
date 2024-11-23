package edu.miu.cs489.gardenapp.service.impl;

import edu.miu.cs489.gardenapp.model.Plant;
import edu.miu.cs489.gardenapp.repository.PlantRepository;
import edu.miu.cs489.gardenapp.service.PlantService;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class PlantServiceImpl implements PlantService {

    private final PlantRepository plantRepository;

    @Override
    public Optional<Plant> addPlant(Plant plant) {
        Plant newPlant = plantRepository.save(plant);
        return Optional.of(newPlant);
    }
    @Override
    public void deletePlant(Plant plant) {
        plantRepository.delete(plant);
    }
    @Override
    public Optional<Plant> updatePlant(String plantName) {
        return Optional.empty();
    }

    @Override
    public List<Plant> getAllPlantsSortedByName() {
        return null; //plantRepository.findAll(Sort.by("name").ascending());
    }
}
