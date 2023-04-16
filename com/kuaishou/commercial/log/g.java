package com.kuaishou.commercial.log.g;
import erd.g;
import com.kuaishou.commercial.log.n;
import java.lang.Object;
import ujc.l;
import java.util.Objects;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import m66.a;
import mxb.j0;
import com.kwai.framework.model.feed.BaseFeed;
import yx.b0;
import com.kuaishou.commercial.perf.tracker.CommercialSplashTracker;

public final class g implements g	// class@0014fb
{
    public final n b;

    public void g(n p0){
       this.b = p0;
    }
    public final void accept(Object p0){
       g tb = this.b;
       Objects.requireNonNull(tb);
       if (PatchProxy.applyVoidOneRefs(p0, tb, n.class, "28")) {
       }else if(p0.a == null){
          tb.a().e(23, p0.a).d(new b0(p0)).a();
          p0.O = true;
       }
       return;
    }
}
