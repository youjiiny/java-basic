package final1;

public class ConstantMain2 {
    public static void main(String[] args) {
        System.out.println("프로그램 참여자 수 " + Constant.MAX_USERS);
        int userCount = 999;
        process(userCount++);
        process(userCount++);
        process(userCount++);
    }
    private static void process(int userCount){
        System.out.println("참여자 수: "+userCount);
        if(userCount > Constant.MAX_USERS) {
            System.out.println("대기자로 등록합니다.");
        } else {
            System.out.println("게임에 참여합니다.");
        }
    }
}
