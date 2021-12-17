package Utility;

public class Client extends Person implements Printable, ClickHandler{
    private String work = "Продавец";
    private String graduate = "Высшее";
    public Client(){
        super("name", 5);
    }

    public String getWork() {
        return work;
    }

    public void setWork(String work) {
        this.work = work;
    }

    public String getGraduate() {
        return graduate;
    }

    public void setGraduate(String graduate) {
        this.graduate = graduate;
    }

    @Override
    public void print() {
        System.out.println(getName()+" - [Возраст: " + getAge() + ", Образование: " + getGraduate() + ", Работа: " + getWork() + "]");
    }

    @Override
    public void season(Season season) {
        System.out.print("Сейчас "+ season);
    }
}
