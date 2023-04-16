package dn8.b;
import java.util.HashSet;
import java.util.WeakHashMap;
import java.lang.Object;
import java.util.Map;
import java.lang.String;
import kotlin.jvm.internal.a;
import java.util.Set;
import java.util.Iterator;
import java.util.Map$Entry;
import java.lang.Iterable;
import dn8.a;
import java.lang.Class;
import java.util.Collection;
import dn8.b$a;

public final class b	// class@0020d5
{
    public static final Collection a;
    public static final WeakHashMap b;
    public static final b c;

    static {
       b.c = new b();
       b.a = new HashSet();
       b.b = new WeakHashMap();
    }
    public void b(){
       super();
    }
    public static final WeakHashMap a(b p0){
       return b.b;
    }
    public final boolean b(Map p0){
       Object obj;
       boolean b;
       a.p(p0, "constraints");
       Iterator iterator = p0.entrySet().iterator();
       while (true) {
          if (!iterator.hasNext()) {
             return 1;
          }
          Map$Entry uEntry = iterator.next();
          Iterator iterator1 = b.a.iterator();
          while (true) {
             if (iterator1.hasNext()) {
                obj = iterator1.next();
                if (!a.g(obj.getClass(), uEntry.getKey())) {
                   continue ;
                }
             }else {
                obj = null;
             }
             b = false;
             if (obj != null) {
                int i = a.g(obj.a, uEntry.getValue()) ^ 1;
                if (!i) {
                }
             }
             break ;
          }
          return b;
       }
    }
    public final void c(a p0){
       a b;
       a.p(p0, "constraintController");
       b.a.add(p0);
       b$a uoa = new b$a(p0);
       a.p(uoa, "listener");
       b = p0.b;
       _monitor_enter(b);
       p0.b.add(uoa);
       _monitor_exit(b);
    }
}
