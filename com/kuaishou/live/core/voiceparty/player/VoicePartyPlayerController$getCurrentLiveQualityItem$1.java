package com.kuaishou.live.core.voiceparty.player.VoicePartyPlayerController$getCurrentLiveQualityItem$1;
import msd.l;
import kotlin.jvm.internal.Lambda;
import com.kwai.video.waynelive.LivePlayerController;
import com.kwai.video.waynelive.quality.LiveQualityItem;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import kotlin.jvm.internal.a;

public final class VoicePartyPlayerController$getCurrentLiveQualityItem$1 extends Lambda implements l	// class@00181d
{
    public static final VoicePartyPlayerController$getCurrentLiveQualityItem$1 INSTANCE;

    static {
       VoicePartyPlayerController$getCurrentLiveQualityItem$1.INSTANCE = new VoicePartyPlayerController$getCurrentLiveQualityItem$1();
    }
    public void VoicePartyPlayerController$getCurrentLiveQualityItem$1(){
       super(1);
    }
    public final LiveQualityItem invoke(LivePlayerController p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, VoicePartyPlayerController$getCurrentLiveQualityItem$1.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.p(p0, "$receiver");
       return p0.getCurrentLiveQualityItem();
    }
    public Object invoke(Object p0){
       return this.invoke(p0);
    }
}
