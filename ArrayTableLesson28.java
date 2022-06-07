package zeq.from.beginning;


public class ArrayTableLesson28 {
    public static void main(String[] args) {
        System.out.println("Index\tValue"); // \t = tab
        int zeq[] = {22, 14, 89, 12, 2, 77,99};

        for (int counter = 0; counter<zeq.length;counter++){
           // any time u give .length it give the lengths of arrays
            System.out.println(counter + " \t\t" + zeq[counter]);
        }
    }
}