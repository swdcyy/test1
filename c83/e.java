package c83.e;
import erd.o;
import c83.h;
import java.lang.Object;
import z1.e;
import java.util.Objects;
import com.kwai.robust.PatchProxyResult;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import brd.t;
import com.kuaishou.live.core.basic.model.LiveGiftGuideConfig;
import java.lang.Integer;
import java.lang.Iterable;
import qk.m;
import com.google.common.base.Optional;
import com.kuaishou.live.common.core.component.gift.log.LiveGiftTag;
import java.util.List;
import pp.c;
import com.kuaishou.android.live.log.b;
import w73.v;
import c83.d;

public final class e implements o	// class@0004f0
{
    public final h b;

    public void e(h p0){
       this.b = p0;
    }
    public final Object apply(Object p0){
       e tb = this.b;
       Objects.requireNonNull(tb);
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       h oh = h.class;
       t ot = PatchProxy.applyOneRefs(p0, tb, oh, "4");
       if (ot != patchProxyRe) {
       }else {
          e a = p0.a;
          Object obj = PatchProxy.applyOneRefs(a, tb, oh, "5");
          if (obj != patchProxyRe) {
          }else {
             obj = m.s(a.mExplicitGiftIds).q().orNull();
          }
          if (obj == null) {
             b.P(LiveGiftTag.LIVE_POPULARITY.appendTag("LiveLitePopularityTicketModel"), "zipGiftObservable: giftId is invalid!");
             ot = t.empty();
          }else {
             ot = tb.i.a(obj.intValue()).map(new d(p0));
          }
       }
       return ot;
    }
}
