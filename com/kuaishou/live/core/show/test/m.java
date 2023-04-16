package com.kuaishou.live.core.show.test.m;
import z1.a;
import java.lang.Object;
import java.lang.Boolean;
import w51.a;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.String;
import xf6.l;

public final class m implements a	// class@0011b5
{
    public static final m a;

    static {
       m.a = new m();
    }
    public void m(){
       super();
    }
    public final void accept(Object p0){
       boolean b = p0.booleanValue();
       a uoa = a.class;
       if (!PatchProxy.isSupport(uoa) || !PatchProxy.applyVoidOneRefs(Boolean.valueOf(b), null, uoa, "95")) {
          l.h("key_open_anchor_stream_type_detect", b);
       }
       return;
    }
}
