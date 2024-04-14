package lang.object.immutable.test;

public class MyDataMain {

    public static void main(String[] args) {
        MyData date1 = new MyData(2024, 1, 1);
        MyData date2 = date1;
        System.out.println("date1 = " + date1);
        System.out.println("date2 = " + date2);

        System.out.println("2025 -> date1");
        date1.setYear(2025);
        System.out.println("date1 = " + date1);
        System.out.println("date2 = " + date2);
    }
}
