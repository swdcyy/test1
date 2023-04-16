package com.kwai.video.krtc.rtcengine.internal.o$2;
import com.kwai.video.krtc.rtcengine.internal.u$a;
import com.kwai.video.krtc.rtcengine.internal.o;
import java.lang.Object;
import java.lang.String;
import com.kwai.video.krtc.rtcengine.IRtcEngineEventHandler;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import sv7.d0;
import com.kwai.video.krtc.rtcengine.internal.z$a;

public class o$2 implements u$a	// class@000885
{
    public final o a;

    public void o$2(o p0){
       this.a = p0;
       super();
    }
    public static void a(String p0,int p1,int p2,int p3,IRtcEngineEventHandler p4){
       p4.onVideoPublishStateChanged(p0, p1, p2, p3);
    }
    public void a(String p0,int p1,int p2,int p3){
       if (PatchProxy.isSupport(o$2.class) && PatchProxy.applyVoidFourRefs(p0, Integer.valueOf(p1), Integer.valueOf(p2), Integer.valueOf(p3), this, o$2.class, "1")) {
          return;
       }
       this.a.a(new d0(p0, p1, p2, p3));
       return;
    }
}
