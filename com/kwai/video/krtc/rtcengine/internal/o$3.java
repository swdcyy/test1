package com.kwai.video.krtc.rtcengine.internal.o$3;
import bo.p;
import com.kwai.video.krtc.rtcengine.internal.o;
import java.lang.Object;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.StringBuilder;
import com.kwai.video.krtc.utils.Log;

public class o$3 implements p	// class@000886
{
    public final o a;

    public void o$3(o p0){
       this.a = p0;
       super();
    }
    public void Log(int p0,String p1,String p2){
       if (PatchProxy.isSupport(o$3.class) && PatchProxy.applyVoidThreeRefs(Integer.valueOf(p0), p1, p2, this, o$3.class, "1")) {
          return;
       }
       int i = 2;
       if (p0 < i) {
          return;
       }
       if (p0) {
          if (p0 != 1) {
             if (p0 != i) {
                if (p0 != 3) {
                   Log.i("RtcEngineImpl", "Aegon "+p2);
                }else {
                   Log.e("RtcEngineImpl", "Aegon "+p2);
                }
             }else {
                Log.w("RtcEngineImpl", "Aegon "+p2);
             }
          }else {
             Log.i("RtcEngineImpl", "Aegon "+p2);
          }
       }else {
          Log.d("RtcEngineImpl", "Aegon "+p2);
       }
       return;
    }
}
