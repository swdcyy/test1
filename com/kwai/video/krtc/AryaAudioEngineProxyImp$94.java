package com.kwai.video.krtc.AryaAudioEngineProxyImp$94;
import java.lang.Runnable;
import com.kwai.video.krtc.AryaAudioEngineProxyImp;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.video.stannis.Stannis$KWStannisConfig;
import com.kwai.video.stannis.Stannis;

public class AryaAudioEngineProxyImp$94 implements Runnable	// class@00071f
{
    public final int a;
    public final String b;
    public final AryaAudioEngineProxyImp c;

    public void AryaAudioEngineProxyImp$94(AryaAudioEngineProxyImp p0,int p1,String p2){
       this.c = p0;
       this.a = p1;
       this.b = p2;
       super();
    }
    public void run(){
       if (PatchProxy.applyVoid(null, this, AryaAudioEngineProxyImp$94.class, "1")) {
          return;
       }
       AryaAudioEngineProxyImp$94 tc = this.c;
       AryaAudioEngineProxyImp a = tc.a;
       a.dumpFlag = this.a & 0xffff;
       a.dumpPath = this.b;
       Stannis stannis = AryaAudioEngineProxyImp.f(tc);
       boolean b = (this.c.a.dumpFlag != null)? true: false;
       stannis.enableAecDump(b);
       AryaAudioEngineProxyImp.f(this.c).setStannisConfig(this.c.a);
       return;
    }
}
