package com.kuaishou.commercial.tvc.TvcPluginImplWrapper$h;
import erd.g;
import com.kuaishou.commercial.tvc.TvcPluginImplWrapper;
import java.util.List;
import java.lang.Object;
import java.lang.Boolean;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import yx.j0;
import lm9.a;

public final class TvcPluginImplWrapper$h implements g	// class@00169e
{
    public final TvcPluginImplWrapper b;
    public final List c;

    public void TvcPluginImplWrapper$h(TvcPluginImplWrapper p0,List p1){
       this.b = p0;
       this.c = p1;
       super();
    }
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefsWithListener(p0, this, TvcPluginImplWrapper$h.class, "1")) {
       }else {
          a.o(p0, "isSuccess");
          if (p0.booleanValue()) {
             p0 = new Object[0];
             j0.f("TvcPluginImplWrapper", "tvc plugin loaded success", p0);
             this.b.n().processFeedsListAsync(this.c);
          }
          PatchProxy.onMethodExit(TvcPluginImplWrapper$h.class, "1");
       }
       return;
    }
}
