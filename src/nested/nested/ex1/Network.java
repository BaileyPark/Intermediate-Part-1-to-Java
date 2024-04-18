package nested.nested.ex1;

public class Network {

    public void sendMessage(String text) {
        NetworkMessege networkMessege = new NetworkMessege(text);
        networkMessege.print();
    }
}
