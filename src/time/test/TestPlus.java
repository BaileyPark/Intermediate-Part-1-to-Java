package time.test;

import java.time.Duration;
import java.time.LocalDateTime;
import java.time.Period;

public class TestPlus {

    public static void main(String[] args) {
        LocalDateTime dt = LocalDateTime.of(2024, 1, 1, 0, 0, 0);
        System.out.println("dt = " + dt);

        Period period = Period.of(1, 2, 3);
        Duration duration = Duration.ofHours(4);
        LocalDateTime plusDt = dt.plus(period).plus(duration);
        System.out.println("plusDt = " + plusDt);

        LocalDateTime dateTime = dt.plusYears(1).plusMonths(2).plusDays(3).plusHours(4);
        System.out.println("dateTime = " + dateTime);
    }
}
