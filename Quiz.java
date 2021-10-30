//Printing the "Yippie" from Line 15, Calling the myFun() method, which calls otherFun() on "Yes", returning "Yippie" and "Yes"
//Finally, printing the "Yay" from the myFun method.

//Answer: C - Yippie Yippie Yes Yay

public class Quiz {
    String myFun (String str) {
        return otherFun(str + " Yay");
    }

    String otherFun(String str) {
        return "Yippie " + str;
    }

    public static void main(String[] args) {
        Quiz ace = new Quiz();
        System.out.println("Yippie " + ace.myFun("Yes"));
    }
}
