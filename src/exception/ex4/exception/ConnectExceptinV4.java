package exception.ex4.exception;

public class ConnectExceptinV4 extends NetworkClientExceptionV4 {

    private final String address;

    public ConnectExceptinV4(String address, String message) {
        super(message);
        this.address = address;
    }

    public String getAddress() {
        return address;
    }
}
