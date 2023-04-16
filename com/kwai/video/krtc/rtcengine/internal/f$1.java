package com.kwai.video.krtc.rtcengine.internal.f$1;
import com.kwai.video.krtc.Arya$AryaAudioRouteListener;
import com.kwai.video.krtc.rtcengine.internal.f;
import java.lang.Object;
import com.kwai.video.krtc.rtcengine.IRtcEngineEventHandler;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.String;
import java.lang.StringBuilder;
import com.kwai.video.krtc.utils.Log;
import com.kwai.video.krtc.Arya;
import com.kwai.video.krtc.Arya$AryaDeviceInfo;
import com.kwai.video.krtc.rtcengine.internal.z;
import sv7.q;
import com.kwai.video.krtc.rtcengine.internal.z$a;

public class f$1 implements Arya$AryaAudioRouteListener	// class@000875
{
    public final f a;

    public void f$1(f p0){
       this.a = p0;
       super();
    }
    public static void a(int p0,int p1,IRtcEngineEventHandler p2){
       p2.onAudioRouteChanged(p0, p1);
    }
    public void onRouteChange(int p0,int p1){
       f$1 u1 = f$1.class;
       if (PatchProxy.isSupport(u1) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), Integer.valueOf(p1), this, u1, "1")) {
          return;
       }
       if (f.a(this.a, p0, p1)) {
          Log.i("RtcEngineAudioRoute", "realAudioRouteChange routeType "+p0+" route "+p1);
          Arya$AryaDeviceInfo currentDevic = f.a(this.a).getCurrentDevice(p0);
          f.b(this.a).a(new q(p0, p1));
          String str = "";
          if (!p0) {
             if (currentDevic == null) {
                f.a(this.a).onAudioOutPutRouteChanged(p1, -1, str);
             }else {
                f.a(this.a).onAudioOutPutRouteChanged(p1, currentDevic.id, currentDevic.name);
             }
          }else if(currentDevic == null){
             f.a(this.a).onAudioInputRouteChanged(p1, -1, str);
          }else {
             f.a(this.a).onAudioInputRouteChanged(p1, currentDevic.id, currentDevic.name);
          }
       }
       return;
    }
}
