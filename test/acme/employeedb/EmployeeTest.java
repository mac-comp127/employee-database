package acme.employeedb;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class EmployeeTest {
    @Test
    void testLabTechAccess() {
        Employee labTech = new LabTech("Sally", 1);
        assertTrue(labTech.hasAccess(new Room(100, RoomType.LAB)));
        assertTrue(labTech.hasAccess(new Room(100, RoomType.SUPPLY_CLOSET)));
        assertFalse(labTech.hasAccess(new Room(100, RoomType.OFFICE)));
    }

    @Test
    void testMiddleManagerAccess() {
        Employee labTech = new MiddleManager("Ling", 1, 3);
        assertTrue(labTech.hasAccess(new Room(300, RoomType.OFFICE)));
        assertTrue(labTech.hasAccess(new Room(399, RoomType.OFFICE)));
        assertFalse(labTech.hasAccess(new Room(400, RoomType.OFFICE)));
        assertFalse(labTech.hasAccess(new Room(300, RoomType.LAB)));
        assertFalse(labTech.hasAccess(new Room(300, RoomType.SUPPLY_CLOSET)));
    }
}
