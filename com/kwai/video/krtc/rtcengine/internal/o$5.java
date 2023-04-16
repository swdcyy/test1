package com.kwai.video.krtc.rtcengine.internal.o$5;
import com.kwai.video.krtc.observers.AryaResultObserver;
import com.kwai.video.krtc.rtcengine.internal.o;
import java.lang.String;
import com.kwai.video.krtc.rtcengine.IRtcEngineEventHandler;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.Object;
import sv7.e0;
import com.kwai.video.krtc.rtcengine.internal.z$a;

public class o$5 extends AryaResultObserver	// class@000888
{
    public final o a;

    public void o$5(o p0){
       this.a = p0;
       super();
    }
    public static void a(int p0,String p1,IRtcEngineEventHandler p2){
       p2.onVideoRecordStateChanged(0, p0, p1);
    }
    public void onResult(int p0,String p1){
       o$5 u5 = o$5.class;
       if (PatchProxy.isSupport(u5) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), p1, this, u5, "1")) {
          return;
       }
       this.a.a(new e0(p0, p1));
       return;
    }
}
