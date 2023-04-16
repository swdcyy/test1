package com.kuaishou.live.core.voiceparty.core.shared.a$a$o;
import com.kwai.statechart.a;
import com.kuaishou.live.core.voiceparty.core.shared.a$a;
import java.lang.String;
import java.lang.Object;
import ut7.h;
import hp2.m;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import com.kuaishou.live.core.voiceparty.core.shared.a$d;
import java.util.Objects;
import hp2.t;
import com.kuaishou.live.core.voiceparty.core.shared.a;
import hp2.c;

public final class a$a$o extends a	// class@0013f6
{
    public final a$a d;

    public void a$a$o(a$a p0,String p1){
       this.d = p0;
       super(p1);
    }
    public void e(Object p0,h p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, a$a$o.class, "1")) {
       }else {
          a.p(p0, "param");
          a.p(p1, "reason");
          a$d uod = this.a();
          String str = p0.a();
          Objects.requireNonNull(uod);
          if (!PatchProxy.applyVoidOneRefs(str, uod, a$d.class, "6")) {
             a.p(str, "<set-?>");
             uod.d = str;
          }
          this.d.i.h().d0(p0);
       }
       return;
    }
    public void f(h p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, a$a$o.class, "2")) {
          return;
       }
       a.p(p0, "reason");
       this.d.i.h().g0(p0);
       return;
    }
}
