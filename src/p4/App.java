package p4;

public class App {
    public static void main(String[] args) {
        // exception 발생 시키기
        try {
            new AAA().method1(3);    
        } catch (Exception e) {
            
        }   
    }
}

class AAA{
    public void method1(int value) throws AppMinumsValueException, AppEvenValueException {
        if(value < 0){
            throw new AppMinumsValueException();
        }

        if(value%2==0){
            throw new AppEvenValueException();
        }

        System.out.println("value의 값: " + value);
    }
}

class AppMinumsValueException extends Exception {}
class AppEvenValueException extends Exception {}
