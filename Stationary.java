package program20;

public class Stationary {
    void pen(){
        System.out.println("Number of pens");
    }
    void pencil(){
        System.out.println("Number of pencil");
    }

    public static void main(String[] args) {
        Stationary ST = new Stationary();
        ST.pen();
        ST.pencil();
    }
}
