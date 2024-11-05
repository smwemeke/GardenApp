package edu.miu.cs489.gardenapp.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;
import java.util.List;

@Entity
@Setter
@Getter
@Table(name="plants")
@NoArgsConstructor
public class Plant {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(name="plant_id")
    private Integer id;
    private String plantName;
    private String plantType;
    private LocalDate plantDate;
    private LocalDate harvestDate;
    @ManyToMany(fetch = FetchType.LAZY, mappedBy = "plants")
    private List<Garden> gardens;

    public Plant(String plantName, String plantType, LocalDate plantDate, List<Garden> gardens) {
        this.plantName = plantName;
        this.plantType = plantType;
        this.plantDate = plantDate;
        this.gardens = gardens;
    }

    @Override
    public String toString() {
        return "Plant{" +
                "plantName='" + plantName + '\'' +
                ", plantType='" + plantType + '\'' +
                ", plantDate=" + plantDate +
                ", harvestDate=" + harvestDate +
                '}';
    }
}
