package com.kwai.video.krtc.rtcengine.internal.g$1;
import com.kwai.video.krtc.observers.AudioSegmentPlayerObserver;
import com.kwai.video.krtc.rtcengine.internal.g;
import java.lang.String;
import com.kwai.video.krtc.rtcengine.IRtcEngineEventHandler;
import com.kwai.video.krtc.observers.AudioSegmentPlayerObserver$ErrorType;
import java.lang.Enum;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.video.krtc.rtcengine.internal.z;
import sv7.u;
import com.kwai.video.krtc.rtcengine.internal.z$a;
import java.lang.Float;
import sv7.s;
import java.lang.Long;
import sv7.t;

public class g$1 extends AudioSegmentPlayerObserver	// class@000877
{
    public final g a;

    public void g$1(g p0){
       this.a = p0;
       super();
    }
    public static void a(String p0,String p1,float p2,float p3,IRtcEngineEventHandler p4){
       p4.onPlayAudioProgressed(p0, p1, p2, p3);
    }
    public static void a(String p0,String p1,long p2,IRtcEngineEventHandler p3){
       p3.onPlayAudioStarted(p0, p1, p2);
    }
    public static void a(String p0,String p1,AudioSegmentPlayerObserver$ErrorType p2,IRtcEngineEventHandler p3){
       p3.onPlayAudioFinished(p0, p1, p2.ordinal());
    }
    public void onFinished(String p0,String p1,AudioSegmentPlayerObserver$ErrorType p2){
       if (PatchProxy.applyVoidThreeRefs(p0, p1, p2, this, g$1.class, "3")) {
          return;
       }
       g.a(this.a).a(new u(p0, p1, p2));
       return;
    }
    public void onProgressed(String p0,String p1,float p2,float p3){
       if (PatchProxy.isSupport(g$1.class) && PatchProxy.applyVoidFourRefs(p0, p1, Float.valueOf(p2), Float.valueOf(p3), this, g$1.class, "2")) {
          return;
       }
       g.a(this.a).a(new s(p0, p1, p2, p3));
       return;
    }
    public void onStarted(String p0,String p1,long p2){
       if (PatchProxy.isSupport(g$1.class) && PatchProxy.applyVoidThreeRefs(p0, p1, Long.valueOf(p2), this, g$1.class, "1")) {
          return;
       }
       g.a(this.a).a(new t(p0, p1, p2));
       return;
    }
}
