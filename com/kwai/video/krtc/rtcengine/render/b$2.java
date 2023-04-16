package com.kwai.video.krtc.rtcengine.render.b$2;
import java.lang.Runnable;
import com.kwai.video.krtc.rtcengine.render.b;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;

public class b$2 implements Runnable	// class@0008af
{
    public final b a;

    public void b$2(b p0){
       this.a = p0;
       super();
    }
    public void run(){
       if (PatchProxy.applyVoid(null, this, b$2.class, "1")) {
          return;
       }
       b.b(this.a);
       return;
    }
}
