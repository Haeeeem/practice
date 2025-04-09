package com.haemin.board.controller;

import com.haemin.board.service.Service;
import com.haemin.board.util.IoUtil;

public class Controller {
    Service service = new Service();
    public void run(){
        IoUtil.print("┌─────────────────────┐");
        IoUtil.print("│     게시판 입장!    │");
        IoUtil.print("└─────────────────────┘");

        while(true){
            service.showArticles(); // 초기화면에서 나오는 글 목록
            IoUtil.print("원하시는 메뉴를 선택해주세요.");
            IoUtil.print("1. 글 작성");
            IoUtil.print("2. 글 상세보기");
            IoUtil.print("0. 게시판 종료");
            String command = IoUtil.input(" > ");

            if (command.equals("0")){
                IoUtil.print("이용해주셔서 감사합니다.");
                break;
            } else if (command.equals("1")){
                service.newArticle();
            } else if (command.equals("2")){
                service.detailArticle();
            } else {
                IoUtil.input("잘못된 접근입니다. 초기화면으로 돌아갑니다.");
            }
        }
    }
}
