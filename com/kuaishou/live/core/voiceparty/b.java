package com.kuaishou.live.core.voiceparty.b;
import java.lang.Object;
import com.kuaishou.live.core.voiceparty.b$a;
import co2.r;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import pp2.a;

public final class b	// class@00133b
{
    public final b$a a;

    public void b(){
       super();
       this.a = new b$a();
    }
    public final void a(r p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, b.class, "1")) {
          return;
       }
       a.p(p0, "observer");
       this.a.j0(p0);
       return;
    }
    public final void b(r p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, b.class, "2")) {
          return;
       }
       a.p(p0, "observer");
       this.a.l0(p0);
       return;
    }
}
