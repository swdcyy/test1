package com.kwai.video.krtc.AryaAudioEngineProxyImp$26$1;
import com.kwai.video.stannis.observers.AudioFrameObserver;
import com.kwai.video.krtc.AryaAudioEngineProxyImp$26;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.String;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import com.kwai.video.krtc.observers.AryaRawAudioFrameObserver;
import cw7.a;

public class AryaAudioEngineProxyImp$26$1 implements AudioFrameObserver	// class@0006ce
{
    public final AryaAudioEngineProxyImp$26 a;

    public void AryaAudioEngineProxyImp$26$1(AryaAudioEngineProxyImp$26 p0){
       this.a = p0;
       super();
    }
    public boolean onMixedFrame(byte[] p0,int p1,int p2,int p3,int p4){
       AryaAudioEngineProxyImp$26$1 u26$1 = AryaAudioEngineProxyImp$26$1.class;
       if (PatchProxy.isSupport(u26$1)) {
          Object[] objArray = new Object[]{p0,Integer.valueOf(p1),Integer.valueOf(p2),Integer.valueOf(p3),Integer.valueOf(p4)};
          Object obj = PatchProxy.apply(objArray, this, u26$1, "3");
          if (obj != PatchProxyResult.class) {
             return obj.booleanValue();
          }
       }
       AryaAudioEngineProxyImp$26 a = this.a.a;
       if (a != null) {
          return a.onMixedFrame(p0, p1, p2, p3, p4);
       }else {
          return 0;
       }
    }
    public boolean onPlaybackFrame(byte[] p0,int p1,int p2,int p3,int p4){
       AryaAudioEngineProxyImp$26$1 u26$1 = AryaAudioEngineProxyImp$26$1.class;
       if (PatchProxy.isSupport(u26$1)) {
          Object[] objArray = new Object[]{p0,Integer.valueOf(p1),Integer.valueOf(p2),Integer.valueOf(p3),Integer.valueOf(p4)};
          Object obj = PatchProxy.apply(objArray, this, u26$1, "2");
          if (obj != PatchProxyResult.class) {
             return obj.booleanValue();
          }
       }
       AryaAudioEngineProxyImp$26 a = this.a.a;
       if (a != null) {
          return a.onPlaybackFrame(p0, p1, p2, p3, p4);
       }else {
          return 0;
       }
    }
    public boolean onRecordFrame(byte[] p0,int p1,int p2,int p3,int p4){
       AryaAudioEngineProxyImp$26$1 u26$1 = AryaAudioEngineProxyImp$26$1.class;
       if (PatchProxy.isSupport(u26$1)) {
          Object[] objArray = new Object[]{p0,Integer.valueOf(p1),Integer.valueOf(p2),Integer.valueOf(p3),Integer.valueOf(p4)};
          Object obj = PatchProxy.apply(objArray, this, u26$1, "1");
          if (obj != PatchProxyResult.class) {
             return obj.booleanValue();
          }
       }
       AryaAudioEngineProxyImp$26 a = this.a.a;
       if (a != null) {
          return a.onRecordAudioFrame(p0, p1, p2, p3, p4);
       }else {
          return 0;
       }
    }
    public boolean onRecordRawFrame(byte[] p0,int p1,int p2,int p3,int p4,int p5){
       return a.a(this, p0, p1, p2, p3, p4, p5);
    }
}
