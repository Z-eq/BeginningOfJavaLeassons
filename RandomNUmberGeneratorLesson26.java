package zeq.from.beginning;

import java.util.Random;

public class RandomNUmberGeneratorLesson26 {
    public static void main(String[] args) {

        Random zeq = new Random();
        int number;

        for (int counter=1; counter <=10; counter++) {
            number = 1+zeq.nextInt(6);  // because computer counts from 0 and we want numbers only from 1-6 we need to add 1+ to zeq.nextInt

        System.out.println(number + " ");

    }
}
}