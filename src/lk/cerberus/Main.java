package lk.cerberus;

public class Main {

    public static void main(String[] args) {
        Orange americanOrange = new Orange();
        americanOrange.setGrade("A");
        Apple newApple = new Apple();
        newApple.setColor("red");

        System.out.println(americanOrange.getGrade());
    }

}
