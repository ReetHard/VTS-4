public class FigurenThreads {
public FigurenThreads() {

}
    public static void main( String[] args ){
        Fig f1 =new Fig();
        Fig f2=new Fig();
        Leser r1 = new Leser(f1);

        r1.start();

        Schreiber w1 = new Schreiber(f1);
        w1.setDaemon(true);
        w1.start();
    }

}
