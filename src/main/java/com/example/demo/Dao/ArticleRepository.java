package com.example.demo.Dao;

import com.example.demo.Entite.Article;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ArticleRepository extends JpaRepository<Article,Long>{

}
