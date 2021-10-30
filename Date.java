public class Date {
    private int day;
    private int month;
    private int year;

    public Date() {
        day = 1;
        month = 1;
        year = 1900;
    }

    public Date (int mo, int da, int yr) {
        day = da;
        month = mo;
        year = yr;
    }

    public static void main(String[] args) {
        //Option B - Just declare it like a scanner (eg: Scanner sc = new Scanner (System.in)) but with variations
        Date d = new Date(7, 14, 2018);

        //Example
        System.out.println(d.day + ", " + d.month + ", " + d.year);
    }
}
