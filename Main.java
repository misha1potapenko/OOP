/*Урок 1. Принципы ООП: Инкапсуляция, наследование, полиморфизм
        При решении этих задач следуйте принципам абстракции, инкапсуляции, наследования, полиморфизма.
        Создайте унаследованный класс ГорячийНапиток с дополнительным полем int температура.
        Создайте класс АвтоматГорячихНапитков, реализующий интерфейс ТорговыйАвтомат и
        реализуйте перегруженный метод getProduct(int name, int volume, int temperature),
        выдающий продукт, соответствующий имени, объему и температуре.
        В main проинициализируйте несколько ГорячихНапитков и АвтоматГорячихНапитков
        и позвольте покупателю купить товар.*/


import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<HotDrinks> addHotDrinks = new ArrayList<>();
        addHotDrinks.add(new HotDrinks("tea", 500, 50,95));
        addHotDrinks.add(new HotDrinks("tea", 300, 50,95));
        addHotDrinks.add(new HotDrinks("tea", 200, 50,95));
        addHotDrinks.add(new HotDrinks("coffee", 200, 100,88));
        addHotDrinks.add(new HotDrinks("coffee", 300, 150,89));
        addHotDrinks.add(new HotDrinks("coffee", 500, 150,89));
        List<HotDrinksVendingMachine> addVendingMachine = new ArrayList<>();
        addVendingMachine.add(new HotDrinksVendingMachine(addHotDrinks));
        HotDrinksVendingMachine showAll = new HotDrinksVendingMachine(addHotDrinks);
        System.out.println("Весь список напитков ");
        showAll.showDrink();
        for (HotDrinksVendingMachine first: addVendingMachine
             ) { first.getProduct();
        }






    }
}