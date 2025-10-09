package acme.employeedb;

public class LabTech extends Employee {
    public LabTech(String name, int id) {
        super(name, id);
        addPermission(new LabPermission());
        addPermission(new SupplyClosetPermission());
    }

    @Override
    public String getRoleDescription() {
        return "Lab Technician";
    }
}
