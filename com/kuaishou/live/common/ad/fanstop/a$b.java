package com.kuaishou.live.common.ad.fanstop.a$b;
import erd.g;
import com.kuaishou.live.common.ad.fanstop.a;
import h91.a;
import java.lang.Object;
import java.lang.Throwable;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;

public class a$b implements g	// class@000e64
{
    public final a b;
    public final a c;

    public void a$b(a p0,a p1){
       this.c = p0;
       this.b = p1;
       super();
    }
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, a$b.class, "1")) {
       }else {
          this.b.onError(p0);
       }
       return;
    }
}
