package com.kuaishou.live.ad.fanstop.widget.LiveAdNeoMerchantPendantView$b;
import ub.a;
import java.lang.String;
import java.lang.Throwable;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import java.lang.StringBuilder;
import yx.j0;

public final class LiveAdNeoMerchantPendantView$b extends a	// class@0009d5
{
    public final String b;

    public void LiveAdNeoMerchantPendantView$b(String p0){
       this.b = p0;
       super();
    }
    public void onFailure(String p0,Throwable p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, LiveAdNeoMerchantPendantView$b.class, "1")) {
          return;
       }
       a.p(p0, "id");
       a.p(p1, "throwable");
       j0.b("LiveAdNeoMerchantPendantView", "Pendent bg load failed, "+this.b, p1);
       return;
    }
}
