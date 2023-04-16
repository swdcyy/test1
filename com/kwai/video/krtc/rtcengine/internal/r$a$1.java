package com.kwai.video.krtc.rtcengine.internal.r$a$1;
import java.lang.Runnable;
import com.kwai.video.krtc.rtcengine.internal.r$a;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.video.krtc.rtcengine.internal.r;
import com.kwai.video.krtc.rtcengine.internal.z;

public class r$a$1 implements Runnable	// class@000891
{
    public final r$a a;

    public void r$a$1(r$a p0){
       this.a = p0;
       super();
    }
    public void run(){
       if (PatchProxy.applyVoid(null, this, r$a$1.class, "1")) {
          return;
       }
       r.c(this.a.a).b(2);
       return;
    }
}
