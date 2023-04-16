package com.kwai.video.krtc.AryaAudioEngineProxyImp$108$1;
import com.kwai.video.stannis.observers.AudioSegmentPlayerObserver;
import com.kwai.video.krtc.AryaAudioEngineProxyImp$108;
import java.lang.String;
import com.kwai.video.stannis.observers.AudioSegmentPlayerObserver$ErrorType;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.video.krtc.observers.AudioSegmentPlayerObserver$ErrorType;
import com.kwai.video.krtc.AryaAudioEngineProxyImp$43;
import java.lang.Enum;
import com.kwai.video.krtc.observers.AudioSegmentPlayerObserver;
import java.lang.Float;
import java.lang.Long;

public class AryaAudioEngineProxyImp$108$1 extends AudioSegmentPlayerObserver	// class@0006a0
{
    public final AryaAudioEngineProxyImp$108 a;

    public void AryaAudioEngineProxyImp$108$1(AryaAudioEngineProxyImp$108 p0){
       this.a = p0;
       super();
    }
    public void onError(String p0,String p1,AudioSegmentPlayerObserver$ErrorType p2){
       if (PatchProxy.applyVoidThreeRefs(p0, p1, p2, this, AryaAudioEngineProxyImp$108$1.class, "2")) {
          return;
       }
       AudioSegmentPlayerObserver$ErrorType none = AudioSegmentPlayerObserver$ErrorType.None;
       int i = AryaAudioEngineProxyImp$43.b[p2.ordinal()];
       if (i != 1) {
          if (i != 2) {
             if (i != 3) {
                if (i != 4) {
                   if (i == 5) {
                      none = AudioSegmentPlayerObserver$ErrorType.NotSupported;
                   }
                }else {
                   none = AudioSegmentPlayerObserver$ErrorType.Malformed;
                }
             }else {
                none = AudioSegmentPlayerObserver$ErrorType.Unknown;
             }
          }else {
             none = AudioSegmentPlayerObserver$ErrorType.ErrorIo;
          }
       }
       this.a.c.onFinished(p1, p0, none);
       return;
    }
    public void onFinished(String p0,String p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, AryaAudioEngineProxyImp$108$1.class, "3")) {
          return;
       }
       this.a.c.onFinished(p1, p0, AudioSegmentPlayerObserver$ErrorType.None);
       return;
    }
    public void onProgressed(String p0,String p1,float p2,float p3){
       if (PatchProxy.isSupport(AryaAudioEngineProxyImp$108$1.class) && PatchProxy.applyVoidFourRefs(p0, p1, Float.valueOf(p2), Float.valueOf(p3), this, AryaAudioEngineProxyImp$108$1.class, "1")) {
          return;
       }
       this.a.c.onProgressed(p1, p0, p2, p3);
       return;
    }
    public void onStartMixing(String p0,String p1,long p2){
       if (PatchProxy.isSupport(AryaAudioEngineProxyImp$108$1.class) && PatchProxy.applyVoidThreeRefs(p0, p1, Long.valueOf(p2), this, AryaAudioEngineProxyImp$108$1.class, "4")) {
          return;
       }
       this.a.c.onStarted(p1, p0, p2);
       return;
    }
}
