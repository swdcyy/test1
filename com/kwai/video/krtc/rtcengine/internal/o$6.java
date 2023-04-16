package com.kwai.video.krtc.rtcengine.internal.o$6;
import com.kwai.video.krtc.observers.AryaResultObserver;
import com.kwai.video.krtc.rtcengine.internal.o;
import java.lang.String;
import com.kwai.video.krtc.rtcengine.IRtcEngineEventHandler;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.Object;
import sv7.f0;
import com.kwai.video.krtc.rtcengine.internal.z$a;

public class o$6 extends AryaResultObserver	// class@000889
{
    public final o a;

    public void o$6(o p0){
       this.a = p0;
       super();
    }
    public static void a(int p0,String p1,IRtcEngineEventHandler p2){
       p2.onVideoRecordStateChanged(0, p0, p1);
    }
    public void onResult(int p0,String p1){
       o$6 u6 = o$6.class;
       if (PatchProxy.isSupport(u6) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), p1, this, u6, "1")) {
          return;
       }
       this.a.a(new f0(p0, p1));
       return;
    }
}
