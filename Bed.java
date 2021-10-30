/*
A: Bed is not an instance of myBed
B: myBed is an instance of Bed - Correct answer
C: I'm actually not sure about this one - haveHeadboard is an attribute of Bed, but I'm pretty
sure this choice is wrong because attributes of instances are called "instance attributes." - Correct answer
D: Size is not an object
E: Bed is not an instance, and it is not an attribute
 */

public class Bed {
    public Bed() {
        //Attributes
        String size = "";
        boolean haveHeadboard = false;
    }

    public static void main(String[] args) {
        //Instances (synonymous with Objects)
        Bed myBed = new Bed();
        Bed yourBed = new Bed();

        //um
    }
}
