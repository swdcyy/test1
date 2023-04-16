package hi0.b;
import java.lang.Integer;
import java.lang.Object;
import java.util.List;
import kotlin.collections.CollectionsKt__CollectionsKt;
import lj0.c;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import com.kuaishou.krn.log.sample.KdsMemoryWarningSampler;
import fk0.a;
import bk0.j;
import ck0.b;
import java.lang.StringBuilder;
import ek0.d;
import kotlin.Pair;
import android.os.SystemClock;
import java.lang.Long;

public final class b	// class@0026cb
{
    public static final List a;
    public static Pair b;
    public static final b c;

    static {
       b.c = new b();
       Integer[] integerArray = new Integer[]{Integer.valueOf(80),Integer.valueOf(15)};
       b.a = CollectionsKt__CollectionsKt.L(integerArray);
    }
    public void b(){
       super();
    }
    public final void a(c p0,String p1,String p2){
       if (PatchProxy.applyVoidThreeRefs(p0, p1, p2, this, b.class, "4")) {
          return;
       }
       a.p(p1, "eventSource");
       a.p(p2, "warningType");
       if (KdsMemoryWarningSampler.d.e()) {
          if (p0 != null) {
             a uoa = p0.c();
             if (uoa != null) {
                j.b.b("kds_memory_warning", new b(uoa, p1, p2));
             }
          }
          j.b.b("kds_memory_warning", new b(p0, p1, p2));
       }
       return;
    }
    public final void b(int p0){
       b uob = b.class;
       if (PatchProxy.isSupport(uob) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, uob, "1")) {
          return;
       }
       d.e("updateMemoryEvents "+p0);
       b.b = new Pair(Integer.valueOf(p0), Long.valueOf(SystemClock.elapsedRealtime()));
       return;
    }
}
