package com.mov.transport.repository;

import com.mov.transport.model.Route;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RouteRepository extends JpaRepository<Route, Long> {
    Route findByRouteCode(String routeCode);
}
