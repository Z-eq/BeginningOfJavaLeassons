package zeq.from.beginning;

import java.util.Scanner;

public class AverageProgramLesson21 {
    public static void main(String[] args) {

        Scanner zeq = new Scanner(System.in);
        int total = 0;
        int grade;
        int average;
        int counter = 0;
        System.out.println("Enter your numbers: ");
        while (counter < 10) {
            grade = zeq.nextInt();
            total = total + grade;
            counter++;
        }

        average = total/10;

        System.out.println("Your average is " + average);

    }
}
