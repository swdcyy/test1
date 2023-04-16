package a1.a$d;
import java.lang.Thread;
import java.lang.String;
import java.util.concurrent.ArrayBlockingQueue;
import z1.g;
import a1.a$c;
import java.lang.Object;
import java.lang.RuntimeException;
import java.lang.Throwable;
import java.lang.StringBuilder;
import com.yxcorp.utility.Log;
import a1.a;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.view.View;
import ag6.a;
import android.os.Handler;
import android.os.Message;

public class a$d extends Thread	// class@00003d
{
    public ArrayBlockingQueue b;
    public g c;
    public static final a$d d;

    static {
       a$d uod = new a$d("k-design-daynight-asyncinflater");
       a$d.d = uod;
       uod.start();
    }
    public void a$d(String p0){
       super(p0);
       this.b = new ArrayBlockingQueue(20);
       this.c = new g(20);
    }
    public static a$d b(){
       return a$d.d;
    }
    public void a(a$c p0){
       try{
          this.b.put(p0);
          this.d("enqueue");
          return;
       }catch(java.lang.InterruptedException e3){
          throw new RuntimeException("Failed to enqueue async inflate request", e3);
       }
    }
    public a$c c(){
       a$c uoc = this.c.q();
       if (uoc == null) {
          uoc = new a$c();
       }
       return uoc;
    }
    public final void d(String p0){
       Log.g("AsyncLayoutInflater", "InflateThread "+p0+"queue size: "+this.b.size()+" detail: "+this.b.toString());
    }
    public void e(a$c p0){
       p0.e = null;
       p0.a = null;
       p0.b = null;
       p0.c = 0;
       p0.d = null;
       this.c.a(p0);
    }
    public void f(){
       try{
          a$c uoc = this.b.take();
          this.d("runInner");
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
          this.f();
       }
    }
}
