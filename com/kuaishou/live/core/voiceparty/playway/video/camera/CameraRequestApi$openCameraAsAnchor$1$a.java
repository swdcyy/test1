package com.kuaishou.live.core.voiceparty.playway.video.camera.CameraRequestApi$openCameraAsAnchor$1$a;
import erd.g;
import com.kuaishou.live.core.voiceparty.playway.video.camera.CameraRequestApi$openCameraAsAnchor$1;
import java.lang.Object;
import com.kuaishou.live.core.voiceparty.model.VoicePartyVideoControlResponse;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.Result;
import qrd.l1;
import msd.l;
import com.kuaishou.livestream.message.nano.SCMicSeatsInfo;
import vs2.a;
import com.kuaishou.live.core.voiceparty.playway.video.camera.CameraRequestApi;
import com.kuaishou.livestream.message.nano.LiveStreamMessages$MicSeatDetailInfo;
import ss2.h;

public final class CameraRequestApi$openCameraAsAnchor$1$a implements g	// class@0018d2
{
    public final CameraRequestApi$openCameraAsAnchor$1 b;

    public void CameraRequestApi$openCameraAsAnchor$1$a(CameraRequestApi$openCameraAsAnchor$1 p0){
       this.b = p0;
       super();
    }
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, CameraRequestApi$openCameraAsAnchor$1$a.class, "1")) {
       }else {
          this.b.$callback.invoke(Result.box-impl(Result.constructor-impl(l1.a)));
          p0 = p0.base64MicSeats;
          if (p0 != null) {
             p0 = a.a(p0);
             this.b.this$0.c.e(p0.micSeatDetailInfo, p0.micSeatsVersion);
          }
       }
       return;
    }
}
