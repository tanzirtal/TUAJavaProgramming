package chapter9;

public class InheritanceTester {

    public static void main(String[] args) {
//        //Person person = new Person();
//        Employee employee = new Employee();
//
//        Rectangle rectangle = new Rectangle();
//        rectangle.print(); //only one print statement method available
//
//        Square square = new Square();
//        square.print(); // two print statements available, this one is from Square.java overload
//        square.print(); // this one is from Rectangle.java method


        Mother mom = new Mother();
        mom.setName("Rokeya");

        System.out.println(mom.getName() + " is a " + mom.getGender());
    }

}
