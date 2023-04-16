package l89.c$b;
import ij7.d;
import java.lang.Object;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Long;
import java.lang.Integer;
import kotlin.jvm.internal.a;
import l89.c;
import java.util.concurrent.ConcurrentHashMap;
import l89.c$a;
import java.util.Map;
import com.yxcorp.gifshow.apm.ApmTracker;
import android.os.SystemClock;

public final class c$b implements d	// class@002cd1
{

    public void c$b(){
       super();
    }
    public void a(long p0,String p1,int p2){
       c b;
       c$a uoa;
       if (PatchProxy.isSupport(c$b.class) && PatchProxy.applyVoidThreeRefs(Long.valueOf(p0), p1, Integer.valueOf(p2), this, c$b.class, "1")) {
          return;
       }
       a.p(p1, "pluginName");
       int i = 0x276a;
       if (p2 != i) {
          String str = "installedPlugins[pluginN¡­nName] = it\n            }";
          int i1 = 0x27d8;
          if (p2 != i1) {
             if (p2 == 0x2904) {
                b = c.b;
                uoa = b.a().get(p1);
                if (uoa == null) {
                   uoa = new c$a();
                   uoa.b(-1);
                   b.a().put(p1, uoa);
                }
                a.o(uoa, str);
                uoa.a(ApmTracker.n().B(SystemClock.elapsedRealtime()));
                uoa.c(0x2904);
             }
          }else {
             b = c.b;
             uoa = b.a().get(p1);
             if (uoa == null) {
                uoa = new c$a();
                uoa.b(-1);
                b.a().put(p1, uoa);
             }
             a.o(uoa, str);
             uoa.a(ApmTracker.n().B(SystemClock.elapsedRealtime()));
             uoa.c(i1);
          }
       }else {
          c$a uoa1 = new c$a();
          uoa1.b(ApmTracker.n().B(SystemClock.elapsedRealtime()));
          uoa1.c(i);
          c.b.a().put(p1, uoa1);
       }
       return;
    }
}
