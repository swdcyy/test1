package com.kwai.video.krtc.rtcengine.internal.e$1$1;
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

public class e$1$1 implements Runnable	// class@00086b
{
    public final int a;
    public final e$1 b;

    public void e$1$1(e$1 p0,int p1){
       this.b = p0;
       this.a = p1;
       super();
    }
    public void run(){
       if (PatchProxy.applyVoid(null, this, e$1$1.class, "1")) {
          return;
       }
       String str = "RtcEngineAudioRecord";
       if (!e.a(this.b.a)) {
          int i = 1;
          if (e.b(this.b.a).size() == i) {
             e$a uoa = e.b(this.b.a).get((e.b(this.b.a).size() - i));
             if (uoa.b != this.a) {
                Log.i(str, "[RtcEngineAudioRecord] onAudioSceneStart pause recordId:"+uoa.c+", scene:"+uoa.b);
                e.a(this.b.a, uoa.c, uoa.b);
             }else {
                Log.i(str, "[RtcEngineAudioRecord] onAudioSceneStart audio scene is same");
             }
          }else {
          label_007a :
             Log.i(str, "[RtcEngineAudioRecord] onAudioSceneStart do not work");
          }
       }else {
          goto label_007a ;
       }
       return;
    }
}
