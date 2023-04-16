package com.kuaishou.live.core.voiceparty.core.shared.theater.TheaterManager$g;
import ut7.c;
import com.kuaishou.live.core.voiceparty.core.shared.theater.TheaterManager;
import java.lang.String;
import java.lang.Object;
import ut7.h;
import qrd.l1;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import com.kwai.statechart.a;
import com.kuaishou.live.core.voiceparty.core.shared.theater.TheaterManager$a;
import op2.f;
import op2.k;

public final class TheaterManager$g extends c	// class@001472
{
    public final TheaterManager f;

    public void TheaterManager$g(TheaterManager p0,String p1){
       this.f = p0;
       super(p1);
    }
    public void e(Object p0,h p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, TheaterManager$g.class, "1")) {
       }else {
          a.p(p0, "param");
          a.p(p1, "reason");
          this.a().g(null);
          this.f.f().e0();
       }
       return;
    }
}
