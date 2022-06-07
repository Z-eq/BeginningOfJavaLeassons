package zeq.from.beginning;

// This method of Arrays adds 5 to arrays values!

public class ArraysInMethodsLesson32 {
    public static void main(String[] args) {

        int zeq[] = {2, 3, 4, 5, 6};
        change(zeq);
        for (int y : zeq)
            System.out.println(y);

    }

    public static void change(int x[]) {  // in this part the important thing is we added an array [] instead of just an variable!
        for (int counter = 0; counter < x.length; counter++)
            x[counter] += 5;  // this one add 5 to indexes of arrays

    }

}