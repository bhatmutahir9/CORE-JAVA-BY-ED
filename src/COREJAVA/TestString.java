package COREJAVA;

public class TestString {
    public static void main(String[] args) {
        String name = "Mutahir";
        System.out.println(name);
       // In Java String is not a Datatype it is a Class Declared like below example
        // difference of passing direct value to string and using new keyword
        String a = new String("insha");
        String b = new String("insha");
        System.out.println(a == b);
        //this return false because new allocated two different memory locations to the String inside heap
        // In this direct literal(value) is passed to string
        String c = "insha";
        String d = "insha";
        System.out.println(c == d);
        // this return true as the var_name is stored in string pool which has same memory locations
    }
}
