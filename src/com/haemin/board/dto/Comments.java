package com.haemin.board.dto;

import java.util.ArrayList;
import java.util.List;

public class Comments {
    private List<Comment> comments = new ArrayList<>();

    // 코멘트 작성
    public void addComment (Comment comment){
        comments.add(comment);
    }

}
