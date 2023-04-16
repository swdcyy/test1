package g82.q0;
import ok.x;
import java.lang.String;
import vq5.d;
import java.lang.Object;
import crd.a;
import yb6.d;
import java.util.List;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kuaishou.android.live.log.LiveLogTag;
import pp.c;
import com.kuaishou.android.live.log.b;
import java.util.Collection;
import ekd.q;
import java.lang.Long;
import java.util.Iterator;
import com.kuaishou.live.common.core.component.fansgroup.model.LiveFansGroupAudienceStatusResponse$LiveFansGroupDelayRequestTaskActionInfo;
import l82.a;
import o02.e;
import brd.t;
import cjd.e;
import erd.o;
import java.util.concurrent.TimeUnit;
import g82.o0;
import g82.p0;
import erd.g;
import crd.b;

public class q0	// class@002ab2
{
    public final d a;
    public final String b;
    public final x c;
    public final a d;
    public final long e;
    public boolean f;

    public void q0(x p0,String p1,d p2){
       super();
       this.d = new a();
       this.e = d.a();
       this.c = p0;
       this.b = p1;
       this.a = p2;
    }
    public void a(List p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, q0.class, "1")) {
          return;
       }
       if (this.f != null) {
          b.Z(LiveLogTag.FANS_GROUP, "received fans group status, already handled delay request info");
          return;
       }else {
          this.f = true;
          if (q.f(p0)) {
             b.Z(LiveLogTag.FANS_GROUP, "received fans group status, the delay request info is null");
             return;
          }else {
             b.d0(LiveLogTag.FANS_GROUP, "received fans group status", "task info", p0.toString(), "mStartLivingTimeStamp", Long.valueOf(this.e));
             Iterator iterator = p0.iterator();
             while (iterator.hasNext()) {
                LiveFansGroupAudienceStatusResponse$LiveFansGroupDelayRequestTaskActionInfo liveFansGrou = iterator.next();
                long l = d.a() - this.e;
                l = l / 1000;
                long l1 = (long)liveFansGrou.mDelaySec - l;
                if (l1 - null <= 0) {
                   continue ;
                }else {
                   this.d.c(e.g().b(this.c.get(), this.b, liveFansGrou.mId).map(new e()).delaySubscription((long)liveFansGrou.mDelaySec, TimeUnit.SECONDS).subscribe(new o0(this), p0.b));
                }
             }
             return;
          }
       }
    }
}
