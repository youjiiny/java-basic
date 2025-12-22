package pack;

import pack.a.User;

public class PackageMain3 {
    public static void main(String[] args) {
        // 이름이 동일한 경우, 보통 자주 사용하는 클래스는 import
        // 자주 사용하지 않는 클래스는 패키지를 포함한 전체 경로 명시
        User userA = new User();
        pack.b.User userB = new  pack.b.User();
    }
}
