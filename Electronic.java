package program20;

public class Electronic {
    void tele(int price){
        System.out.println("Tele price :"+ price);
    }
    void spaker(String name){
        System.out.println("Brand of speaker:"+name);
    }

    public static void main(String[] args) {
        Electronic et = new Electronic();
        et.tele(88989);
        et.spaker("Panasonic");

    }
}
