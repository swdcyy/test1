package com.kwai.video.krtc.rtcengine.internal.b;
import com.kwai.video.krtc.Arya;
import com.kwai.video.krtc.rtcengine.internal.z;
import java.lang.Object;
import java.lang.String;
import com.kwai.video.krtc.rtcengine.IRtcEngineEventHandler;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import java.lang.Float;
import java.lang.Boolean;
import java.lang.StringBuilder;
import com.kwai.video.krtc.utils.Log;
import sv7.a;
import com.kwai.video.krtc.rtcengine.internal.z$a;
import com.kwai.video.krtc.rtcengine.internal.b$1;
import com.kwai.video.krtc.observers.AudioBufferPlayObserver;

public class b	// class@000865
{
    public Arya a;
    public z b;
    public final String c;

    public void b(Arya p0,z p1){
       super();
       this.c = "RtcEngineAudioBuffer";
       this.a = p0;
       this.b = p1;
    }
    public static z a(b p0){
       return p0.b;
    }
    public static void a(String p0,IRtcEngineEventHandler p1){
       p1.onPlayAudioFinished(p0, 5);
    }
    public int a(){
       Object obj = PatchProxy.apply(null, this, b.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       this.a.pauseAudioBuffer();
       return 0;
    }
    public int a(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, b.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       this.a.clearAudioBuffer(p0);
       return 0;
    }
    public int a(String p0,byte[] p1,float p2,boolean p3){
       boolean b;
       if (PatchProxy.isSupport(b.class)) {
          Object obj = PatchProxy.applyFourRefs(p0, p1, Float.valueOf(p2), Boolean.valueOf(p3), this, b.class, "1");
          if (obj != PatchProxyResult.class) {
             return obj.intValue();
          }
       }
       int currentAudio = this.a.getCurrentAudioScene();
       b = this.a.checkAudioSceneExclusive(currentAudio, 1280);
       Log.i("RtcEngineAudioBuffer", "playAudioBuffer currentAudioScene:"+currentAudio+", requestAudioScene:"+1280+", isExclusive:"+b);
       if (b) {
          this.b.b(new a(p0));
          return -1;
       }else {
          this.a.tryStartAudioEngineWithScene(currentAudio, 1280);
          this.a.playAudioBuffer(p0, p1, p2, p3, new b$1(this));
          return 0;
       }
    }
    public int a(boolean p0){
       b uob = b.class;
       if (PatchProxy.isSupport(uob)) {
          Object obj = PatchProxy.applyOneRefs(Boolean.valueOf(p0), this, uob, "3");
          if (obj != PatchProxyResult.class) {
             return obj.intValue();
          }
       }
       this.a.resumeAudioBuffer(p0);
       return 0;
    }
    public int b(){
       Object obj = PatchProxy.apply(null, this, b.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       this.a.clearAllAudioBuffer();
       return 0;
    }
}
