package com.example.demo.dtos;

import antlr.Token;
import lombok.Data;

@Data
public class JwtResponse {
    private Token token;

    public JwtResponse(String token) {
    }
}
