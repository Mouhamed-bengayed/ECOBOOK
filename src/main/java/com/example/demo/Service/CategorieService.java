package com.example.demo.Service;

import com.example.demo.Dao.CategorieRepository;
import com.example.demo.Entite.Article;
import com.example.demo.Entite.Categorie;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CategorieService {

@Autowired
    CategorieRepository categorieRepository;


    public Categorie addCategory(Categorie c1){
        Categorie savedCategory=categorieRepository.save(c1);
        return savedCategory;
    }

public List<Categorie> getAllCategory(){
    categorieRepository.findAll();
    return getAllCategory();
}

    public Categorie deleteCategory(Long id){
        Optional<Categorie> categorie = categorieRepository.findById(id);
        if(categorie.isPresent()){
            return categorie.get();
        }else
        {
            return null;
        }
    }

}
