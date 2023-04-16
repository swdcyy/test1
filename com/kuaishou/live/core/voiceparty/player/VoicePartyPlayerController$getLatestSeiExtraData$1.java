package com.kuaishou.live.core.voiceparty.player.VoicePartyPlayerController$getLatestSeiExtraData$1;
import msd.l;
import kotlin.jvm.internal.Lambda;
import com.kwai.video.waynelive.LivePlayerController;
import com.kwai.video.waynelive.util.SeiExtraData;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import kotlin.jvm.internal.a;

public final class VoicePartyPlayerController$getLatestSeiExtraData$1 extends Lambda implements l	// class@001820
{
    public static final VoicePartyPlayerController$getLatestSeiExtraData$1 INSTANCE;

    static {
       VoicePartyPlayerController$getLatestSeiExtraData$1.INSTANCE = new VoicePartyPlayerController$getLatestSeiExtraData$1();
    }
    public void VoicePartyPlayerController$getLatestSeiExtraData$1(){
       super(1);
    }
    public final SeiExtraData invoke(LivePlayerController p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, VoicePartyPlayerController$getLatestSeiExtraData$1.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.p(p0, "$receiver");
       return p0.getLatestSeiExtraData();
    }
    public Object invoke(Object p0){
       return this.invoke(p0);
    }
}
