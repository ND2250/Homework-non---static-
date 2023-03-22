package program20;

public class Utensils {
    void drawer(String Name){
        System.out.println("Drawers occupied:"+Name);

    }
    public void wtp(String full){
        System.out.println("Total worktop space:"+full);
    }
    void stove(float Numbers){
        System.out.println("Total stove:"+Numbers);

    }

    public static void main(String [] args){
        Utensils UT = new Utensils();
        UT.drawer("How many drawers occupied ?");
        UT.wtp(" 55 inches");
        UT.stove(5);



    }
}
