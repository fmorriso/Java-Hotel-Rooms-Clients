import java.time.LocalDate;

class Reservation {
    private Guest guest;
    private Room room;
    private LocalDate startDate;
    private LocalDate endDate;

    public Reservation(Guest guest, Room room, LocalDate startDate, LocalDate endDate) {
        this.guest = guest;
        this.room = room;
        this.startDate = startDate;
        this.endDate = endDate;
    }

    public Guest getGuest() { return guest; }
    public void setGuest(Guest guest) {this.guest = guest;}

    public Room getRoom() {return room;}
    public void setRoom(Room room) {this.room = room;}

    public LocalDate getStartDate() {return startDate;}
    public void setStartDate(LocalDate startDate) {this.startDate = startDate;}

    public LocalDate getEndDate() {return endDate;}
    public void setEndDate(LocalDate endDate) {this.endDate = endDate;}
}