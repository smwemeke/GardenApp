package edu.miu.cs489.gardenapp;

import edu.miu.cs489.gardenapp.model.Garden;
import edu.miu.cs489.gardenapp.model.Plant;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.time.LocalDate;
import java.util.List;

@SpringBootApplication
public class GardenAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(GardenAppApplication.class, args);
	}

	@Bean
	CommandLineRunner commandLineRunner(){
			return args -> {

				List<Garden> gardens = List.of(
					new Garden("Patch", 50.2),
					new Garden("Herb Garden", 20.0)
                 );

				//Plant p1 = new Plant("Carrot", "Vegetable", LocalDate.now(),gardens.get(0));



			};
		}

}
