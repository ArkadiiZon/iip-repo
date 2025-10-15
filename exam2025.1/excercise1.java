public class Costume {
    public static final int Monster = 1, Ghost = 2, Witch = 3, Vampire = 4;
    private String name, size;
    private int type;
    private double price, weight;
    private Date releaseDate;

    public Costume(String name, String size, int type, double price, double weight, int day, int month, int year) {
        this.name = name; // this.name refers to the instance variable
        this.size = size; // name refers to the parameter
        this.type = type;
        this.price = price;
        this.weight = weight;
        this.releaseDate = new Date(day, month, year);
    }

    public Costume() {
        this("Classic Ghost", "M", Ghost, 29.99, 1.5, 1, 10, 2022);
    }

    public double getPrice() {
        return this.price;
    }

}