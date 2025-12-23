package final1;

public class ConstantMain1 {
    public static void main(String[] args) {
        System.out.println("프로그램 참여자 수 " + 1000);
        int userCount = 999;
        process(userCount++);
        process(userCount++);
        process(userCount++);
    }
    private static void process(int userCount){
        System.out.println("참여자 수: "+userCount);
        if(userCount > 1000) {
            System.out.println("대기자로 등록합니다.");
        } else {
            System.out.println("게임에 참여합니다.");
        }
    }
}
