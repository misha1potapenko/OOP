import java.util.HashSet;
import java.util.Set;


public class HotDrinksVendingMachine  implements VendingMachine{



    public Set<HotDrinks> addHotDrinks(){
        Set<HotDrinks> hotDrinks = new HashSet<HotDrinks>();
        Set<Drinks> drinks = new HashSet<Drinks>();
        hotDrinks.add(new HotDrinks("tea",300, 86, 90));
        hotDrinks.add(new HotDrinks("coffee",300, 120, 88));
        drinks.add(new Drinks("water", 500, 54));
        System.out.println();
        return hotDrinks;
    }
    public Set<Drinks> addDrinks(){
        Set<Drinks> drinks = new HashSet<Drinks>();
        drinks.add(new Drinks("water", 500, 54));
        drinks.add(new Drinks("coldTea", 500, 126));
        System.out.println();
        return drinks;
    }


    @Override
    public void issuingDrink() {
        System.out.println("Получите ваш напиток");
    }

    }


