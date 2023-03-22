package program20;

public class Company {
    void lable(){
        System.out.println("Total purchase lable");

    }
    public void barcode(){
        System.out.println("Attached barcode sticker");
    }

    public static void main(String [] args){
        Company cp = new Company();
        cp.barcode();
        cp.lable();

    }
}
