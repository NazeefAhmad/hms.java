public class Room {
    private String type;
    private int costPerPerson;
    private int availableRooms;

    public Room(String type, int costPerPerson, int availableRooms) {
        this.type = type;
        this.costPerPerson = costPerPerson;
        this.availableRooms = availableRooms;
    }

    public String getType() {
        return type;
    }

    public int getCostPerPerson() {
        return costPerPerson;
    }

    public int getAvailableRooms() {
        return availableRooms;
    }

    public void bookRoom(int num) {
        if (availableRooms >= num) {
            availableRooms -= num;
        } else {
            throw new IllegalStateException("No rooms available for " + type + " room.");
        }
    }

    @Override
    public String toString() {
        return type + " Room - Cost: " + costPerPerson + " per person, Available Rooms: " + availableRooms;
    }
}
