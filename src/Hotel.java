import java.util.ArrayList;
import java.util.List;

public class Hotel {
    private String name;
    private List<Room> rooms;

    public String getName() { return name;}
    public void setName(String name) { this.name = name; }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Hotel{");
        sb.append("name='").append(name).append('\'');
        sb.append(", rooms=").append(rooms);
        sb.append('}');
        return sb.toString();
    }

    public List<Room> getRooms() {return rooms;}

    public Hotel(String name) {
        this.name = name;
        this.rooms = new ArrayList<Room>();
    }


}
