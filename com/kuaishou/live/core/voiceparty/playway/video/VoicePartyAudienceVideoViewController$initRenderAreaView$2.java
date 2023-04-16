package com.kuaishou.live.core.voiceparty.playway.video.VoicePartyAudienceVideoViewController$initRenderAreaView$2;
import msd.l;
import kotlin.jvm.internal.Lambda;
import com.kuaishou.live.core.voiceparty.playway.video.VoicePartyAudienceVideoViewController;
import java.lang.Object;
import java.lang.Boolean;
import qrd.l1;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.String;
import com.kwai.feature.api.live.service.voiceparty.LiveVoicePartyPlayViewService;
import com.kuaishou.live.core.voiceparty.LiveVoicePartyLogTag;
import java.lang.StringBuilder;
import pp.c;
import com.kuaishou.android.live.log.b;

public final class VoicePartyAudienceVideoViewController$initRenderAreaView$2 extends Lambda implements l	// class@0018b3
{
    public final VoicePartyAudienceVideoViewController this$0;

    public void VoicePartyAudienceVideoViewController$initRenderAreaView$2(VoicePartyAudienceVideoViewController p0){
       this.this$0 = p0;
       super(1);
    }
    public Object invoke(Object p0){
       this.invoke(p0.booleanValue());
       return l1.a;
    }
    public final void invoke(boolean p0){
       if (PatchProxy.isSupport(VoicePartyAudienceVideoViewController$initRenderAreaView$2.class) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, VoicePartyAudienceVideoViewController$initRenderAreaView$2.class, "1")) {
          return;
       }
       if (!p0) {
          this.this$0.o = null;
       }
       this.this$0.D.b(p0);
       b.Z(LiveVoicePartyLogTag.VIDEO_CHAT, "观众端播放器可见性变化 "+p0);
       return;
    }
}
