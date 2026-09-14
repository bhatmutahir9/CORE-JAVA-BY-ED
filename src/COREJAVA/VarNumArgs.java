package COREJAVA;

public class VarNumArgs {
    public static void main(String[] args) {
        System.out.println(VariableNumArgs(44, 6, 9, 3)); // This approach is called variable numbers arguments
    }

    public static int VariableNumArgs(int... a) {
        // this approach acts like an array we can add multiple values without varName
        int sum = 0;
        for (int i : a) {
            sum += i;
        }
        return sum;
    }
}
