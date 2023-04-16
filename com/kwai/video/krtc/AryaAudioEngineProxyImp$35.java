package com.kwai.video.krtc.AryaAudioEngineProxyImp$35;
import java.lang.Runnable;
import com.kwai.video.krtc.AryaAudioEngineProxyImp;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.video.krtc.AryaAudioEngineProxyImp$a;
import com.kwai.video.krtc.AryaAudioEngineProxyImp$1;
import java.util.concurrent.locks.Lock;
import java.util.HashMap;
import java.lang.Integer;
import java.lang.StringBuilder;
import com.kwai.video.krtc.utils.Log;
import com.kwai.video.stannis.Stannis;

public class AryaAudioEngineProxyImp$35 implements Runnable	// class@0006d9
{
    public final int a;
    public final int b;
    public final String c;
    public final int d;
    public final boolean e;
    public final boolean f;
    public final int g;
    public final AryaAudioEngineProxyImp h;

    public void AryaAudioEngineProxyImp$35(AryaAudioEngineProxyImp p0,int p1,int p2,String p3,int p4,boolean p5,boolean p6,int p7){
       this.h = p0;
       this.a = p1;
       this.b = p2;
       this.c = p3;
       this.d = p4;
       this.e = p5;
       this.f = p6;
       this.g = p7;
       super();
    }
    public void run(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, AryaAudioEngineProxyImp$35.class, "1")) {
          return;
       }
       AryaAudioEngineProxyImp$a uoa = new AryaAudioEngineProxyImp$a(this.h, objArray);
       uoa.a = this.a;
       uoa.b = this.b;
       uoa.c = this.c;
       AryaAudioEngineProxyImp.w(this.h).lock();
       AryaAudioEngineProxyImp.p(this.h).put(Integer.valueOf(this.d), uoa);
       AryaAudioEngineProxyImp.w(this.h).unlock();
       if (AryaAudioEngineProxyImp.l(this.h)) {
          Log.i("AryaAudioEngineProxyImp", "addRxStream with volume:"+AryaAudioEngineProxyImp.q(this.h));
          if (this.e == null) {
             AryaAudioEngineProxyImp.f(this.h).AddRxStreamWithNativeDataProvider(this.d, AryaAudioEngineProxyImp.k(this.h), this.a, this.b);
          }else {
             AryaAudioEngineProxyImp.f(this.h).AddRxStreamWithNativeDataProviderWithType(this.d, AryaAudioEngineProxyImp.k(this.h), this.a, this.b, this.f, this.g);
          }
          AryaAudioEngineProxyImp.f(this.h).setAudioRxVolume(this.d, AryaAudioEngineProxyImp.q(this.h));
       }
       return;
    }
}
