package zeq.from.beginning;


// Nested if Statements = when u have an if statement inside another one!

public class NestedIfStatementsLesson18 {
    public static void main(String[] args) {
        int age = 60;

        if(age < 50) {
            System.out.println("You are young");
        }else {
            System.out.println("You are old");
            if (age > 75 ){
                System.out.println("you are really old");

            }else{
                System.out.println("Don't worry u are not that old");
            }
        }
    }
}
