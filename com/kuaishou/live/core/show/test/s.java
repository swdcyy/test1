package com.kuaishou.live.core.show.test.s;
import z1.a;
import java.lang.Object;
import java.lang.Boolean;
import w51.a;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.String;
import xf6.l;

public final class s implements a	// class@0011c1
{
    public static final s a;

    static {
       s.a = new s();
    }
    public void s(){
       super();
    }
    public final void accept(Object p0){
       boolean b = p0.booleanValue();
       a uoa = a.class;
       if (!PatchProxy.isSupport(uoa) || !PatchProxy.applyVoidOneRefs(Boolean.valueOf(b), null, uoa, "34")) {
          l.h("live_close_online_watch_count", b);
       }
       return;
    }
}
