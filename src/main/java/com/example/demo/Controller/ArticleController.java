package com.example.demo.Controller;

import com.example.demo.Entite.Article;
import com.example.demo.Entite.Categorie;
import com.example.demo.Service.ArticleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;
@CrossOrigin
@RequestMapping("/api/Article")
@RestController
public class ArticleController {
@Autowired
    ArticleService articleService;

    @GetMapping("/list-Article")
    public List<Article> ListArticle() {
        return articleService.gettAllArticle();
    }

    @DeleteMapping("/delete-Article/{idArticle}")
    public void deleteCategory(@PathVariable("idArticle") Long idArticle) {
        articleService.deleteArticle(idArticle);
    }

    @PostMapping("/add-Specialite")
    public Article addCategory(@RequestBody @Valid Article s1) {
        return articleService.addArticle(s1);
    }
}
