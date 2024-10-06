public class MiddleManager extends Employee {

    public MiddleManager(String name, int id) {
        super(name, id);
    }

    @Override
    public String description() {
        return "< ID: " + this.getID() + "; Name: " + this.getName() + "; Middle Manager >\n" 
        + "\tLab Access: " + this.labPermission() + "\n"
        + "\tSupply Closet Access: " + this.supplyClosetPermission();
    }

    @Override
    public boolean labPermission() { // Middle managers have not received lab safety training
        return false;
    }

    @Override
    public boolean supplyClosetPermission() { // Middle managers have not received safe materials handling training
        return false;
    }
    
}
