package acme.employeedb;

public abstract class Employee {
    private String name;
    private int id;

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

    /**
     * Returns a description of what type of employee this is.
     */
    public abstract String getRoleDescription();

    /**
     * Returns true if this employee has authorization to unlock the given room.
     */
    public abstract boolean hasAccess(Room room);
    
    /**
     * Provides a string with the employee's data, role, and access permissions.
     */
    public abstract String description();
}
