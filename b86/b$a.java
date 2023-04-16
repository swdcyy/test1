package b86.b$a;
import java.lang.Runnable;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import x76.a;
import java.util.List;
import java.util.Iterator;
import java.lang.Iterable;
import java.lang.Number;
import u76.a;
import java.util.Objects;
import u76.a$a;
import java.lang.Integer;
import s76.a;
import b86.d;
import b86.g;
import b86.c;
import b86.f;
import y76.c;
import com.kwai.framework.kgi.sdk.internal.config.KgiChannelConfigItem;
import com.kwai.framework.kgi.sdk.internal.config.KgiConfig;
import b86.b;
import java.util.concurrent.ConcurrentHashMap;
import java.lang.Long;
import yb6.d;
import java.util.Map;
import b86.i;
import android.os.Handler;

public final class b$a implements Runnable	// class@000433
{
    public final b$a b;

    public void b$a(){
       super();
       this.b = this;
    }
    public void run(){
       a$a a;
       long l6;
       boolean b;
       Object obj = this;
       if (PatchProxy.applyVoid(null, obj, b$a.class, "1")) {
          return;
       }
       b uob = 1;
       Iterator iterator = a.d.a().iterator();
       long l = 1000;
       while (iterator.hasNext()) {
          int i = iterator.next().intValue();
          a = a.a;
          Objects.requireNonNull(a);
          a$a uoa = a$a.class;
          if (PatchProxy.isSupport(uoa) && (!PatchProxy.applyVoidOneRefs(Integer.valueOf(i), a, uoa, "5") && a.f(i))) {
             b = g.g(i).c();
             if (!g.h(i).c() || !b) {
                c.a(i, "OTHER_EXCEPTION", "终止通道：通道线程状态异常");
                a.d(i);
             }
          }
          if (!a.g(i) && !a.h(i)) {
             uob = null;
             KgiChannelConfigItem kgiChannelCo = KgiConfig.a(i);
             long l1 = (long)kgiChannelCo.intervalSecondCallEngine * l;
             long l2 = (long)kgiChannelCo.intervalSecondCallEngineComplete * l;
             long l3 = (long)kgiChannelCo.intervalSecondCallEngineFeedbackConsume * l;
             b j = b.j;
             Long longx = b.g.get(Integer.valueOf(i));
             Long longx1 = b.e(j).get(Integer.valueOf(i));
             Long longx2 = b.f.get(Integer.valueOf(i));
             long l4 = d.a();
             if (longx != null) {
                long l5 = l4 - longx.longValue();
                if (l5 - l3 < 0) {
                   continue ;
                }
             }
             if (longx1 == null) {
                b.e(j).put(Integer.valueOf(i), Long.valueOf(l4));
                i.g(i);
             }else if(longx2 == null || longx2.longValue() - longx1.longValue() < 0){
                l6 = l4 - longx1.longValue();
                if (l6 - l1 > 0) {
                   b.e(j).put(Integer.valueOf(i), Long.valueOf(l4));
                   i.g(i);
                }
             }else {
                l6 = l4 - longx2.longValue();
                if (l6 - l2 > 0) {
                   b.e(j).put(Integer.valueOf(i), Long.valueOf(l4));
                   i.g(i);
                }
             }
          }
       }
       if (!uob) {
          b.j.a().postDelayed(obj.b, l);
       }
       return;
    }
}
