package COREJAVA;

public class OOPSBasics {
    public static void main(String[] args) {
        int x = 10;
        System.out.println(multiply(x)); // output will be 100  as x will be multiplied by 10
        System.out.println(x); // output will be 10 as it directly passes the value of x in this main method
        // STRING USE IN THIS WAY
        String a = "Mutahir";
        System.out.println(UpperCase(a)); // Reference os str will be passed to a and Converts it to uppercase
        System.out.println(a); // it prints same value of a
    }

    public static int multiply(int x) {
        return x * 10; // this method's x and above methods x are different as they are declared locally
    }

    public static String UpperCase(String str) {
        return str.toUpperCase();
    }
}
