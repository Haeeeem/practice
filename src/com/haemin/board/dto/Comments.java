package com.haemin.board.dto;

import java.util.ArrayList;
import java.util.List;

public class Comments {
    private List<Comment> comments = new ArrayList<>();

    // 코멘트 작성
    public void addComment (Comment comment){
        comments.add(comment);
    }

    // 코멘트 목록
    public List<Comment> commentsList (){
        List<Comment> commentResult = new ArrayList<>();
        for(Comment e : comments){
            commentResult.add(e);
        } return commentResult;
    }

    // 코멘트가 비어있는지 확인하는 메소드
    public boolean isNotEmpty(){
        return !comments.isEmpty();
    }
    

}
