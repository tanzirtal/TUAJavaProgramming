package chapter10;

public class Zoo {
    public static void main(String[] args) {

        Dog wilson = new Dog();
        wilson.fetch();
        wilson.makeSound();
        feed(wilson); //able to do this because wilson is of Animal superclass


        Animal charles = new Dog(); //Polymorphism example: instantiate sparky as a dog. Sparky is of the Animal type
        charles.makeSound();         // since we @override in Dog.java, sparky will still output print statement "woof" and not Animal.java print statement
        feed(charles);

        charles = new Cat(); //since charles is of type animal, it can become both subclasses (cat or dog)
        charles.makeSound();
        ((Cat) charles).scratch(); //((class) object) casts the object to the necessary class to pull methods
        feed(charles);             // in this example, we cast charles as Cat subclass and not Animal parent class to access .scratch() method
                                   // otherwise, this would not be possible keeping it as Animal parent class (only specific to this call)

    }

    public static void feed(Animal animal){

        if(animal instanceof Dog){ //instanceof operator used to determine if an object is an instance of a certain class, returns boolean t/f value
            System.out.println("Here is your dog food");
        } else if(animal instanceof Cat){
            System.out.println("Here is your cat food");
        }



    }

}
