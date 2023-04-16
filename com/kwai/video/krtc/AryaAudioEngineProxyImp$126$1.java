package com.kwai.video.krtc.AryaAudioEngineProxyImp$126$1;
import com.kwai.video.stannis.observers.DataReadyObserver;
import com.kwai.video.krtc.AryaAudioEngineProxyImp$126;
import java.lang.Object;
import java.nio.ByteBuffer;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.Long;
import java.lang.Short;
import java.lang.String;
import com.kwai.video.krtc.observers.RawAudioObserver;

public class AryaAudioEngineProxyImp$126$1 implements DataReadyObserver	// class@0006b5
{
    public final AryaAudioEngineProxyImp$126 a;

    public void AryaAudioEngineProxyImp$126$1(AryaAudioEngineProxyImp$126 p0){
       this.a = p0;
       super();
    }
    public void onDataReady(int p0,ByteBuffer p1,int p2,int p3,int p4,long p5,short p6,int p7){
       AryaAudioEngineProxyImp$126$1 u126$1 = this;
       AryaAudioEngineProxyImp$126$1 u126$11 = AryaAudioEngineProxyImp$126$1.class;
       if (PatchProxy.isSupport(u126$11)) {
          Object[] objArray = new Object[]{Integer.valueOf(p0),p1,Integer.valueOf(p2),Integer.valueOf(p3),Integer.valueOf(p4),Long.valueOf(p5),Short.valueOf(p6),Integer.valueOf(p7)};
          if (PatchProxy.applyVoid(objArray, this, u126$11, "1")) {
             return;
          }
       }
       AryaAudioEngineProxyImp$126 a = u126$1.a.a;
       if (a != null) {
          a.onRawAudio(p0, p1, p2, p3, p4, p5, p6, p7);
       }
       return;
    }
}
