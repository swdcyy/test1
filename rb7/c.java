package rb7.c;
import rb7.b;
import java.util.TreeMap;
import java.util.concurrent.ConcurrentHashMap;
import java.lang.Object;
import java.lang.Class;
import brd.t;
import java.lang.String;
import kotlin.jvm.internal.a;
import java.util.Map;
import rb7.a;
import java.util.NavigableMap;
import java.util.Collection;
import java.util.Iterator;
import dn.b;
import qrd.l1;
import java.lang.Integer;
import com.jakewharton.rxrelay2.PublishRelay;
import rb7.c$a;
import io.reactivex.g;
import brd.w;

public final class c implements b	// class@002362
{
    public static final TreeMap a;
    public static final Map b;
    public static final c c;

    static {
       c.c = new c();
       c.a = new TreeMap();
       c.b = new ConcurrentHashMap();
    }
    public void c(){
       super();
    }
    public t a(Class p0){
       a.q(p0, "eventType");
       return this.g(p0, true);
    }
    public t b(Class p0){
       a.q(p0, "eventType");
       return this.g(p0, false);
    }
    public void c(Class p0){
       a.q(p0, "clazz");
       c.b.remove(p0);
    }
    public void d(){
       c.b.clear();
    }
    public void e(a p0){
       TreeMap a;
       a.q(p0, "event");
       a = c.a;
       _monitor_enter(a);
       Iterator iterator = a.descendingMap().values().iterator();
       while (iterator.hasNext()) {
          iterator.next().accept(p0);
       }
       _monitor_exit(a);
       return;
    }
    public void f(a p0){
       a.q(p0, "event");
       c.b.put(p0.getClass(), p0);
       this.e(p0);
    }
    public final t g(Class p0,boolean p1){
       b uob;
       TreeMap a = c.a;
       _monitor_enter(a);
       int i = 0;
       if (a.get(Integer.valueOf(i)) == null) {
          uob = PublishRelay.d().c();
          a.h(uob, "PublishRelay.create<Any>\(\).toSerialized\(\)");
          a.put(Integer.valueOf(i), uob);
       }else {
          Object obj1 = a.get(Integer.valueOf(i));
          if (obj1 == null) {
             a.L();
          }
          uob = obj1;
       }
       _monitor_exit(a);
       t ot = uob.ofType(p0);
       if (!p1) {
          a.h(ot, "observable");
          return ot;
       }else {
          Object obj = c.b.get(p0);
          if (obj != null) {
             ot = ot.mergeWith(t.create(new c$a(p0, obj)));
             a.h(ot, "observable.mergeWith\(Obs¡­\(it\)\n          }\n      }\)");
          }else {
             a.h(ot, "observable");
          }
          return ot;
       }
    }
}
