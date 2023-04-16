package com.kwai.video.krtc.rtcengine.extend.a.b$2;
import com.kwai.video.krtc.observers.AryaResultObserver;
import com.kwai.video.krtc.rtcengine.extend.a.b;
import java.lang.String;
import com.kwai.video.krtc.rtcengine.IRtcEngineEventHandler;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.Object;
import com.kwai.video.krtc.rtcengine.internal.o;
import rv7.c;
import com.kwai.video.krtc.rtcengine.internal.z$a;

public class b$2 extends AryaResultObserver	// class@000858
{
    public final b a;

    public void b$2(b p0){
       this.a = p0;
       super();
    }
    public static void a(int p0,String p1,IRtcEngineEventHandler p2){
       p2.onVideoRecordStateChanged(1, p0, p1);
    }
    public void onResult(int p0,String p1){
       b$2 u2 = b$2.class;
       if (PatchProxy.isSupport(u2) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), p1, this, u2, "1")) {
          return;
       }
       b.a(this.a).a(new c(p0, p1));
       return;
    }
}
