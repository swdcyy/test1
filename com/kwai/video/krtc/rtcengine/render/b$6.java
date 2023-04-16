package com.kwai.video.krtc.rtcengine.render.b$6;
import java.lang.Runnable;
import com.kwai.video.krtc.rtcengine.render.b;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.video.krtc.rtcengine.RtcEngineVideoFrame;
import java.lang.StringBuilder;
import com.kwai.video.krtc.utils.Log;

public class b$6 implements Runnable	// class@0008b3
{
    public final int a;
    public final b b;

    public void b$6(b p0,int p1){
       this.b = p0;
       this.a = p1;
       super();
    }
    public void run(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, b$6.class, "1")) {
          return;
       }
       Object obj = b.d(this.b);
       _monitor_enter(obj);
       if (this.a <= null || (b.e(this.b) == null || b.e(this.b) == b.f(this.b))) {
          objArray = b.f(this.b);
       }
       _monitor_exit(obj);
       if (objArray != null) {
          Log.i(b.b(), this+" renderLastFrame\("+objArray+"\), width: "+objArray.width+", height: "+objArray.height+", delayMs: "+this.a);
          this.b.a(objArray, false);
       }
       return;
    }
}
