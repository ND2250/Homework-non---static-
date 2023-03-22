package program20;

public class Bedroom {

    public void numbers(){
        System.out.println("How many bedrooms ? ");
    }
    public void doors(){
        System.out.println("1 door available");

    }

    public static  void main(String [] args){
        Bedroom BD = new Bedroom();
        BD.numbers();
        BD.doors();

    }
}
