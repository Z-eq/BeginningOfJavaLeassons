package zeq.from.beginning;

import java.util.Scanner;

public class IncrementOperatorsLesson9 {


    public static void main(String[] args) {
        Scanner zeq = new Scanner(System.in);
        int tuna = 5;
        int bass = 18;
        tuna = tuna +5; // will take 5 and add new value to it!

        tuna += 8;   // This is same but easier and cleaner than abowe = Assingment operator!

       // ++tuna;    adding ++tuna; will add 1 to the tuna value!
        // adding ++ = preincrement it adds 1 before
        System.out.println(tuna);
    }
}

