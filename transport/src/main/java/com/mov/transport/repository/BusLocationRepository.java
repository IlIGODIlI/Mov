package com.mov.transport.repository;

import com.mov.transport.model.BusLocation;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BusLocationRepository extends JpaRepository<BusLocation, Long> {
    BusLocation findByRouteCode(String routeCode);
}
