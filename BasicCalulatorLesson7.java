package zeq.from.beginning;

import java.util.Scanner;

public class BasicCalulatorLesson7 {


    // Simple Calculator

         public static void main(String[] args) {
            Scanner zeq = new Scanner(System.in);
            //If u have many of same variables for double u can write them all in one line instead of each line!
            double num1, num2, answer;
            System.out.println("Enter the first number: ");

            // * num1 is where my input will be saved!
            // *  always use same datatype as u work with in our case we used double which means
            // we cannot use zeq.nextString(); since it will require qe used strings text input!
            num1 = zeq.nextDouble();
            System.out.println("Enter second number: ");
            num2 = zeq.nextDouble();

            answer = num1 + num2;
            System.out.println(answer);


        }
    }