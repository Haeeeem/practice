package com.haemin.board.service;

import com.haemin.board.dto.Article;
import com.haemin.board.dto.Articles;
import com.haemin.board.dto.Comment;
import com.haemin.board.dto.Comments;
import com.haemin.board.util.IoUtil;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Service {
    Scanner scanner = new Scanner(System.in);
    Articles articles = new Articles();
    Comment comment = new Comment();
    Article article = new Article();
    Comments comments = new Comments();

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
        while (title.trim().isEmpty()){
            title = IoUtil.input("글 제목을 입력하세요. > ");
            while (title.trim().isEmpty()){
                IoUtil.print("제목을 입력하지 않았습니다. 다시 입력해주세요. \t\t[초기화면]: '0'입력");
                title = IoUtil.input("> ");
                if(title.equals("0")){
                    break;
                } 
                break;
            }
        }
        while (content.trim().isEmpty()){
            content = IoUtil.input("글 내용을 입력하세요. > ");
            while (content.trim().isEmpty()){
                IoUtil.print("내용을 입력하지 않았습니다. 다시 입력해주세요. \t\t[초기화면]: '0'입력");
                content = IoUtil.input("> ");
                if(content.equals("0")){
                    break;
                } 
                break;
            }
        }
        while (author.trim().isEmpty()){
            author = IoUtil.input("작성자를 입력하세요. > ");
            while (author.trim().isEmpty()){
                IoUtil.print("작성자를 입력하지 않았습니다. 다시 입력해주세요. \t\t[초기화면]: '0'입력");
                author = IoUtil.input("> ");
                if(author.equals("0")){
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
            if(number >= list.size()){
                IoUtil.input("해당 번호의 게시글이 존재하지 않습니다. 초기화면으로 돌아갑니다.");
            } else {
                String resultContent = list.get(number).getContent();
                String resultAuthor = list.get(number).getAuthor();
                IoUtil.print(number + "번 글 내용: " + resultContent + "\t\tby." + resultAuthor);

                // 댓글창 보여주는 로직
                IoUtil.print("───────────────────────");
                IoUtil.print("댓글목록입니다.");
                detailComment();

                IoUtil.print("\n1. 댓글 작성 \n2. 댓글 수정 \n3. 댓글 삭제\n돌아가시려면 enter를 눌러주세요.");
                    String command = IoUtil.input("> ");
                    if(command.equals("1")){
                        // 댓글 작성
                        String text = "";
                        String writer = "";
                        while (text.trim().isEmpty()){
                            text = IoUtil.input("댓글 내용을 입력하세요. > ");
                            while (text.trim().isEmpty()){
                                IoUtil.print("댓글을 입력하지 않았습니다. 다시 입력해주세요. \t\t[초기화면]: '0'입력");
                                text = IoUtil.input("> ");
                                if(text.equals("0")){
                                    break;
                                } 
                                break;
                            }
                        }                
                        while (writer.trim().isEmpty()){
                            writer = IoUtil.input("작성자를 입력하세요. > ");
                            while (writer.trim().isEmpty()){
                                IoUtil.print("작성자를 입력하지 않았습니다. 다시 입력해주세요. \t\t[초기화면]: '0'입력");
                                writer = IoUtil.input("> ");
                                if(writer.equals("0")){
                                    break;
                                } 
                                break;
                            }
                        }
                        Comment comment = new Comment(text, writer);
                        comments.addComment(comment);
                
                    } else if(command.equals("2")){
                        // 댓글 수정
                        System.out.println("2");
                    } else if(command.equals("3")){
                        // 댓글 삭제
                        System.out.println("3");
                    } else if(command.equals("")){
                        System.out.println("4");
                    }
                }
            } else {
            IoUtil.input("불러올 게시글이 없습니다. 초기화면으로 돌아갑니다.");
        }
        
    }

    // 댓글 쓰기
    public void newComment(String text, String writer){
        Comment comment = new Comment(text, writer);
        
    }

    // 댓글 보기
    public void detailComment(){
        if(comments.isNotEmpty()){
            int count = 0;
            List<Comment> list = comments.commentsList();
            for(Comment e : list){
                String text = "";
                text += count + ") " + e.getText();
                text += "\t\tby." + e.getWriter();
                IoUtil.print(text);
                count++;
            }
        } else {
            IoUtil.print("[등록된 댓글이 존재하지 않습니다.]");
        }
    }
}
