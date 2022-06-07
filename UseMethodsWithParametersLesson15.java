package zeq.from.beginning;

import java.util.Scanner;

public class UseMethodsWithParametersLesson15 {

    public static void main(String[] args) {

        Scanner zeq = new Scanner(System.in);
        Underclass15Leason Underclass15LeasonObject = new Underclass15Leason();

        System.out.println("Enter your name:");
        String name = zeq.nextLine();
        Underclass15LeasonObject.baraTest(name);
    }
}