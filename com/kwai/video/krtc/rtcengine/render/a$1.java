package com.kwai.video.krtc.rtcengine.render.a$1;
import java.lang.Runnable;
import com.kwai.video.krtc.rtcengine.render.a;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.video.krtc.rtcengine.RtcEngineVideoFrame;
import java.lang.StringBuilder;
import com.kwai.video.krtc.utils.Log;

public class a$1 implements Runnable	// class@0008ab
{
    public final int a;
    public final a b;

    public void a$1(a p0,int p1){
       this.b = p0;
       this.a = p1;
       super();
    }
    public void run(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, a$1.class, "1")) {
          return;
       }
       Object obj = a.a(this.b);
       _monitor_enter(obj);
       if (this.a <= null || (a.b(this.b) == null || a.b(this.b) == a.c(this.b))) {
          objArray = a.c(this.b);
       }
       _monitor_exit(obj);
       if (objArray != null) {
          Log.i(a.b(), this+" renderLastFrame\("+objArray+"\), width: "+objArray.width+"height: "+objArray.height);
          this.b.renderFrame(objArray);
       }
       return;
    }
}
