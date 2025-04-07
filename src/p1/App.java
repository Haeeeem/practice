package p1;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        // 예외 처리
        // 1. (좁은 의미) 예외를 어떻게 처리할 것인가? (문법)
        // 2. 예외를 발생시키는 문법

        Scanner scn = new Scanner(System.in);
        System.out.print("점수를 입력하세요(0 ~ 100) > ");
        String input = scn.nextLine();

        int score = -1;
        try{
            score = Integer.parseInt(input); // 뻗는다!! Worst
        } catch(Exception e){
            System.out.println("입력된 값을 숫자로 변환하는데 실패했습니다.");
            return;
        }
        

        // 넓은 의미에서 예외처리
        if(score < 0 || score > 100){
            System.out.println("범위를 벗어났습니다.");
            return;
        }

        System.out.println("입력받은 점수는 : " + score);

    }
}
