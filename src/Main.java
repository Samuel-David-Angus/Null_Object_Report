import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        NullPerson nullPerson = new NullPerson();
        NullPet nullPet = new NullPet();
        NullVehicle nullVehicle = new NullVehicle();
        Person mom = nullPerson;
        Person dad = nullPerson;
        Person child = nullPerson;
        Pet pet = nullPet;
        Vehicle vehicle = nullVehicle;
        String input1;
        String input2;

        System.out.println("Mother info");
        System.out.println("First name: ");
        input1 = scanner.nextLine();
        System.out.println("Last name: ");
        input2 = scanner.nextLine();
        if (input1.length() > 0 && input2.length() > 0) {
            mom = new Person(input1,input2);
        }

        System.out.println("Father info");
        System.out.println("First name: ");
        input1 = scanner.nextLine();
        System.out.println("Last name: ");
        input2 = scanner.nextLine();
        if (input1.length() > 0 && input2.length() > 0) {
            dad = new Person(input1,input2);
        }

        System.out.println("Child info");
        System.out.println("First name: ");
        input1 = scanner.nextLine();
        System.out.println("Last name: ");
        input2 = scanner.nextLine();
        if (input1.length() > 0 && input2.length() > 0) {
            child = new Person(input1,input2);
        }

        System.out.println("Pet info");
        System.out.println("Animal type: ");
        input1 = scanner.nextLine();
        System.out.println("Pet name: ");
        input2 = scanner.nextLine();
        if (input1.length() > 0 && input2.length() > 0) {
            pet = new Pet(input1,input2);
        }

        System.out.println("Vehicle info");
        System.out.println("Vehicle type: ");
        input1 = scanner.nextLine();
        System.out.println("Vehicle Brand: ");
        input2 = scanner.nextLine();
        System.out.println("Vehicle Capacity: ");
        String input3 = scanner.nextLine();
        if (input1.length() > 0 && input2.length() > 0 && input3.length() > 0) {
            vehicle = new TransportationVehicle(Integer.parseInt(input3), input1,input2);
        }

        SmallFamilyHome unit1 = new SmallFamilyHome(mom, dad, child, pet, vehicle);
        unit1.displayInfo();
    }
}