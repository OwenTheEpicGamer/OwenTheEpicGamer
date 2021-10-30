public class Number {
    private int num;
    //Because the word "double" is a reserved word, you can't have it as a method name
    //Therefore, nothing will compile (E)
    public void double() {
        num = num*2;
    }

}
