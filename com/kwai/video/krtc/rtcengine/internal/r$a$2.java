package com.kwai.video.krtc.rtcengine.internal.r$a$2;
import java.lang.Runnable;
import com.kwai.video.krtc.rtcengine.internal.r$a;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.video.krtc.rtcengine.internal.r;

public class r$a$2 implements Runnable	// class@000892
{
    public final String a;
    public final String b;
    public final int c;
    public final int d;
    public final int e;
    public final int f;
    public final r$a g;

    public void r$a$2(r$a p0,String p1,String p2,int p3,int p4,int p5,int p6){
       this.g = p0;
       this.a = p1;
       this.b = p2;
       this.c = p3;
       this.d = p4;
       this.e = p5;
       this.f = p6;
       super();
    }
    public void run(){
       if (PatchProxy.applyVoid(null, this, r$a$2.class, "1")) {
          return;
       }
       r.a(this.g.a, this.a, this.b, this.c, this.d, this.e, this.f);
       return;
    }
}
