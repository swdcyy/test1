package com.kwai.video.krtc.rtcengine.internal.e$2;
import java.lang.Runnable;
import com.kwai.video.krtc.rtcengine.internal.e;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;

public class e$2 implements Runnable	// class@00086e
{
    public final int a;
    public final e b;

    public void e$2(e p0,int p1){
       this.b = p0;
       this.a = p1;
       super();
    }
    public void run(){
       if (PatchProxy.applyVoid(null, this, e$2.class, "1")) {
          return;
       }
       e.b(this.b, this.a, 0, 2816);
       return;
    }
}
