package com.kuaishou.live.core.voiceparty.player.VoicePartyPlayerController$getVideoHeight$1;
import msd.l;
import kotlin.jvm.internal.Lambda;
import com.kwai.video.waynelive.LivePlayerController;
import java.lang.Integer;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import kotlin.jvm.internal.a;

public final class VoicePartyPlayerController$getVideoHeight$1 extends Lambda implements l	// class@001824
{
    public static final VoicePartyPlayerController$getVideoHeight$1 INSTANCE;

    static {
       VoicePartyPlayerController$getVideoHeight$1.INSTANCE = new VoicePartyPlayerController$getVideoHeight$1();
    }
    public void VoicePartyPlayerController$getVideoHeight$1(){
       super(1);
    }
    public final Integer invoke(LivePlayerController p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, VoicePartyPlayerController$getVideoHeight$1.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.p(p0, "$receiver");
       return Integer.valueOf(p0.getVideoHeight());
    }
    public Object invoke(Object p0){
       return this.invoke(p0);
    }
}
