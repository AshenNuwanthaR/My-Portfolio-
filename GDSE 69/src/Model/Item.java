package model;

/**
 * @author Amil Srinath
 */
public class Item {
    private String id;
    private String name;
    private int quanity;
    private double price;

    @Override
    public String toString() {
        return "Item{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", quanity=" + quanity +
                ", price=" + price +
                '}';
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getQuanity() {
        return quanity;
    }

    public void setQuanity(int quanity) {
        this.quanity = quanity;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public Item() {
    }

    public Item(String id, String name, int quanity, double price) {
        this.id = id;
        this.name = name;
        this.quanity = quanity;
        this.price = price;
    }
}