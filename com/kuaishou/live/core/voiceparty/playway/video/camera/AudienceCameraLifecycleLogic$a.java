package com.kuaishou.live.core.voiceparty.playway.video.camera.AudienceCameraLifecycleLogic$a;
import erd.g;
import com.kuaishou.live.core.voiceparty.playway.video.camera.AudienceCameraLifecycleLogic;
import java.lang.Object;
import java.lang.Long;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kuaishou.live.core.voiceparty.LiveVoicePartyLogTag;
import pp.c;
import com.kuaishou.android.live.log.b;
import com.kuaishou.live.core.voiceparty.playway.video.camera.AudienceCameraLifecycleLogic$onAppBackground$1$1;
import msd.l;
import com.kuaishou.live.core.voiceparty.playway.video.camera.CameraRequestApi;

public final class AudienceCameraLifecycleLogic$a implements g	// class@0018ba
{
    public final AudienceCameraLifecycleLogic b;

    public void AudienceCameraLifecycleLogic$a(AudienceCameraLifecycleLogic p0){
       this.b = p0;
       super();
    }
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, AudienceCameraLifecycleLogic$a.class, "1")) {
       }else {
          b.Z(LiveVoicePartyLogTag.PORTRAIT_VIDEO, "Background Too Long: close video now !");
          this.b.f.b(AudienceCameraLifecycleLogic$onAppBackground$1$1.INSTANCE);
          p0.b = true;
       }
       return;
    }
}
