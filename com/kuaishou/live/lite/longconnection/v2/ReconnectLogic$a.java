package com.kuaishou.live.lite.longconnection.v2.ReconnectLogic$a;
import erd.g;
import com.kuaishou.live.lite.longconnection.v2.ReconnectLogic;
import java.lang.Object;
import java.lang.Boolean;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import msd.l;

public final class ReconnectLogic$a implements g	// class@000a2a
{
    public final ReconnectLogic b;

    public void ReconnectLogic$a(ReconnectLogic p0){
       this.b = p0;
       super();
    }
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, ReconnectLogic$a.class, "1")) {
       }else {
          a.o(p0, "it");
          if (p0.booleanValue()) {
             this.b.f.invoke(Boolean.TRUE);
          }
       }
       return;
    }
}
