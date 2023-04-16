package com.kuaishou.live.core.voiceparty.playway.video.camera.CameraRequestApi$a;
import erd.g;
import com.kuaishou.live.core.voiceparty.playway.video.camera.CameraRequestApi;
import msd.l;
import java.lang.Object;
import com.kuaishou.live.core.voiceparty.model.VoicePartyVideoControlResponse;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.Result;
import qrd.l1;
import com.kuaishou.livestream.message.nano.SCMicSeatsInfo;
import vs2.a;
import com.kuaishou.livestream.message.nano.LiveStreamMessages$MicSeatDetailInfo;
import ss2.h;

public final class CameraRequestApi$a implements g	// class@0018cc
{
    public final CameraRequestApi b;
    public final l c;

    public void CameraRequestApi$a(CameraRequestApi p0,l p1){
       this.b = p0;
       this.c = p1;
       super();
    }
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, CameraRequestApi$a.class, "1")) {
       }else {
          this.c.invoke(Result.box-impl(Result.constructor-impl(l1.a)));
          p0 = p0.base64MicSeats;
          if (p0 != null) {
             p0 = a.a(p0);
             this.b.c.e(p0.micSeatDetailInfo, p0.micSeatsVersion);
          }
       }
       return;
    }
}
