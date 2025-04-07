package p10;

import java.io.BufferedOutputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileOutputStream;

public class App {
    public static void main(String[] args) throws Exception{
        int a = 0x11223344;

        File file = new File("C:/temp/qqq.dat");
        FileOutputStream fileOutputStream = new FileOutputStream(file);
        BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(fileOutputStream);
        DataOutputStream dataOutputStream = new DataOutputStream(bufferedOutputStream);

        dataOutputStream.writeInt(a);
        dataOutputStream.writeInt(a);
        dataOutputStream.writeInt(a);
        dataOutputStream.writeInt(a);
        dataOutputStream.writeInt(a);
        dataOutputStream.writeInt(a);
        dataOutputStream.writeUTF("안녕하세요!!!");

        dataOutputStream.close();
        bufferedOutputStream.close();
        fileOutputStream.close();


    }
}
