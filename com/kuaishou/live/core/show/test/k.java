package com.kuaishou.live.core.show.test.k;
import z1.a;
import java.lang.Object;
import java.lang.Boolean;
import w51.a;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.String;
import xf6.l;

public final class k implements a	// class@0011b1
{
    public static final k a;

    static {
       k.a = new k();
    }
    public void k(){
       super();
    }
    public final void accept(Object p0){
       boolean b = p0.booleanValue();
       a uoa = a.class;
       if (!PatchProxy.isSupport(uoa) || !PatchProxy.applyVoidOneRefs(Boolean.valueOf(b), null, uoa, "93")) {
          l.h("key_auto_accept_interact_invite", b);
       }
       return;
    }
}
