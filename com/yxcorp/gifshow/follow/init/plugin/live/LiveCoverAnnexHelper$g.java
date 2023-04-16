package com.yxcorp.gifshow.follow.init.plugin.live.LiveCoverAnnexHelper$g;
import erd.g;
import com.yxcorp.gifshow.follow.init.plugin.live.LiveCoverAnnexHelper;
import java.lang.Object;
import com.yxcorp.gifshow.follow.common.data.LiveCoverAnnexResponse;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import la6.a;
import com.kuaishou.android.model.mix.CommonMeta;
import java.util.Collection;
import ekd.q;

public final class LiveCoverAnnexHelper$g implements g	// class@0010ce
{
    public final LiveCoverAnnexHelper b;

    public void LiveCoverAnnexHelper$g(LiveCoverAnnexHelper p0){
       this.b = p0;
       super();
    }
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveCoverAnnexHelper$g.class, "1")) {
       }else {
          a.p(p0, "liveCoverAnnexResponse");
          LiveCoverAnnexHelper$g tb = this.b;
          tb.n = false;
          tb.j = p0.mMinRequestIntervalMillis;
          tb.k = p0.mMaxContinuousRequestTimes;
          if (a.a(p0.getCursor())) {
             this.b.l = p0.getCursor();
          }
          LiveCoverAnnexHelper f = this.b.F;
          if (f == null || f.mTransientShowedCommodity != 1) {
             if (!q.f(p0.mLiveCoverAnnex)) {
                p0.p = 0;
             }else {
                this.b.p();
             }
          }
       }
       return;
    }
}
