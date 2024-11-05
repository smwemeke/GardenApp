package edu.miu.cs489.gardenapp.model;

import jakarta.persistence.*;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;


@Entity
@Setter
@Getter
@NoArgsConstructor
@Table(name ="garden")
public class Garden {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(name = "garden_id")
    private Integer id;
    private String gardenname;
    private double size;
    @ManyToMany(fetch = FetchType.EAGER)
            @JoinTable(
                    name= "garden_plant",
                    joinColumns = @JoinColumn(name="garden_id"),
                    inverseJoinColumns = @JoinColumn(name ="plant_id")
            )
    List<Plant> plants;

    public Garden(String gardenname, double size) {
        this.gardenname = gardenname;
        this.size = size;
    }

    @Override
    public String toString() {
        return "Garden{" +
                "gardenname='" + gardenname + '\'' +
                ", size=" + size +
                ", plants=" + plants +
                '}';
    }
}
