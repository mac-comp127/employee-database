package acme.employeedb;

public class OfficesOnFloorPermission implements Permission {
    private int floor;

    public OfficesOnFloorPermission(int floor) {
        this.floor = floor;
    }

    public int getFloor() {
        return floor;
    }

    @Override
    public boolean allowsAccess(Room room) {
        return room.getType() == RoomType.OFFICE
            && room.getFloor() == floor;
    }

    @Override
    public String description() {
        return "Access to offices on floor " + getFloor();
    }
}
