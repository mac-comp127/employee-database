public class MiddleManager extends Employee {
    private int accessFloor;

    public MiddleManager(String name, int id, int homeFloor) {
        super(name, id);
        this.accessFloor = homeFloor;
    }

    @Override
    public boolean hasAccess(Room room) {
        return room.getType() == RoomType.OFFICE
            && room.getFloor() == accessFloor;
    }

    @Override
    public String description() {
        return "< ID: " + this.getID() + "; Name: " + this.getName() + "; Middle Manager >\n" 
        + "\tAccess: offices on floor " + this.accessFloor;
    }    
}
