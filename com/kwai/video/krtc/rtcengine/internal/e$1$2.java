package com.kwai.video.krtc.rtcengine.internal.e$1$2;
import java.lang.Runnable;
import com.kwai.video.krtc.rtcengine.internal.e$1;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.video.krtc.rtcengine.internal.e;
import java.util.List;
import com.kwai.video.krtc.rtcengine.internal.e$a;
import java.lang.StringBuilder;
import com.kwai.video.krtc.utils.Log;

public class e$1$2 implements Runnable	// class@00086c
{
    public final e$1 a;

    public void e$1$2(e$1 p0){
       this.a = p0;
       super();
    }
    public void run(){
       if (PatchProxy.applyVoid(null, this, e$1$2.class, "1")) {
          return;
       }
       String str = "RtcEngineAudioRecord";
       if (!e.a(this.a.a)) {
          int i = 1;
          if (e.b(this.a.a).size() == i) {
             e$a uoa = e.b(this.a.a).get((e.b(this.a.a).size() - i));
             Log.i(str, "[RtcEngineAudioRecord] onAudioSceneStop restore recordId:"+uoa.c+", scene:"+uoa.b);
             e.a(this.a.a, uoa.c, uoa.a, uoa.b);
          label_0075 :
             return;
          }
       }
       Log.i(str, "[RtcEngineAudioRecord] onAudioSceneStop do not work");
       goto label_0075 ;
    }
}
