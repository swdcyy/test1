package ltd.o$c;
import ltd.d;
import ltd.o;
import java.lang.Object;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.jvm.internal.a;

public abstract class o$c extends d	// class@001cd8
{
    public o b;
    public final o c;

    public void o$c(o p0){
       super();
       this.c = p0;
    }
    public void d(Object p0,Object p1){
       this.i(p0, p1);
    }
    public void i(o p0,Object p1){
       p1 = (p1 == null)? 1: null;
       o$c tc = (p1)? this.c: this.b;
       if (tc != null && (o.b.compareAndSet(p0, this, tc) && p1)) {
          o$c tc1 = this.c;
          p1 = this.b;
          if (p1 == null) {
             a.L();
          }
          tc1.K(p1);
       }
    label_0024 :
       return;
    }
}
