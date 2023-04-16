package com.kuaishou.live.core.show.test.q;
import z1.a;
import java.lang.Object;
import java.lang.Boolean;
import w51.a;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.String;
import xf6.l;

public final class q implements a	// class@0011bd
{
    public static final q a;

    static {
       q.a = new q();
    }
    public void q(){
       super();
    }
    public final void accept(Object p0){
       boolean b = p0.booleanValue();
       a uoa = a.class;
       if (!PatchProxy.isSupport(uoa) || !PatchProxy.applyVoidOneRefs(Boolean.valueOf(b), null, uoa, "30")) {
          l.h("live_close_like_particle_view", b);
       }
       return;
    }
}
