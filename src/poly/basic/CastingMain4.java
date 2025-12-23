package poly.basic;

// 다운캐스팅을 자동으로 하지 않는 이유
public class CastingMain4 {
    public static void main(String[] args) {
        Parent parent1 = new Child();
        Child child1 = (Child) parent1;
        child1.childMethod(); // 문제 없음

        Parent parent2 = new Parent();
        // parent2는 Parent로 생성되었기 때문에 메모리 상에 Child 자체가 존재하지 않음
        // 따라서 자바에서 사용할 수 없는 타입으로 다운캐스팅하는 경우, ClassCastException 예외 발생 
        Child child2 = (Child) parent2; // 런타임 오류 - ClassCastException
        child2.childMethod(); // 실행 불가
    }
}
