package com.kwai.video.krtc.rtcengine.internal.e$1;
import com.kwai.video.krtc.observers.AudioSceneObserver;
import com.kwai.video.krtc.rtcengine.internal.e;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.String;
import java.lang.StringBuilder;
import com.kwai.video.krtc.utils.Log;
import android.os.Handler;
import com.kwai.video.krtc.rtcengine.internal.e$1$1;
import java.lang.Runnable;
import com.kwai.video.krtc.rtcengine.internal.e$1$2;

public class e$1 implements AudioSceneObserver	// class@00086d
{
    public final e a;

    public void e$1(e p0){
       this.a = p0;
       super();
    }
    public void onAudioSceneStart(int p0){
       e$1 u1 = e$1.class;
       if (PatchProxy.isSupport(u1) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, u1, "1")) {
          return;
       }
       Log.i("RtcEngineAudioRecord", "[RtcEngineAudioRecord] onAudioSceneStart audioScene:"+p0+", ignoreAudioScene:"+e.a(this.a));
       e.c(this.a).post(new e$1$1(this, p0));
       return;
    }
    public void onAudioSceneStop(int p0){
       e$1 u1 = e$1.class;
       if (PatchProxy.isSupport(u1) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, u1, "2")) {
          return;
       }
       Log.i("RtcEngineAudioRecord", "[RtcEngineAudioRecord] onAudioSceneStop audioScene:"+p0+", ignoreAudioScene:"+e.a(this.a));
       e.c(this.a).post(new e$1$2(this));
       return;
    }
}
