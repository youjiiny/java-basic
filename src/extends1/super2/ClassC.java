package extends1.super2;

public class ClassC extends ClassB{
    public ClassC(){
        // 기본 생성자인 경우에만 super(); 생략 가능
        super(10,20); //부모가 기본 생성자가 없으면 직접 super로 지정
        System.out.println("ClassC 생성자");
    }
}
