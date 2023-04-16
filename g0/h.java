package g0.h;
import java.util.concurrent.Executor;
import java.lang.Object;
import java.util.ArrayDeque;
import java.lang.Runnable;
import aegon.chrome.base.task.b;
import g0.h$a;

public class h implements Executor	// class@002028
{
    public final ArrayDeque b;
    public Runnable c;

    public void h(){
       super();
       this.b = new ArrayDeque();
    }
    public synchronized void a(){
       Runnable runnable = this.b.poll();
       this.c = runnable;
       if (runnable != null) {
          b.f.execute(runnable);
       }
       return;
    }
    public synchronized void execute(Runnable p0){
       this.b.offer(new h$a(this, p0));
       if (this.c == null) {
          this.a();
       }
       return;
    }
}
