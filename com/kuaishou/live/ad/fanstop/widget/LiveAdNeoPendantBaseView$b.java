package com.kuaishou.live.ad.fanstop.widget.LiveAdNeoPendantBaseView$b;
import erd.o;
import java.lang.Object;
import java.lang.Long;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import kotlin.jvm.internal.a;

public final class LiveAdNeoPendantBaseView$b implements o	// class@0009d8
{
    public final long b;

    public void LiveAdNeoPendantBaseView$b(long p0){
       this.b = p0;
       super();
    }
    public Object apply(Object p0){
       Long longx = PatchProxy.applyOneRefs(p0, this, LiveAdNeoPendantBaseView$b.class, "1");
       if (longx != PatchProxyResult.class) {
       }else {
          a.p(p0, "it");
          longx = Long.valueOf((this.b - p0.longValue()));
       }
       return longx;
    }
}
