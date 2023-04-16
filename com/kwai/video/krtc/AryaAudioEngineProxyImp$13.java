package com.kwai.video.krtc.AryaAudioEngineProxyImp$13;
import java.lang.Runnable;
import com.kwai.video.krtc.AryaAudioEngineProxyImp;
import com.kwai.video.krtc.a$a;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.video.stannis.Stannis;
import com.kwai.video.krtc.utils.Log;
import java.util.HashMap;
import android.content.Context;
import com.kwai.video.stannis.observers.StannisNotifyObserver;
import com.kwai.video.stannis.observers.StannisQosObserver;
import com.kwai.video.krtc.AryaAudioEngineProxyImp$c;
import java.lang.StringBuilder;
import com.kwai.video.krtc.AryaAudioEngineProxyImp$1;
import com.kwai.video.stannis.observers.DataReadyObserver;

public class AryaAudioEngineProxyImp$13 implements Runnable	// class@0006c0
{
    public final a$a a;
    public final int b;
    public final AryaAudioEngineProxyImp c;

    public void AryaAudioEngineProxyImp$13(AryaAudioEngineProxyImp p0,a$a p1,int p2){
       this.c = p0;
       this.a = p1;
       this.b = p2;
       super();
    }
    public void run(){
       AryaAudioEngineProxyImp$13 tc;
       AryaAudioEngineProxyImp$c uoc;
       int i;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, AryaAudioEngineProxyImp$13.class, "1")) {
          return;
       }
       String str = "AryaAudioEngineProxyImp";
       if (!AryaAudioEngineProxyImp.f(this.c).isInited()) {
          Log.i(str, "start stannis was not inited, init it again.");
          AryaAudioEngineProxyImp.f(this.c).uninitStannisEngine(AryaAudioEngineProxyImp.e(this.c));
          AryaAudioEngineProxyImp.c(this.c).clear();
          tc = this.c;
          AryaAudioEngineProxyImp.c(tc, AryaAudioEngineProxyImp.f(tc).initStannisEngineWithNotifyObserver(AryaAudioEngineProxyImp.r(this.c), objArray, AryaAudioEngineProxyImp.g(this.c)));
       }else {
          Log.i(str, "start stannis has been inited already.");
       }
       if (AryaAudioEngineProxyImp.c(this.c).containsKey(this.a)) {
          uoc = AryaAudioEngineProxyImp.c(this.c).get(this.a);
          i = uoc.a ^ 1;
          uoc.b = this.b;
          Log.i(str, "shoudStart="+i+" with ctx.pause="+uoc.a);
       }else {
          uoc = new AryaAudioEngineProxyImp$c(this.c, objArray);
          uoc.a = false;
          uoc.b = this.b;
          AryaAudioEngineProxyImp.c(this.c).put(this.a, uoc);
          Log.i(str, "start delegateMap size:"+AryaAudioEngineProxyImp.c(this.c).size());
          tc = this.c;
          AryaAudioEngineProxyImp.a(tc, AryaAudioEngineProxyImp.j(tc), this.a.b);
          tc = this.c;
          AryaAudioEngineProxyImp.b(tc, AryaAudioEngineProxyImp.k(tc), this.a.b);
          i = 1;
       }
       if (i) {
          if (AryaAudioEngineProxyImp.s(this.c)) {
             AryaAudioEngineProxyImp.f(this.c).resume();
             AryaAudioEngineProxyImp.b(this.c, false);
          }
          if (AryaAudioEngineProxyImp.l(this.c)) {
             AryaAudioEngineProxyImp.f(this.c).startPipelineWithNativePtr(this.b, AryaAudioEngineProxyImp.j(this.c));
          }
          AryaAudioEngineProxyImp.b(this.c, this.b);
          AryaAudioEngineProxyImp.a(this.c, this.b);
          AryaAudioEngineProxyImp.c(this.c, 1);
          if (AryaAudioEngineProxyImp.t(this.c) != null) {
             AryaAudioEngineProxyImp.f(this.c).AddBypassDataReadyObserver(AryaAudioEngineProxyImp.t(this.c), AryaAudioEngineProxyImp.u(this.c));
          }
       }
       return;
    }
}
