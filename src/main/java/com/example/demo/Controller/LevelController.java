package com.example.demo.Controller;

import com.example.demo.Entite.Level;
import com.example.demo.Service.LevelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@CrossOrigin
@RequestMapping("/api/Level")
@RestController
public class LevelController {

    @Autowired
    LevelService levelService;

    @GetMapping("/list-Lrvel")
    public List<Level> ListAccount() {
        return levelService.getAllLevel();
    }

    @DeleteMapping("/delete-Levrl/{idLevelt}")
    public void deleteLevel(@PathVariable("idLevel") Long idLevel) {
        levelService.deleteLevel(idLevel);
    }

    @PostMapping("/add-Level")
    public Level addLevel(@RequestBody @Valid Level A1) {
        return levelService.addLevel(A1);
    }

}
