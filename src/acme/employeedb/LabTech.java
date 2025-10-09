package acme.employeedb;

public class LabTech extends Employee {
    public LabTech(String name, int id) {
        super(name, id);
    }

    @Override
    public boolean hasAccess(Room room) {
        return room.getType() == RoomType.LAB;
    }
 
    @Override
    public String description() {
        return "< ID: " + this.getID() + "; Name: " + this.getName() + "; Lab Technician >\n" 
        + "\tAccess: all labs";
    }
}
