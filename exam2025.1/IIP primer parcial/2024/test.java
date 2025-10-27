import java.util.Scanner;

class Test {
    private Test() {}

    public static void main (String[] args) {
        Costume costume1 = new Costume();
        System.out.println("Standard costume: " + costume1);
    }

    Scanner sc = new Scanner(System.in);

    System.out.print("Enter new price for the costume: ");
    String name = sc.nextLine();

    System.out.print("Day of the release date: ");
    int day = sc.nextInt();


}