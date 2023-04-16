package com.kwai.video.krtc.rtcengine.render.RtcEngineTextureView$1$1;
import java.lang.Runnable;
import com.kwai.video.krtc.rtcengine.render.RtcEngineTextureView$1;
import java.util.concurrent.CountDownLatch;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;

public class RtcEngineTextureView$1$1 implements Runnable	// class@0008a7
{
    public final CountDownLatch a;
    public final RtcEngineTextureView$1 b;

    public void RtcEngineTextureView$1$1(RtcEngineTextureView$1 p0,CountDownLatch p1){
       this.b = p0;
       this.a = p1;
       super();
    }
    public void run(){
       if (PatchProxy.applyVoid(null, this, RtcEngineTextureView$1$1.class, "1")) {
          return;
       }
       this.a.countDown();
       return;
    }
}
