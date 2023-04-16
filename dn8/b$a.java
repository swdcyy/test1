package dn8.b$a;
import dn8.c;
import dn8.a;
import java.lang.Object;
import dn8.b;
import java.util.WeakHashMap;
import java.util.Set;
import java.util.Map;
import java.util.Iterator;
import java.util.Map$Entry;
import java.lang.Class;
import java.lang.String;
import kotlin.jvm.internal.a;
import com.smilehacker.workmanager.ext.ConstraintWorker;
import ptd.c;
import ptd.c$a;
import qrd.l1;

public final class b$a implements c	// class@0020d4
{
    public final a a;

    public void b$a(a p0){
       this.a = p0;
       super();
    }
    public void a(Object p0){
       p0 = b.c;
       WeakHashMap weakHashMap = b.a(p0);
       _monitor_enter(weakHashMap);
       p0 = b.a(p0).entrySet().iterator();
       while (p0.hasNext()) {
          Map$Entry uEntry = p0.next();
          if (uEntry.getValue().get(this.a.getClass()) != null) {
             Object value = uEntry.getValue();
             a.o(value, "entry.value");
             if (b.c.b(value)) {
                ConstraintWorker key = uEntry.getKey();
                if (key != null && key.d.a()) {
                   c$a.c(key.d, null, 1, null);
                }
             }
          }
       }
       _monitor_exit(weakHashMap);
       return;
    }
}
