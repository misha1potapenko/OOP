public abstract class HotDrinks extends Drinks{
    int temperature;

    public HotDrinks(String name, int volume, double price, int temperature) {
        super(name, volume, price);
        this.temperature = temperature;
    }
}

