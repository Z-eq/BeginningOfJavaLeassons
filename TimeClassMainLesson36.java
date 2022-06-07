package zeq.from.beginning;


public class TimeClassMainLesson36 {

    // Set military time and also convert military time to regular!
    public static void main(String[] args) {
        timeClass36 timeClass36Object = new timeClass36();

        System.out.println("Default time:" +" " + timeClass36Object.toMilitary());
        System.out.println("Default time:" +" " + timeClass36Object.toString());

    //    timeClass36Object.setTime(20, 34, 44);

        timeClass36Object.setTime(13, 27, 6);
        System.out.println(timeClass36Object.toMilitary());
        System.out.println(timeClass36Object.toString());

    }
}
