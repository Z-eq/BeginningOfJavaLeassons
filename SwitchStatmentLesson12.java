package zeq.from.beginning;

public class SwitchStatmentLesson12 {
    public static void main(String[] args) {

        // Switch Statement = test 1 variable and depending of that value it gives multiple choices!
        // Switch is very good to test many things instead of using "if" statemnts!
        // If there is no match it will print the default message!!!

        int age;
        age = 17;

        switch (age) {
            case 18 :
                System.out.println("You can drink beer!");
                break;
            case 22 :
                System.out.println("You can eat pizza!");
                break;
            case 17 :
                System.out.println("You can drink milk!");
                break;

                default:  // Print this is there is no match!!
                System.out.println("You are not allowed:");
        }
    }
}
