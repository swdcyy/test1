package okhttp3.ConnectionPool$1;
import java.lang.Runnable;
import okhttp3.ConnectionPool;
import java.lang.Object;
import java.lang.System;

public class ConnectionPool$1 implements Runnable	// class@002069
{
    public final ConnectionPool this$0;

    public void ConnectionPool$1(ConnectionPool p0){
       this.this$0 = p0;
       super();
    }
    public void run(){
       long l = this.this$0.cleanup(System.nanoTime());
       while (l - -1) {
          if (l > 0) {
             long l1 = l / 0xf4240;
             long l2 = 0xf4240 * l1;
             l = l - l2;
             ConnectionPool$1 tthis$0 = this.this$0;
             _monitor_enter(tthis$0);
             try{
                this.this$0.wait(l1, (int)l);
                _monitor_exit(tthis$0);
             }catch(java.lang.InterruptedException e0){
             }
          }
       }
       return;
    }
}
