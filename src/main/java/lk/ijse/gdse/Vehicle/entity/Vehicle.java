package lk.ijse.gdse.Vehicle.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@AllArgsConstructor
@NoArgsConstructor
@Data
@ToString
@Entity
public class Vehicle {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long vehicleId;
    private String brand;
    private String subName;
    private String type;
    private String pata;
    private String category;
    private String transmission;
    private String seatCapacity;
    private String fuelType;
    private String model;
    private double pricePerKM;

    private String image1;
    private String image2;
    private String image3;
    private String image4;
}
