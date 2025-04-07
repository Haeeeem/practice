package p8;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class App {
    public static void main(String[] args) {
        // 우리 기준 실 사용 예시
        // 목적: API활용시 문법 오류는 어떻게든 피해보자
        // 네트워크, 파일입출력은 특히... checked 예외 API가 많다.

        byte a = 'A';

        File file = new File("C:\\temp\\aaa.txt"); //윈도우
        // File file = new File("/Users/..../temp/aaa.txt"); 맥북
        // FileOutputStream fileOutputStream = null;
        // try {
        //     fileOutputStream = new FileOutputStream(file);    
        //     fileOutputStream.write(a);
        //     // Thread.sleep(60000);
        // } catch (Exception e) {
        //     e.printStackTrace();
        // } finally {
        //     if(fileOutputStream != null){
        //         try{
        //             fileOutputStream.close();
        //         }
        //         catch(Exception e){
        //             e.printStackTrace();
        //         }
        //     }
        // }
        
        // try with resource
        try(FileOutputStream fileOutputStream = new FileOutputStream(file)){
            fileOutputStream.write(a);
        } catch (Exception e){
            e.printStackTrace();
        }

        System.out.println("파일 생성 완료");
    }
}
