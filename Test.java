import java.io.IOException;

public class Test {
    public static void main( String[] args ) throws IOException {
        UniqueId file = new UniqueId("id.dat");
        file.init(1000);
        myThread t1 = new myThread(file,1);
        myThread t2 = new myThread(file,2);
        myThread t3 = new myThread(file,3);
        myThread t4 = new myThread(file,4);
        myThread t5 = new myThread(file,5);

        t1.start();
        t2.start();
        t3.start();
        t4.start();
        t5.start();


        }
    }

