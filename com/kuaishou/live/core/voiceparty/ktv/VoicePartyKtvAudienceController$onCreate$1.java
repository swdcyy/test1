package com.kuaishou.live.core.voiceparty.ktv.VoicePartyKtvAudienceController$onCreate$1;
import msd.a;
import kotlin.jvm.internal.Lambda;
import com.kuaishou.live.core.voiceparty.ktv.VoicePartyKtvAudienceController;
import java.lang.Object;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import qu2.a;
import fs2.p;

public final class VoicePartyKtvAudienceController$onCreate$1 extends Lambda implements a	// class@00151f
{
    public final VoicePartyKtvAudienceController this$0;

    public void VoicePartyKtvAudienceController$onCreate$1(VoicePartyKtvAudienceController p0){
       this.this$0 = p0;
       super(0);
    }
    public Object invoke(){
       return this.invoke();
    }
    public final String invoke(){
       Object obj = PatchProxy.apply(null, this, VoicePartyKtvAudienceController$onCreate$1.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.this$0.v.h().getLiveStreamId();
    }
}