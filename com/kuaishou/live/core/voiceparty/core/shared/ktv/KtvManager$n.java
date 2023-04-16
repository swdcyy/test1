package com.kuaishou.live.core.voiceparty.core.shared.ktv.KtvManager$n;
import ut7.d;
import com.kuaishou.live.core.voiceparty.core.shared.ktv.KtvManager;
import java.lang.String;
import java.lang.Object;
import ut7.h;
import com.kuaishou.livestream.message.nano.KtvMusicOrderInfo;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import com.kwai.statechart.b;
import com.kuaishou.live.core.voiceparty.core.shared.ktv.KtvManager$f;
import com.kuaishou.live.core.voiceparty.core.shared.ktv.KtvManager$c;
import com.kwai.statechart.a;
import com.kuaishou.live.core.voiceparty.core.shared.ktv.KtvManager$b;
import com.kuaishou.live.core.voiceparty.core.shared.ktv.KtvManager$h;
import jp2.u;
import com.kuaishou.live.core.voiceparty.core.shared.ktv.KtvManager$SingerChangeSingType;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;

public final class KtvManager$n extends d	// class@00143b
{
    public final KtvManager f;

    public void KtvManager$n(KtvManager p0,String p1){
       this.f = p0;
       super(p1);
    }
    public void e(Object p0,h p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, KtvManager$n.class, "1")) {
       }else {
          a.p(p0, "music");
          a.p(p1, "reason");
          this.h().h(p0);
          this.a().p(this.h());
          this.a().n().g(p0);
          this.h().n(this.f.f().q());
          this.f.k();
       }
       return;
    }
    public void f(h p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, KtvManager$n.class, "3")) {
          return;
       }
       a.p(p0, "reason");
       this.a().p(null);
       this.f.l();
       return;
    }
    public final boolean j(KtvManager$SingerChangeSingType p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, KtvManager$n.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       a.p(p0, "singType");
       if (a.g(p0.b(), this.a().g())) {
          this.h().j(p0.a());
       }
       return true;
    }
}
