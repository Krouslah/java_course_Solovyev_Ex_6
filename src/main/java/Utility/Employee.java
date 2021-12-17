package Utility;

public class Employee extends Person implements Printable, ClickHandler {
    private int priceForWork;
    private String isFree;
    public Employee (int priceForWork, String isFree, String name, int age){
        super(name, age);
        this.priceForWork = priceForWork;
        this.isFree = isFree;
    }

    public int getPriceForWork() {
        return priceForWork;
    }

    public void setPriceForWork(int priceForWork) {
        this.priceForWork = priceForWork;
    }

    public String isFree() {
        return isFree;
    }

    public void setFree(String free) {
        isFree = free;
    }

    @Override
    public void print() {
        System.out.println(getName() + "[Возраст: " + getAge() + ", Цена за работу: " + getPriceForWork() + ", Занятость: " + isFree());
    }

    @Override
    public void season(Season season) {
        System.out.println(Season.SUMMER);
    }
}
