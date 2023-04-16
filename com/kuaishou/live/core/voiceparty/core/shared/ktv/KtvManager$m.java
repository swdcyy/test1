package com.kuaishou.live.core.voiceparty.core.shared.ktv.KtvManager$m;
import com.kuaishou.live.core.voiceparty.core.shared.ktv.KtvManager$BaseWatchPrepareState;
import com.kuaishou.live.core.voiceparty.core.shared.ktv.KtvManager;
import java.lang.String;
import java.lang.Object;
import ut7.h;
import qrd.l1;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import jp2.s;
import com.kwai.statechart.a;
import com.kuaishou.live.core.voiceparty.core.shared.ktv.KtvManager$f;
import com.kuaishou.livestream.message.nano.KtvMusicOrderInfo;
import com.kuaishou.live.core.voiceparty.core.shared.ktv.KtvManager$c;
import com.kwai.robust.PatchProxyResult;
import com.kuaishou.live.core.voiceparty.core.shared.ktv.KtvManager$RefreshWatch;
import java.lang.Boolean;
import com.kuaishou.live.core.voiceparty.core.shared.ktv.KtvManager$NextMusicOrder;
import ut7.e;

public final class KtvManager$m extends KtvManager$BaseWatchPrepareState	// class@00143a
{
    public final KtvManager h;

    public void KtvManager$m(KtvManager p0,String p1){
       this.h = p0;
       super(p0, p1);
    }
    public void e(Object p0,h p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, KtvManager$m.class, "2")) {
       }else {
          a.p(p0, "param");
          a.p(p1, "reason");
          this.h.i().Z(this.a().b());
          this.k();
       }
       return;
    }
    public KtvManager$f h(){
       Object obj = PatchProxy.apply(null, this, KtvManager$m.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.a();
    }
    public boolean j(){
       return false;
    }
    public final boolean l(KtvManager$RefreshWatch p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, KtvManager$m.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       a.p(p0, "e");
       this.h.r(new KtvManager$NextMusicOrder(this.h().b(), true));
       return true;
    }
}
