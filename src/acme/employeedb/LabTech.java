package acme.employeedb;

public class LabTech extends Employee {
    public LabTech(String name, int id) {
        super(name, id);
    }

    @Override
    public String getRoleDescription() {
        return "Lab Technician";
    }

    @Override
    public boolean hasAccess(Room room) {
        return room.getType() == RoomType.LAB
            || room.getType() == RoomType.SUPPLY_CLOSET;
    }
 
    @Override
    public String description() {
        return "< ID: " + getID() + "; Name: " + getName() + "; " + getRoleDescription() + " >" 
            + "\n\tAccess to all labs"
            + "\n\tAccess to all supply closets";
    }
}
