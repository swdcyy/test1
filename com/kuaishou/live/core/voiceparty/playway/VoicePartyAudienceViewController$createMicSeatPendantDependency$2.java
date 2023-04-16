package com.kuaishou.live.core.voiceparty.playway.VoicePartyAudienceViewController$createMicSeatPendantDependency$2;
import msd.p;
import kotlin.jvm.internal.Lambda;
import com.kuaishou.live.core.voiceparty.playway.VoicePartyAudienceViewController;
import java.lang.Object;
import ss2.f;
import java.lang.Number;
import qrd.l1;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.String;
import kotlin.jvm.internal.a;
import com.kuaishou.live.core.voiceparty.playway.VoicePartyAudienceViewController$b;

public final class VoicePartyAudienceViewController$createMicSeatPendantDependency$2 extends Lambda implements p	// class@00183b
{
    public final boolean $isOpponent;
    public final VoicePartyAudienceViewController this$0;

    public void VoicePartyAudienceViewController$createMicSeatPendantDependency$2(VoicePartyAudienceViewController p0,boolean p1){
       this.this$0 = p0;
       this.$isOpponent = p1;
       super(2);
    }
    public Object invoke(Object p0,Object p1){
       this.invoke(p0, p1.intValue());
       return l1.a;
    }
    public final void invoke(f p0,int p1){
       if (PatchProxy.isSupport(VoicePartyAudienceViewController$createMicSeatPendantDependency$2.class) && PatchProxy.applyVoidTwoRefs(p0, Integer.valueOf(p1), this, VoicePartyAudienceViewController$createMicSeatPendantDependency$2.class, "1")) {
          return;
       }
       a.p(p0, "micSeatInfo");
       if (this.$isOpponent == null) {
          this.this$0.B.n1(p0, p1);
       }
       return;
    }
}
