package com.kwai.video.krtc.rtcengine.RtcEngine$1;
import com.kwai.video.krtc.observers.AryaLogObserver;
import com.kwai.video.krtc.AryaManager$LogParam;
import java.lang.Object;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.video.krtc.rtcengine.internal.q;
import com.kwai.video.krtc.utils.Log;

public final class RtcEngine$1 implements AryaLogObserver	// class@0007e5
{
    public final AryaManager$LogParam val$param;

    public void RtcEngine$1(AryaManager$LogParam p0){
       this.val$param = p0;
       super();
    }
    public void onLog(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, RtcEngine$1.class, "1")) {
          return;
       }
       int i = q.c();
       if (i) {
          if (i != 1) {
             if (i != 2) {
                if (i == 3) {
                   Log.e("RtcEngineImpl", p0);
                }
             }else {
                Log.w("RtcEngineImpl", p0);
             }
          }else {
             Log.i("RtcEngineImpl", p0);
          }
       }else {
          Log.d("RtcEngineImpl", p0);
       }
       AryaManager$LogParam logCb = this.val$param.logCb;
       if (logCb != null) {
          logCb.onLog(p0);
       }
       return;
    }
}
