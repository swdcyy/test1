package com.kwai.video.krtc.rtcengine.internal.o$4;
import java.lang.Runnable;
import com.kwai.video.krtc.rtcengine.internal.o;
import com.kwai.video.krtc.rtcengine.internal.z$a;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;

public class o$4 implements Runnable	// class@000887
{
    public final z$a a;
    public final o b;

    public void o$4(o p0,z$a p1){
       this.b = p0;
       this.a = p1;
       super();
    }
    public void run(){
       if (PatchProxy.applyVoid(null, this, o$4.class, "1")) {
          return;
       }
       this.b.a(this.a);
       return;
    }
}
