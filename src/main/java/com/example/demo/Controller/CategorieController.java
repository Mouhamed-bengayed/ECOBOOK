package com.example.demo.Controller;

import com.example.demo.Entite.Categorie;
import com.example.demo.Entite.Specialite;
import com.example.demo.Service.CategorieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@CrossOrigin
@RequestMapping("/api/Categorie")
@RestController
public class CategorieController {
    @Autowired
    CategorieService categorieService;

    @GetMapping("/list-Specialite")
    public List<Categorie> ListCategory() {
        return categorieService.getAllCategory();
    }

    @DeleteMapping("/delete-Levrl/{idSpecialite}")
    public void deleteCategory(@PathVariable("idLevel") Long idCategory) {
        categorieService.deleteCategory(idCategory);
    }

    @PostMapping("/add-Specialite")
    public Categorie addCategory(@RequestBody @Valid Categorie s1) {
        return categorieService.addCategory(s1);
    }

}
