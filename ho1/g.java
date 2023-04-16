package ho1.g;
import erd.g;
import com.kuaishou.live.common.core.component.like.count.b$a;
import java.lang.Object;
import com.kuaishou.live.common.core.component.like.count.LiveLikeResponse;
import com.kuaishou.live.common.core.component.like.count.b;
import com.kuaishou.live.common.core.component.like.count.b$b;
import java.lang.Long;
import java.util.Objects;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import wkd.b;
import l66.a;
import dda.g;
import com.kuaishou.android.model.feed.LiveStreamFeedWrapper;
import com.kwai.framework.model.feed.BaseFeed;
import m66.a;
import com.yxcorp.gifshow.action.c;
import crd.b;
import lnc.b9;

public final class g implements g	// class@002759
{
    public final b$a b;
    public final int c;

    public void g(b$a p0,int p1){
       super();
       this.b = p0;
       this.c = p1;
    }
    public final void accept(Object p0){
       b$a b;
       g tb = this.b;
       g tc = this.c;
       b uob = b.class;
       b k = tb.b.k;
       if (k != null) {
          k.c(p0);
       }
       b = tb.b;
       p0 = Long.valueOf(p0.mIntervalMs);
       Objects.requireNonNull(b);
       if (!PatchProxy.applyVoidOneRefs(p0, b, uob, "1")) {
          long l = p0.longValue();
          b.f = l;
          if (l <= 0) {
             b.f = 3000;
          }
       }
       p0 = tb.b;
       Objects.requireNonNull(p0);
       if (!PatchProxy.isSupport(uob) || !PatchProxy.applyVoidOneRefs(Integer.valueOf(tc), p0, uob, "2")) {
          if (tc > null && p0.h != null) {
             b.a(0x6d2a4fdd).b(new g(p0.h.mEntity, tc));
          }
          if (p0.i == null) {
             b h = p0.h;
             if (h != null) {
                c.a(3, h.mEntity);
                p0.i = true;
             }
          }
       }
    label_0079 :
       b9.a(tb.b.l);
       return;
    }
}
