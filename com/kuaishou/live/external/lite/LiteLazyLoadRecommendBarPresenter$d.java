package com.kuaishou.live.external.lite.LiteLazyLoadRecommendBarPresenter$d;
import qs5.e;
import com.kuaishou.live.external.lite.LiteLazyLoadRecommendBarPresenter;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.util.Objects;
import u33.b;
import msd.a;
import pp.c;
import java.lang.StringBuilder;
import com.kuaishou.android.live.log.b;
import com.kuaishou.live.external.lite.LiteLazyLoadRecommendBarPresenter$d$a;
import java.lang.Runnable;
import ekd.k1;

public final class LiteLazyLoadRecommendBarPresenter$d extends e	// class@001ba7
{
    public final LiteLazyLoadRecommendBarPresenter d;

    public void LiteLazyLoadRecommendBarPresenter$d(LiteLazyLoadRecommendBarPresenter p0,String p1){
       this.d = p0;
       super(p1);
    }
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiteLazyLoadRecommendBarPresenter$d.class, "1")) {
          return;
       }
       Objects.requireNonNull(LiteLazyLoadRecommendBarPresenter.w);
       p0 = LiteLazyLoadRecommendBarPresenter.v;
       if (p0 != null) {
          p0 = new b(p0);
       }
       b.Z(p0, "live plugin install success, hasDestroyed: "+this.d.s);
       if (this.d.s != null) {
          return;
       }else {
          k1.p(new LiteLazyLoadRecommendBarPresenter$d$a(this), this.d.r);
          return;
       }
    }
}
