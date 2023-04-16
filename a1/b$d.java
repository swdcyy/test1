package a1.b$d;
import java.lang.Thread;
import java.util.concurrent.ArrayBlockingQueue;
import z1.g;
import a1.b$c;
import java.lang.Object;
import java.lang.RuntimeException;
import java.lang.String;
import java.lang.Throwable;
import a1.b;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.view.View;
import ag6.a;
import android.os.Handler;
import android.os.Message;

public class b$d extends Thread	// class@000043
{
    public ArrayBlockingQueue b;
    public g c;
    public static final b$d d;

    static {
       b$d uod = new b$d();
       b$d.d = uod;
       uod.start();
    }
    public void b$d(){
       super();
       this.b = new ArrayBlockingQueue(10);
       this.c = new g(10);
    }
    public static b$d b(){
       return b$d.d;
    }
    public void a(b$c p0){
       try{
          this.b.put(p0);
          return;
       }catch(java.lang.InterruptedException e3){
          throw new RuntimeException("Failed to enqueue async inflate request", e3);
       }
    }
    public b$c c(){
       b$c uoc = this.c.q();
       if (uoc == null) {
          uoc = new b$c();
       }
       return uoc;
    }
    public void d(b$c p0){
       p0.e = null;
       p0.a = null;
       p0.b = null;
       p0.c = 0;
       p0.d = null;
       this.c.a(p0);
    }
    public void e(){
       try{
          b$c uoc = this.b.take();
          try{
             int i = 0;
             uoc.d = a.c(uoc.a.a, uoc.c, uoc.b, i);
             Message.obtain(e0.a.b, i, e0).sendToTarget();
             return;
          }catch(java.lang.RuntimeException e0){
          }
       }catch(java.lang.InterruptedException e0){
       }
    }
    public void run(){
       while (true) {
          this.e();
       }
    }
}
