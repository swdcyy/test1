package com.kwai.video.krtc.rtcengine.internal.e$4;
import java.lang.Runnable;
import com.kwai.video.krtc.rtcengine.internal.e;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.util.List;
import java.lang.StringBuilder;
import com.kwai.video.krtc.utils.Log;
import com.kwai.video.krtc.rtcengine.internal.e$a;
import java.util.Iterator;

public class e$4 implements Runnable	// class@000870
{
    public final int a;
    public final e b;

    public void e$4(e p0,int p1){
       this.b = p0;
       this.a = p1;
       super();
    }
    public void run(){
       if (PatchProxy.applyVoid(null, this, e$4.class, "1")) {
          return;
       }
       String str = "RtcEngineAudioRecord";
       if (!e.b(this.b).size()) {
          Log.i(str, "[RtcEngineAudioRecord] stopAudioRecording no record instance, this:"+this);
          return;
       }else {
          int i = e.b(this.b).size() - 1;
          e$a uoa = e.b(this.b).get(i);
          if (uoa.c == this.a) {
             Log.i(str, "[RtcEngineAudioRecord] stopAudioRecording recordId:"+this.a+" is running, this:"+this);
             e.b(this.b).remove(i);
             e.a(this.b, this.a, uoa.b);
          }else {
             Log.i(str, "[RtcEngineAudioRecord] stopAudioRecording recordId:"+this.a+" is paused, this:"+this);
             Iterator iterator = e.b(this.b).iterator();
             while (iterator.hasNext()) {
                if (iterator.next().c == this.a) {
                   iterator.remove();
                }
             }
          }
          if (e.b(this.b).size() > 0) {
             e$a uoa1 = e.b(this.b).get((e.b(this.b).size() - 1));
             e.a(this.b, uoa1.c, uoa1.a, uoa1.b);
          }else {
             Log.i(str, "[RtcEngineAudioRecord] stopAudioRecording do not need to recovery audio recording");
          }
          return;
       }
    }
}
