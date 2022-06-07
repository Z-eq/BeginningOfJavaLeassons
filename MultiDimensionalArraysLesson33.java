package zeq.from.beginning;

public class MultiDimensionalArraysLesson33 {

    public static void main(String[] args) {
        //This is our multidimensional array
        int arr[][]= {{1,2,4,5,6},{7,8,9,10}};

        //This will call the method and substitute the method array with our array "arr"
        display(arr);

    }
    // This is the method called "display"
    public static void display(int substitute[][]) {

        //This is the first for loop for "x" that will repeat until "x" will reach the array length.
        // In our case array length = 2 (2 sets of square brackets) ( [] + [] = 2).
        //"x" represents the first set of square brackets [] from the array.
        for(int x=0;x<substitute.length;x++) {

            //This is the second for loop and is for "y". It will repeat until "y" will reach the array length[x].
            // Where substitute[x] will have two values in our case: substitute[0] and substitute[1].
            // "y" represents the second set of square brackets [] from the array.

            for(int y=0;y<substitute[x].length;y++) {

                //This will print out arr[x][y] for as long as x=0. In our case arr [0][0] and arr[0][1]

                System.out.print(substitute[x][y]+"\t");
            }

            //This will print a new line and will return to the first loop util it finishes!
            System.out.println();
        }
    }
}