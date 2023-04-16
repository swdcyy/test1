package com.kwai.video.krtc.rtcengine.internal.r$a$3;
import java.lang.Runnable;
import com.kwai.video.krtc.rtcengine.internal.r$a;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.video.krtc.rtcengine.internal.r;
import com.kwai.video.krtc.rtcengine.internal.z;

public class r$a$3 implements Runnable	// class@000893
{
    public final r$a a;

    public void r$a$3(r$a p0){
       this.a = p0;
       super();
    }
    public void run(){
       if (PatchProxy.applyVoid(null, this, r$a$3.class, "1")) {
          return;
       }
       r.c(this.a.a).a(1);
       return;
    }
}
