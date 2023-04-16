package com.kuaishou.live.core.voiceparty.VoicePartyAudienceManagerAssembler$liveInfo$1;
import msd.a;
import kotlin.jvm.internal.Lambda;
import com.kuaishou.live.core.voiceparty.VoicePartyAudienceManagerAssembler;
import java.lang.Object;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import t02.a0;
import kotlin.jvm.internal.a;
import p91.m;

public final class VoicePartyAudienceManagerAssembler$liveInfo$1 extends Lambda implements a	// class@001316
{
    public final VoicePartyAudienceManagerAssembler this$0;

    public void VoicePartyAudienceManagerAssembler$liveInfo$1(VoicePartyAudienceManagerAssembler p0){
       this.this$0 = p0;
       super(0);
    }
    public Object invoke(){
       return this.invoke();
    }
    public final String invoke(){
       a0 obj = PatchProxy.apply(null, this, VoicePartyAudienceManagerAssembler$liveInfo$1.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.this$0.g.Z2;
       a.o(obj, "callerContext.mLiveBasicContext");
       String liveStreamId = obj.getLiveStreamId();
       a.o(liveStreamId, "callerContext.mLiveBasicContext.liveStreamId");
       return liveStreamId;
    }
}
