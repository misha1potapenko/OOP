
import java.util.List;
import java.util.Scanner;



public class HotDrinksVendingMachine  implements VendingMachine{
    private List<HotDrinks> hotDrinks;

    public HotDrinksVendingMachine(List<HotDrinks> hotDrinks) {
        this.hotDrinks = hotDrinks;
    }

    public HotDrinks  getProduct(String choose, int volume){
        System.out.print("Введите имя продукта из списка (teaSmall, coffeeBig, tea, coffee) ");
        Scanner choose3 = new Scanner(System.in);
        String newChoose = choose3.nextLine();
        HotDrinks product = null;
        System.out.print("Введите объем продукта из списка (500, 200) ");
        Scanner choose2 = new Scanner(System.in);
        int newChoose2 = choose2.nextInt();
        for (HotDrinks drink: hotDrinks
             ) { if (newChoose.equals(drink.getName()) & newChoose2 == drink.getVolume() ) {
            System.out.println(drink);
            product = drink;
        }
        }
        return product;

    }
    public HotDrinks  getProduct(){
        System.out.print("Введите имя продукта из списка (tea, coffee) ");
        Scanner choose = new Scanner(System.in);
        String newChoose = choose.nextLine();
        HotDrinks product = null;
        System.out.print("Введите объем продукта из списка (500, 300, 200) ");
        Scanner choose2 = new Scanner(System.in);
        int newChoose2 = choose2.nextInt();
        for (HotDrinks drink: hotDrinks
        ) { if (newChoose.equals(drink.getName()) & newChoose2 == drink.getVolume() ) {
            System.out.print("Ваш напиток: ");
            System.out.println(drink);
            product = drink;
        }
        }
        return product;

    }



    @Override
    public void showDrink() {
        System.out.println(hotDrinks);
    }

    }


