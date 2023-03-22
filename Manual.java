package program20;

public class Manual {
    void pdf1(String topics ,String done){
        System.out.println(topics + " " + done);
    }
    void pdf2(String lfc, String principle){
        System.out.println( lfc + " " + principle);

    }

    public static void main(String [] args){
        Manual prc = new Manual();
        prc.pdf1("On time practice","concentration");
        prc.pdf2("principle important", "Interview prospects");
    }
}
