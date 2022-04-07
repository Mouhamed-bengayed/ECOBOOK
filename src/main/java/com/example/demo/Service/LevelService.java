package com.example.demo.Service;

import com.example.demo.Dao.LevelRepository;
import com.example.demo.Entite.Categorie;
import com.example.demo.Entite.Level;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class LevelService {
@Autowired
LevelRepository levelRepository;


    public Level addLevel(Level l1){
        Level savedLevel= levelRepository.save(l1);
        return savedLevel;
    }
    public List<Level> getAllLevel(){
        levelRepository.findAll();
        return getAllLevel();
    }

    public Level deleteLevel(Long id){
        Optional<Level> level = levelRepository.findById(id);
        if(level.isPresent()){
            return level.get();
        }else
        {
            return null;
        }
    }

}


