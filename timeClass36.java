package zeq.from.beginning;

public class timeClass36 {
    // three variables - one for hours one for minutes and one for seconds!

    private int hour;
    private int minute;
    private int second;

    public void setTime(int h, int m, int s){
        hour = ((h>=0 && h<24)  ? h : 0);  //=  if h is greater than 0 and is less than 24  ? : you can go ahead and use that number & and if not put it to zero!
        minute = ((m>=0 && m<60) ? m : 0);
        second = ((s>=0 && s<60) ? s : 0);

    }
// new method here
    public String toMilitary(){
        return String.format("%02d:%02d:%02d", hour, minute, second);  // now go to main TimeClassMainLesson36 and set object to call this function!
    }

    // convert from military to regular time!
    public String toString(){
        return String.format("%d:%02d:%02d %s", ((hour==0||hour==12) ?12:hour%12), minute, second, (hour < 12? "AM" : "PM"));
    }
}
