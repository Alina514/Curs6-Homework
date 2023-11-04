import Bottle.Bottle;
import Product.Product;
import model.Person;

public class Main {
    public static <bottle> void main(String[] args) {
        //Ex1
        Person friend = new Person("Mihai", 30, "yes");
        System.out.println("My person: " + friend.getName() + "," + friend.getAge() + "," + friend.getMarried());

        //Ex2
        Person one = new Person("Florin", 45, "no");
        System.out.println("My first person: " + one.getName() + ", " + one.getAge() + " ," + one.getMarried());

        Person two = new Person("Alin", 35, "yes");
        System.out.println("My second person: " + two.getName() + ", " + two.getAge() + " ," + two.getMarried());

        Person three = new Person("Ioana", 29, "no");
        System.out.println("My thrird person: " + three.getName() + ", " + three.getAge() + " ," + three.getMarried());

        //Ex3

        Product apple = new Product("Apple", 5, 50, "fruits");
        System.out.println("My product: " + apple.getName() + "," + apple.getPrice() + "," + apple.getQuantity() + "," + apple.getCategory());

        String result = null;
        if (apple.getQuantity() > 0 ) {
            result = String.valueOf(true);
        }
            System.out.println(result );

        String category =  null;
        String param1 = String.valueOf(10);
        if(apple.getCategory().equals(param1)){
            result = String.valueOf(true);
        }
        System.out.println(result );

        //Ex4.

        //Ex5
        Bottle myBottle =  new Bottle(1000, 500, false);
        System.out.println("My bottle's capacity is:" + myBottle.getTotalCapacity() + "liters, available liquid is: " + myBottle.getAvailableLiquid() + "liters. It is open? " + myBottle.getIsOpen());

    }
}
