public class NullVehicle implements Vehicle{
    @Override
    public void ride() {
        System.out.println("No vehicle");
    }

    @Override
    public int getCapacity() {
        return 0;
    }

    @Override
    public String getBrand() {
        return "----";
    }

    @Override
    public String getType() {
        return "----";
    }
}
