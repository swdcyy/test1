package com.kuaishou.live.core.voiceparty.micseats.c;
import sfc.a;
import com.kuaishou.live.core.voiceparty.micseats.a;
import java.lang.Object;
import java.lang.Throwable;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import ps2.i;

public final class c extends a	// class@001578
{
    public final a c;
    public final int d;

    public void c(a p0,int p1){
       this.c = p0;
       this.d = p1;
       super();
    }
    public void accept(Object p0){
       this.b(p0);
    }
    public void b(Throwable p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, c.class, "1")) {
          return;
       }
       a.p(p0, "throwable");
       if (i.a(p0)) {
          this.c.a0(this.d);
          return;
       }else {
          super.b(p0);
          return;
       }
    }
}
