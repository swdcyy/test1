package com.kuaishou.live.core.voiceparty.playway.video.camera.AudienceCameraLifecycleLogic;
import brd.t;
import ts2.f;
import com.kuaishou.live.core.voiceparty.playway.video.camera.CameraRequestApi;
import w02.g;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import com.kuaishou.live.core.voiceparty.playway.video.camera.AudienceCameraLifecycleLogic$c;
import erd.g;
import crd.b;
import m56.f;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kuaishou.live.core.voiceparty.LiveVoicePartyLogTag;
import pp.c;
import com.kuaishou.android.live.log.b;
import java.util.concurrent.TimeUnit;
import brd.z;
import io.reactivex.android.schedulers.a;
import com.kuaishou.live.core.voiceparty.playway.video.camera.AudienceCameraLifecycleLogic$a;
import m56.g;
import com.kuaishou.live.core.voiceparty.playway.video.camera.AudienceCameraLifecycleLogic$b;
import com.kuaishou.live.core.voiceparty.playway.video.camera.AudienceCameraLifecycleLogic$onAppForeground$2;
import erd.o;
import msd.l;

public final class AudienceCameraLifecycleLogic	// class@0018bf
{
    public b a;
    public boolean b;
    public boolean c;
    public final b d;
    public final f e;
    public final CameraRequestApi f;
    public final g g;

    public void AudienceCameraLifecycleLogic(t p0,f p1,CameraRequestApi p2,g p3){
       a.p(p0, "selfOpenVideoInfo");
       a.p(p1, "micSeatStateService");
       a.p(p2, "cameraRequestApi");
       a.p(p3, "eventBusService");
       super();
       this.e = p1;
       this.f = p2;
       this.g = p3;
       this.d = p0.subscribe(new AudienceCameraLifecycleLogic$c(this));
    }
    public final void onAppBackground(f p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, AudienceCameraLifecycleLogic.class, "3")) {
          return;
       }
       LiveVoicePartyLogTag pORTRAIT_VID = LiveVoicePartyLogTag.PORTRAIT_VIDEO;
       b.Z(pORTRAIT_VID, "App ON Background");
       if (this.c != null) {
          b.Z(pORTRAIT_VID, "Scheduled to Stop video");
          AudienceCameraLifecycleLogic ta = this.a;
          if (ta != null) {
             ta.dispose();
          }
          this.a = t.timer(1, TimeUnit.MINUTES).observeOn(a.c()).subscribe(new AudienceCameraLifecycleLogic$a(this));
       }
       return;
    }
    public final void onAppForeground(g p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, AudienceCameraLifecycleLogic.class, "4")) {
          return;
       }
       b.Z(LiveVoicePartyLogTag.PORTRAIT_VIDEO, "App ON Foreground");
       AudienceCameraLifecycleLogic ta = this.a;
       if (ta != null) {
          ta.dispose();
       }
       this.a = null;
       if (this.b != null) {
          this.b = false;
          this.f.e(AudienceCameraLifecycleLogic$b.b, AudienceCameraLifecycleLogic$onAppForeground$2.INSTANCE);
       }
       return;
    }
}
