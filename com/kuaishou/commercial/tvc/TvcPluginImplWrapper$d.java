package com.kuaishou.commercial.tvc.TvcPluginImplWrapper$d;
import erd.g;
import java.lang.Object;
import java.lang.Boolean;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import yx.j0;

public final class TvcPluginImplWrapper$d implements g	// class@00169a
{
    public static final TvcPluginImplWrapper$d b;

    static {
       TvcPluginImplWrapper$d.b = new TvcPluginImplWrapper$d();
    }
    public void TvcPluginImplWrapper$d(){
       super();
    }
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, TvcPluginImplWrapper$d.class, "1")) {
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
