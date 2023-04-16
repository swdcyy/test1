package com.kwai.video.krtc.rtcengine.extend.RtcEngineExt$1;
import com.kwai.video.krtc.observers.AryaLogObserver;
import com.kwai.video.krtc.AryaManager$LogParam;
import java.lang.Object;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.video.krtc.rtcengine.internal.q;
import com.kwai.video.krtc.utils.Log;

public final class RtcEngineExt$1 implements AryaLogObserver	// class@000851
{
    public final AryaManager$LogParam val$param;

    public void RtcEngineExt$1(AryaManager$LogParam p0){
       this.val$param = p0;
       super();
    }
    public void onLog(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, RtcEngineExt$1.class, "1")) {
          return;
       }
       int i = q.c();
       if (i) {
          if (i != 1) {
             if (i != 2) {
                if (i == 3) {
                   Log.e("RtcEngineExtImpl", p0);
                }
             }else {
                Log.w("RtcEngineExtImpl", p0);
             }
          }else {
             Log.i("RtcEngineExtImpl", p0);
          }
       }else {
          Log.d("RtcEngineExtImpl", p0);
       }
       AryaManager$LogParam logCb = this.val$param.logCb;
       if (logCb != null) {
          logCb.onLog(p0);
       }
       return;
    }
}
