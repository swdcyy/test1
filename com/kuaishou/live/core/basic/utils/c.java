package com.kuaishou.live.core.basic.utils.c;
import erd.o;
import java.lang.Runnable;
import java.lang.Object;
import brd.t;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import brd.w;
import com.kuaishou.live.core.basic.utils.b;

public class c implements o	// class@0008e5
{
    public final Runnable b;

    public void c(Runnable p0){
       super();
       this.b = p0;
    }
    public Object apply(Object p0){
       t ot = PatchProxy.applyOneRefs(p0, this, c.class, "1");
       if (ot != PatchProxyResult.class) {
       }else {
          ot = p0.flatMap(new b(this));
       }
       return ot;
    }
}
