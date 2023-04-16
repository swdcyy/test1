package com.kuaishou.live.core.show.screenrecord.videocapture.gl.TextureBuffer;
import com.kuaishou.live.core.show.screenrecord.videocapture.gl.TextureBuffer$Type;
import android.os.Handler;
import com.kuaishou.live.core.show.screenrecord.videocapture.gl.k;
import lj2.a;
import java.util.concurrent.locks.ReentrantLock;
import java.lang.Object;
import lj2.a$a;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicInteger;

public class TextureBuffer	// class@000fed
{
    public int a;
    public int b;
    public int c;
    public int d;
    public long e;
    public final TextureBuffer$Type f;
    public final int g;
    public float[] h;
    public final Handler i;
    public final k j;
    public final a k;
    public ReentrantLock l;

    public void TextureBuffer(int p0,int p1,int p2,long p3,TextureBuffer$Type p4,int p5,float[] p6,int p7,Handler p8,k p9,a p10,ReentrantLock p11){
       super();
       this.l = new ReentrantLock();
       this.a = p0;
       this.b = p1;
       this.c = p2;
       this.e = p3;
       this.f = p4;
       this.g = p5;
       this.h = p6.clone();
       this.i = p8;
       this.j = p9;
       this.k = p10;
       this.l = p11;
       this.d = p7;
    }
    public void TextureBuffer(int p0,int p1,int p2,long p3,TextureBuffer$Type p4,int p5,float[] p6,Handler p7,k p8,a$a p9){
       super();
       this.l = new ReentrantLock();
       this.a = p0;
       this.b = p1;
       this.c = p2;
       this.e = p3;
       this.f = p4;
       this.g = p5;
       this.h = p6.clone();
       this.i = p7;
       this.j = p8;
       this.k = new a(p9, p5);
       this.d = 0;
    }
    public int a(){
       return this.d;
    }
    public int b(){
       return this.b;
    }
    public long c(){
       return this.e;
    }
    public Object clone(){
       TextureBuffer textureBuffe = PatchProxy.apply(null, this, TextureBuffer.class, "1");
       if (textureBuffe != PatchProxyResult.class) {
       }else {
          TextureBuffer textureBuffe1 = new TextureBuffer(this.a, this.b, this.c, this.e, this.f, this.g, this.h, this.d, this.i, this.j, this.k, this.l);
       }
       return textureBuffe;
    }
    public int d(){
       return this.a;
    }
    public void e(){
       if (PatchProxy.applyVoid(null, this, TextureBuffer.class, "5")) {
          return;
       }
       TextureBuffer tk = this.k;
       Objects.requireNonNull(tk);
       if (!PatchProxy.applyVoid(null, tk, a.class, "2") && !tk.a.decrementAndGet()) {
          a c = tk.c;
          if (c != null) {
             c.u(tk.b);
             tk.c = null;
          }
       }
       return;
    }
    public void f(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, TextureBuffer.class, "4")) {
          return;
       }
       TextureBuffer tk = this.k;
       Objects.requireNonNull(tk);
       if (!PatchProxy.applyVoid(objArray, tk, a.class, "1")) {
          tk.a.incrementAndGet();
       }
       return;
    }
}
