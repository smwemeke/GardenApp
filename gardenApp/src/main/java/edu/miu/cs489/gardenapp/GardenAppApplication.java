package edu.miu.cs489.gardenapp;

import edu.miu.cs489.gardenapp.model.Garden;
import edu.miu.cs489.gardenapp.model.Plant;
import edu.miu.cs489.gardenapp.repository.GardenRepository;
import edu.miu.cs489.gardenapp.repository.PlantRepository;
import edu.miu.cs489.gardenapp.service.GardenService;
import edu.miu.cs489.gardenapp.service.PlantService;
import lombok.RequiredArgsConstructor;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.time.LocalDate;
import java.util.List;

@SpringBootApplication
@RequiredArgsConstructor
public class GardenAppApplication {

	private final GardenService gardenService;
	private final PlantService plantService;

	public static void main(String[] args) {

		SpringApplication.run(GardenAppApplication.class, args);	}

	@Bean
	CommandLineRunner commandLineRunner(){
			return args -> {

					Garden g1 = new Garden("Patch", 50.2);
					Garden g2 = new Garden("Herb Garden", 20.0);

					gardenService.addGarden(g1);
					gardenService.addGarden(g2);

				Plant p1 = new Plant("Carrot", "Vegetable", LocalDate.now(),g1);
				Plant p2= new Plant("Potato", "Vegetable", LocalDate.now(),g2);

				plantService.addPlant(p1);
				plantService.addPlant(p2);




			};
		}

}
