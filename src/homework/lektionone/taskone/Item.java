package homework.lektionone.taskone;

public class Item {
    private String name;
    private double price;
    private double weight;
    private String description;

    public Item(String name, double price, double weight,
                String description) {
        this.name = name;
        this.price = price;
        this.weight = weight;
        this.description = description;
    }

    public Item() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return String.format("Item[name: %s; price: %f; weight: " +
                        "%f]\ndescription: %s",
                getName(), getPrice(), getWeight(), getDescription());
    }
}
