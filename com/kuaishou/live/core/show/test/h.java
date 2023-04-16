package com.kuaishou.live.core.show.test.h;
import z1.a;
import java.lang.Object;
import java.lang.Boolean;
import w51.a;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.String;
import xf6.l;

public final class h implements a	// class@0011ab
{
    public static final h a;

    static {
       h.a = new h();
    }
    public void h(){
       super();
    }
    public final void accept(Object p0){
       boolean b = p0.booleanValue();
       a uoa = a.class;
       if (!PatchProxy.isSupport(uoa) || !PatchProxy.applyVoidOneRefs(Boolean.valueOf(b), null, uoa, "68")) {
          l.h("live_close_bottom_right_pendant", b);
       }
       return;
    }
}
