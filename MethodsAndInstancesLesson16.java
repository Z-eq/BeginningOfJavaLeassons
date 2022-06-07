package zeq.from.beginning;

import java.util.Scanner;

//Instance method and Multiple methods!

public class MethodsAndInstancesLesson16 {

    public static void main(String[] args) {
        Scanner zeq = new  Scanner(System.in);
        Lesson16 Lesson16Object = new Lesson16();
        System.out.println("Enter name of first gf here: ");
        String temp = zeq.nextLine();
        Lesson16Object.setName(temp);
        Lesson16Object.saying();
    }

}
