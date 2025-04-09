package com.haemin.board.dto;

import java.util.ArrayList;
import java.util.List;

public class Article {

    // 필드
    private String title;
    private String content;
    private String author;
    private List<Comment> commentList = new ArrayList<>();

    // 기본 생성자
    public Article(){}

    public Article(String title, String content, String author) {
        this.title = title;
        this.content = content;
        this.author = author;
    }

    // getter, setter
    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }
    public String getContent() {
        return content;
    }
    public void setContent(String content) {
        this.content = content;
    }
    public String getAuthor() {
        return author;
    }
    public void setAuthor(String author) {
        this.author = author;
    }
    public List<Comment> getCommentList() {
        return commentList;
    }
    public void setCommentList(List<Comment> commentList) {
        this.commentList = commentList;
    }

    // 공백 시 저장하지 않기
    public void writeText(String content){
        if(content == null || content.trim().isEmpty()){
            System.out.println("내용을 입력해주세요.");
            return;
        }
    }
}
