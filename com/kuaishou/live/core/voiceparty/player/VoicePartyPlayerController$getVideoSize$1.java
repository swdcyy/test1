package com.kuaishou.live.core.voiceparty.player.VoicePartyPlayerController$getVideoSize$1;
import msd.l;
import kotlin.jvm.internal.Lambda;
import com.kwai.video.waynelive.LivePlayerController;
import android.graphics.Point;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import kotlin.jvm.internal.a;

public final class VoicePartyPlayerController$getVideoSize$1 extends Lambda implements l	// class@001825
{
    public static final VoicePartyPlayerController$getVideoSize$1 INSTANCE;

    static {
       VoicePartyPlayerController$getVideoSize$1.INSTANCE = new VoicePartyPlayerController$getVideoSize$1();
    }
    public void VoicePartyPlayerController$getVideoSize$1(){
       super(1);
    }
    public final Point invoke(LivePlayerController p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, VoicePartyPlayerController$getVideoSize$1.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.p(p0, "$receiver");
       return new Point(p0.getVideoWidth(), p0.getVideoHeight());
    }
    public Object invoke(Object p0){
       return this.invoke(p0);
    }
}
