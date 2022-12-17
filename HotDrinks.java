public  class HotDrinks extends Drinks{
    int temperature;

    public HotDrinks(String name, int volume, double price, int temperature) {
        super(name, volume, price);
        this.temperature = temperature;
    }


    @Override
    public String toString() {
        return "HotDrinks{" +
                "temperature=" + temperature +
                ", name='" + name + '\'' +
                ", volume=" + volume +
                ", price=" + price +
                '}';
    }

    public int getTemperature() {
        return temperature;
    }
}

