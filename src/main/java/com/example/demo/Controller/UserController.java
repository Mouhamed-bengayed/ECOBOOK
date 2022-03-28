package com.example.demo.Controller;


import com.example.demo.Entite.User;
import com.example.demo.Service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@CrossOrigin
@RequestMapping("/api/user")
public class UserController {

    @Autowired
    UserService userService;

    @GetMapping("/list-user")
    public List<User> ListUser() {
        return userService.getAllUser();
    }

    @PostMapping("/add-user")
    public User adduser(@RequestBody @Valid User A1) {
        return userService.addUtilisateur(A1);
    }

    @PutMapping("/validate-user/{idUser}")
    public void validInscription(@PathVariable("idUser") Long idUser) {
        userService.validInscription(idUser);
    }
    @DeleteMapping("/delete-user/{idUser}")
    public void deleteAccount(@PathVariable("idUser") Long idUser) {
        userService.deleteUser(idUser);
    }



}
