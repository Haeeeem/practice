package p1.p2;

public class App {
    public static void main(String[] args) {
        // 여러 형태의 exception
        
        try {
            System.out.println(1);
            String str = null;
            str.length();

            System.out.println(2);
            int[] arr = new int[5];
            arr[150] = 10;

            System.out.println(3);
            int result = 10/1;                
        } catch (NullPointerException e){
            System.out.println("null값이면 안됩니다.");
            return;
        } catch (IndexOutOfBoundsException e){
            System.out.println("인덱스 범위를 넘어섰습니다.");
        } catch (Exception e) {
            // e.printStackTrace();
            // System.out.println(e.getMessage());
            System.out.println("로직에 문제가 발생했습니다. 다시 시도해주세요...");    
            return;
        } finally {
            // 사용 용도... 리소스 해제 시 활용
            // ~~~ .close();
            System.out.println("익셉션이 발생하던...안하던...무조건 실행");
        }

        System.out.println("프로그램 종료");

    }
}
