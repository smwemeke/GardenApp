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
    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "garden_id")
    private Garden garden;

    public Plant(String plantName, String plantType, LocalDate plantDate, Garden garden) {
        this.plantName = plantName;
        this.plantType = plantType;
        this.plantDate = plantDate;
        this.garden = garden;
    }

    @Override
    public String toString() {
        return "Plant{" +
                "plantName='" + plantName + '\'' +
                ", plantType='" + plantType + '\'' +
                ", plantDate=" + plantDate +
                '}';
    }
}
