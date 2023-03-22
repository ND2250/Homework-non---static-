package program20;

public class Musicalinstru {
    public void piano(int cost){
        System.out.println("Cost of piano: "+ cost);
    }
    public void drums(String Brand){
        System.out.println("Brand name: "+ Brand);
    }

    public static void main(String[] args) {
        Musicalinstru MS = new Musicalinstru();
        MS.piano(20000);
        MS.drums("YAMAHA");
    }
}
