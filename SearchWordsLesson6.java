package zeq.from.beginning;

public class SearchWordsLesson6 {


    public static void main(String[] args) {
        String[] words = {"ball", "sport", "spring", "home"};

        //startWith
        for (String w : words) {
            if (w.startsWith("sp"))
                System.out.println(w + " Starts with sp");
        }
        //ends with
        for (String w : words) {
            if (w.endsWith("h"))
                System.out.println(w + " ends with h");

        }
    }
}