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
        return this.name;
    }

    /**
     * Returns the ID number of the employee
     */
    public int getID() {
        return this.id;
    }
    
    /**
     * Abstract method signature which will allow sublcasses to describe the employee's role
     */
    public abstract String description();

    /**
     * Whether an employee has permission to access the laboratory facilities.
     * 
     * @return true
     */
    public boolean labPermission() {
        return true;
    }

    /**
     * Whether an employee has permission to access the laboratory supply closet.
     * 
     * @return true
     */
    public boolean supplyClosetPermission() {
        return true;
    }
}
