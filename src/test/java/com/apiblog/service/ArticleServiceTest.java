package com.apiblog.service;

import com.apiblog.entity.Article;
import com.apiblog.repository.IArticleRepository;
import org.junit.jupiter.api.Test;


public class ArticleServiceTest {

    private IArticleRepository repoArticle;

    public ArticleServiceTest(IArticleRepository repoArticle) {
        this.repoArticle = repoArticle;
    }

    @Test
    public void save_nominalCase(){
        Article article = new Article();
        article.setTitle("Article 1");
        article.setContent("Contenu de l'article 1");
        repoArticle.save(article);
        System.out.println("Save test end");
    }

}
