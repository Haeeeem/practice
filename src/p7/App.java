package p7;

import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception{
        new AAA().test();
        System.out.println("프로그램 종료!");        
    }
}

class AAA{
    public void test()throws Exception{
        new BBB().test();
    }
}

class BBB{
    public void test()throws Exception{
        new CCC().test();
    }
}

class CCC{
    public void test() throws Exception{
        int value = (int)(Math.random()*100);
        System.out.println(value);
        if (value < 50) {
            throw new Exception("어쩌고 저쩌고...");
        }
        System.out.println("....");
    }
}