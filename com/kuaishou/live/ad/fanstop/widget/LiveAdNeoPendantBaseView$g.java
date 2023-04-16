package com.kuaishou.live.ad.fanstop.widget.LiveAdNeoPendantBaseView$g;
import erd.o;
import java.lang.Object;
import java.lang.Long;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import kotlin.jvm.internal.a;

public final class LiveAdNeoPendantBaseView$g implements o	// class@0009dd
{
    public final long b;

    public void LiveAdNeoPendantBaseView$g(long p0){
       this.b = p0;
       super();
    }
    public Object apply(Object p0){
       Long longx = PatchProxy.applyOneRefs(p0, this, LiveAdNeoPendantBaseView$g.class, "1");
       if (longx != PatchProxyResult.class) {
       }else {
          a.p(p0, "it");
          longx = Long.valueOf((this.b - p0.longValue()));
       }
       return longx;
    }
}
