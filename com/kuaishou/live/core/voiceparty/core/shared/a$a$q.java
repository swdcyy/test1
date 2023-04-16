package com.kuaishou.live.core.voiceparty.core.shared.a$a$q;
import com.kwai.statechart.a;
import com.kuaishou.live.core.voiceparty.core.shared.a$a;
import java.lang.String;
import java.lang.Object;
import ut7.h;
import qrd.l1;
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

public final class a$a$q extends a	// class@0013f8
{
    public final a$a d;

    public void a$a$q(a$a p0,String p1){
       this.d = p0;
       super(p1);
    }
    public void e(Object p0,h p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, a$a$q.class, "1")) {
       }else {
          a.p(p0, "param");
          a.p(p1, "reason");
          p0 = this.a().k();
          Objects.requireNonNull(p0);
          if (!PatchProxy.applyVoid(null, p0, a$c.class, "3")) {
             p0.e = System.currentTimeMillis();
             p0.k(0);
          }
          this.d.i.h().x();
       }
       return;
    }
    public void f(h p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, a$a$q.class, "2")) {
          return;
       }
       a.p(p0, "reason");
       a$c uoc = this.a().k();
       Objects.requireNonNull(uoc);
       if (!PatchProxy.applyVoid(null, uoc, a$c.class, "4")) {
          uoc.k(System.currentTimeMillis());
       }
       this.d.i.h().R(p0);
       return;
    }
}
