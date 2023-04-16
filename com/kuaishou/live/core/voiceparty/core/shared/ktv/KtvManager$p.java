package com.kuaishou.live.core.voiceparty.core.shared.ktv.KtvManager$p;
import com.kuaishou.live.core.voiceparty.core.shared.ktv.KtvManager$BaseWatchPrepareState;
import com.kuaishou.live.core.voiceparty.core.shared.ktv.KtvManager;
import java.lang.String;
import java.lang.Object;
import ut7.h;
import qrd.l1;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import com.kuaishou.live.core.voiceparty.core.shared.ktv.KtvManager$f;
import jp2.u;
import com.kwai.robust.PatchProxyResult;
import com.kwai.statechart.a;
import com.kuaishou.live.core.voiceparty.core.shared.ktv.KtvManager$i;

public final class KtvManager$p extends KtvManager$BaseWatchPrepareState	// class@00143d
{
    public final KtvManager h;

    public void KtvManager$p(KtvManager p0,String p1){
       this.h = p0;
       super(p0, p1);
    }
    public void e(Object p0,h p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, KtvManager$p.class, "2")) {
       }else {
          a.p(p0, "param");
          a.p(p1, "reason");
          this.h().n(this.h.f().q());
          this.h.m();
          this.k();
       }
       return;
    }
    public KtvManager$f h(){
       Object obj = PatchProxy.apply(null, this, KtvManager$p.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.a().a();
    }
    public boolean j(){
       return true;
    }
}
