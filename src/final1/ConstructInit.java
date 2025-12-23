package final1;

public class ConstructInit {
    final int value;
    
    // final로 멤버 변수를 설정한 경우, 생성자를 통해 초기화 1번 가능
    public ConstructInit(int value) {
        this.value = value;
    }
}
