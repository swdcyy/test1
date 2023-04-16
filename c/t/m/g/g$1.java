package c.t.m.g.g$1;
import java.lang.Runnable;
import c.t.m.g.g;
import java.lang.Object;
import java.util.concurrent.atomic.AtomicBoolean;
import java.lang.String;
import java.lang.Throwable;
import c.t.m.g.bt;

public class g$1 implements Runnable	// class@000c93
{
    public final g a;

    public void g$1(g p0){
       this.a = p0;
       super();
    }
    public void run(){
       if (g.a(this.a).get()) {
          return;
       }
       g.a(this.a).set(true);
       g.b(this.a);
       g.a(this.a).set(false);
       return;
    }
}
