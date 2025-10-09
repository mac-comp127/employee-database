
/**
 * A specific room in the ACME Corporation.
 */
public final class Room {
    private final int number;
    private final RoomType type;

    public Room(int number, RoomType type) {
        this.number = number;
        this.type = type;
    }

    /**
     * Returns the room number, e.g. 256.
     */
    public int getNumber() {
        return number;
    }

    /**
     * Returns which floor of the building the room is on. Floors of the building are numbered in
     * multiples of 100, i.e. room 256 is on floor 2.
     */
    public int getFloor() {
        return number / 100;
    }

    /**
     * Describes what kind of room this is. Different rooms have different layouts and different
     * purposes.
     */
    public RoomType getType() {
        return type;
    }

    @Override
    public String toString() {
        return "Room " + getNumber() + " (" + getType() + ")";
    }
}
