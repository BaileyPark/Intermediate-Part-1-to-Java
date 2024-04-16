package time.test;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.temporal.TemporalAdjusters;
import java.util.Scanner;

public class TestCanlendarPrint {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("년도를 입력하세요: ");
        int year = scanner.nextInt();
        System.out.print("월를 입력하세요: ");
        int month = scanner.nextInt();

        printCalrendar(year, month);
    }

    private static void printCalrendar(int year, int month) {
        LocalDate firstDayOfMonth = LocalDate.of(year, month, 1);
        LocalDate firstDayOfNextMonth = firstDayOfMonth.plusMonths(1);
        DayOfWeek dayOfWeek = firstDayOfMonth.getDayOfWeek();
        int offset = dayOfWeek.getValue() % 7;

        System.out.println("Su Mo Tu We Th Fr Sa");
        for (int i = 0; i < offset; i++) {
            System.out.print("   ");
        }

        while (firstDayOfMonth.isBefore(firstDayOfNextMonth)) {
            //System.out.print(firstDayOfMonth.getDayOfMonth() + " ");
            System.out.printf("%2d ", firstDayOfMonth.getDayOfMonth());
            if (firstDayOfMonth.getDayOfWeek() == DayOfWeek.SATURDAY) {
                System.out.println();
            }
            firstDayOfMonth = firstDayOfMonth.plusDays(1);
        }
    }

}
