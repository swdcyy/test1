package com.kwai.video.krtc.rtcengine.internal.g;
import com.kwai.video.krtc.Arya;
import com.kwai.video.krtc.rtcengine.internal.z;
import java.lang.Object;
import java.lang.String;
import com.kwai.video.krtc.rtcengine.IRtcEngineEventHandler;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import java.lang.Boolean;
import java.lang.StringBuilder;
import com.kwai.video.krtc.utils.Log;
import sv7.r;
import com.kwai.video.krtc.rtcengine.internal.z$a;
import com.kwai.video.krtc.rtcengine.internal.g$1;
import com.kwai.video.krtc.observers.AudioSegmentPlayerObserver;

public class g	// class@000878
{
    public Arya a;
    public z b;
    public final String c;

    public void g(Arya p0,z p1){
       super();
       this.c = "RtcEngineAudioSegment";
       this.a = p0;
       this.b = p1;
    }
    public static z a(g p0){
       return p0.b;
    }
    public static void a(String p0,String p1,IRtcEngineEventHandler p2){
       p2.onPlayAudioFinished(p0, p1, 5);
    }
    public int a(){
       Object obj = PatchProxy.apply(null, this, g.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       this.a.stopPlayAudioSegment();
       return 0;
    }
    public int a(String p0,String p1,boolean p2,boolean p3){
       if (PatchProxy.isSupport(g.class)) {
          Object obj = PatchProxy.applyFourRefs(p0, p1, Boolean.valueOf(p2), Boolean.valueOf(p3), this, g.class, "1");
          if (obj != PatchProxyResult.class) {
             return obj.intValue();
          }
       }
       int currentAudio = this.a.getCurrentAudioScene();
       boolean b = this.a.checkAudioSceneExclusive(currentAudio, 1280);
       Log.i("RtcEngineAudioSegment", "startPlayAudioSegment currentAudioScene:"+currentAudio+", requestAudioScene:"+1280+", isExclusive:"+b);
       if (b) {
          this.b.b(new r(p0, p1));
          return -1;
       }else {
          this.a.tryStartAudioEngineWithScene(currentAudio, 1280);
          this.a.enableMixingAudioSegment(p3);
          this.a.startPlayAudioSegment(p0, p1, p2, new g$1(this));
          return 0;
       }
    }
}
