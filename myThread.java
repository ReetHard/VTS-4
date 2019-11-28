import java.io.IOException;

public class myThread extends Thread{
    UniqueId file;
    int n;
    public myThread(UniqueId file,int num){
        this.file = file;
       this.n=num;
    }
    public void run() {
        for (int i = 0; i < 10; i++) {
            try {
                System.out.println("Thread:"+n+"  "+ file.getNext());
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
