import java.sql.Date;
import java.util.Scanner;


public class Costume {

    // Constants for costume types
    public static final int MONSTER = 1, GHOST = 2, WITCH = 3, VAMPIRE = 4;
    private String name;
    private int type;
    private char size;
    private double weight;
    private double price;
    private Date releaseDate;

    // Constructor with parameters
    public Costume(String name, int type, char size, double weight, double price, int day, int month, int year) {
        this.name = name;
        this.type = type;
        this.size = size;
        this.weight = weight;
        this.price = price;
        this.releaseDate = new Date(day, month, year);
    }

    // Default constructor
    public Costume() {
        this("Classic Ghost", GHOST, 'M', 0.5, 20.99, 31, 10, 2022);
    }

    // Getters and Setters
    // Getter for name
    public double getPrice() {
        return this.price;
    }

    // Setter for price
    public void setPrice(double p) {
        this.price = p;
    }

    // Method to check if the costume is lightweight
    public boolean isLightWeight() {
        return this.weight > 0.1 && this.weight < 1.0; 
    }
    // Method to compare release dates
    public boolean isReleasedBefore(Costume other) {
        return this.releaseDate.compareTo(other.releaseDate) < 0;

    }

        @Override 
        public boolean equals(Object o) {
            return o instanceof Costume
            && this.name.equals(((Costume) o).name)
            && this.type == ((Costume) o).type;
        }


        @Override 
        public String toString() {
           double priceRounded = Math.round(price * 100.0) / 100.0;
           double weightRounded = Math.round(weight * 10.0) / 10.0;
           return (this.name + ".Realease date: " + this.releaseDate + ".Type: " + this.type + ".Size: " + this.size + ".Weight: " + weightRounded + "kg.Price: $" + priceRounded);
        }
    }




class Test {
    private Test() {}


    public static void main (String [] args) {
        Costume costume1 = new Costume();
        System.out.println("Standard costume: " + costume1);

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter name of the costume: ");
        
    }
}