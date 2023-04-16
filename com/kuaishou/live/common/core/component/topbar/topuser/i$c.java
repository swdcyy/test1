package com.kuaishou.live.common.core.component.topbar.topuser.i$c;
import erd.o;
import com.kuaishou.live.common.core.component.topbar.topuser.i;
import java.lang.Object;
import brd.t;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import brd.w;
import com.kuaishou.live.common.core.component.topbar.topuser.k;

public class i$c implements o	// class@001789
{
    public final i b;

    public void i$c(i p0){
       this.b = p0;
       super();
    }
    public Object apply(Object p0){
       t ot = PatchProxy.applyOneRefs(p0, this, i$c.class, "1");
       if (ot != PatchProxyResult.class) {
       }else {
          ot = p0.flatMap(new k(this));
       }
       return ot;
    }
}
