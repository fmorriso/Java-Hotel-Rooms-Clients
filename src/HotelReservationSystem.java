import java.time.LocalDate;

public class HotelReservationSystem
{
    public static void main(String[] args)
    {
        System.out.format("Java version: %s%n", getJavaVersion());

        /*
        Dates d1 = new Dates(1, 2, 2024);
        Dates d2 = new Dates(1, 3, 2024);
        System.out.format("Difference in days: %d%n", Dates.StayDays(d1, d2));
        */
        Hotel hotel = new Hotel("Grand Hotel");
        System.out.println(hotel);
    }

    public boolean bookRoom(Guest guest, LocalDate startDate, LocalDate endDate) {
        // Logic to find an available room and create a reservation
        return true;
    }

    public void listAvailableRooms(LocalDate date) {
        // Logic to filter and display available rooms
    }

    /** get the java version that is running the current program
     * @return string containing the java version running the current program
     */
    private static String getJavaVersion()
    {
        Runtime.Version runTimeVersion = Runtime.version();
        return String.format("%s.%s.%s.%s", runTimeVersion.feature(), runTimeVersion.interim(), runTimeVersion.update(), runTimeVersion.patch());
    }
}
