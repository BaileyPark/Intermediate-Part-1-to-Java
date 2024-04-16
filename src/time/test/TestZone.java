package time.test;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;

public class TestZone {

    public static void main(String[] args) {
        LocalDateTime dt = LocalDateTime.of(2024, 1, 1, 9, 0, 0);
        ZonedDateTime seoulDt = ZonedDateTime.of(dt, ZoneId.of("Asia/Seoul"));
        ZonedDateTime londonDt = seoulDt.withZoneSameInstant(ZoneId.of("Europe/London"));
        ZonedDateTime new_YorkDt = seoulDt.withZoneSameInstant(ZoneId.of("America/New_York"));
        System.out.println("서울의 회의 시간: " + seoulDt);
        System.out.println("런던의 회의 시간 = " + londonDt);
        System.out.println("뉴욕의 회의 시간 = " + new_YorkDt);
    }
}
