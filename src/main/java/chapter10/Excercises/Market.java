package chapter10.Excercises;

import org.w3c.dom.ls.LSOutput;

public class Market {
    public static void main(String[] args) {
        Fruit mango = new Mango();
        Fruit lychee = new Lychee();

        mango.setCalories(150);
        lychee.setCalories(25);

        mango.makeJuice();
        lychee.makeJuice();
        pick(mango);
        pick(lychee);

//        mango = new Lychee();
//        mango.makeJuice();

//        lychee = new Mango();
//        lychee.makeJuice();
    }

    public static void pick(Fruit fruit){
        if (fruit instanceof Mango){
            System.out.println("Climb that tall tree and smack that sucka down");
        } else if (fruit instanceof Lychee){
            System.out.println("Go to the market for that jawn");
        }
    }
}
