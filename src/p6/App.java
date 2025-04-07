package p6;

public class App {
    public static void main(String[] args) {
        try {
            AAA.test(-32);    
        } catch (Exception e) {
            System.out.println("오류지만 어찌됐건 잡음");
        }
        System.out.println("프로그램 종료");
    }
}

class AAA{
    public static void test(int value) {
        if(value < 0){
            throw new AppMinusException();
        }
        System.out.println("야호!!" + value);
    }
}

class AppMinusException extends RuntimeException {}
