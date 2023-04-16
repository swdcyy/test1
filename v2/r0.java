package v2.r0;
import java.util.concurrent.Executor;
import java.lang.Object;
import java.util.ArrayDeque;
import java.lang.Runnable;
import v2.r0$a;

public class r0 implements Executor	// class@00265d
{
    public final Executor b;
    public final ArrayDeque c;
    public Runnable d;

    public void r0(Executor p0){
       super();
       this.c = new ArrayDeque();
       this.b = p0;
    }
    public synchronized void a(){
       Runnable runnable = this.c.poll();
       this.d = runnable;
       if (runnable != null) {
          this.b.execute(runnable);
       }
       return;
    }
    public synchronized void execute(Runnable p0){
       this.c.offer(new r0$a(this, p0));
       if (this.d == null) {
          this.a();
       }
       return;
    }
}
