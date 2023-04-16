package com.kwai.video.krtc.rtcengine.internal.f;
import com.kwai.video.krtc.rtcengine.internal.z;
import com.kwai.video.krtc.Arya;
import java.lang.Object;
import java.util.HashMap;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.String;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import java.lang.StringBuilder;
import com.kwai.video.krtc.utils.Log;
import java.lang.Boolean;
import java.util.Map;
import com.kwai.video.krtc.rtcengine.internal.f$1;
import com.kwai.video.krtc.Arya$AryaAudioRouteListener;

public class f	// class@000876
{
    public Arya a;
    public z b;
    public Map c;

    public void f(z p0,Arya p1){
       super();
       this.a = p1;
       this.b = p0;
       this.c = new HashMap();
    }
    public static Arya a(f p0){
       return p0.a;
    }
    public static boolean a(f p0,int p1,int p2){
       return p0.a(p1, p2);
    }
    public static z b(f p0){
       return p0.b;
    }
    public int a(int p0){
       f uof = f.class;
       if (PatchProxy.isSupport(uof)) {
          Object obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), this, uof, "5");
          if (obj != PatchProxyResult.class) {
             return obj.intValue();
          }
       }
       Log.i("RtcEngineAudioRoute", "setInEarMonitoringVolume "+p0);
       this.a.setHeadphoneMonitorVolume(((float)p0 / 100.00f));
       return 0;
    }
    public int a(boolean p0){
       f uof = f.class;
       if (PatchProxy.isSupport(uof)) {
          Object obj = PatchProxy.applyOneRefs(Boolean.valueOf(p0), this, uof, "1");
          if (obj != PatchProxyResult.class) {
             return obj.intValue();
          }
       }
       Log.i("RtcEngineAudioRoute", "setEnableSpeakerphone "+p0);
       this.a.setSpeakerOn(p0);
       return 0;
    }
    public boolean a(){
       Object obj = PatchProxy.apply(null, this, f.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = this.a.isSpeakerOn();
       Log.i("RtcEngineAudioRoute", "isSpeakerphoneEnabled "+b);
       return b;
    }
    public final boolean a(int p0,int p1){
       f uof = f.class;
       if (PatchProxy.isSupport(uof)) {
          Object obj = PatchProxy.applyTwoRefs(Integer.valueOf(p0), Integer.valueOf(p1), this, uof, "7");
          if (obj != PatchProxyResult.class) {
             return obj.booleanValue();
          }
       }
       if (!this.c.containsKey(Integer.valueOf(p0))) {
          this.c.put(Integer.valueOf(p0), Integer.valueOf(p1));
          return true;
       }else if(!this.c.get(Integer.valueOf(p0)).equals(Integer.valueOf(p1))){
          this.c.put(Integer.valueOf(p0), Integer.valueOf(p1));
          return true;
       }else {
          return false;
       }
    }
    public int b(){
       Object obj = PatchProxy.apply(null, this, f.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       Log.i("RtcEngineAudioRoute", "enableInEarMonitoring");
       this.a.enableHeadphoneMonitor(true);
       return 0;
    }
    public int c(){
       Object obj = PatchProxy.apply(null, this, f.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       Log.i("RtcEngineAudioRoute", "disableInEarMonitoring");
       this.a.disableHeadphoneMonitor();
       return 0;
    }
    public int d(){
       Object obj = PatchProxy.apply(null, this, f.class, "6");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       this.a.setAudioRouteListener(new f$1(this));
       return 0;
    }
}
