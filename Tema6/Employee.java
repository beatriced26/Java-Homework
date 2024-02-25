package Tema6;

public class Employee {

    private int id;
    private String name;
    private int salary;

    public Employee(int id, String name, int salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getSalary() {
        return salary;
    }


    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public void raiseSalary (double percent) {
        if (percent > 0) {
            double raiseAmount = ((percent/100)*salary);
            salary += raiseAmount;
            System.out.println("Salary of employee " + id + " has been increased by " + percent + "%");
        }else
            System.out.println("Invalid percentange. Salary was not increased.");
    }

}
