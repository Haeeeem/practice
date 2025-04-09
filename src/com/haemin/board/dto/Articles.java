package com.haemin.board.dto;

import java.util.ArrayList;
import java.util.List;

public class Articles {
    private List<Article> articles = new ArrayList<>();

    // 글 작성 후 저장
    public void addArticle(Article article){
        articles.add(article);
    }

    // 글 목록
    public List<Article> articleList (){
        List<Article> result = new ArrayList<>();
        for(Article e : articles){
            result.add(e);
        }
        return result;
    }

    public boolean isNotEmpty() {
        return !articles.isEmpty();
    }

}
