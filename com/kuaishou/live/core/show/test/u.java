package com.kuaishou.live.core.show.test.u;
import z1.a;
import java.lang.Object;
import java.lang.Boolean;
import w51.a;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.String;
import xf6.l;

public final class u implements a	// class@0011c5
{
    public static final u a;

    static {
       u.a = new u();
    }
    public void u(){
       super();
    }
    public final void accept(Object p0){
       boolean b = p0.booleanValue();
       a uoa = a.class;
       if (!PatchProxy.isSupport(uoa) || !PatchProxy.applyVoidOneRefs(Boolean.valueOf(b), null, uoa, "52")) {
          l.h("live_close_guard", b);
       }
       return;
    }
}
