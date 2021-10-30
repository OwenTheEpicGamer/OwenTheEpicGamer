/*
A: The values don't change (no functions are called)
B: Correct answer: calling doIt() adds 1 to 5 (x) and subtracts 1 from 7 (y), making both values equal 6
C: Executes tryIt() - not the right method
D: Executes both doIt() and tryIt()
E: You don't need a parameter constructor all the time
 */

public class Test {
    private int x;
    private int y;

    public Test() {
        x = 5;
        y = 7;
    }

    public void doIt() {
        x++;
        y--;
    }

    public void tryIt() {
        x += 3;
        y -= 4;
    }

    public static void main(String[] args) {
        Test t = new Test();
        t.doIt();
        System.out.println(t.x);
        System.out.println(t.y);

    }
}
