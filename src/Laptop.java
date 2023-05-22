public class Laptop {
    private int RAM;
    private int capacityHardDisk;
    private String OS;
    private String color;

    public Laptop(int RAM, int capacityHardDisk, String OS, String color) {
        this.RAM = RAM;
        this.capacityHardDisk = capacityHardDisk;
        this.OS = OS;
        this.color = color;
    }

    public int getRAM() {
        return RAM;
    }

    public String getColor() {
        return color;
    }

    public String getOS() {
        return OS;
    }

    public int getCapacityHardDisk() {
        return capacityHardDisk;
    }

    @Override
    public String toString() {
        return "RAM: " + RAM + ", capacityHardDisk: " + capacityHardDisk + ", OS: " + OS + ", color: " + color;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Laptop)) {
            return false;
        }
        Laptop laptop = (Laptop) obj;
        return RAM == laptop.RAM &&
                capacityHardDisk == laptop.capacityHardDisk &&
                OS.equals(laptop.OS) &&
                color.equals(laptop.color);
    }
}
