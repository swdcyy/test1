package com.kuaishou.live.core.voiceparty.micseats.a$d;
import sfc.a;
import com.kuaishou.live.core.voiceparty.micseats.a;
import java.lang.Object;
import java.lang.Throwable;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;

public final class a$d extends a	// class@001566
{
    public final a c;

    public void a$d(a p0){
       this.c = p0;
       super();
    }
    public void accept(Object p0){
       this.b(p0);
    }
    public void b(Throwable p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, a$d.class, "1")) {
          return;
       }
       a.p(p0, "throwable");
       this.c.p();
       super.b(p0);
       return;
    }
}
