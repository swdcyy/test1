package com.kuaishou.live.core.voiceparty.player.VoicePartyPlayerController$removeQualityChangeListener$1;
import msd.l;
import kotlin.jvm.internal.Lambda;
import com.kwai.video.waynelive.quality.LiveQualityChangeListener;
import java.lang.Object;
import com.kwai.video.waynelive.LivePlayerController;
import qrd.l1;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import com.kwai.video.waynelive.ILivePlayerStatusMonitor;

public final class VoicePartyPlayerController$removeQualityChangeListener$1 extends Lambda implements l	// class@001830
{
    public final LiveQualityChangeListener $listener;

    public void VoicePartyPlayerController$removeQualityChangeListener$1(LiveQualityChangeListener p0){
       this.$listener = p0;
       super(1);
    }
    public Object invoke(Object p0){
       this.invoke(p0);
       return l1.a;
    }
    public final void invoke(LivePlayerController p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, VoicePartyPlayerController$removeQualityChangeListener$1.class, "1")) {
          return;
       }
       a.p(p0, "$receiver");
       p0.removeQualityChangeListener(this.$listener);
       return;
    }
}
