package com.kuaishou.commercial.log.m;
import erd.g;
import com.kuaishou.commercial.log.n;
import java.lang.Object;
import ujc.h;
import java.util.Objects;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import m66.a;
import tjc.b;
import com.kwai.framework.model.feed.BaseFeed;
import com.yxcorp.gifshow.entity.QPhoto;
import mxb.j0;
import tw.l;
import java.lang.Boolean;
import yx.x;
import com.kuaishou.commercial.perf.tracker.CommercialSplashTracker;
import yx.j0;

public final class m implements g	// class@001501
{
    public final n b;

    public void m(n p0){
       this.b = p0;
    }
    public final void accept(Object p0){
       m tb = this.b;
       Objects.requireNonNull(tb);
       if (PatchProxy.applyVoidOneRefs(p0, tb, n.class, "22")) {
       }else {
          b b = p0.a.b;
          if (b == null || (tb.b(b) && tb.c(p0.a.b))) {
             tb.a().e(86, new QPhoto(p0.a.b).mEntity).q("change_splash_landscape", Boolean.valueOf(l.l(p0.a.b))).d(new x(p0)).a();
             CommercialSplashTracker uCommercialS = CommercialSplashTracker.E();
             Objects.requireNonNull(uCommercialS);
             if (!PatchProxy.applyVoidOneRefs(p0, uCommercialS, CommercialSplashTracker.class, "6")) {
                if (uCommercialS.m == null) {
                   uCommercialS.m = p0;
                }else {
                   p0 = new Object[0];
                   j0.f("ad_apm", "splashClick!=null", p0);
                }
             }
          }
       }
       return;
    }
}
