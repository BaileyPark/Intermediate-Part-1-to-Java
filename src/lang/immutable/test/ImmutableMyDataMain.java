package lang.immutable.test;

public class ImmutableMyDataMain {

    public static void main(String[] args) {
        ImmutableMyData date1 = new ImmutableMyData(2024, 1, 1);
        ImmutableMyData date2 = date1;
        System.out.println("date1 = " + date1);
        System.out.println("date2 = " + date2);

        System.out.println("2025 -> date1");
        date1 = date1.withYear(2025);
        System.out.println("date3 = " + date1);
        System.out.println("date2 = " + date2);
    }
}
