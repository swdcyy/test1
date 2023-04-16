package com.kuaishou.live.ad.fanstop.widget.LiveAdNeoPendantBaseView$h;
import erd.o;
import com.kuaishou.live.ad.fanstop.widget.LiveAdNeoPendantBaseView;
import java.lang.Object;
import java.lang.Long;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import kotlin.jvm.internal.a;

public final class LiveAdNeoPendantBaseView$h implements o	// class@0009de
{
    public final LiveAdNeoPendantBaseView b;

    public void LiveAdNeoPendantBaseView$h(LiveAdNeoPendantBaseView p0){
       this.b = p0;
       super();
    }
    public Object apply(Object p0){
       String str = PatchProxy.applyOneRefs(p0, this, LiveAdNeoPendantBaseView$h.class, "1");
       if (str != PatchProxyResult.class) {
       }else {
          a.p(p0, "it");
          str = this.b.f((int)p0.longValue());
       }
       return str;
    }
}
