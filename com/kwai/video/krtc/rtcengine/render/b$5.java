package com.kwai.video.krtc.rtcengine.render.b$5;
import java.lang.Runnable;
import com.kwai.video.krtc.rtcengine.render.b;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;

public class b$5 implements Runnable	// class@0008b2
{
    public final b a;

    public void b$5(b p0){
       this.a = p0;
       super();
    }
    public void run(){
       if (PatchProxy.applyVoid(null, this, b$5.class, "1")) {
          return;
       }
       b.b(this.a);
       return;
    }
}
