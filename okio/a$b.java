package okio.a$b;
import java.lang.Thread;
import java.lang.String;
import okio.a;
import okio.a$a;
import qrd.l1;

public final class a$b extends Thread	// class@0020e9
{

    public void a$b(){
       super("Okio Watchdog");
       this.setDaemon(true);
    }
    public void run(){
       try{
          _monitor_enter(a.class);
          a uoa = a.Companion.a();
          while (uoa != a.head) {
             _monitor_exit(a.class);
             if (uoa != null) {
                uoa.timedOut();
             }
          }
          a.head = null;
          _monitor_exit(a.class);
          return;
       }catch(java.lang.InterruptedException e0){
       }
    }
}
