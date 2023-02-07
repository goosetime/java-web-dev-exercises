package exercises.technology;

public class Laptop extends Computer{
    private boolean hasTouchscreen;
    public Laptop(String name, String brand, boolean hasTouchscreen) {
        super(name, brand);
        this.hasTouchscreen = hasTouchscreen;
        }
}
