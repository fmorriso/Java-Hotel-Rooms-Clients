import java.time.Duration;
import java.time.LocalDate;

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
        LocalDate d2 = LocalDate.of(y.getYear(), y.getMonth(), y.getDay());
        Duration diff = Duration.between(d1, d2);
        return (int) diff.toDays();
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
