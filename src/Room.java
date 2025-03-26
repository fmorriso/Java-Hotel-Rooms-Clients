class Room {


    private int roomNumber;
    private String roomType;
    private double price;
    private boolean isAvailable;

    public Room(int roomNumber, String roomType, double price) {
        this.roomNumber = roomNumber;
        this.roomType = roomType;
        this.price = price;
        this.isAvailable = true;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Room{");
        sb.append("roomNumber=").append(roomNumber);
        sb.append(", roomType='").append(roomType).append('\'');
        sb.append(", price=").append(price);
        sb.append(", isAvailable=").append(isAvailable);
        sb.append('}');
        return sb.toString();
    }

    public boolean checkAvailability() {return isAvailable;}

    public int getRoomNumber() {return roomNumber;}
    public void setRoomNumber(int roomNumber) {this.roomNumber = roomNumber;}

    public String getRoomType() {return roomType;}
    public void setRoomType(String roomType) {this.roomType = roomType;}

    public double getPrice() {return price;}
    public void setPrice(double price) {this.price = price;}
}