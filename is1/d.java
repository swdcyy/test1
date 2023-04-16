package is1.d;
import is1.a;
import is1.d$b;
import nsd.u;
import is1.d$a;
import java.lang.String;
import msd.a;
import java.lang.Runnable;
import java.lang.Object;
import kotlin.jvm.internal.a;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.StringBuilder;
import pp.c;
import com.kuaishou.android.live.log.b;
import com.kuaishou.protobuf.livestream.nano.LiveMultiLinePkWarmUpStartExtraInfo;
import f02.a;

public final class d extends a	// class@002991
{
    public static final c j;
    public static final d$b k;

    static {
       d.k = new d$b(null);
       d.j = d$a.b;
    }
    public void d(String p0,a p1,Runnable p2){
       a.p(p1, "serverTimeGetter");
       super(p1, p2);
       if (PatchProxy.applyVoidOneRefs(p0, this, d.class, "1")) {
       }else {
          b.Z(d.j, "handleWarmUpStart, subTypeExtraInfo: "+p0);
          if (p0 != null) {
             LiveMultiLinePkWarmUpStartExtraInfo liveMultiLin = a.i(p0);
             LiveMultiLinePkWarmUpStartExtraInfo liveMultiLin1 = null;
             LiveMultiLinePkWarmUpStartExtraInfo warmUpEndDea = (liveMultiLin != null)? liveMultiLin.warmUpEndDeadline: liveMultiLin1;
             if (liveMultiLin != null) {
                liveMultiLin1 = liveMultiLin.warmUpEndNotifyDeadline;
             }
             this.d(warmUpEndDea, liveMultiLin1);
          }
       }
       return;
    }
}
