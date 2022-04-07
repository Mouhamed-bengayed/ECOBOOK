package com.example.demo.Service;

import com.example.demo.Dao.SpecialiteRepository;
import com.example.demo.Entite.Categorie;
import com.example.demo.Entite.Specialite;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class SpecialiteService {

@Autowired
    SpecialiteRepository specialiteRepository;


public Specialite addSpesialte(Specialite s1) {
    Specialite savespecialite=specialiteRepository.save(s1);
    return savespecialite;
}


    public List<Specialite> getAllSpesialte(){
        specialiteRepository.findAll();
        return getAllSpesialte();
    }

    public Specialite deleteSpesialte(Long id){
        Optional<Specialite> specialite = specialiteRepository.findById(id);
        if(specialite.isPresent()){
            return specialite.get();
        }else
        {
            return null;
        }
    }

}


