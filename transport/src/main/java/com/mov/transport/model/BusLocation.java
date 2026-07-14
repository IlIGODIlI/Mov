package com.mov.transport.model;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;

@Entity
@Table(name = "bus_locations")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class BusLocation {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String routeCode;

    private double latitude;

    private double longitude;
}
