package com.kuaishou.live.core.voiceparty.core.shared.theater.TheaterManager$i;
import ut7.c;
import com.kuaishou.live.core.voiceparty.core.shared.theater.TheaterManager;
import java.lang.String;
import java.lang.Object;
import ut7.h;
import com.kuaishou.live.core.voiceparty.core.shared.theater.TheaterManager$b;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import op2.b;
import op2.k;

public final class TheaterManager$i extends c	// class@001474
{
    public b f;
    public final TheaterManager g;

    public void TheaterManager$i(TheaterManager p0,String p1){
       this.g = p0;
       super(p1);
    }
    public void e(Object p0,h p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, TheaterManager$i.class, "1")) {
       }else {
          a.p(p0, "param");
          a.p(p1, "reason");
          this.f = this.g.m(p0);
          this.g.f().p();
       }
       return;
    }
    public void f(h p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, TheaterManager$i.class, "2")) {
          return;
       }
       a.p(p0, "reason");
       TheaterManager$i tf = this.f;
       if (tf != null) {
          tf.release();
          this.f = null;
       }
       return;
    }
}
