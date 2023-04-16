package com.kwai.video.krtc.AryaAudioEngineProxyImp$47;
import java.util.concurrent.Callable;
import com.kwai.video.krtc.AryaAudioEngineProxyImp;
import java.lang.Object;
import java.lang.Integer;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;

public class AryaAudioEngineProxyImp$47 implements Callable	// class@0006e6
{
    public final AryaAudioEngineProxyImp a;

    public void AryaAudioEngineProxyImp$47(AryaAudioEngineProxyImp p0){
       this.a = p0;
       super();
    }
    public Integer a(){
       Object obj = PatchProxy.apply(null, this, AryaAudioEngineProxyImp$47.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new Integer(AryaAudioEngineProxyImp.x(this.a));
    }
    public Object call(){
       return this.a();
    }
}
