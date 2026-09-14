package COREJAVA;

public class Arrays {
    public static void main(String[] args) {
        int arr[] = new int[5]; // int[5] = size of array, arr[2] = array index 2.
        for(int i = 0;i< arr.length;i++){ //Traversing an Array  >> arr.length used for array length
            System.out.println(arr[i]);
        }

        //Another (for loop) for Arrays named as foreach loop
        int[] arr1 = {22,4,5,1,99};
        for( int i : arr1){
            System.out.println(i+" ");
        }
        // Search an element in an array
        int[] arr2 = { 9,13,4,6,34,66,223,6,23,8};
        for(int j : arr2){
            if( j == 66){
                System.out.println("Element Found : " + j );
            }
        }

        // find largest and smallest element in array
        int[] arr3 ={44,276,4,-300,0,12};
        int result = Integer.MIN_VALUE; // USED TO STORE THE SMALLEST VALUE LIKE IT STORES -VE INFINITY VALUE
        int result2 = Integer.MAX_VALUE; // Used to store Largest possible value -ve Infinity
        for(int i =0 ;i < arr.length;i++){
            if(arr3[i] > result){
                result = arr3[i];
            }if(arr3[i] < result2){
                result2 = arr3[i];
            }
        }
        System.out.println("Largest Value : "+result);
        System.out.println("Smallest Value : "+result2);

        //Print a reverse Array
        int[] arr4 = {21,4,2,14,5,1,54,6,90};
        System.out.print("Reversed Array : ");
        for(int i = arr4.length-1;i>=0;i--){
            System.out.println(arr4[i]+ " ");
    }
        //Sum of Array
        int[] arr5 = {33,6,-91,333,5,12,9};
        int sum = 0;
        for(int i = 0; i < arr5.length; i++){  // Another Way >> for( int i : arr5) { sum += i }
            sum = sum + arr5[i];
        }
        System.out.println("Sum of Array is  : "+ sum);

        // 2D Arrays like Matrix
        int[][] matrix = {
                {1,2,3},
                {4,5,6},
                {7,8,9}
        };  // Array traversing of 2D array one loop stores row and another columns
        for(int i = 0;i< matrix.length;i++) { // for rows
            for (int j = 0; j < matrix.length; j++) { // for Columns
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println(); // prints elements in new line after each column
//            matrix[0][0],[0][1],[0][2]  1 2 3
//            matrix[1][0],[0][1],[0][2]  4 5 6
//            matrix[2][0],[0][1],[0][2]  7 8 9
        }
        // Array of char's using 2D indexing
        char[][] arr0 = new char[3][2];
        arr0[0][0] = 'a';
        arr0[0][1] = 'b';
        arr0[1][0] = 'c';
        arr0[1][1] = 'd';
        arr0[2][0] = 'e';
        arr0[2][1] = 'f';

        for(int i = 0; i < arr0.length;i++){
            for(int j = 0;j < arr0[i].length;j++){
                System.out.print(arr0[i][j]+" ");
            }
            System.out.println();
        }

        //Jagged Array >> array of different length array
        char[][] arr6 = new char[3][]; // in this we don't need to initialize column value
        arr6[0] = new char[2]; // pints  a b
        arr6[1] = new char[3]; // this will print 3 elements  //prints c d e
        arr6[2] = new char[2]; // prints f g
        arr6[0][0] = 'a';
        arr6[0][1] = 'b';
        arr6[1][0] = 'c';
        arr6[1][1] = 'd';
        arr6[1][2] = 'd';
        arr6[2][0] = 'e';
        arr6[2][1] = 'f';

        for(int i = 0; i< arr6.length;i++){
            for(int j = 0;j < arr6[i].length;j++){
                System.out.print(arr6[i][j]+" ");
            }
            System.out.println();
        }
        // Working of foreach loop
        int[] foreach = {12,3,4,5,6,7,};
        for(int i : foreach){
            System.out.println("This is foreach loop : "+ i);
        }
        // loop to find the table of a number
        int[] aarrr = new int[10];
        for (int i = 0; i < aarrr.length; i++) {
           aarrr[i] = i*5;
            System.out.println(aarrr[i]);
        }
//        loop to reverse an array
        int[] revarr = {12,6,43,56,34,6,342,21};
        for (int i = revarr.length-1;i >= 0; i--){
            System.out.print(revarr[i]+" ");
        }
 }
}
