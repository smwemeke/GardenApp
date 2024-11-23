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
    private String gardenName;
    private double size;
    @OneToMany(mappedBy = "garden")
    List<Plant> plants;

    public Garden(String gardenname, double size) {
        this.gardenName = gardenname;
        this.size = size;
    }

    @Override
    public String toString() {
        return "Garden{" +
                "gardenname='" + gardenName + '\'' +
                ", size=" + size +
                ", plants=" + plants +
                '}';
    }
}