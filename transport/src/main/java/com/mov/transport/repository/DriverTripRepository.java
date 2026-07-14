package com.mov.transport.repository;

import com.mov.transport.model.DriverTrip;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DriverTripRepository extends JpaRepository<DriverTrip, Long> {
    DriverTrip findFirstByRouteCodeAndActiveTrue(String routeCode);
}
