package com.kuaishou.live.core.basic.utils.g;
import erd.o;
import java.lang.Runnable;
import com.kuaishou.live.core.basic.utils.g$a;
import java.lang.Object;
import brd.t;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import brd.w;
import com.kuaishou.live.core.basic.utils.f;

public class g implements o	// class@0008e9
{
    public final Runnable b;
    public final g$a c;

    public void g(Runnable p0){
       super(p0, null);
    }
    public void g(Runnable p0,g$a p1){
       super();
       this.b = p0;
       this.c = p1;
    }
    public Object apply(Object p0){
       t ot = PatchProxy.applyOneRefs(p0, this, g.class, "1");
       if (ot != PatchProxyResult.class) {
       }else {
          ot = p0.flatMap(new f(this));
       }
       return ot;
    }
}
