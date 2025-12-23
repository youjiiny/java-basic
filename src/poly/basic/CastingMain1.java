package poly.basic;

public class CastingMain1 {
    public static void main(String[] args) {
        // 부모 변수가 자식 인스턴스 참조(다형적 참조)
        Parent poly = new Child();
        // 단 자식의 기능은 호출할 수 없다. 컴파일 오류 발생
        // poly.childMethod();

        // 다운캐스팅 (부모 타입 -> 자식 타입)
        // poly를 강제로 parent 타입에서 child 타입으로 변경
        // 특정 타입으로 변경하는 것을 캐스팅이라 함
        Child child = (Child) poly;
        child.childMethod();
    }
}
