package com.kwai.video.krtc.AryaAudioEngineProxyImp$64;
import com.kwai.video.stannis.observers.BgmObserver;
import com.kwai.video.krtc.AryaAudioEngineProxyImp;
import com.kwai.video.krtc.a$b;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import android.os.Handler;
import com.kwai.video.krtc.AryaAudioEngineProxyImp$64$2;
import java.lang.Runnable;
import com.kwai.video.stannis.observers.BgmObserver$BgmErrorType;
import com.kwai.video.krtc.AryaAudioEngineProxyImp$64$3;
import com.kwai.video.krtc.observers.BgmObserver$BgmErrorType;
import com.kwai.video.krtc.AryaAudioEngineProxyImp$43;
import java.lang.Enum;
import java.lang.Float;
import com.kwai.video.krtc.AryaAudioEngineProxyImp$64$1;

public class AryaAudioEngineProxyImp$64 extends BgmObserver	// class@0006fd
{
    public final a$b a;
    public final AryaAudioEngineProxyImp b;

    public void AryaAudioEngineProxyImp$64(AryaAudioEngineProxyImp p0,a$b p1){
       this.b = p0;
       this.a = p1;
       super();
    }
    public void onCompleted(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, AryaAudioEngineProxyImp$64.class, "3")) {
          return;
       }
       AryaAudioEngineProxyImp.d(this.b).post(new AryaAudioEngineProxyImp$64$2(this));
       this.a.onCompleted(p0);
       return;
    }
    public void onError(String p0,BgmObserver$BgmErrorType p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, AryaAudioEngineProxyImp$64.class, "4")) {
          return;
       }
       AryaAudioEngineProxyImp.d(this.b).post(new AryaAudioEngineProxyImp$64$3(this));
       BgmObserver$BgmErrorType none = BgmObserver$BgmErrorType.None;
       int i = AryaAudioEngineProxyImp$43.a[p1.ordinal()];
       if (i != 1) {
          if (i != 2) {
             if (i != 3) {
                if (i != 4) {
                   if (i == 5) {
                      none = BgmObserver$BgmErrorType.NotSupported;
                   }
                }else {
                   none = BgmObserver$BgmErrorType.Malformed;
                }
             }else {
                none = BgmObserver$BgmErrorType.Unknown;
             }
          }else {
             none = BgmObserver$BgmErrorType.ErrorIo;
          }
       }
       this.a.onError(p0, none);
       return;
    }
    public void onProgressed(String p0,float p1,float p2){
       if (PatchProxy.isSupport(AryaAudioEngineProxyImp$64.class) && PatchProxy.applyVoidThreeRefs(p0, Float.valueOf(p1), Float.valueOf(p2), this, AryaAudioEngineProxyImp$64.class, "2")) {
          return;
       }
       AryaAudioEngineProxyImp.d(this.b).post(new AryaAudioEngineProxyImp$64$1(this, p1));
       this.a.onProgressed(p0, p1, p2);
       return;
    }
    public void onStart(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, AryaAudioEngineProxyImp$64.class, "1")) {
          return;
       }
       this.a.onStart(p0);
       return;
    }
}
