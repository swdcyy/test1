package com.kuaishou.live.ad.fanstop.widget.LiveAdNeoEnhancePendantView$f;
import ub.a;
import java.lang.String;
import java.lang.Throwable;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import java.lang.StringBuilder;
import yx.j0;

public final class LiveAdNeoEnhancePendantView$f extends a	// class@0009cc
{
    public final String b;

    public void LiveAdNeoEnhancePendantView$f(String p0){
       this.b = p0;
       super();
    }
    public void onFailure(String p0,Throwable p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, LiveAdNeoEnhancePendantView$f.class, "1")) {
          return;
       }
       a.p(p0, "id");
       a.p(p1, "throwable");
       j0.b("LiveAdNeoEnhancePendantView", "Pendent bg load failed, "+this.b, p1);
       return;
    }
}
