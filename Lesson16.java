package zeq.from.beginning;

public class Lesson16 {
    private String girlName;
    public void setName(String name){
        girlName=name;
    }
    //new method
    public String getName(){
        return girlName;
    }
    //new method

    public void saying(){
        System.out.printf("Your first gf was %s", getName());
    }
}
