package acme.employeedb;

import java.util.ArrayList;
import java.util.List;

public abstract class Employee {
    private String name;
    private int id;
    private List<Permission> permissions = new ArrayList<>();

    /**
     * Constructor method for ceating an Emloyee object.
     * 
     * As this is an abstract class, this constructor functions mainly to reduce code duplication in subclasses.
     * 
     * @param name
     * @param id
     */
    public Employee(String name, int id) {
        this.name = name;
        this.id = id;
    }

    /**
     * Returns the name of the employee
     */
    public String getName() {
        return name;
    }

    /**
     * Returns the ID number of the employee
     */
    public int getID() {
        return id;
    }

    public void addPermission(Permission permission) {
        permissions.add(permission);
    }

    /**
     * Returns a description of what type of employee this is.
     */
    public abstract String getRoleDescription();

    /**
     * Returns true if this employee has authorization to unlock the given room.
     */
    public final boolean hasAccess(Room room) {
        for (Permission permission : permissions) {
            if (permission.allowsAccess(room)) {
                return true;
            }
        }
        return false;
    }
    
    /**
     * Provides a string with the employee's data, role, and access permissions.
     */
    public final String description() {
        String result = "< ID: " + getID() + "; Name: " + getName() + "; " + getRoleDescription() + " >";
        for (Permission permission : permissions) {
            result += "\n\t";
            result += permission.description();
        }
        return result;
    }    
}
