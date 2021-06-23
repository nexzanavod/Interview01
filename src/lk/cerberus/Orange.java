package lk.cerberus;

public class Orange extends Fruit {
    private String grade;

    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }

    public Orange(String color, int weight, double price, String grade) {
        super(color, weight, price);
        this.grade = grade;
    }

    public Orange(String grade) {
        this.grade = grade;
    }

    public Orange() {
    }
}
