package com.kwai.video.krtc.rtcengine.internal.n;
import com.kwai.video.krtc.rtcengine.internal.z;
import java.lang.Object;
import java.lang.String;
import com.kwai.video.krtc.utils.Log;
import com.kwai.video.krtc.Arya;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import java.lang.StringBuilder;

public class n	// class@000883
{
    public Arya a;

    public void n(z p0){
       super();
       Log.i("RtcEngineGameVoice", "RtcEngineGameVoice");
       this.a = p0.a();
    }
    public int a(int p0){
       n on = n.class;
       if (PatchProxy.isSupport(on)) {
          Object obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), this, on, "1");
          if (obj != PatchProxyResult.class) {
             return obj.intValue();
          }
       }
       Log.i("RtcEngineGameVoice", "setAudioTeamId "+p0);
       this.a.setAudioTeamId(p0);
       return 0;
    }
    public int a(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, n.class, "10");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       Log.i("RtcEngineGameVoice", "setHrtfModelPath "+p0);
       this.a.setHrtfModelPath(p0);
       return 0;
    }
    public int a(int[] p0,float[] p1,float[] p2,float[] p3){
       Object obj = PatchProxy.applyFourRefs(p0, p1, p2, p3, this, n.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       Log.i("RtcEngineGameVoice", "updateSelfPosition pos \( "+p0[0]+" "+p0[1]+" "+p0[2]+" \)  af \( "+p1[0]+" "+p1[1]+" "+p1[2]+" \)  ar \( "+p2[0]+" "+p2[1]+" "+p2[2]+" \)  au \( "+p3[0]+" "+p3[1]+" "+p3[2]+" \) ");
       this.a.updateSelfPosition(p0, p1, p2, p3);
       return 0;
    }
    public int b(int p0){
       n on = n.class;
       if (PatchProxy.isSupport(on)) {
          Object obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), this, on, "2");
          if (obj != PatchProxyResult.class) {
             return obj.intValue();
          }
       }
       Log.i("RtcEngineGameVoice", "setAudioTunnel "+p0);
       this.a.setAudioTunnel(p0);
       return 0;
    }
    public int c(int p0){
       n on = n.class;
       if (PatchProxy.isSupport(on)) {
          Object obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), this, on, "3");
          if (obj != PatchProxyResult.class) {
             return obj.intValue();
          }
       }
       Log.i("RtcEngineGameVoice", "setAudioRecvRange "+p0);
       this.a.setAudioRecvRange(p0);
       return 0;
    }
    public int d(int p0){
       n on = n.class;
       if (PatchProxy.isSupport(on)) {
          Object obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), this, on, "4");
          if (obj != PatchProxyResult.class) {
             return obj.intValue();
          }
       }
       Log.i("RtcEngineGameVoice", "setAudioTeamMode "+p0);
       this.a.setAudioTeamMode(p0);
       return 0;
    }
    public int e(int p0){
       n on = n.class;
       if (PatchProxy.isSupport(on)) {
          Object obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), this, on, "6");
          if (obj != PatchProxyResult.class) {
             return obj.intValue();
          }
       }
       Log.i("RtcEngineGameVoice", "enableRangeAudio "+p0);
       this.a.enableRangeAudio(p0);
       return 0;
    }
    public int f(int p0){
       n on = n.class;
       if (PatchProxy.isSupport(on)) {
          Object obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), this, on, "7");
          if (obj != PatchProxyResult.class) {
             return obj.intValue();
          }
       }
       Log.i("RtcEngineGameVoice", "disableRangeAudio "+p0);
       this.a.disableRangeAudio(p0);
       return 0;
    }
    public int g(int p0){
       n on = n.class;
       if (PatchProxy.isSupport(on)) {
          Object obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), this, on, "8");
          if (obj != PatchProxyResult.class) {
             return obj.intValue();
          }
       }
       Log.i("RtcEngineGameVoice", "enableSpatializer "+p0);
       this.a.enableSpatializer(p0);
       return 0;
    }
    public int h(int p0){
       n on = n.class;
       if (PatchProxy.isSupport(on)) {
          Object obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), this, on, "9");
          if (obj != PatchProxyResult.class) {
             return obj.intValue();
          }
       }
       Log.i("RtcEngineGameVoice", "disableSpatializer "+p0);
       this.a.disableSpatializer(p0);
       return 0;
    }
    public int i(int p0){
       n on = n.class;
       if (PatchProxy.isSupport(on)) {
          Object obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), this, on, "11");
          if (obj != PatchProxyResult.class) {
             return obj.intValue();
          }
       }
       Log.i("RtcEngineGameVoice", "enableAttenuation "+p0);
       this.a.enableAttenuation(p0);
       return 0;
    }
    public int j(int p0){
       n on = n.class;
       if (PatchProxy.isSupport(on)) {
          Object obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), this, on, "12");
          if (obj != PatchProxyResult.class) {
             return obj.intValue();
          }
       }
       Log.i("RtcEngineGameVoice", "disableAttenuation "+p0);
       this.a.disableAttenuation(p0);
       return 0;
    }
}
