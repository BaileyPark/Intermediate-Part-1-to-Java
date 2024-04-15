package lang.wrapper;

public class MyIntegerMethodMain1 {

    public static void main(String[] args) {
        MyInterger myInterger = new MyInterger(10);
        int i1 = myInterger.compareTo(5);
        int i2 = myInterger.compareTo(10);
        int i3 = myInterger.compareTo(20);
        System.out.println("i1 = " + i1);
        System.out.println("i2 = " + i2);
        System.out.println("i3 = " + i3);
    }
}
