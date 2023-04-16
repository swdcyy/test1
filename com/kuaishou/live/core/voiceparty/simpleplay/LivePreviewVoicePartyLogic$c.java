package com.kuaishou.live.core.voiceparty.simpleplay.LivePreviewVoicePartyLogic$c;
import qu2.c;
import com.kuaishou.live.core.voiceparty.simpleplay.VoicePartyAudienceSimplePlayManagerAssembler;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import com.kuaishou.live.core.voiceparty.core.audience.RtcManager;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import bp2.c;
import com.kuaishou.live.core.voiceparty.b;
import qu2.b;

public final class LivePreviewVoicePartyLogic$c implements c	// class@001902
{
    public final VoicePartyAudienceSimplePlayManagerAssembler a;

    public void LivePreviewVoicePartyLogic$c(VoicePartyAudienceSimplePlayManagerAssembler p0){
       a.p(p0, "playManagerAssembler");
       super();
       this.a = p0;
    }
    public RtcManager a(){
       Object obj = PatchProxy.apply(null, this, LivePreviewVoicePartyLogic$c.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.a.c;
    }
    public c b(){
       Object obj = PatchProxy.apply(null, this, LivePreviewVoicePartyLogic$c.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.a.d;
    }
    public b c(){
       return b.a(this);
    }
}
