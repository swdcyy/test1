package is1.c;
import is1.a;
import is1.c$b;
import nsd.u;
import is1.c$a;
import java.lang.Long;
import msd.a;
import java.lang.Runnable;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Number;
import pp.c;
import com.kuaishou.android.live.log.b;

public final class c extends a	// class@00298e
{
    public final Long j;
    public static final c k;
    public static final c$b l;

    static {
       c.l = new c$b(null);
       c.k = c$a.b;
    }
    public void c(Long p0,a p1,Runnable p2){
       a.p(p1, "serverTimeGetter");
       super(p1, p2);
       this.j = p0;
    }
    public final void e(Long p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, c.class, "1")) {
          return;
       }
       this.c();
       if (p0 != null) {
          long l = p0.longValue();
          c tj = this.j;
          if (tj != null) {
             long l1 = tj.longValue() + l;
             if (!PatchProxy.isSupport(c.class) || !PatchProxy.applyVoidTwoRefs(Long.valueOf(l), Long.valueOf(l1), this, c.class, "2")) {
                b.d0(c.k, "handleGiftBattleStart", "endDeadline", Long.valueOf(l), "exceedDeadline", Long.valueOf(l1));
                this.d(l, l1);
             }
          }
       }
       return;
    }
}
