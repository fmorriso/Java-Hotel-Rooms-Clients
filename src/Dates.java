import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Dates
{
    private int day;
    private int month;
    private int year;

    public Dates(int day, int month, int year)
    {
        this.day = day;
        this.month = month;
        this.year = year;
    }

    public static int StayDays(Dates x, Dates y)
    {
        // calculate the number of nights between the two dates and return it to caller.
        LocalDate d1 = LocalDate.of(x.getYear(), x.getMonth(), x.getDay());
        // System.out.format("d1 = %s%n", d1);
        LocalDate d2 = LocalDate.of(y.getYear(), y.getMonth(), y.getDay());
        // System.out.format("d2 = %s%n", d2);
        long diff = ChronoUnit.DAYS.between(d1, d2);
        return (int) diff;
    }

    public int getDay()
    {
        return day;
    }

    public void setDay(int day)
    {
        this.day = day;
    }

    public int getMonth()
    {
        return month;
    }

    public void setMonth(int month)
    {
        this.month = month;
    }

    public int getYear()
    {
        return year;
    }

    public void setYear(int year)
    {
        this.year = year;
    }
}
