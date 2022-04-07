package com.example.demo.Entite;

import lombok.Data;

import javax.persistence.*;
import java.util.List;

@Entity
@Data
public class Level {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @OneToMany(mappedBy = "Level")
    private List<Article> article;
}
