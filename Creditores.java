package program20;

public class Creditores {


    void cres (long x ){
        System.out.println("Total credit :"+x);

    }
    public void midyrs(int y){
        System.out.println("up to mid year :"+y);


    }

    public static void main(String[] args) {
        Creditores cd = new Creditores();
        cd.cres(676899999l);
        cd.midyrs(88);


    }

}
