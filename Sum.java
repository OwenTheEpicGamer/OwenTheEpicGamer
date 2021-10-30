public class Sum {
    private int sum;

    public Sum() {
        sum = 0;
    }

    public Sum(int n) {
        //Checking the ones digit --> tens digit --> hundreds digit
        for(int i = 0; i < 3; i++) {
            sum = sum + n % 10;
            n = n / 10;
        }
    }

    public static void main(String[] args) {
        //Example
        Sum s = new Sum(999);
        System.out.println(s.sum);
    }
}
