public class Drinks {
    String name;
    int volume;
    double price;

    public Drinks(String name, int volume, double price) {
        this.name = name;
        this.volume = volume;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public int getVolume() {
        return volume;
    }

    public double getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "Drinks{" +
                "name='" + name + '\'' +
                ", volume=" + volume +
                ", price=" + price +
                '}';
    }
}
