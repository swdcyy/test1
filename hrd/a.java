package hrd.a;
import java.lang.Object;
import erd.o;
import java.lang.String;
import io.reactivex.internal.functions.a;
import io.reactivex.internal.operators.parallel.b;
import ird.a;
import brd.z;
import brd.h;
import io.reactivex.internal.operators.parallel.ParallelRunOn;
import io.reactivex.internal.operators.parallel.ParallelJoin;
import cxd.c;
import java.lang.IllegalArgumentException;
import java.lang.StringBuilder;
import java.lang.Throwable;
import io.reactivex.internal.subscriptions.EmptySubscription;

public abstract class a	// class@000fa5
{

    public void a(){
       super();
    }
    public final a a(o p0){
       a.c(p0, "mapper");
       return a.k(new b(this, p0));
    }
    public abstract int b();
    public final a c(z p0){
       int i = h.b();
       a.c(p0, "scheduler");
       a.d(i, "prefetch");
       return a.k(new ParallelRunOn(this, p0, i));
    }
    public final h d(){
       int i = h.b();
       a.d(i, "prefetch");
       return a.f(new ParallelJoin(this, i, false));
    }
    public abstract void e(c[] p0);
    public final boolean f(c[] p0){
       int i = this.b();
       if (p0.length == i) {
          return true;
       }
       IllegalArgumentException illegalArgum = new IllegalArgumentException("parallelism = "+i+", subscribers = "+p0.length);
       i = p0.length;
       for (int i1 = 0; i1 < i; i1 = i1 + 1) {
          EmptySubscription.error(illegalArgum, p0[i1]);
       }
       return false;
    }
}
