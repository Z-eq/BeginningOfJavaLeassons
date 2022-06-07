package zeq.from.beginning;

// THIS is much easier than lesson30 to count , called Enhanced for statement!

public class EnhancedForLoopStatementLesson31 {
    public static void main(String[] args) {

        int zeq[]={3,4,5,6,7,8};
        int total=0;

        for(int x: zeq){
            total+=x;
        }

        System.out.println(total);
    }
}
