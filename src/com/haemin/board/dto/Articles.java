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
        List<Article> articleResult = new ArrayList<>();
        for(Article e : articles){
            articleResult.add(e);
        }
        return articleResult;
    }

    // 글이 비어있는지 확인하는 메소드
    public boolean isNotEmpty() {
        return !articles.isEmpty();
    }

}
