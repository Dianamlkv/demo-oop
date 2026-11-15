package by.itacademy.malkovadiana.javabasics.oop;

public class Person extends Student{
    private int salary=0;

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public int getIncome(){
        return super.getIncome()+this.salary;
    }
}
