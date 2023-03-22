package program20;

public class Acadamicrcd {
    void students (int total ){
        System.out.println("Final marks :"+total);

    }
    void teachers(int seq){
        System.out.println("Performance of teachers:"+seq);
    }
    void gd(char grade){
        System.out.println("Grades :"+grade);
    }
    void marks(float terms ){
        System.out.println("term marks :"+terms);
    }

    public static void main(String []args){
        Acadamicrcd AC = new Acadamicrcd();
        AC.students(88);
        AC.teachers(7);
        AC.gd('B');
        AC.marks(77.88f);


    }
}
