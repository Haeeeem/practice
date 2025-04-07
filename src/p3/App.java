package p3;

import java.io.FileOutputStream;

public class App {
    public static void main(String[] args) {
        // 실제로 여러분들이 사용해야 되는 try - catch
        // 몇몇 API들은 문법적으로 try - catch를 사용해야만 문법 오류를 해결할 수 있다.
        // 네트워크, 파일 입출력... 그 외 자잘한 것들
        Math.random();
        
        try {
            FileOutputStream fos = new FileOutputStream("C:\\temp\\aa.jpg");    
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
