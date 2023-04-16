package com.kuaishou.live.core.show.test.t;
import z1.a;
import java.lang.Object;
import java.lang.Boolean;
import w51.a;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.String;
import xf6.l;

public final class t implements a	// class@0011c3
{
    public static final t a;

    static {
       t.a = new t();
    }
    public void t(){
       super();
    }
    public final void accept(Object p0){
       boolean b = p0.booleanValue();
       a uoa = a.class;
       if (!PatchProxy.isSupport(uoa) || !PatchProxy.applyVoidOneRefs(Boolean.valueOf(b), null, uoa, "36")) {
          l.h("live_close_like_count", b);
       }
       return;
    }
}
