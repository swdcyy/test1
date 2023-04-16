package j02.q;
import erd.g;
import java.lang.String;
import java.lang.Object;
import java.lang.Throwable;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import j02.u;
import java.lang.StringBuilder;
import java.util.List;
import com.kuaishou.android.live.log.b;
import j02.d;
import java.util.Objects;
import kotlin.jvm.internal.a;
import java.util.HashMap;
import java.lang.Integer;
import java.util.Map;

public final class q implements g	// class@002a2d
{
    public final String b;

    public void q(String p0){
       this.b = p0;
       super();
    }
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, q.class, "1")) {
       }else {
          b.P(u.a, "reportWatchLive doOnError, "+p0);
          p0 = d.c;
          q tb = this.b;
          Objects.requireNonNull(p0);
          if (!PatchProxy.applyVoidOneRefs(tb, p0, d.class, "3")) {
             a.p(tb, "taskId");
             p0 = d.b;
             Integer integer = p0.get(tb);
             if (integer == null) {
                integer = Integer.valueOf(0);
             }
             a.o(integer, "reportFailedCountMap[taskId] ?: 0");
             p0.put(tb, Integer.valueOf((integer.intValue() + 1)));
          }
       }
       return;
    }
}
