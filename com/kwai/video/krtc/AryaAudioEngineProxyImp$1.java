package com.kwai.video.krtc.AryaAudioEngineProxyImp$1;
import java.lang.Runnable;
import com.kwai.video.krtc.AryaAudioEngineProxyImp;
import android.content.Context;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.video.krtc.AryaAudioEngineProxyImp$1$1;
import com.kwai.video.stannis.observers.StannisNotifyObserver;
import java.lang.StringBuilder;
import com.kwai.video.krtc.utils.Log;
import com.kwai.video.stannis.Stannis;
import com.kwai.video.stannis.observers.StannisQosObserver;

public class AryaAudioEngineProxyImp$1 implements Runnable	// class@0006c7
{
    public final Context a;
    public final AryaAudioEngineProxyImp b;

    public void AryaAudioEngineProxyImp$1(AryaAudioEngineProxyImp p0,Context p1){
       this.b = p0;
       this.a = p1;
       super();
    }
    public void run(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, AryaAudioEngineProxyImp$1.class, "1")) {
          return;
       }
       AryaAudioEngineProxyImp.a(this.b, this.a);
       AryaAudioEngineProxyImp$1 tb = this.b;
       AryaAudioEngineProxyImp.a(tb, AryaAudioEngineProxyImp.a(tb));
       tb = this.b;
       AryaAudioEngineProxyImp.b(tb, AryaAudioEngineProxyImp.b(tb));
       AryaAudioEngineProxyImp.a(this.b, new AryaAudioEngineProxyImp$1$1(this));
       if (AryaAudioEngineProxyImp.e(this.b) - -1) {
          Log.w("AryaAudioEngineProxyImp", "initAudioEngine, but stannisUserId is:"+AryaAudioEngineProxyImp.e(this.b));
          AryaAudioEngineProxyImp.f(this.b).uninitStannisEngine(AryaAudioEngineProxyImp.e(this.b));
       }
       tb = this.b;
       AryaAudioEngineProxyImp.c(tb, AryaAudioEngineProxyImp.f(tb).initStannisEngineWithNotifyObserver(this.a, objArray, AryaAudioEngineProxyImp.g(this.b)));
       return;
    }
}
