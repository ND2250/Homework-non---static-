package program20;

public class Airtravel {
    void agency(){
        System.out.println("Name of agency");
    }
    void customer(){
        System.out.println("customer name");
    }

    public static void main(String[] args) {
        Airtravel AT = new Airtravel();
        AT.agency();
        AT.customer();
    }
}
