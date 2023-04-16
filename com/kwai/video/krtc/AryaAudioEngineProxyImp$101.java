package com.kwai.video.krtc.AryaAudioEngineProxyImp$101;
import com.kwai.video.stannis.observers.BgmObserver;
import com.kwai.video.krtc.AryaAudioEngineProxyImp;
import com.kwai.video.krtc.observers.a;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.video.stannis.observers.BgmObserver$BgmErrorType;
import com.kwai.video.krtc.observers.a$a;
import com.kwai.video.krtc.AryaAudioEngineProxyImp$43;
import java.lang.Enum;
import java.lang.Float;

public class AryaAudioEngineProxyImp$101 extends BgmObserver	// class@000699
{
    public final a a;
    public final AryaAudioEngineProxyImp b;

    public void AryaAudioEngineProxyImp$101(AryaAudioEngineProxyImp p0,a p1){
       this.b = p0;
       this.a = p1;
       super();
    }
    public void onCompleted(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, AryaAudioEngineProxyImp$101.class, "3")) {
          return;
       }
       this.a.b(p0);
       return;
    }
    public void onError(String p0,BgmObserver$BgmErrorType p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, AryaAudioEngineProxyImp$101.class, "4")) {
          return;
       }
       a$a a = a$a.a;
       int i = AryaAudioEngineProxyImp$43.a[p1.ordinal()];
       if (i != 1) {
          if (i != 2) {
             if (i != 3) {
                if (i != 4) {
                   if (i == 5) {
                      a = a$a.c;
                   }
                }else {
                   a = a$a.e;
                }
             }else {
                a = a$a.b;
             }
          }else {
             a = a$a.d;
          }
       }
       this.a.a(p0, a);
       return;
    }
    public void onProgressed(String p0,float p1,float p2){
       if (PatchProxy.isSupport(AryaAudioEngineProxyImp$101.class) && PatchProxy.applyVoidThreeRefs(p0, Float.valueOf(p1), Float.valueOf(p2), this, AryaAudioEngineProxyImp$101.class, "2")) {
          return;
       }
       this.a.a(p0, p1, p2);
       return;
    }
    public void onStart(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, AryaAudioEngineProxyImp$101.class, "1")) {
          return;
       }
       this.a.a(p0);
       return;
    }
}
