package edu.miu.cs489.gardenapp.service;

import edu.miu.cs489.gardenapp.model.Garden;

import java.util.List;
import java.util.Optional;

public interface GardenService {
    List<Garden> findAll(List<Garden> garden);
    Optional<Garden> addGarden(Garden garden);
}
