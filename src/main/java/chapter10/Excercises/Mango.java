package chapter10.Excercises;

public class Mango extends Fruit {

    public void peel(){
        System.out.println("Don't be afraid, use your fingers!");
    }

    public int Mango(int calories) {
        return calories;
    }

    @Override
    public void makeJuice() {
        System.out.println("Mango juice is made");
    }
}
