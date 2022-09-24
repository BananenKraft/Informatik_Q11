import java.util.HashMap;
import java.util.Hashtable;

class register {
    private customer[] queue = new customer[10];
    private int cash = 0;
    private int queue_length = 0;

    
    public void displayQueue() {
        for (int i = 0;i<queue_length;i++){
            System.out.println(String.valueOf(i+1) + ". " + queue[i].getName());
        }
    }
}