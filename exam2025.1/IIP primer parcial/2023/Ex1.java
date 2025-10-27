import java.util.Date;

class Sticker {
    private  String name;
    private String teamName;
    public static int GOALKEEPER = 1, DEFENDER = 2, MIDFIELDER = 3, FORWARD = 4;
    private int height;
    private int role;
    private double weight;
    private Date birthDate;

    public Sticker(String n, int r,String t, int h, double w, int day, int month, int year ){
        name = n;
        teamName = t;
        height = h;
        role = r;
        weight = w;
        birthDate = new Date(day, month, year);
    }

    public Sticker () {
      name = "Olga Carmona";
      teamName = "Real Madrid C.F.";
      height = 159;
      weight = 51.5;
      role = DEFENDER;
      birthDate = new Date(12, 6,2000);
    }

    public boolean equals( Object o) {
        return o instanceof Sticker
        && name.equals(((Sticker) o).name)
        && teamName.equals(((Sticker) o).teamName)
        && role == ((Sticker) o).role;
    }
    
    public boolean isBMINormal() { 
        double bmi = weight / Math.pow(height, 2);
        return 18.8 <= bmi && bmi <= 24.9;
    }

    public boolean isYounger (Sticker other) {
        return birthDate.compareTo(other.birthDate) < 0;
    }

    @Override
    public String toString() {
        return name + "  " + "("+ teamName + ")" + "  Birthdate:" + birthDate + "  Weight:  " + weight + "  kg.  Height:  " + height + "  cm." ;

}
}