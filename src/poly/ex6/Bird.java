package poly.ex6;

// extends를 통한 상속은 하나만 가능하고 implements를 통한 다중 구현은 여러 개 가능
// 클래스, 인터페이스 상속이 모두 있는 경우, extends 키워드를 먼저 작성
public class Bird extends AbstractAnimal implements Fly{
    @Override
    public void sound() {
        System.out.println("짹짹");
    }

    @Override
    public void fly() {
        System.out.println("새 날기");
    }
}
