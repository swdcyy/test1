package bolts.Task$n;
import bolts.a;
import java.lang.Object;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import y3.g;
import bolts.Task;
import java.lang.Exception;
import bolts.AggregateException;
import java.lang.Integer;
import java.lang.String;
import java.util.List;

public final class Task$n implements a	// class@000b66
{
    public final Object a;
    public final ArrayList b;
    public final AtomicBoolean c;
    public final AtomicInteger d;
    public final g e;

    public void Task$n(Object p0,ArrayList p1,AtomicBoolean p2,AtomicInteger p3,g p4){
       this.a = p0;
       this.b = p1;
       this.c = p2;
       this.d = p3;
       this.e = p4;
       super();
    }
    public Object a(Task p0){
       if (p0.isFaulted()) {
          Task$n ta = this.a;
          _monitor_enter(ta);
          this.b.add(p0.getError());
          _monitor_exit(ta);
       }
       boolean b = true;
       if (p0.isCancelled()) {
          this.c.set(b);
       }
       if (!this.d.decrementAndGet()) {
          if (this.b.size()) {
             int i = 0;
             if (this.b.size() == b) {
                this.e.c(this.b.get(i));
             }else {
                Object[] objArray = new Object[b];
                objArray[i] = Integer.valueOf(this.b.size());
                this.e.c(new AggregateException(String.format("There were %d exceptions.", objArray), this.b));
             }
          }else if(this.c.get()){
             this.e.b();
          }else {
             this.e.d(null);
          }
       }
       return null;
    }
}
