package com.kwai.video.krtc.rtcengine.internal.o$7;
import com.kwai.video.krtc.observers.AryaResultObserver;
import com.kwai.video.krtc.rtcengine.internal.o;
import java.lang.String;
import com.kwai.video.krtc.rtcengine.IRtcEngineEventHandler;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.Object;
import sv7.g0;
import com.kwai.video.krtc.rtcengine.internal.z$a;

public class o$7 extends AryaResultObserver	// class@00088a
{
    public final o a;

    public void o$7(o p0){
       this.a = p0;
       super();
    }
    public static void a(int p0,String p1,IRtcEngineEventHandler p2){
       p2.onVideoRecordStateChanged(1, p0, p1);
    }
    public void onResult(int p0,String p1){
       o$7 u7 = o$7.class;
       if (PatchProxy.isSupport(u7) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), p1, this, u7, "1")) {
          return;
       }
       this.a.a(new g0(p0, p1));
       return;
    }
}
