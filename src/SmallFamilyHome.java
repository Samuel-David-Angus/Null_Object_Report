import Persons.Person;
import Pets.Pet;
import Vehicles.Vehicle;

public class SmallFamilyHome {
    private Person mother;
    private Person father;
    private Person child;
    private Pet pet;
    private Vehicle vehicle;

    public SmallFamilyHome(Person mother, Person father, Person child, Pet pet, Vehicle vehicle) {
        this.mother = mother;
        this.father = father;
        this.child = child;
        this.pet = pet;
        this.vehicle = vehicle;
    }

    public void displayInfo() {
        if (mother != null) {
            System.out.println("Mother: " + mother.fullName());
        } else {
            System.out.println("Mother: ----");
        }
        if (father != null) {
            System.out.println("Father: " + father.fullName());
        } else {
            System.out.println("Father: ----");
        }
        if (child != null) {
            System.out.println("Child: " + child.fullName());
        } else {
            System.out.println("Child: ----");
        }
        if (pet != null) {
            System.out.println("Pets.Pet type: " + pet.getType());
            System.out.println("Pets.Pet name: " + pet.getName());
        } else {
            System.out.println("Pets.Pet type: ----");
            System.out.println("Pets.Pet name: ----");
        }
        if (vehicle != null) {
            System.out.println("Vehicle Type: " + vehicle.getType());
            System.out.println("Vehicle brand: " + vehicle.getBrand());
            System.out.println("Vehicle capacity: " + vehicle.getCapacity());
            vehicle.ride();
        } else {
            System.out.println("Vehicle brand: ----");
            System.out.println("Vehicle # of wheels: ----");
            System.out.println("Vehicle Capacity: ----");
            System.out.println("No vehicle");
        }
        /*
        System.out.println("Mother: " + mother.fullName());
        System.out.println("Father: " + father.fullName());
        System.out.println("Child: " + child.fullName());
        System.out.println("Pets.Pet type: " + pet.getType());
        System.out.println("Pets.Pet name: " + pet.getName());
        System.out.println("Vehicle Type: " + vehicle.getType());
        System.out.println("Vehicle brand: " + vehicle.getBrand());
        System.out.println("Vehicle capacity: " + vehicle.getCapacity());

         */
    }
}
