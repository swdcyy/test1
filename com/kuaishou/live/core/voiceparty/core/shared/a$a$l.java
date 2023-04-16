package com.kuaishou.live.core.voiceparty.core.shared.a$a$l;
import com.kwai.statechart.a;
import com.kuaishou.live.core.voiceparty.core.shared.a$a;
import java.lang.String;
import java.lang.Object;
import ut7.h;
import hp2.f;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import com.kuaishou.live.core.voiceparty.core.shared.a$d;
import hp2.t;
import com.kuaishou.live.core.voiceparty.core.shared.a;
import hp2.c;

public final class a$a$l extends a	// class@0013f3
{
    public final a$a d;

    public void a$a$l(a$a p0,String p1){
       this.d = p0;
       super(p1);
    }
    public void e(Object p0,h p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, a$a$l.class, "1")) {
       }else {
          a.p(p0, "param");
          a.p(p1, "reason");
          this.a().m(p0.a());
          this.d.i.h().Y(p0);
       }
       return;
    }
    public void f(h p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, a$a$l.class, "2")) {
          return;
       }
       a.p(p0, "reason");
       this.d.i.h().L(p0);
       this.a().m("");
       return;
    }
}
