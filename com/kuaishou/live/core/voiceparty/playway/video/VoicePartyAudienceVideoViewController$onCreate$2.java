package com.kuaishou.live.core.voiceparty.playway.video.VoicePartyAudienceVideoViewController$onCreate$2;
import msd.l;
import kotlin.jvm.internal.Lambda;
import com.kuaishou.live.core.voiceparty.playway.video.VoicePartyAudienceVideoViewController;
import java.lang.Object;
import java.lang.Boolean;
import je3.b;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.String;
import com.kwai.robust.PatchProxyResult;
import xo1.c;

public final class VoicePartyAudienceVideoViewController$onCreate$2 extends Lambda implements l	// class@0018b7
{
    public final VoicePartyAudienceVideoViewController this$0;

    public void VoicePartyAudienceVideoViewController$onCreate$2(VoicePartyAudienceVideoViewController p0){
       this.this$0 = p0;
       super(1);
    }
    public Object invoke(Object p0){
       return this.invoke(p0.booleanValue());
    }
    public final b invoke(boolean p0){
       if (PatchProxy.isSupport(VoicePartyAudienceVideoViewController$onCreate$2.class)) {
          Object obj = PatchProxy.applyOneRefs(Boolean.valueOf(p0), this, VoicePartyAudienceVideoViewController$onCreate$2.class, "1");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       return this.this$0.V2(p0);
    }
}
