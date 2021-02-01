package techStaff;

import staff.Employee;

public class Developer extends Employee {

    public Developer(String name, String niNumber, int salary){
        super(name, niNumber, salary);
    }


    public double raiseSalary(Double raise){
        double newSalary =  getSalary() * raise;
        return getSalary() + newSalary;
    }

    public int payBonus(){
        return getSalary() / 100 * 1;
    }

}
