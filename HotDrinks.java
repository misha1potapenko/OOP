public  class HotDrinks extends Drinks{
    int temperature;

    public HotDrinks(String name, int volume, double price, int temperature) {
        super(name, volume, price);
        this.temperature = temperature;
    }


    @Override
    public String toString() {
        return "HotDrinks{" +
                " name='" + name + '\'' +
                ", volume=" + volume +
                ", price=" + price +
                ", temperature=" + temperature +
                '}';
    }

    public int getTemperature() {
        return temperature;
    }
}

