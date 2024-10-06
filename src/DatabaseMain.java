import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class DatabaseMain {

    /**
     * A helper method to print the list of program commands
     */
    private static void printHelp() {
        System.out.println("Available Commands:");
        System.out.println("ADD - initiate adding a member to the database");
        System.out.println("REMOVE - initiate removing a member from the database");
        System.out.println("LIST - see a list of all current members");
        System.out.println("QUIT - exit the program");
    }

    /**
     * Static helper method to add a new member to the employees list
     * 
     * @param sc Scanner for user input
     * @param members Employees list
     * @param id New Employee ID number
     */
    public static void addMember(Scanner sc, List<Employee> members, int id) {
        System.out.print("Enter the name of the employee to add: ");
        String name = sc.nextLine();
        System.out.println("Which of the following is " + name + "?");
        System.out.println("1. Lab Technician");
        System.out.println("2. Middle Manager");
        System.out.print("> ");

        int type = sc.nextInt();
        if(type == 1) {
            members.add(new LabTech(name, id));

        } else if (type == 2) {
            members.add(new MiddleManager(name, id));

        } else {
            System.out.println("Not a valid entry. Exiting to main menu.");
        }
        sc.nextLine(); // clear the hanging newline out of the buffer
    }

    /**
     * A static helper method to remove a member from the employees list
     * 
     * @param sc Scanner for user input
     * @param members The list of employees
     */
    public static void removeMember(Scanner sc, List<Employee> members) {
        System.out.print("Enter the ID number of the employee to remove: ");
        int id = sc.nextInt();
        sc.nextLine();

        for(int i = 0; i < members.size(); i++) {
            if(members.get(i).getID() == id) {
                System.out.println("Removing " + members.get(i).getName());
                members.remove(i);
                return;
            }
        }

        System.out.println("Could not find an employee with ID #" + id);

    }

    public static void main(String[] args) {
        List<Employee> members = new ArrayList<>(); // List to hold all of a company's employees
        int idCounter = 1; // A counter to ensure unique employee ID numbers

        System.out.println("Welcome to Database Manager 3000!\n Our company philosophy: data management peaked in 1983!");
        Scanner sc = new Scanner(System.in);
        while(true) {
            System.out.print("Please enter a command, or HELP for help: ");
            String input = sc.nextLine();

            if(input.equalsIgnoreCase("QUIT")) { //quit the program
                break;
            }

            if(input.equalsIgnoreCase("help")) { // print list of commands
                printHelp();

            } else if(input.equalsIgnoreCase("list")) { // listing members
                for(Employee f : members) {
                    System.out.println(f.description());
                    System.out.println();
                }

            } else if(input.equalsIgnoreCase("add")) { // adding a member
                addMember(sc, members, idCounter);
                idCounter++;

            } else if(input.equalsIgnoreCase("remove")) { // removing a member
                removeMember(sc, members);

            } else { // invalid command
                System.out.println("Entered: " + input);
                System.out.println("Please enter a valid command");
            }

        }
        

    }
    
}
