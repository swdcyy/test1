package com.kuaishou.live.core.show.test.r;
import z1.a;
import java.lang.Object;
import java.lang.Boolean;
import w51.a;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.String;
import xf6.l;

public final class r implements a	// class@0011bf
{
    public static final r a;

    static {
       r.a = new r();
    }
    public void r(){
       super();
    }
    public final void accept(Object p0){
       boolean b = p0.booleanValue();
       a uoa = a.class;
       if (!PatchProxy.isSupport(uoa) || !PatchProxy.applyVoidOneRefs(Boolean.valueOf(b), null, uoa, "32")) {
          l.h("live_close_top_notice", b);
       }
       return;
    }
}