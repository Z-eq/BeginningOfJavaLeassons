package zeq.from.beginning;

public class SummingElementsOfArraysLesson29 {
    public static void main(String[] args) {

        int zeq[]={21,34,44,21,2,9,876};
        int sum=0;  // start to count from index 0 in our case 21 which is the first value!

        for(int counter=0;counter<zeq.length;counter++){
            sum+=zeq[counter]; //whatever the value is and add it to the sume so?
        }
        System.out.println("The sum of tese numbers is "+ sum);
    }
}
