package com.kuaishou.live.core.show.test.f;
import z1.a;
import java.lang.Object;
import java.lang.Boolean;
import w51.a;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.String;
import xf6.l;

public final class f implements a	// class@0011a7
{
    public static final f a;

    static {
       f.a = new f();
    }
    public void f(){
       super();
    }
    public final void accept(Object p0){
       boolean b = p0.booleanValue();
       a uoa = a.class;
       if (!PatchProxy.isSupport(uoa) || !PatchProxy.applyVoidOneRefs(Boolean.valueOf(b), null, uoa, "64")) {
          l.h("live_close_player", b);
       }
       return;
    }
}
