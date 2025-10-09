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
    void testLabTechDescription() {
        Employee labTech = new LabTech("Sally", 123);
        assertEquals(
            "< ID: 123; Name: Sally; Lab Technician >"
                + "\n\tAccess to all labs\n\tAccess to all supply closets",
            labTech.description());
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
    
    @Test
    void testMiddleManagerDescription() {
        Employee labTech = new MiddleManager("Ling", 456, 10);
        assertEquals(
            "< ID: 456; Name: Ling; Middle Manager >"
                + "\n\tAccess to offices on floor 10",
            labTech.description());
    }
}
