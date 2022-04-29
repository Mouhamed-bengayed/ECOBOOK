package com.example.demo.Controller;

import com.example.demo.Service.UserService;
import com.example.demo.dtos.JwtResponse;
import com.example.demo.dtos.SignIn;
import com.example.demo.security.TokenUtil;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.web.bind.annotation.*;

@CrossOrigin
@RequestMapping("/api/Auth")
@RestController
public class AuthController {
    @Autowired
    TokenUtil tokenUtil;
    @Autowired
    UserService userService;
    @Autowired
    AuthenticationManager authenticationManager;

    @PostMapping("/signIn/{signIn}")
    public JwtResponse signIn(@RequestBody SignIn signIn) {
        final Authentication authentication = authenticationManager.authenticate(
        new UsernamePasswordAuthenticationToken(signIn.getEmail(), signIn.getPassword())
   );
        SecurityContextHolder.getContext().setAuthentication(authentication);
        UserDetails userDetails = userService.loadUserByUsername(signIn.getEmail());
        String token = tokenUtil.generateToken(userDetails);
        JwtResponse jwtResponse=new JwtResponse(token);
        return jwtResponse;
}
}
