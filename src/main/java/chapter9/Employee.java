package chapter9;

public class Employee extends Person{

    private String employeeId;
    private String title;

    public Employee(){
        super("Mikilla"); //how does Java know not to call the default constructor here? just because it doesn't have a string in it?
                                //super() needs to be the first statement in constructor
        System.out.println("In Employee default constructor");
    }

    public String getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(String employeeId) {
        this.employeeId = employeeId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }











}
