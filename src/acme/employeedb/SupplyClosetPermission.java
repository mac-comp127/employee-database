package acme.employeedb;

public class SupplyClosetPermission implements Permission {

    @Override
    public boolean allowsAccess(Room room) {
        return room.getType() == RoomType.SUPPLY_CLOSET;
    }

    @Override
    public String description() {
        return "Access to all supply closets";
    }
}
