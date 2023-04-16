package com.kuaishou.live.core.voiceparty.player.VoicePartyPlayerController$getLatestTsptExtraData$1;
import msd.l;
import kotlin.jvm.internal.Lambda;
import java.lang.Object;
import com.kwai.video.waynelive.LivePlayerController;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import kotlin.jvm.internal.a;

public final class VoicePartyPlayerController$getLatestTsptExtraData$1 extends Lambda implements l	// class@001821
{
    public static final VoicePartyPlayerController$getLatestTsptExtraData$1 INSTANCE;

    static {
       VoicePartyPlayerController$getLatestTsptExtraData$1.INSTANCE = new VoicePartyPlayerController$getLatestTsptExtraData$1();
    }
    public void VoicePartyPlayerController$getLatestTsptExtraData$1(){
       super(1);
    }
    public Object invoke(Object p0){
       return this.invoke(p0);
    }
    public final byte[] invoke(LivePlayerController p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, VoicePartyPlayerController$getLatestTsptExtraData$1.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.p(p0, "$receiver");
       return p0.getLatestTsptExtraData();
    }
}
