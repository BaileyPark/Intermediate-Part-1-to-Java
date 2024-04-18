package nested.nested.ex2;

public class Network {

    public void sendMessage(String text) {
        NetworkMessege networkMessege = new NetworkMessege(text);
        networkMessege.print();
    }

    private static class NetworkMessege {

        private String content;

        public NetworkMessege(String content) {
            this.content = content;
        }

        public void print() {
            System.out.println(content);
        }
    }
}