package edu.miu.cs489.gardenapp.repository;

import edu.miu.cs489.gardenapp.model.Plant;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface PlantRepository extends JpaRepository<Plant, Integer> {

    List<Plant> findAll(Sort sort);
}
