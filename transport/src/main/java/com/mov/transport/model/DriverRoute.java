package com.mov.transport.model;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;

@Entity
@Table(name = "driver_routes")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class DriverRoute {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String driverEmail;

    private String routeCode;
}
