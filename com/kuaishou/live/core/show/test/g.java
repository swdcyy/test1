package com.kuaishou.live.core.show.test.g;
import z1.a;
import java.lang.Object;
import java.lang.Boolean;
import w51.a;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.String;
import xf6.l;

public final class g implements a	// class@0011a9
{
    public static final g a;

    static {
       g.a = new g();
    }
    public void g(){
       super();
    }
    public final void accept(Object p0){
       boolean b = p0.booleanValue();
       a uoa = a.class;
       if (!PatchProxy.isSupport(uoa) || !PatchProxy.applyVoidOneRefs(Boolean.valueOf(b), null, uoa, "66")) {
          l.h("live_close_top_left_pendant", b);
       }
       return;
    }
}
