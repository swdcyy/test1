package com.kuaishou.live.core.show.test.j;
import z1.a;
import java.lang.Object;
import java.lang.Boolean;
import w51.a;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.String;
import xf6.l;

public final class j implements a	// class@0011af
{
    public static final j a;

    static {
       j.a = new j();
    }
    public void j(){
       super();
    }
    public final void accept(Object p0){
       boolean b = p0.booleanValue();
       a uoa = a.class;
       if (!PatchProxy.isSupport(uoa) || !PatchProxy.applyVoidOneRefs(Boolean.valueOf(b), null, uoa, "72")) {
          l.h("live_close_multi_line_ui", b);
       }
       return;
    }
}
