package com.kuaishou.live.core.voiceparty.player.VoicePartyPlayerController$isDestroyed$1;
import msd.l;
import kotlin.jvm.internal.Lambda;
import com.kwai.video.waynelive.LivePlayerController;
import java.lang.Boolean;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import kotlin.jvm.internal.a;

public final class VoicePartyPlayerController$isDestroyed$1 extends Lambda implements l	// class@001827
{
    public static final VoicePartyPlayerController$isDestroyed$1 INSTANCE;

    static {
       VoicePartyPlayerController$isDestroyed$1.INSTANCE = new VoicePartyPlayerController$isDestroyed$1();
    }
    public void VoicePartyPlayerController$isDestroyed$1(){
       super(1);
    }
    public final Boolean invoke(LivePlayerController p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, VoicePartyPlayerController$isDestroyed$1.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.p(p0, "$receiver");
       return Boolean.valueOf(p0.isDestroyed());
    }
    public Object invoke(Object p0){
       return this.invoke(p0);
    }
}
