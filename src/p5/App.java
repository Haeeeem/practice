package p5;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class App {
    public static void main(String[] args) {
        // JAVA는 exception이 크게 두종류가 있다.
        // Exception 상속받은 클래스: Checked 예외(exception) - 문법적으로 try를 사용하지
            // 않으면 문법 오류(자바만의 특징)
        // RuntimeException 상속받은 클래스: Unchecked 예외(exception)
        // 사실 RuntimeException도 Exception을 상속 받았음


        try {
            FileOutputStream fos = new FileOutputStream("aaa,jpg");    
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        

        String value = "fff";
        int qqq = Integer.parseInt(value);

    }
}
