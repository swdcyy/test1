package com.kuaishou.live.core.show.test.v;
import z1.a;
import java.lang.Object;
import java.lang.Boolean;
import w51.a;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.String;
import xf6.l;

public final class v implements a	// class@0011c7
{
    public static final v a;

    static {
       v.a = new v();
    }
    public void v(){
       super();
    }
    public final void accept(Object p0){
       boolean b = p0.booleanValue();
       a uoa = a.class;
       if (!PatchProxy.isSupport(uoa) || !PatchProxy.applyVoidOneRefs(Boolean.valueOf(b), null, uoa, "54")) {
          l.h("live_close_hourly_rank_list", b);
       }
       return;
    }
}
