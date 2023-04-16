package com.kwai.video.krtc.rtcengine.internal.b$1;
import com.kwai.video.krtc.observers.AudioBufferPlayObserver;
import com.kwai.video.krtc.rtcengine.internal.b;
import java.lang.String;
import com.kwai.video.krtc.rtcengine.IRtcEngineEventHandler;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.video.krtc.rtcengine.internal.z;
import sv7.b;
import com.kwai.video.krtc.rtcengine.internal.z$a;

public class b$1 extends AudioBufferPlayObserver	// class@000863
{
    public final b a;

    public void b$1(b p0){
       this.a = p0;
       super();
    }
    public static void a(String p0,IRtcEngineEventHandler p1){
       p1.onPlayAudioFinished(p0, 0);
    }
    public void onCompleted(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, b$1.class, "1")) {
          return;
       }
       b.a(this.a).a(new b(p0));
       return;
    }
}
