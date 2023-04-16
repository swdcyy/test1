package com.kuaishou.commercial.tvc.TvcPluginImplWrapper$b;
import erd.g;
import com.kuaishou.commercial.tvc.TvcPluginImplWrapper;
import java.lang.String;
import java.lang.Object;
import java.lang.Boolean;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import yx.j0;
import lm9.a;

public final class TvcPluginImplWrapper$b implements g	// class@001698
{
    public final TvcPluginImplWrapper b;
    public final String c;

    public void TvcPluginImplWrapper$b(TvcPluginImplWrapper p0,String p1){
       this.b = p0;
       this.c = p1;
       super();
    }
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, TvcPluginImplWrapper$b.class, "1")) {
       }else {
          a.o(p0, "isSuccess");
          if (p0.booleanValue()) {
             p0 = new Object[0];
             j0.f("TvcPluginImplWrapper", "tvc plugin loaded success", p0);
             this.b.n().AH(this.c);
          }
       }
       return;
    }
}
