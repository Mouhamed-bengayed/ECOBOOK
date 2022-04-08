package com.example.demo.Entite;

import lombok.Data;

import javax.persistence.*;
import java.util.List;

@Entity
@Data

public class Categorie {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String nom;

    @OneToMany(mappedBy = "categorie")
    private List<Article> article;

}
