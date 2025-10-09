package acme.employeedb;

public class MiddleManager extends Employee {
    public MiddleManager(String name, int id, int homeFloor) {
        super(name, id);
        this.accessFloor = homeFloor;
        addPermission(new OfficesOnFloorPermission(homeFloor));
    }

    @Override
    public String getRoleDescription() {
        return "Middle Manager";
    }
}
