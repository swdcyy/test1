package com.kuaishou.live.lite.framework.basicservice.d;
import erd.g;
import java.lang.Runnable;
import crd.a;
import java.lang.Object;
import com.kuaishou.live.lite.framework.basicservice.LiveLiteScatterLoadManager$ScatterLoadStatus;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import e93.f;
import com.kuaishou.live.lite.framework.basicservice.c;
import crd.b;
import crd.c;

public final class d implements g	// class@00090e
{
    public final Runnable b;
    public final a c;

    public void d(Runnable p0,a p1){
       this.b = p0;
       this.c = p1;
       super();
    }
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, d.class, "1")) {
       }else {
          f.j("afterScatterTask", this.b, 0);
          this.c.c(c.d(new c(this)));
       }
       return;
    }
}
