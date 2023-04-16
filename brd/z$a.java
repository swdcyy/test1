package brd.z$a;
import crd.b;
import java.lang.Runnable;
import lrd.a;
import brd.z$c;
import java.lang.Object;
import java.lang.Thread;
import io.reactivex.internal.schedulers.f;
import java.util.concurrent.ScheduledExecutorService;

public final class z$a implements b, Runnable, a	// class@0002d8
{
    public final Runnable b;
    public final z$c c;
    public Thread d;

    public void z$a(Runnable p0,z$c p1){
       super();
       this.b = p0;
       this.c = p1;
    }
    public void dispose(){
       if (this.d == Thread.currentThread()) {
          z$a tc = this.c;
          if (tc instanceof f) {
             if (tc.c == null) {
                tc.c = true;
                tc.b.shutdown();
             }
          }else {
          label_001d :
             this.c.dispose();
          }
       }else {
          goto label_001d ;
       }
       return;
    }
    public Runnable getWrappedRunnable(){
       return this.b;
    }
    public boolean isDisposed(){
       return this.c.isDisposed();
    }
    public void run(){
       this.d = Thread.currentThread();
       this.b.run();
       this.dispose();
       this.d = null;
    }
}
