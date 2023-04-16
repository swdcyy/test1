package com.kuaishou.live.core.voiceparty.playway.video.VoicePartyAudienceVideoViewController$initRenderAreaView$1;
import msd.l;
import kotlin.jvm.internal.Lambda;
import com.kuaishou.live.core.voiceparty.playway.video.VoicePartyAudienceVideoViewController;
import java.lang.Object;
import android.graphics.Rect;
import qrd.l1;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import android.graphics.Point;
import com.kwai.feature.api.live.service.voiceparty.LiveVoicePartyPlayViewService$ScaleType;
import com.kwai.feature.api.live.service.voiceparty.LiveVoicePartyPlayViewService;
import com.kuaishou.live.core.voiceparty.LiveVoicePartyLogTag;
import java.lang.StringBuilder;
import pp.c;
import com.kuaishou.android.live.log.b;

public final class VoicePartyAudienceVideoViewController$initRenderAreaView$1 extends Lambda implements l	// class@0018b2
{
    public final VoicePartyAudienceVideoViewController this$0;

    public void VoicePartyAudienceVideoViewController$initRenderAreaView$1(VoicePartyAudienceVideoViewController p0){
       this.this$0 = p0;
       super(1);
    }
    public Object invoke(Object p0){
       this.invoke(p0);
       return l1.a;
    }
    public final void invoke(Rect p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, VoicePartyAudienceVideoViewController$initRenderAreaView$1.class, "1")) {
          return;
       }
       a.p(p0, "locationInWindow");
       if (a.g(p0, this.this$0.o) ^ 0x01) {
          VoicePartyAudienceVideoViewController$initRenderAreaView$1 tthis$0 = this.this$0;
          tthis$0.o = p0;
          tthis$0.D.k(new Point(p0.width(), p0.height()), p0, LiveVoicePartyPlayViewService$ScaleType.CenterCrop);
       }
       b.Z(LiveVoicePartyLogTag.VIDEO_CHAT, "观众端播放器位置变化 "+p0);
       return;
    }
}
