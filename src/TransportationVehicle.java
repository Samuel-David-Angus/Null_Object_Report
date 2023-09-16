public class TransportationVehicle implements Vehicle{
    private int capacity;
    private String type;
    private String brand;

    public TransportationVehicle(int capacity, String type, String brand) {
        this.capacity = capacity;
        this.type = type;
        this.brand = brand;
    }

    @Override
    public void ride() {
        System.out.println(type + " go vroooom");
    }

    @Override
    public int getCapacity() {
        return capacity;
    }

    @Override
    public String getBrand() {
        return brand;
    }

    @Override
    public String getType() {
        return type;
    }
}
