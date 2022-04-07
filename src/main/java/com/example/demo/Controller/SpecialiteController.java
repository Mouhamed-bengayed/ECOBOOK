package com.example.demo.Controller;

import com.example.demo.Entite.Level;
import com.example.demo.Entite.Specialite;
import com.example.demo.Service.LevelService;
import com.example.demo.Service.SpecialiteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;
@CrossOrigin
@RequestMapping("/api/Specialite")
@RestController
public class SpecialiteController {
    @Autowired
    SpecialiteService specialiteService;



    @GetMapping("/list-Specialite")
    public List<Specialite> ListSpecialite() {
        return specialiteService.getAllSpesialte();
    }

    @DeleteMapping("/delete-Levrl/{idSpecialite}")
    public void deleteSpecialite(@PathVariable("idLevel") Long idSpesialte) {
        specialiteService.deleteSpesialte(idSpesialte);
    }

    @PostMapping("/add-Specialite")
    public Specialite addSpecialite(@RequestBody @Valid Specialite s1) {
        return specialiteService.addSpesialte(s1);
    }

}
