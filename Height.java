package program20;

public class Height {

    void criteria(){
        System.out.println("Height should be above 5.7");

    }
    void limit(){
        System.out.println("Height should not be below 5.5");
    }

    public static void main(String [] args){
        Height lmt = new Height();
        lmt.criteria();
        lmt.limit();

    }

}
