package com.kuaishou.live.core.voiceparty.player.VoicePartyPlayerController$getLiveQualityList$1;
import msd.l;
import kotlin.jvm.internal.Lambda;
import java.lang.Object;
import com.kwai.video.waynelive.LivePlayerController;
import java.util.List;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import kotlin.jvm.internal.a;

public final class VoicePartyPlayerController$getLiveQualityList$1 extends Lambda implements l	// class@001823
{
    public static final VoicePartyPlayerController$getLiveQualityList$1 INSTANCE;

    static {
       VoicePartyPlayerController$getLiveQualityList$1.INSTANCE = new VoicePartyPlayerController$getLiveQualityList$1();
    }
    public void VoicePartyPlayerController$getLiveQualityList$1(){
       super(1);
    }
    public Object invoke(Object p0){
       return this.invoke(p0);
    }
    public final List invoke(LivePlayerController p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, VoicePartyPlayerController$getLiveQualityList$1.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.p(p0, "$receiver");
       return p0.getLiveQualityList();
    }
}
