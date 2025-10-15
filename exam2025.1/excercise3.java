
public class Excercise3 {
    private Excercise3() {
    }

    public static void main(String[] args) {
        Point p = new Point(4.0, -1.0);
        double x = p.getX(), y = p.getY();
        System.out.println("Initially:");
        System.out.println("x = " + x + ", y = " + y + ", p = " + p.toString());

        oneMethod(x, y, p);
        System.out.println("After oneMethod:");
        System.out.println("x = " + x + ", y = " + y + ", p = " + p.toString());

        x = p.getY();
        y = p.getX();
        otherMethod(p);
        System.out.println("After otherMethod:");
        System.out.println("x = " + x + ", y = " + y + ", p = " + p.toString());
    }

    public static void oneMethod(double x, double y, Point p) {
        x = x + y;

        p.setX(x);
        p.setY(y);
        y = 0;
    }

    public sttic void otherMethod(Point q) {
        double aux = q.getX();
        q.setX(q.getY());
        aux = aux + q.getX();
        q.setY(aux);
    }
}
