package zeq.from.beginning;

public class leason17 {

    private String girlName;

    public leason17(String name){
        girlName=name;
    }

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
