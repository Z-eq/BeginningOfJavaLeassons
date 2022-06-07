package zeq.from.beginning;


//****  While loop allows you to execute certain block of code multiple times but only write it one time!!

public class WhileLoopLesson13 {
    public static void main(String[] args) {


        int counter = 0;  //created counter variable!

        while (counter <10) {

            System.out.println(counter);
               counter++;   // IN While if we don't set counter++; it will loop 0 forever!
        }

    }
}