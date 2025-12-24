package poly.ex3;

// 인스턴스를 직접 생성할 수 없으며 부모 역할을 하는 추상 클래스
public abstract class AbstractAnimal {
    // 추상 메서드는 메서드 바디가 없음
    // 추상 메서드가 하나라도 있으면 추상 클래스로 선언해야 함
    // 추상 메서드는 상속 받는 자식 클래스가 반드시 오버라이딩해야 함
    public abstract void sound();

    // 자식이 상속받아서 사용할 수 있는 메서드로 추상 메서드가 아님
    public void move(){
        System.out.println("동물이 움직입니다.");
    }
}
