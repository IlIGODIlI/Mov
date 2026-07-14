package com.mov.transport.repository;

import com.mov.transport.model.DriverRoute;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DriverRouteRepository extends JpaRepository<DriverRoute, Long> {
    DriverRoute findByDriverEmail(String driverEmail);
}
