package ed.p;
import ed.t;
import java.lang.Object;
import java.util.HashSet;
import ed.g;
import java.util.Set;
import android.util.SparseArray;
import ed.g$b;
import java.util.LinkedList;
import ed.g$a;

public abstract class p implements t	// class@001f30
{
    public final Set a;
    public final g b;

    public void p(){
       super();
       this.a = new HashSet();
       this.b = new g();
    }
    public final Object b(Object p0){
       if (p0 != null) {
          _monitor_enter(this);
          this.a.remove(p0);
          _monitor_exit(this);
       }
       return p0;
    }
    public Object get(int p0){
       p tb = this.b;
       _monitor_enter(tb);
       g$b uob = tb.a.get(p0);
       if (uob == null) {
          _monitor_exit(tb);
       }else {
          tb.a(uob);
          _monitor_exit(tb);
          Object obj = uob.c.pollFirst();
       }
       this.b(null);
       return null;
    }
    public Object pop(){
       p tb = this.b;
       _monitor_enter(tb);
       g c = tb.c;
       if (c == null) {
          _monitor_exit(tb);
       }else {
          Object obj = c.c.pollLast();
          if (c.c.isEmpty()) {
             tb.b(c);
             tb.a.remove(c.b);
          }
          _monitor_exit(tb);
          Object obj1 = obj;
       }
       this.b(null);
       return null;
    }
    public void put(Object p0){
       _monitor_enter(this);
       _monitor_exit(this);
       if (this.a.add(p0)) {
          p tb = this.b;
          int i = this.a(p0);
          _monitor_enter(tb);
          g$b uob = tb.a.get(i);
          if (uob == null) {
             uob = new g$b(null, i, new LinkedList(), null, null);
             tb.a.put(i, v8);
             uob = v8;
          }
          uob.c.addLast(p0);
          tb.a(uob);
          _monitor_exit(tb);
       }
       return;
    }
}
