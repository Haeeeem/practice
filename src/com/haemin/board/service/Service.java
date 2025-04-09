package com.haemin.board.service;

import com.haemin.board.dto.Article;
import com.haemin.board.dto.Articles;
import com.haemin.board.dto.Comment;
import com.haemin.board.util.IoUtil;

import java.util.List;
import java.util.Scanner;

public class Service {
    Scanner scanner = new Scanner(System.in);
    Articles articles = new Articles();
    Comment comment = new Comment();
    Article article = new Article();

    // 글 목록
    public void showArticles(){
        if(articles.isNotEmpty()){
            IoUtil.print("글 목록입니다.");
            IoUtil.print("───────────────────────");
            List<Article> list = articles.articleList();
            int count = 0;
            for(Article e : list){
                String text = "";
                text += "<" + count + "> " + e.getTitle();
                text += "\t\t작성자: " + e.getAuthor();
                count++;
                IoUtil.print(text);
            }
//            List<Article> articlesList = new ArrayList<>();
//            for(Article e : articlesList){
//                String text = "";
//                int count = 0;
//                text += "<" + count + "> " + article.getTitle();
//                count++;
//                IoUtil.print(text);
//            }
        } else {
            IoUtil.print("[게시글이 존재하지 않습니다.]");
            IoUtil.print("───────────────────────");
        }
    }

    // 글 작성
    public void newArticle() {
        IoUtil.print("───────────────────────");
        IoUtil.print("글 작성을 시작합니다.");
        IoUtil.print("───────────────────────");
        IoUtil.input("");
        
        String title = "";
        String content = "";
        String author = "";
        while (title.trim().isEmpty() || content.trim().isEmpty() || author.trim().isEmpty()){
            title = IoUtil.input("글 제목을 입력하세요. > ");
            while (title.trim().isEmpty()){
                IoUtil.print("제목을 입력하지 않았습니다. 다시 입력해주세요. \t\t[초기화면]: '0'입력");
                String zero = IoUtil.input("> ");
                if(zero.equals("0")){
                    return;
                } else if (!(title.isEmpty())){
                    break;
                }
                break;
            }
            content = IoUtil.input("글 내용을 입력하세요. > ");
            while (content.trim().isEmpty()){
                String zero = IoUtil.input("내용을 입력하지 않았습니다. 다시 입력해주세요. \t\t[초기화면]: '0'입력");
                if(zero.equals("0")){
                    return;
                } else if (!(content.isEmpty())){
                    break;
                } 
                break;
            }
            author = IoUtil.input("작성자를 입력하세요. > ");
            while (author.trim().isEmpty()){
                String zero = IoUtil.input("작성자를 입력하지 않았습니다. 다시 입력해주세요. \t\t[초기화면]: '0'입력");
                if(zero.equals("0")){
                    return;
            } else if (!(author.isEmpty())){
                break;
            } break;
        }
    }
        IoUtil.input("글 작성이 완료되었습니다.");
        IoUtil.print("───────────────────────");

        Article article = new Article(title, content, author);
        articles.addArticle(article);
    }

    // 특정 글 불러오기
    public void detailArticle(){
        if(articles.isNotEmpty()){
            int number = Integer.parseInt(IoUtil.input("글번호를 입력해주세요. > "));
            List<Article> list = articles.articleList();
            String resultContent = list.get(number).getContent();
            String resultAuthor = list.get(number).getAuthor();
            IoUtil.print(number + "번 글 내용: " + resultContent + "\t\tby." + resultAuthor);
            IoUtil.input("돌아가시려면 enter를 눌러주세요.");
        } else {
            IoUtil.input("불러올 게시글이 없습니다. 초기화면으로 돌아갑니다.");
        }

    }
}
