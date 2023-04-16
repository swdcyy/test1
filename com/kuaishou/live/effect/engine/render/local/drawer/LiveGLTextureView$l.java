package com.kuaishou.live.effect.engine.render.local.drawer.LiveGLTextureView$l;
import java.lang.Object;
import com.kuaishou.live.effect.engine.render.local.drawer.LiveGLTextureView$a;
import javax.microedition.khronos.opengles.GL10;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kuaishou.live.effect.engine.render.local.drawer.LiveGLTextureView$k;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import pp.a;
import java.lang.StringBuilder;
import java.lang.Thread;
import q87.c;
import com.kuaishou.live.effect.engine.render.local.drawer.LiveGLTextureView;

public class LiveGLTextureView$l	// class@001b0f
{
    public boolean a;
    public int b;
    public boolean c;
    public boolean d;
    public boolean e;
    public LiveGLTextureView$k f;
    public static String g = "GLThreadManager";

    public void LiveGLTextureView$l(){
       super();
    }
    public void LiveGLTextureView$l(LiveGLTextureView$a p0){
       super();
    }
    public synchronized void a(GL10 p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveGLTextureView$l.class, "5")) {
          return;
       }
       if (this.c == null) {
          this.b();
          String str = p0.glGetString(7937);
          boolean b = false;
          if (this.b < 0x20000) {
             boolean b1 = (!str.startsWith("Q3Dimension MSM7500 "))? true: false;
             this.d = b1;
             this.notifyAll();
          }
          if (this.d == null) {
             b = true;
          }
          this.e = b;
          this.c = true;
       }
       return;
    }
    public final void b(){
       if (this.a == null) {
          this.a = true;
       }
       return;
    }
    public void c(LiveGLTextureView$k p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveGLTextureView$l.class, "3")) {
          return;
       }
       if (this.f == p0) {
          this.f = null;
       }
       this.notifyAll();
       return;
    }
    public synchronized boolean d(){
       return this.e;
    }
    public synchronized boolean e(){
       Object obj = PatchProxy.apply(null, this, LiveGLTextureView$l.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       this.b();
       return (this.d ^ 0x01);
    }
    public synchronized void f(LiveGLTextureView$k p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveGLTextureView$l.class, "1")) {
          return;
       }
       Object[] objArray = new Object[0];
       a.C().w("GLThread", "exiting tid="+p0.getId(), objArray);
       p0.d = true;
       if (this.f == p0) {
          this.f = null;
       }
       this.notifyAll();
       return;
    }
    public boolean g(LiveGLTextureView$k p0){
       LiveGLTextureView$l obj = PatchProxy.applyOneRefs(p0, this, LiveGLTextureView$l.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       obj = this.f;
       if (obj == p0 || obj == null) {
          this.f = p0;
          this.notifyAll();
          return true;
       }else {
          this.b();
          if (this.d != null) {
             return true;
          }
          LiveGLTextureView$l tf = this.f;
          if (tf != null && !PatchProxy.applyVoid(null, tf, LiveGLTextureView$k.class, "15")) {
             tf.l = true;
             LiveGLTextureView.p.notifyAll();
          }
          return false;
       }
    }
}
