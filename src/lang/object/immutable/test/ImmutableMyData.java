package lang.object.immutable.test;

public class ImmutableMyData {

    private final int year;
    private final int month;
    private final int day;

    public ImmutableMyData(int year, int month, int day) {
        this.year = year;
        this.month = month;
        this.day = day;
    }

    public ImmutableMyData withYear(int newYear) {
        return new ImmutableMyData(newYear, month, day);
    }

    @Override
    public String toString() {
        return year + "-" + month + "-" + day;
    }
}
