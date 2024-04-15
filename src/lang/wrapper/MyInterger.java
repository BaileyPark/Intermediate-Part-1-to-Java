package lang.wrapper;

public class MyInterger {

    private final int value;

    public MyInterger(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    public int compareTo(int targer) {
        if (value < targer) {
            return -1;
        } else if (value > targer) {
            return 1;
        } else {
            return 0;
        }
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }
}
