package com.kwai.video.krtc.rtcengine.internal.e$3;
import java.lang.Runnable;
import com.kwai.video.krtc.rtcengine.internal.e;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;

public class e$3 implements Runnable	// class@00086f
{
    public final int a;
    public final int b;
    public final int c;
    public final e d;

    public void e$3(e p0,int p1,int p2,int p3){
       this.d = p0;
       this.a = p1;
       this.b = p2;
       this.c = p3;
       super();
    }
    public void run(){
       if (PatchProxy.applyVoid(null, this, e$3.class, "1")) {
          return;
       }
       e.b(this.d, this.a, this.b, this.c);
       return;
    }
}
