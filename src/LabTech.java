public class LabTech extends Employee {

    public LabTech(String name, int id) {
        super(name, id);
    }

    @Override
    public String description() {
        return "< ID: " + this.getID() + "; Name: " + this.getName() + "; Lab Technician >\n" 
        + "\tLab Access: " + this.labPermission() + "\n"
        + "\tSupply Closet Access: " + this.supplyClosetPermission();
    }
    
}
