package com.kwai.video.krtc.AryaAudioEngineProxyImp$92;
import com.kwai.video.stannis.Stannis$AudioRouteListener;
import com.kwai.video.krtc.AryaAudioEngineProxyImp;
import com.kwai.video.krtc.Arya$AryaAudioRouteListener;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.String;

public class AryaAudioEngineProxyImp$92 implements Stannis$AudioRouteListener	// class@00071d
{
    public final Arya$AryaAudioRouteListener a;
    public final AryaAudioEngineProxyImp b;

    public void AryaAudioEngineProxyImp$92(AryaAudioEngineProxyImp p0,Arya$AryaAudioRouteListener p1){
       this.b = p0;
       this.a = p1;
       super();
    }
    public void onRouteChange(int p0,int p1){
       AryaAudioEngineProxyImp$92 u92 = AryaAudioEngineProxyImp$92.class;
       if (PatchProxy.isSupport(u92) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), Integer.valueOf(p1), this, u92, "1")) {
          return;
       }
       u92 = this.a;
       if (u92 != null) {
          u92.onRouteChange(p0, p1);
       }
       return;
    }
}
