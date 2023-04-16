package com.kuaishou.live.core.voiceparty.player.VoicePartyPlayerController$setLiveQualityItem$1;
import msd.l;
import kotlin.jvm.internal.Lambda;
import com.kwai.video.waynelive.quality.LiveQualityItem;
import java.lang.Object;
import com.kwai.video.waynelive.LivePlayerController;
import qrd.l1;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;

public final class VoicePartyPlayerController$setLiveQualityItem$1 extends Lambda implements l	// class@001834
{
    public final LiveQualityItem $item;

    public void VoicePartyPlayerController$setLiveQualityItem$1(LiveQualityItem p0){
       this.$item = p0;
       super(1);
    }
    public Object invoke(Object p0){
       this.invoke(p0);
       return l1.a;
    }
    public final void invoke(LivePlayerController p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, VoicePartyPlayerController$setLiveQualityItem$1.class, "1")) {
          return;
       }
       a.p(p0, "$receiver");
       p0.setLiveQualityItem(this.$item);
       return;
    }
}
