package com.example.examen.controllers;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.web.bind.annotation.*;

import com.example.examen.model.jwt.entity.AuthRequest;
import com.example.examen.model.jwt.entity.UserInfo;
import com.example.examen.jwt.service.JwtService;
import com.example.examen.jwt.service.UserInfoService;

@RestController
@RequestMapping("/autenticacion")
public class UserController {

    @Autowired
    private UserInfoService service;

    @Autowired
    private JwtService jwtService;

    @Autowired
    private AuthenticationManager authenticationManager;

    @PostMapping("/agregarUsuario")
    public String addNewUser(@RequestBody UserInfo userInfo) {
        return service.addUser(userInfo);
    }

    @PostMapping("/generarToken")
    public String authenticateAndGetToken(@RequestBody AuthRequest authRequest) {
    	try {
    		Authentication authentication = authenticationManager.authenticate(
    	            new UsernamePasswordAuthenticationToken(authRequest.getUsername(), authRequest.getPassword()));
    		if (authentication.isAuthenticated()) {
                return jwtService.generateToken(authRequest.getUsername());
            } else {
                throw new UsernameNotFoundException("Invalid user request!");
            }
		} catch (Exception e) {
			System.out.println(e.getMessage());
			throw new UsernameNotFoundException("Invalid user request!");
}
 
    }
}