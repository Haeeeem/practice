package com.haemin.board.dto;

public class Comment {

    // 필드
    private String text;
    private String writer;

    // 기본 생성자
    public Comment (){};

    public Comment(String text, String writer) {
        this.text = text;
        this.writer = writer;
    }

    // getter
    public String getText(){
        return text;
    }
    public String getWriter(){
        return writer;
    }
}
