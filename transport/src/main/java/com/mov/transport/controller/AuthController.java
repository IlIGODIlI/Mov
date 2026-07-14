package com.mov.transport.controller;

import com.mov.transport.model.User;
import com.mov.transport.repository.UserRepository;
import com.mov.transport.config.JwtUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
public class AuthController {

    @Autowired
    private UserRepository userRepository;

    @SuppressWarnings("null")
    @PostMapping("/register")
    public User registerUser(@RequestBody User user) {
        return userRepository.save(user);
    }

    @GetMapping("/admin/allUsers")
    public List<User> getAllUsers() {
        return userRepository.findAll();
    }

    @PostMapping("/login")
    public Object loginUser(@RequestBody User user){
        User existingUser = userRepository.findByEmail(user.getEmail());

        if(existingUser == null)
            return "User not found";

        if(!existingUser.getRole().equalsIgnoreCase(user.getRole()))
            return "Incorrect role";

        if(existingUser.getPassword().equals(user.getPassword())){
            String token = JwtUtil.generateToken(
                    existingUser.getEmail(),
                    existingUser.getRole()
            );
            return token;
        }

        return "Invalid password";
    }
}
