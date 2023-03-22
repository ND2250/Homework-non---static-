package program20;

public class Total {


     void gross(int Gross,int Net){
         System.out.println(Gross + Net );



    }
    void net(String name,String Lastname){
         System.out.println( name + " "+ Lastname);

        }

    public static void main(String [] args){
         Total TT = new Total();
         TT.gross(78,77);
         TT.net("Vidhata","Traders");




    }


}
