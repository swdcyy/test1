package com.kuaishou.live.core.show.screenrecord.videocapture.gl.i;
import java.lang.Runnable;
import com.kuaishou.live.core.show.screenrecord.videocapture.gl.f;
import com.kuaishou.live.core.show.screenrecord.videocapture.gl.TextureBuffer$Type;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kuaishou.live.core.show.screenrecord.videocapture.gl.TextureBuffer;

public class i implements Runnable	// class@001000
{
    public final TextureBuffer$Type b;
    public final int c;
    public final int d;
    public final int e;
    public final long f;
    public final float[] g;
    public final f h;

    public void i(f p0,TextureBuffer$Type p1,int p2,int p3,int p4,long p5,float[] p6){
       this.h = p0;
       this.b = p1;
       this.c = p2;
       this.d = p3;
       this.e = p4;
       this.f = p5;
       this.g = p6;
       super();
    }
    public void run(){
       if (PatchProxy.applyVoid(null, this, i.class, "1")) {
          return;
       }
       i th = this.h;
       th.m = th.a(this.b, this.c, this.d, this.e, this.f, this.g);
       return;
    }
}
