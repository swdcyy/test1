package com.kwai.video.krtc.AryaAudioEngineProxyImp$128$1;
import com.kwai.video.stannis.observers.AudioBufferPlayObserver;
import com.kwai.video.krtc.AryaAudioEngineProxyImp$128;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.video.krtc.observers.AudioBufferPlayObserver;

public class AryaAudioEngineProxyImp$128$1 extends AudioBufferPlayObserver	// class@0006b8
{
    public final AryaAudioEngineProxyImp$128 a;

    public void AryaAudioEngineProxyImp$128$1(AryaAudioEngineProxyImp$128 p0){
       this.a = p0;
       super();
    }
    public void onCompleted(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, AryaAudioEngineProxyImp$128$1.class, "1")) {
          return;
       }
       AryaAudioEngineProxyImp$128$1 ta = this.a;
       AryaAudioEngineProxyImp$128 e = ta.e;
       if (e != null) {
          e.onCompleted(ta.a);
       }
       return;
    }
}
