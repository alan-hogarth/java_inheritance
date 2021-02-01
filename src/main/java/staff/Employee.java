package staff;

public abstract class Employee {

    private String name;
    private String niNumber;
    private int salary;

    public Employee(String name, String niNumber, int salary){
        this.name = name;
        this.niNumber = niNumber;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public String getNiNumber() {
        return niNumber;
    }

    public int getSalary() {
        return salary;
    }

    public double raiseSalary(Double raise){
        double newSalary =  getSalary() * raise;
        return getSalary() + newSalary;
    }

    public int payBonus(){
        return getSalary() / 100 * 1;
    }
}
