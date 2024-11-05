package edu.miu.cs489.gardenapp.service.impl;

import edu.miu.cs489.gardenapp.model.Garden;
import edu.miu.cs489.gardenapp.repository.GardenRepository;
import edu.miu.cs489.gardenapp.service.GardenService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class GardenServiceImpl implements GardenService {
    private final GardenRepository gardenRepository;
    @Override
    public List<Garden> findAll(List<Garden> garden) {

        return gardenRepository.findAll();
    }

    @Override
    public Optional<Garden> addGarden(Garden garden) {
        Garden garden1 = gardenRepository.save(garden);
        return Optional.of(garden1);
    }

}
