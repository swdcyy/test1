package com.kuaishou.live.core.show.test.l;
import z1.a;
import java.lang.Object;
import java.lang.Boolean;
import w51.a;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.String;
import xf6.l;

public final class l implements a	// class@0011b3
{
    public static final l a;

    static {
       l.a = new l();
    }
    public void l(){
       super();
    }
    public final void accept(Object p0){
       boolean b = p0.booleanValue();
       a uoa = a.class;
       if (!PatchProxy.isSupport(uoa) || !PatchProxy.applyVoidOneRefs(Boolean.valueOf(b), null, uoa, "24")) {
          l.h("live_close_comment", b);
       }
       return;
    }
}
