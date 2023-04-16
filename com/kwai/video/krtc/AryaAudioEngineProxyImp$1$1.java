package com.kwai.video.krtc.AryaAudioEngineProxyImp$1$1;
import com.kwai.video.stannis.observers.StannisNotifyObserver;
import com.kwai.video.krtc.AryaAudioEngineProxyImp$1;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.Object;
import java.lang.String;
import com.kwai.video.krtc.AryaAudioEngineProxyImp;
import android.os.Handler;
import com.kwai.video.krtc.AryaAudioEngineProxyImp$1$1$1;
import java.lang.Runnable;

public class AryaAudioEngineProxyImp$1$1 extends StannisNotifyObserver	// class@000697
{
    public final AryaAudioEngineProxyImp$1 a;

    public void AryaAudioEngineProxyImp$1$1(AryaAudioEngineProxyImp$1 p0){
       this.a = p0;
       super();
    }
    public void onNotify(int p0){
       AryaAudioEngineProxyImp$1$1 u1$1 = AryaAudioEngineProxyImp$1$1.class;
       if (PatchProxy.isSupport(u1$1) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, u1$1, "1")) {
          return;
       }
       AryaAudioEngineProxyImp.d(this.a.b).post(new AryaAudioEngineProxyImp$1$1$1(this, p0));
       return;
    }
}
