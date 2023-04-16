package com.kuaishou.live.effect.engine.render.local.drawer.LiveGLTextureView$n;
import java.io.Writer;
import java.lang.StringBuilder;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;

public class LiveGLTextureView$n extends Writer	// class@001b11
{
    public StringBuilder b;

    public void LiveGLTextureView$n(){
       super();
       this.b = "";
    }
    public final void a(){
       if (PatchProxy.applyVoid(null, this, LiveGLTextureView$n.class, "4")) {
          return;
       }
       if ((this.b).length() > 0) {
          LiveGLTextureView$n tb = this.b;
          tb.delete(0, tb.length());
       }
       return;
    }
    public void close(){
       if (PatchProxy.applyVoid(null, this, LiveGLTextureView$n.class, "1")) {
          return;
       }
       this.a();
       return;
    }
    public void flush(){
       if (PatchProxy.applyVoid(null, this, LiveGLTextureView$n.class, "2")) {
          return;
       }
       this.a();
       return;
    }
    public void write(char[] p0,int p1,int p2){
       if (PatchProxy.isSupport(LiveGLTextureView$n.class) && PatchProxy.applyVoidThreeRefs(p0, Integer.valueOf(p1), Integer.valueOf(p2), this, LiveGLTextureView$n.class, "3")) {
          return;
       }
       int i = 0;
       while (i < p2) {
          int i1 = p1 + i;
          char c = p0[i1];
          if (c == 10) {
             this.a();
          }else {
             StringBuilder str = this.b+c;
          }
          i = i + 1;
       }
       return;
    }
}
