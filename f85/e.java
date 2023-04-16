package f85.e;
import java.lang.Runnable;
import java.lang.Object;
import f85.f;
import java.util.Map;
import android.os.SystemClock;
import java.util.HashSet;
import java.util.Collection;
import java.util.Iterator;
import f85.g;
import java.util.Objects;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Long;
import java.lang.String;
import java.util.Set;

public final class e implements Runnable	// class@0015e6
{
    public static final e b;

    static {
       e.b = new e();
    }
    public void e(){
       super();
    }
    public final void run(){
       Map a = f.a;
       if (!a.isEmpty() && !f.b) {
          long l = SystemClock.elapsedRealtime();
          HashSet hashSet = new HashSet();
          Iterator iterator = a.values().iterator();
          while (iterator.hasNext()) {
             g og = iterator.next();
             if (f.b) {
                break ;
             }else {
                Objects.requireNonNull(og);
                g og1 = g.class;
                int i = 1;
                if (!PatchProxy.isSupport(og1) || !PatchProxy.applyVoidOneRefs(Long.valueOf(l), og, og1, "2")) {
                   if (og.g != null && og.h <= 3) {
                      og.b = og.b();
                      og.c(l);
                   }else {
                      long l1 = l - og.e;
                      if (l1 - 0x7530 >= 0) {
                         og.e = l;
                         Set set = og.b();
                         if (og.b.equals(set)) {
                            if (set.isEmpty()) {
                               int i1 = og.f + i;
                               og.f = i1;
                            }
                         }else {
                            og.f = 0;
                            og.b = set;
                            og.c(l);
                         }
                      }
                   }
                }
                if (og.f < 3) {
                   i = 0;
                }
                if (i) {
                   hashSet.add(og.a());
                }
             }
          }
          iterator = hashSet.iterator();
          while (iterator.hasNext()) {
             f.a.remove(iterator.next());
          }
          f.c();
          if (!f.a.isEmpty()) {
             f.b();
          }
       }
       return;
    }
}
