package h31.b;
import erd.o;
import h31.l;
import java.lang.Object;
import com.kuaishou.live.core.show.delayinfo.LiveAudienceDelayInfosResponse;
import java.util.Objects;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.util.List;
import java.util.Collection;
import ekd.q;
import java.util.ArrayList;
import com.google.common.collect.Lists;
import java.lang.Iterable;
import qk.m;
import h31.a;
import ok.h;
import h31.c;
import ok.o;

public final class b implements o	// class@00260f
{
    public final l b;

    public void b(l p0){
       this.b = p0;
    }
    public final Object apply(Object p0){
       b tb = this.b;
       Objects.requireNonNull(tb);
       ArrayList uArrayList = PatchProxy.applyOneRefs(p0, tb, l.class, "8");
       if (uArrayList != PatchProxyResult.class) {
       }else {
          p0 = p0.mAnchorReinforceInfos;
          if (q.f(p0)) {
             uArrayList = Lists.b();
          }else {
             uArrayList = Lists.b();
             m.s(p0).F(a.b).p(new c(tb)).n(uArrayList);
          }
       }
       return uArrayList;
    }
}
