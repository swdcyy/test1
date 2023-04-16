package com.kuaishou.live.core.voiceparty.core.audience.AudienceVoicePartyManager$1;
import msd.a;
import kotlin.jvm.internal.Lambda;
import com.kuaishou.live.core.voiceparty.core.audience.AudienceVoicePartyManager;
import java.lang.Object;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import qu2.a;

public final class AudienceVoicePartyManager$1 extends Lambda implements a	// class@001387
{
    public final AudienceVoicePartyManager this$0;

    public void AudienceVoicePartyManager$1(AudienceVoicePartyManager p0){
       this.this$0 = p0;
       super(0);
    }
    public Object invoke(){
       return this.invoke();
    }
    public final String invoke(){
       Object obj = PatchProxy.apply(null, this, AudienceVoicePartyManager$1.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.this$0.j.getLiveStreamId();
    }
}
