package com.example.demo.Service;

import com.example.demo.Dao.ArticleRepository;
import com.example.demo.Entite.Article;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ArticleService {
@Autowired
    ArticleRepository articleRepository;

    public Article addArticle(Article a1){
        Article savedArticle = articleRepository.save(a1);

        return savedArticle;
    }

    public Article deleteArticle(Long id){
        Optional<Article> article = articleRepository.findById(id);
        if(article.isPresent()){
            return article.get();
        }else
        {
            return null;
        }
    }
    public List<Article> gettAllArticle(){
        articleRepository.findAll();
return gettAllArticle();
    }
}
