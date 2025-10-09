package acme.employeedb;

public interface Permission {
    boolean allowsAccess(Room room);
    String description();
}
