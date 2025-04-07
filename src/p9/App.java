package p9;

import java.io.File;
import java.io.FileOutputStream;

public class App {
    public static void main(String[] args) throws Exception {
        // 파일 입출력 API
        // 실질적으로 파일 입출력시에는 고수준의 API를 활용하는 경우가 많다.
        // 수업 자체는 저수준의 API를 활용
        // 목표: 코드로 파일이 저장되는구나... 야호 신난다.
        // 바이트 스트림에 대한 이해??... 헥사 코드... 등등
        // 파일 구조: 메타데이터(헤더) 로우데이터(실제 데이터)
        // 넘어가도 되기는 한데... 빅엔디언, 리틀엔디언

        // output: 출력, input: 입력

        int a = 0x0f1c0033; // 비트로 보면 00001111 00011100 ...

        // File: 파일 혹은 디렉토리(폴더) 정보 컨트롤
        File file = new File("C:/temp/qwer.dat");
        FileOutputStream fileOutputStream = new FileOutputStream(file);

        // Big Endian
        fileOutputStream.write(a >> 24); // 0x0000000f
        fileOutputStream.write(a >> 16); // 0x00000f1c
        fileOutputStream.write(a >> 8); // 0x000f1c00
        fileOutputStream.write(a >> 0); // 0x0f1c0033

        // little Endian
        fileOutputStream.write(a >> 0); // 0x0f1c0033
        fileOutputStream.write(a >> 8); // 0x000f1c00
        fileOutputStream.write(a >> 16); // 0x00000f1c
        fileOutputStream.write(a >> 24); // 0x0000000f

        fileOutputStream.close();

        System.out.println("파일 생성 완료");
    }
}
