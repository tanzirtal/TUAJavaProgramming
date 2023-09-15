package chapter9.Excercise;

public class TasteTester {
    public static void main(String[] args) {

        Cake cake = new Cake();
        cake.setFlavor("rose");
        cake.setPrice(20.00);
        System.out.println("Your cake is a " + cake.getFlavor() +" flavored cake and it cost: $" + cake.getPrice() + ".");


        BirthdayCake birthdayCake = new BirthdayCake();
        birthdayCake.setFlavor("chocolate");
        birthdayCake.setCandles(21);
        birthdayCake.setPrice(99.99);
        System.out.println("Your birthday cake is a " + birthdayCake.getFlavor() + " cake with " + birthdayCake.getCandles() + " candles, and it cost: $" + birthdayCake.getPrice() + ".");
        //System.out.println("If you would like, we could add " + weddingCake.setTiers() + " tiers to your cake, for presentation."); //weddingCake.setTiers hasn't been initialized until line 23
                                                                                                                                      // if we move sout below initialized setter, we can use this

        WeddingCake weddingCake = new WeddingCake();
        weddingCake.setFlavor("marble");
        weddingCake.setPrice(1000.00);
        weddingCake.setTiers(6);
        System.out.println("Your wedding cake is a " + weddingCake.getFlavor() + " cake with " + weddingCake.getTiers() + " tiers, and it cost: $" + weddingCake.getPrice() + ".");
        System.out.println("If you would like, we could add " + birthdayCake.getCandles() + " candles to your cake, for presentation."); // notice how birthdayCake.getCandles() works here


    }
}
