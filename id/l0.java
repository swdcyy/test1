package id.l0;
import id.k0;
import java.util.concurrent.Executor;
import java.lang.Object;
import ab.e;
import java.util.ArrayDeque;
import java.lang.Runnable;
import java.util.Deque;

public class l0 implements k0	// class@0017df
{
    public boolean a;
    public final Deque b;
    public final Executor c;

    public void l0(Executor p0){
       super();
       this.a = false;
       e.d(p0);
       this.c = p0;
       this.b = new ArrayDeque();
    }
    public synchronized void a(Runnable p0){
       this.b.remove(p0);
    }
    public synchronized void b(){
       this.a = true;
    }
    public synchronized void c(Runnable p0){
       if (this.a != null) {
          this.b.add(p0);
       }else {
          this.c.execute(p0);
       }
       return;
    }
    public synchronized void d(){
       this.a = false;
       while (!this.b.isEmpty()) {
          this.c.execute(this.b.pop());
       }
       this.b.clear();
       return;
    }
    public synchronized boolean e(){
       return this.a;
    }
}
