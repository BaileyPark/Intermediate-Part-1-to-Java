package time.test;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.time.temporal.TemporalAdjusters;

public class TestLoopPlus {

    public static void main(String[] args) {
        LocalDate date = LocalDate.of(2024, 1, 1);

        for (int i = 0; i < 5; i++) {
            LocalDate localDate = date.plusWeeks(i*2);
            System.out.println("날짜 " + (i+1) + ": " + localDate);
        }

        for (int i = 0; i < 5; i++) {
            LocalDate plus = date.plus(2 * i, ChronoUnit.WEEKS);
            System.out.println("날짜 " + (i+1) + ": " + plus);
        }


    }
}
