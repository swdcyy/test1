package com.kuaishou.live.core.voiceparty.core.audience.RtcManager$onEnterRoom$2;
import msd.l;
import kotlin.jvm.internal.Lambda;
import com.kuaishou.live.core.voiceparty.core.audience.RtcManager;
import java.lang.Object;
import java.util.Map;
import qrd.l1;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import zo2.o0;

public final class RtcManager$onEnterRoom$2 extends Lambda implements l	// class@0013b2
{
    public final Object $token;
    public final RtcManager this$0;

    public void RtcManager$onEnterRoom$2(RtcManager p0,Object p1){
       this.this$0 = p0;
       this.$token = p1;
       super(1);
    }
    public Object invoke(Object p0){
       this.invoke(p0);
       return l1.a;
    }
    public final void invoke(Map p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, RtcManager$onEnterRoom$2.class, "1")) {
          return;
       }
       a.p(p0, "it");
       this.this$0.b.N(this.$token, p0);
       return;
    }
}
