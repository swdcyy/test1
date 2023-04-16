package com.kuaishou.live.core.voiceparty.core.audience.AudienceVoicePartyManager$start$1;
import msd.l;
import kotlin.jvm.internal.Lambda;
import com.kuaishou.live.core.voiceparty.core.audience.AudienceVoicePartyManager;
import java.lang.Object;
import com.kuaishou.livestream.message.nano.LiveStreamMessages$VoicePartyCommonInfo;
import qrd.l1;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import com.kuaishou.live.core.voiceparty.core.shared.a$d;
import com.kuaishou.live.core.voiceparty.core.shared.a;
import zo2.b;
import hp2.d;

public final class AudienceVoicePartyManager$start$1 extends Lambda implements l	// class@00138c
{
    public final AudienceVoicePartyManager this$0;

    public void AudienceVoicePartyManager$start$1(AudienceVoicePartyManager p0){
       this.this$0 = p0;
       super(1);
    }
    public Object invoke(Object p0){
       this.invoke(p0);
       return l1.a;
    }
    public final void invoke(LiveStreamMessages$VoicePartyCommonInfo p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, AudienceVoicePartyManager$start$1.class, "1")) {
          return;
       }
       a.p(p0, "it");
       this.this$0.e().l(new b(p0));
       return;
    }
}
