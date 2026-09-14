package COREJAVA;

public class StringMethods {
    public static void main(String[] args) {
        // Method is a piece of code used to perform some tasks ex main() is a method
        String name = "Mutahir";
        int length = name.length(); //Method used to find the length of a string
        char c = name.charAt(length-1); // Method used to return character value at specific index
        String name2 = "Insha";
        System.out.println(length);
        System.out.println(c);
        System.out.println(name.equals(name2)); // used to check the equality of a string returns boolean values
        System.out.println(name.equalsIgnoreCase(name2)); // used to ignore the String case it checks letters not Case ex A,a is same



      // Compares to strings and returns ASCII Value after Checking the String when element is not same it subtracts that from other and returns value
        String str1 = "Mutahir";
        String Str2 = "Bhat";
        System.out.println('M'+0);// To check the ASCII value of any letter
        System.out.println('B'+0);
        int i = str1.compareTo(Str2);
        System.out.println(i);

        // Substring method
        String name3 = "insha jan";
        String newname3 = name3.replace("jan","rani");
        String substring = name3.substring(6); // starts prints from index 6
        String substring2 = name3.substring(0,5); // prints from 0 ends at 5;
        System.out.println(substring);
        System.out.println(substring2);
        System.out.println(newname3);

        // Converts int to String
        int a = 245;
        String str = String.valueOf(a);
        System.out.println(str);

        // Format Method this is a Static method  >> Methods accesed with classes are static methods
        String formattedstring = String.format("My name is %s and i am %d years old","Mutahir",23);
        System.out.println(formattedstring);
    }
}
