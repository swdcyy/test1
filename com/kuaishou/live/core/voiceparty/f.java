package com.kuaishou.live.core.voiceparty.f;
import zo2.u;
import com.kuaishou.live.core.voiceparty.h;
import java.lang.Object;
import zo2.n;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.util.Objects;
import yx2.g;
import hp2.e;
import co2.f2;
import brd.t;
import com.kuaishou.live.core.voiceparty.e;
import erd.o;
import co2.p;
import erd.g;
import crd.b;
import hp2.c;
import hp2.c$a;
import hp2.c$b;
import hp2.c$c;
import lnc.b9;

public class f implements u	// class@0014eb
{
    public final h b;

    public void f(h p0){
       this.b = p0;
       super();
    }
    public void a0(n p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, f.class, "1")) {
          return;
       }
       f tb = this.b;
       Objects.requireNonNull(tb);
       if (!PatchProxy.applyVoid(null, tb, h.class, "17")) {
          tb.a.f("onEnterVoiceParty");
          tb.i = tb.c.e().h().map(e.b).distinctUntilChanged().subscribe(new p(tb));
       }
       return;
    }
    public void b(c p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, f.class, "2")) {
          return;
       }
       f tb = this.b;
       Objects.requireNonNull(tb);
       if (!PatchProxy.applyVoidOneRefs(p0, tb, h.class, "18")) {
          tb.a.f("onEnterLive");
          int i = 0;
          if (p0 == c$a.d || p0 == c$b.d) {
             i = 1;
          }else if(p0 == c$c.d){
             i = 5;
          }
          tb.b(i);
          p0.c = 2;
          b9.a(tb.i);
       }
       return;
    }
}
