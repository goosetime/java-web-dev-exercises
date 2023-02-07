package exercises.technology;

public class Computer {
    private String name;
    private String brand;
    private boolean mainframeHacked;
    private boolean isHungry;

    public Computer(String name, String brand) {
        super();
        this.name = name;
        this.brand = brand;
        this.mainframeHacked = false;
        this.isHungry = true;
    }
    ///// GETTERS AND SETTERS
    public String getBrand() {
        return brand;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isMainframeHacked() {
        return mainframeHacked;
    }

    public void setMainframeHacked(boolean mainframeHacked) {
        this.mainframeHacked = mainframeHacked;
    }

    public boolean isHungry() {
        return isHungry;
    }

    public void setHungry(boolean hungry) {
        isHungry = hungry;
    }
    ///// END G&S
    public void speakToDevice(String message) {
        if (this.isHungry() == true) {
            System.out.println("I AM HUNGRY");
        } else if (this.isMainframeHacked() == true) {
            System.out.println("THEY'VE HACKED INTO THE MAINFRAME");
        } else {
            System.out.println("I DO NOT UNDERSTAND " + message);
        }
    }
    public void feedDevice(String food) {
        if (food.length() >= 7) {
            setHungry(false);
            System.out.println("Mmm, tasty!");
        } else {
            System.out.println("I'M STILL HUNGRY");
        }
    }
}
