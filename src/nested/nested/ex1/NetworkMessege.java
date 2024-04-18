package nested.nested.ex1;

// Network 객체 안에서만 사용
public class NetworkMessege {

    private String content;

    public NetworkMessege(String content) {
        this.content = content;
    }

    public void print() {
        System.out.println(content);
    }
}
