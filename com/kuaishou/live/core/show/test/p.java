package com.kuaishou.live.core.show.test.p;
import z1.a;
import java.lang.Object;
import java.lang.Boolean;
import w51.a;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.String;
import xf6.l;

public final class p implements a	// class@0011bb
{
    public static final p a;

    static {
       p.a = new p();
    }
    public void p(){
       super();
    }
    public final void accept(Object p0){
       boolean b = p0.booleanValue();
       a uoa = a.class;
       if (!PatchProxy.isSupport(uoa) || !PatchProxy.applyVoidOneRefs(Boolean.valueOf(b), null, uoa, "28")) {
          l.h("live_close_gift_container", b);
       }
       return;
    }
}
