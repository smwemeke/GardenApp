package edu.miu.cs489.gardenapp.service.impl;

import edu.miu.cs489.gardenapp.model.Garden;
import edu.miu.cs489.gardenapp.repository.GardenRepository;
import edu.miu.cs489.gardenapp.service.GardenService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class GardenServiceImpl implements GardenService {
    private final GardenRepository gardenRepository;
    @Override
    public List<Garden> findAll(Garden garden) {
        return gardenRepository.findAll();
    }
}
