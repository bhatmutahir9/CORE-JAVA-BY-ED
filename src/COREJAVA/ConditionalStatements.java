package COREJAVA;

public class ConditionalStatements {
    public static void main(String[] args) {

        int a = 10;
        int b = 25;
        System.out.println(a < b);
        // Relational Operators return boolean result used  to compare two values

        int ch = 'a';
        int ch1 = 'j';
        System.out.println(ch > ch1);
         //it compares the ASCII values of characters
        String str1 = "English";
        String str2 = "Hindi";
        System.out.println(str1.equals(str2)); // correct string comparison

        // Logical Operators && -AND  || -OR ! -NOT

        int marks = 50;
        int age = 25;
        System.out.println(marks >= 33 && age <= 25);
        System.out.println(!(20 > 50)); // NOT operator changes the result

        String name = "Eisa";
        int experience = 2; // given exp
        boolean tier1 = true;
        boolean cond1 = experience >= 3; // condition for given exp needed
        System.out.println("Eligible Aspirant : " +(cond1 || tier1)); // using OR operator to check eligibility

        // Conditional Statements

        int age1 = 15;
        if (age1 >= 18) {
            System.out.println("You're Adult!");
        } else if (age1 <= 25) {
            System.out.println("You're Young");
        } else {
            System.out.println("You're Child");
        }

        // Using if-else ladder (Multiple if else statements in a program)
        int day = 5;
        if (day == 1) {
            System.out.println("Monday");
        } else if (day == 2) {
            System.out.println("Tuesday");
        } else if (day == 3) {
            System.out.println("Wednesday");
        } else if (day == 4) {
            System.out.println("Thursday");
        } else if (day == 5) {
            System.out.println("Friday");
        } else if (day == 6) {
            System.out.println("Saturday");
        } else if (day == 7) {
            System.out.println("Sunday");
        } else {
            System.out.println("Invalid input");
        }

        // Using switch  this returns the output on the basis of given condition
        int day1 = 3;
        switch (day1) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
            default:
                System.out.println("Invalid input");
        }
    }
}
