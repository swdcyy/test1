package com.kwai.video.krtc.AryaAudioEngineProxyImp$1$1$1;
import java.lang.Runnable;
import com.kwai.video.krtc.AryaAudioEngineProxyImp$1$1;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.video.krtc.AryaAudioEngineProxyImp$1;
import com.kwai.video.krtc.AryaAudioEngineProxyImp;
import java.util.HashMap;
import java.util.Set;
import java.util.Iterator;
import com.kwai.video.krtc.a$a;
import com.kwai.video.krtc.AryaAudioEngineProxyImp$c;
import com.kwai.video.krtc.a$d;

public class AryaAudioEngineProxyImp$1$1$1 implements Runnable	// class@000696
{
    public final int a;
    public final AryaAudioEngineProxyImp$1$1 b;

    public void AryaAudioEngineProxyImp$1$1$1(AryaAudioEngineProxyImp$1$1 p0,int p1){
       this.b = p0;
       this.a = p1;
       super();
    }
    public void run(){
       if (PatchProxy.applyVoid(null, this, AryaAudioEngineProxyImp$1$1$1.class, "1")) {
          return;
       }
       AryaAudioEngineProxyImp$1$1$1 ta = this.a;
       int i = 104;
       boolean b = 103;
       AryaAudioEngineProxyImp$1$1$1 u1$1$1 = 52;
       if (ta != 9) {
          if (ta != 35) {
             if (ta != u1$1$1) {
                if (ta != b) {
                   if (ta != i) {
                      switch (ta){
                          case 2007:
                            i = 2017;
                            break;
                          case 2008:
                            i = 2018;
                            break;
                          case 2009:
                            i = 2019;
                            break;
                          case 2010:
                            i = 2020;
                            break;
                          default:
                            i = -1;
                      }
                   }
                }else {
                   i = 103;
                }
             }else {
                i = 52;
             }
          }else {
             i = 35;
          }
       }else {
          i = 9;
       }
       if (i != -1) {
          Iterator iterator = AryaAudioEngineProxyImp.c(this.b.a.b).keySet().iterator();
          while (iterator.hasNext()) {
             a$a uoa = iterator.next();
             AryaAudioEngineProxyImp$c uoc = AryaAudioEngineProxyImp.c(this.b.a.b).get(uoa);
             if (uoa != null) {
                uoa = uoa.a;
                if (uoa != null && (uoc != null && uoc.a == null)) {
                   uoa.onNotify(i);
                }
             }
          }
       }
       return;
    }
}
