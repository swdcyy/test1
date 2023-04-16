package bh.f;
import java.lang.Runnable;
import bh.g;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import bh.e;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import bh.n;
import java.lang.Throwable;

public class f implements Runnable	// class@000b32
{
    public final g b;

    public void f(g p0){
       this.b = p0;
       super();
    }
    public void run(){
       f tb;
       Throwable obj;
       Iterator iterator;
       g og = g.class;
       if (PatchProxy.applyVoid(null, this, f.class, "1")) {
          return;
       }
       if (this.b.d == null) {
          return;
       }
       g d = this.b.d;
       if (d.b() != null) {
          tb = this.b;
          obj = d.b();
          _monitor_enter(tb);
          if (PatchProxy.applyVoidOneRefs(obj, tb, og, "7")) {
             _monitor_exit(tb);
          }else {
             iterator = new ArrayList(tb.a).iterator();
             while (iterator.hasNext()) {
                iterator.next().onResult(obj);
             }
             _monitor_exit(tb);
          }
       }else {
          tb = this.b;
          obj = d.a();
          _monitor_enter(tb);
          if (PatchProxy.applyVoidOneRefs(obj, tb, og, "8")) {
             _monitor_exit(tb);
          }else {
             ArrayList uArrayList = new ArrayList(tb.b);
             if (uArrayList.isEmpty()) {
                _monitor_exit(tb);
             }else {
                iterator = uArrayList.iterator();
                while (iterator.hasNext()) {
                   iterator.next().onResult(obj);
                }
                _monitor_exit(tb);
             }
          }
       }
       return;
    }
}
