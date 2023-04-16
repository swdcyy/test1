package df.c$b;
import java.lang.Runnable;
import df.c;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import hg.a;
import java.util.concurrent.atomic.AtomicInteger;
import od.a;
import java.util.Comparator;
import java.util.Arrays;
import df.b;
import com.facebook.react.uimanager.events.RCTEventEmitter;
import java.util.Objects;
import android.util.LongSparseArray;
import java.util.Iterator;
import java.util.List;
import df.a;

public class c$b implements Runnable	// class@001e4d
{
    public final c b;

    public void c$b(c p0){
       this.b = p0;
       super();
    }
    public void run(){
       if (PatchProxy.applyVoid(null, this, c$b.class, "1")) {
          return;
       }
       a.a(0, "DispatchEventsRunnable");
       this.b.l.getAndIncrement();
       boolean b = false;
       this.b.q = b;
       a.c(this.b.o);
       c c = this.b.c;
       _monitor_enter(c);
       c$b tb = this.b;
       c n = tb.n;
       if (n > null) {
          if (n > 1) {
             Arrays.sort(tb.m, b, n, c.r);
          }
          int i = 0;
          c$b tb1 = this.b;
          while (i < tb1.n) {
             object oobject = tb1.m[i];
             if (oobject != null) {
                oobject.e();
                oobject.b(this.b.o);
                oobject.c();
             }
             i = i + 1;
          }
          Objects.requireNonNull(tb1);
          if (!PatchProxy.applyVoid(null, tb1, c.class, "18")) {
             Arrays.fill(tb1.m, b, tb1.n, null);
             tb1.n = b;
          }
          this.b.e.clear();
       }
       _monitor_exit(c);
       Iterator iterator = this.b.j.iterator();
       while (iterator.hasNext()) {
          iterator.next().a();
       }
       a.c(0, "DispatchEventsRunnable");
       return;
    }
}
