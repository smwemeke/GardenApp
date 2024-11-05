package edu.miu.cs489.gardenapp.service;

import edu.miu.cs489.gardenapp.model.Garden;

import java.util.List;

public interface GardenService {
    List<Garden> findAll(Garden garden);
}
