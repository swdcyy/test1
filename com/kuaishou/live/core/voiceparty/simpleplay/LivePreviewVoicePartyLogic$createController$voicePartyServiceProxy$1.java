package com.kuaishou.live.core.voiceparty.simpleplay.LivePreviewVoicePartyLogic$createController$voicePartyServiceProxy$1;
import msd.a;
import kotlin.jvm.internal.Lambda;
import com.kuaishou.live.core.voiceparty.simpleplay.LivePreviewVoicePartyLogic;
import com.kuaishou.live.core.voiceparty.playway.shared.model.MicSeatsDataManager;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.kuaishou.live.core.voiceparty.playway.shared.model.audience.AudienceMicSeatsDataManager;

public final class LivePreviewVoicePartyLogic$createController$voicePartyServiceProxy$1 extends Lambda implements a	// class@001904
{
    public final LivePreviewVoicePartyLogic this$0;

    public void LivePreviewVoicePartyLogic$createController$voicePartyServiceProxy$1(LivePreviewVoicePartyLogic p0){
       this.this$0 = p0;
       super(0);
    }
    public final MicSeatsDataManager invoke(){
       Object obj = PatchProxy.apply(null, this, LivePreviewVoicePartyLogic$createController$voicePartyServiceProxy$1.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return LivePreviewVoicePartyLogic.a(this.this$0);
    }
    public Object invoke(){
       return this.invoke();
    }
}
