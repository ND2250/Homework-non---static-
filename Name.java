package program20;

public class Name {

    public void data(float percent ){
        System.out.println("Final :"+ percent);

    }
    public void stat(String name){
        System.out.println("Name of the student:" + name);

    }



    public static void main(String [] args){
        Name nn = new Name();
        nn.data(77.7f);
        nn.stat("Manoj");
    }

}
