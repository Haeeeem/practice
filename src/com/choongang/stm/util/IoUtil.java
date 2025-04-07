package com.choongang.stm.util;

import java.util.Scanner;

// 강사의 실제 목적: static 앞으로 안 쓸것 같아서... ㅠㅠ
public class IoUtil {

    private static final Scanner scanner = new Scanner(System.in);

    private IoUtil() {}

    public static void print(String text) {
        System.out.println(text);
    }

    public static String input(String prompt) {
        System.out.print(prompt);
        return scanner.nextLine();
    }

    public static void pause() {
        System.out.println("계속 하시려면 enter를 입력해주세요...");
        scanner.nextLine();
    }

}
