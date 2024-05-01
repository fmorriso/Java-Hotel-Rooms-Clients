public class Main
{
    public static void main(String[] args)
    {
        Dates d1 = new Dates(1, 2, 2024);
        Dates d2 = new Dates(1, 3, 2024);
        System.out.format("Difference in days: %d%n", Dates.StayDays(d1, d2));
    }
}
