package acme.employeedb;

public class MiddleManager extends Employee {
    private int accessFloor;

    public MiddleManager(String name, int id, int homeFloor) {
        super(name, id);
        this.accessFloor = homeFloor;
    }

    @Override
    public String getRoleDescription() {
        return "Middle Manager";
    }

    @Override
    public boolean hasAccess(Room room) {
        return room.getType() == RoomType.OFFICE
            && room.getFloor() == accessFloor;
    }

    @Override
    public String description() {
        return "< ID: " + getID() + "; Name: " + getName() + "; " + getRoleDescription() + " >" 
            + "\n\tAccess to offices on floor " + accessFloor;
    }    
}
