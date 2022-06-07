package zeq.from.beginning;

public class CompoundInterestProgramLesson23 {

    //  calculate compound interest in this case we know we have 10000 , and we know that we rise 1% each day
    // we want to see how many followers we got after 20 days!


    public static void main(String[] args) {

        double amount;
        double principal = 10000;
        double rate = .01;

        for(int day=1;day<=20;day++) {
            amount=principal*Math.pow(1 + rate, day);
            System.out.println(day + "  "+amount);
        }

    }
}
