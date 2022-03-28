package com.example.demo.Service;

import com.example.demo.Dao.CategorieRepository;
import com.example.demo.Entite.Article;
import com.example.demo.Entite.Categorie;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CategorieService {

@Autowired
    CategorieRepository categorieRepository;


    public Categorie addCategory(Categorie c1){
        Categorie savedCategory=categorieRepository.save(c1);
        return savedCategory;
    }



}
