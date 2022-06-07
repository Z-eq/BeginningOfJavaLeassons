package zeq.from.beginning;

// Variable Length Arguments when u don't know how many arguments and numbers for u will give.
//

public class VariableLengthArgumentsLesson35 {
    public static void main(String[] args) {
        System.out.println("Average number is:" + " " +average(23,22,67,99,70,88,53,12,90,55));
    }
    // this is a method out side main method!
// ... = when we don't numbers of arguments!

    public static int average(int...numbers) {
        int total=0;
        for(int x:numbers) // this is enhanced for loop
            total+=x;

        return total/numbers.length;

    }
}
