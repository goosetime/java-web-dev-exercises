package exercises.technology;

public class SmartPhone extends Computer{
    private boolean toiletWater;

    public SmartPhone(String name, String brand, boolean toiletWater) {
        super(name, brand);
        this.toiletWater = toiletWater;
    }
}
