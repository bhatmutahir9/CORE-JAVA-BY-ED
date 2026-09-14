public class Recursion {
//    public static void printnum(int x) {
//        if (x == 0) { // Base condition
//            return;
//        }
//        printnum(x - 1); // Recursion
//        System.out.println(x); // print x
//    }

    // print 1-5nums
    public static void printnum2(int a) {
        if (a == 6) {
            return;
        }
        printnum2(a + 1);
        System.out.println(a);
    }
        // Factorial function
//        public static int factorial ( int n){
//            if (n == 1) {
//                return 1;
//            }
//            return n * factorial(n - 1);
//        }
        public static void main (String[]args){ // Main Function
            int x = 10;
            int a =1;
            printnum2(a);
//            printnum(x);
//            System.out.println(factorial(5));
        }
    }

