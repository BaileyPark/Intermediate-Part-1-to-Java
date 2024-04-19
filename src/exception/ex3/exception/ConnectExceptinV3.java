package exception.ex3.exception;

public class ConnectExceptinV3 extends NetworkClientExceptionV3 {

    private final String address;

    public ConnectExceptinV3(String address, String message) {
        super(message);
        this.address = address;
    }

    public String getAddress() {
        return address;
    }
}
