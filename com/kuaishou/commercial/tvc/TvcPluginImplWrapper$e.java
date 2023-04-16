package com.kuaishou.commercial.tvc.TvcPluginImplWrapper$e;
import erd.g;
import java.lang.Object;
import java.lang.Boolean;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import yx.j0;

public final class TvcPluginImplWrapper$e implements g	// class@00169b
{
    public static final TvcPluginImplWrapper$e b;

    static {
       TvcPluginImplWrapper$e.b = new TvcPluginImplWrapper$e();
    }
    public void TvcPluginImplWrapper$e(){
       super();
    }
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, TvcPluginImplWrapper$e.class, "1")) {
       }else {
          a.o(p0, "isSuccess");
          if (p0.booleanValue()) {
             p0 = new Object[0];
             j0.f("TvcPluginImplWrapper", "tvc plugin loaded success", p0);
          }
       }
       return;
    }
}
