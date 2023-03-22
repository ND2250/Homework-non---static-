package program20;

public class Hospital {

    public void Bed(){
        System.out.println("Total bed");

    }
    public void rooms(){
        System.out.println("Total rooms");

    }

    public static void main(String[] args) {
        Hospital HS = new Hospital();
        HS.Bed();
        HS.rooms();
    }
}
