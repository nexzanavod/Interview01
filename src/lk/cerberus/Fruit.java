package lk.cerberus;

public class Fruit {
    private String color;
    private int weight;
    private double price;

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public Fruit(String color, int weight, double price) {
        this.color = color;
        this.weight = weight;
        this.price = price;
    }

    public Fruit() {
    }
}
