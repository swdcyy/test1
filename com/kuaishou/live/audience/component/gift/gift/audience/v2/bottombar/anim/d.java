package com.kuaishou.live.audience.component.gift.gift.audience.v2.bottombar.anim.d;
import lnc.c3$a;
import java.lang.Object;
import com.kuaishou.live.audience.component.gift.gift.audience.v2.bottombar.anim.o;
import java.util.Objects;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import crd.b;
import lnc.b9;
import gz0.z;
import lnc.c3;
import lf3.g;
import hf3.a;
import com.kuaishou.live.audience.component.gift.gift.audience.v2.bottombar.anim.n;

public final class d implements c3$a	// class@000b05
{
    public static final d a;

    static {
       d.a = new d();
    }
    public void d(){
       super();
    }
    public final void apply(Object p0){
       Objects.requireNonNull(p0);
       if (PatchProxy.applyVoid(null, p0, o.class, "2")) {
       }else {
          b9.a(p0.c);
          c3.c(p0.f, new z(p0));
          p0.a.o(1088, p0.i);
          c3.c(p0.h, n.a);
       }
       return;
    }
}
