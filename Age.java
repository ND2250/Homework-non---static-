package program20;

public class Age {

    public void ageabove(){
        System.out.println("Age limits");
    }
    public void agebelow(){
        System.out.println("Age below");


    }

    public static void main(String [] args){
        Age ref = new Age();
        ref.ageabove();
        ref.agebelow();

    }
}
