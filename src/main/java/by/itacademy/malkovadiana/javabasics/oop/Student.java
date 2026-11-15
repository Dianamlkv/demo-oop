package by.itacademy.malkovadiana.javabasics.oop;

public class Student extends User{
    private int grant=0;

    public int getGrant() {
        return grant;
    }

    public void setGrant(int grant) {
        this.grant = grant;
    }

    public int getIncome(){
        return this.grant;
    }
}
