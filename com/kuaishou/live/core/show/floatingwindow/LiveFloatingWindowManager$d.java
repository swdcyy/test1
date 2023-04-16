package com.kuaishou.live.core.show.floatingwindow.LiveFloatingWindowManager$d;
import h91.a;
import com.kuaishou.live.core.show.floatingwindow.LiveFloatingWindowManager;
import java.lang.Object;
import java.lang.Throwable;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kuaishou.live.playeradapter.response.LiveStreamStatusResponse;
import com.kwai.video.waynelive.LiveRestartReason;
import com.kwai.video.waynelive.LivePlayerController;

public class LiveFloatingWindowManager$d implements a	// class@000b64
{
    public final LiveFloatingWindowManager a;

    public void LiveFloatingWindowManager$d(LiveFloatingWindowManager p0){
       this.a = p0;
       super();
    }
    public void onError(Throwable p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveFloatingWindowManager$d.class, "2")) {
          return;
       }
       this.a.j(p0);
       return;
    }
    public void onSuccess(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveFloatingWindowManager$d.class, "1")) {
       }else {
          p0 = p0.mLiveStatus;
          if (p0 == 1) {
             this.a.z("onAnchorEndLive");
             this.a.t();
          }else if(p0 == 3){
             this.a.z("onAnchorReopen");
             p0 = this.a;
             p0.c.restartPlay(p0.h());
          }
       }
       return;
    }
}
