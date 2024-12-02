interface Father{
    void child1();
    void child2();
}
interface Son extends Father{
    void child2();
    void child3();
}
class GrandSon implements Son{
    public void child1(){
        System.out.print(" child1 is here.....1");
    }
    public void  child2(){
        System.out.print(" child2 is here.....2");
    }
    public void  child3(){
        System.out.print(" child3 is here.....3");
    }
    public void child4(){
        System.out.print(" child4 is here.....4");
    }
}
public class Main{
    public static void main(String args[]){
        Son s = new GrandSon();
        s.child2();
        
    }
}
