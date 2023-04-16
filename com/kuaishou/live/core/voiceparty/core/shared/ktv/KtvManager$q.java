package com.kuaishou.live.core.voiceparty.core.shared.ktv.KtvManager$q;
import ut7.c;
import com.kuaishou.live.core.voiceparty.core.shared.ktv.KtvManager;
import java.lang.String;
import java.lang.Object;
import ut7.h;
import mp2.d;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import com.kuaishou.live.core.voiceparty.core.shared.ktv.KtvManager$f;
import com.kuaishou.live.core.voiceparty.core.shared.ktv.KtvManager$c;
import com.kuaishou.live.core.voiceparty.core.shared.ktv.KtvManager$watchingState$1$onEnter$1;
import msd.l;
import com.kuaishou.live.core.voiceparty.core.shared.ktv.KtvManager$watchingState$1$onEnter$2;
import com.kwai.robust.PatchProxyResult;
import com.kwai.statechart.a;
import com.kuaishou.live.core.voiceparty.core.shared.ktv.KtvManager$i;
import com.kuaishou.live.core.voiceparty.core.shared.ktv.KtvManager$SingerChangeSingType;
import java.lang.Boolean;

public final class KtvManager$q extends c	// class@00143e
{
    public d f;
    public final KtvManager g;

    public void KtvManager$q(KtvManager p0,String p1){
       this.g = p0;
       super(p1);
    }
    public void e(Object p0,h p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, KtvManager$q.class, "2")) {
       }else {
          a.p(p0, "param");
          a.p(p1, "reason");
          this.f = p0;
          String str = "logic";
          if (p0 == null) {
             a.S(str);
          }
          p0.c(this.h().d(), new KtvManager$watchingState$1$onEnter$1(this));
          p0 = this.f;
          if (p0 == null) {
             a.S(str);
          }
          p0.a(new KtvManager$watchingState$1$onEnter$2(this));
       }
       return;
    }
    public void f(h p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, KtvManager$q.class, "3")) {
          return;
       }
       a.p(p0, "reason");
       KtvManager$q tf = this.f;
       if (tf == null) {
          a.S("logic");
       }
       tf.stop();
       return;
    }
    public final KtvManager$f h(){
       Object obj = PatchProxy.apply(null, this, KtvManager$q.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.a().a();
    }
    public final boolean j(KtvManager$SingerChangeSingType p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, KtvManager$q.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       a.p(p0, "singType");
       if (a.g(p0.b(), this.h().e()) && this.h().d() != p0.a()) {
          this.h().j(p0.a());
          KtvManager$q tf = this.f;
          if (tf == null) {
             a.S("logic");
          }
          tf.b(this.h().d());
       }
       return true;
    }
}
