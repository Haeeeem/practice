package com.haemin.board.util;

import java.util.Scanner;


public class IoUtil {
    private static Scanner scanner = new Scanner(System.in);

    public static void print (String text){
        System.out.println(text);
    }

    public static void print (int text){
        System.out.println(text);
    }

    public static String input (String prompt){
        System.out.print(prompt);
        return scanner.nextLine();
    }

    public static int input (int prompt){
        System.out.print(prompt);
        return scanner.nextInt();
    }
}
