package com.kuaishou.live.ad.fanstop.widget.LiveAdNeoPendantBaseView$c;
import erd.o;
import com.kuaishou.live.ad.fanstop.widget.LiveAdNeoPendantBaseView;
import java.lang.Object;
import java.lang.Long;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import kotlin.jvm.internal.a;

public final class LiveAdNeoPendantBaseView$c implements o	// class@0009d9
{
    public final LiveAdNeoPendantBaseView b;

    public void LiveAdNeoPendantBaseView$c(LiveAdNeoPendantBaseView p0){
       this.b = p0;
       super();
    }
    public Object apply(Object p0){
       String str = PatchProxy.applyOneRefs(p0, this, LiveAdNeoPendantBaseView$c.class, "1");
       if (str != PatchProxyResult.class) {
       }else {
          a.p(p0, "it");
          str = this.b.f((int)p0.longValue());
       }
       return str;
    }
}
