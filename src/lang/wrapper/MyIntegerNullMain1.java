package lang.wrapper;

public class MyIntegerNullMain1 {

    public static void main(String[] args) {
        MyInterger[] intArr = {new MyInterger(-1), new MyInterger(0), new MyInterger(1), new MyInterger(2), new MyInterger(3)};

        System.out.println(findValue(intArr, -1));
        System.out.println(findValue(intArr, 0));
        System.out.println(findValue(intArr, 1));
        System.out.println(findValue(intArr, 2));
        System.out.println(findValue(intArr, 100));


    }

    private static MyInterger findValue(MyInterger[] intArr, int target) {
        for (MyInterger i : intArr) {
            if (i.getValue() == target) {
                return i;
            }
        }
        return null;
    }
}
