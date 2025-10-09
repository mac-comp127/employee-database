package acme.employeedb;

public class LabPermission implements Permission {

    @Override
    public boolean allowsAccess(Room room) {
        return room.getType() == RoomType.LAB;
    }

    @Override
    public String description() {
        return "Access to all labs";
    }
}
