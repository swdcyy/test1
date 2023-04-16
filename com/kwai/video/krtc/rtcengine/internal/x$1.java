package com.kwai.video.krtc.rtcengine.internal.x$1;
import com.kwai.video.krtc.observers.DirectorObserver;
import com.kwai.video.krtc.rtcengine.internal.x;
import com.kwai.video.krtc.rtcengine.extend.RtcEngineExt$ScaleLayout;
import com.kwai.video.krtc.rtcengine.IRtcEngineEventHandler;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.video.krtc.rtcengine.internal.z;
import sv7.g2;
import com.kwai.video.krtc.rtcengine.internal.z$a;

public class x$1 extends DirectorObserver	// class@00089e
{
    public final x a;

    public void x$1(x p0){
       this.a = p0;
       super();
    }
    public static void a(RtcEngineExt$ScaleLayout p0,IRtcEngineEventHandler p1){
       p1.onDirectorMainSourceScaleLayout(p0);
    }
    public void onDirectorMainSourceScaleLayout(RtcEngineExt$ScaleLayout p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, x$1.class, "1")) {
          return;
       }
       x.a(this.a).a(new g2(p0));
       return;
    }
}
