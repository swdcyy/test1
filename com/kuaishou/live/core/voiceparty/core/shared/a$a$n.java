package com.kuaishou.live.core.voiceparty.core.shared.a$a$n;
import com.kwai.statechart.a;
import com.kuaishou.live.core.voiceparty.core.shared.a$a;
import java.lang.String;
import java.lang.Object;
import ut7.h;
import hp2.h;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import com.kuaishou.live.core.voiceparty.core.shared.a$d;
import com.kuaishou.live.core.voiceparty.core.shared.a$c;
import java.util.Objects;
import java.lang.System;
import hp2.t;
import com.kuaishou.live.core.voiceparty.core.shared.a;
import hp2.c;

public final class a$a$n extends a	// class@0013f5
{
    public final a$a d;

    public void a$a$n(a$a p0,String p1){
       this.d = p0;
       super(p1);
    }
    public void e(Object p0,h p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, a$a$n.class, "1")) {
       }else {
          a.p(p0, "param");
          a.p(p1, "reason");
          a$c uoc = this.a().k();
          Objects.requireNonNull(uoc);
          if (!PatchProxy.applyVoid(null, uoc, a$c.class, "5")) {
             uoc.g = System.currentTimeMillis();
             uoc.j(0);
          }
          a$d uod = this.a();
          String str = p0.a();
          Objects.requireNonNull(uod);
          if (!PatchProxy.applyVoidOneRefs(str, uod, a$d.class, "7")) {
             a.p(str, "<set-?>");
             uod.e = str;
          }
          this.d.i.h().T(p0);
       }
       return;
    }
    public void f(h p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, a$a$n.class, "2")) {
          return;
       }
       a.p(p0, "reason");
       a$c uoc = this.a().k();
       Objects.requireNonNull(uoc);
       if (!PatchProxy.applyVoid(null, uoc, a$c.class, "6")) {
          uoc.j(System.currentTimeMillis());
       }
       this.d.i.h().V(p0);
       return;
    }
}