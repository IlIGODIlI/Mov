package com.mov.transport.controller;

import com.mov.transport.model.BusLocation;
import com.mov.transport.model.DriverRoute;
import com.mov.transport.model.Route;
import com.mov.transport.model.StudentRoute;
import com.mov.transport.model.User;
import com.mov.transport.repository.BusLocationRepository;
import com.mov.transport.repository.DriverRouteRepository;
import com.mov.transport.repository.RouteRepository;
import com.mov.transport.repository.StudentRouteRepository;
import com.mov.transport.repository.UserRepository;
import com.mov.transport.service.RouteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/admin")
public class RouteController {

    @Autowired
    private RouteRepository routeRepository;

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private StudentRouteRepository studentRouteRepository;

    @Autowired
    private DriverRouteRepository driverRouteRepository;

    @GetMapping("/allRoutes")
    public List<Route> getAllRoutes() {
        return routeRepository.findAll();
    }

    @Autowired
    private RouteService routeService;

    @PostMapping("/createRoute")
    public Route createRoute(@RequestBody Route route) {
        String code = routeService.generateRouteCode();
        route.setRouteCode(code);
        return routeRepository.save(route);
    }

    @Autowired
    private BusLocationRepository busLocationRepository;

    @GetMapping("/allLocations")
    public List<BusLocation> getAllLocations() {
        return busLocationRepository.findAll();
    }

    @PostMapping("/assignRoute")
    public String assignRoute(@RequestBody Map<String, String> data) {
        String email = data.get("email");
        String routeCode = data.get("routeCode");

        User user = userRepository.findByEmail(email);
        if (user == null) return "User not found";

        if (user.getRole().equalsIgnoreCase("STUDENT")) {
            StudentRoute sr = studentRouteRepository.findByStudentEmail(email);
            if (sr == null) sr = new StudentRoute();
            sr.setStudentEmail(email);
            sr.setRouteCode(routeCode);
            studentRouteRepository.save(sr);
            return "Route " + routeCode + " assigned to student " + email;
        } else if (user.getRole().equalsIgnoreCase("DRIVER")) {
            DriverRoute dr = driverRouteRepository.findByDriverEmail(email);
            if (dr == null) dr = new DriverRoute();
            dr.setDriverEmail(email);
            dr.setRouteCode(routeCode);
            driverRouteRepository.save(dr);
            return "Route " + routeCode + " assigned to driver " + email;
        }

        return "Invalid role for assignment";
    }

    @PutMapping("/updateRoutePosition")
    public String updateRoutePosition(@RequestBody Map<String, String> data) {
        String routeCode = data.get("routeCode");
        
        try {
            double sLat = Double.parseDouble(data.get("startLat"));
            double sLng = Double.parseDouble(data.get("startLng"));
            double eLat = Double.parseDouble(data.get("endLat"));
            double eLng = Double.parseDouble(data.get("endLng"));

            Route route = routeRepository.findByRouteCode(routeCode);
            if (route == null) return "Route not found";

            route.setStartLat(sLat);
            route.setStartLng(sLng);
            route.setEndLat(eLat);
            route.setEndLng(eLng);
            routeRepository.save(route);
            return "Route coordinates updated successfully";
        } catch (Exception e) {
            return "Invalid coordinate format: " + e.getMessage();
        }
    }
}
