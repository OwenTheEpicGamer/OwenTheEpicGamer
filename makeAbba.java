//makeAbba("Hi, Bye") --> "HiByeByeHi"
public class makeAbba {
    public String makeAbba(String a, String b)
    {
        //String concatenation
        return a+b+b+a;
    }

    public static void main(String[] args) {
        //Example
        makeAbba myObj = new makeAbba();
        String str = (myObj.makeAbba("c", "d"));
        System.out.println(str);
    }
}
