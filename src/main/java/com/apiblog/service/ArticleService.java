package com.apiblog.service;

import com.apiblog.entity.Article;
import com.apiblog.repository.IArticleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ArticleService {
    @Autowired
    private IArticleRepository repoArticle;

    public Article addArticle(Article article){
        return repoArticle.save(article);
    }
}
