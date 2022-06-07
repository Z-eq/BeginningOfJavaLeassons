package zeq.from.beginning;

import java.util.Random;

public class ArrayElementsToStoreAsCountersLesson30 {
    public static void main(String[] args) {
        Random zeq = new Random(); //
        int freq[]=new int[7];  //made an array called frequency and set it to 7 elements!!

        for(int roll=1;roll<1000;roll++){
            ++freq[1+zeq.nextInt(6)];
        }

        System.out.println("Face\tFrequency");

        for(int face=1;face<freq.length;face++){
            System.out.println(face+"\t\t"+freq[face]);
        }

    }
}
