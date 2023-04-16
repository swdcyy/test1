package com.kuaishou.live.ad.fanstop.widget.LiveAdNeoPendantBaseView$e;
import erd.g;
import msd.a;
import java.lang.Object;
import java.lang.Throwable;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.lang.StringBuilder;
import yx.j0;

public final class LiveAdNeoPendantBaseView$e implements g	// class@0009db
{
    public final a b;

    public void LiveAdNeoPendantBaseView$e(a p0){
       this.b = p0;
       super();
    }
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveAdNeoPendantBaseView$e.class, "1")) {
       }else {
          this.b.invoke();
          Object[] objArray = new Object[0];
          j0.f("LiveAdNeoPendantBaseView", "coll Down err  "+p0, objArray);
       }
       return;
    }
}
