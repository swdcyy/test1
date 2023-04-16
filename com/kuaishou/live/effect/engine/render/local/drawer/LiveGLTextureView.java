package com.kuaishou.live.effect.engine.render.local.drawer.LiveGLTextureView;
import android.view.TextureView$SurfaceTextureListener;
import android.view.TextureView;
import com.kuaishou.live.effect.engine.render.local.drawer.LiveGLTextureView$l;
import com.kuaishou.live.effect.engine.render.local.drawer.LiveGLTextureView$a;
import android.content.Context;
import java.lang.ref.WeakReference;
import java.lang.Object;
import android.util.AttributeSet;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import pp.a;
import java.lang.StringBuilder;
import q87.c;
import java.lang.IllegalStateException;
import com.kuaishou.live.effect.engine.render.local.drawer.LiveGLTextureView$k;
import java.lang.Thread;
import java.util.Objects;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import java.lang.Integer;
import java.lang.Boolean;
import android.view.View;
import android.graphics.SurfaceTexture;
import com.kuaishou.live.effect.engine.render.local.drawer.LiveGLTextureView$f;
import com.kuaishou.live.effect.engine.render.local.drawer.LiveGLTextureView$p;
import com.kuaishou.live.effect.engine.render.local.drawer.LiveGLTextureView$g;
import com.kuaishou.live.effect.engine.render.local.drawer.LiveGLTextureView$h;
import com.kuaishou.live.effect.engine.render.local.drawer.LiveGLTextureView$j;
import com.kuaishou.live.effect.engine.render.local.drawer.LiveGLTextureView$m;
import com.kuaishou.live.effect.engine.render.local.drawer.LiveGLTextureView$o;
import com.kuaishou.live.effect.engine.render.local.drawer.LiveGLTextureView$d;
import com.kuaishou.live.effect.engine.render.local.drawer.LiveGLTextureView$e;

public class LiveGLTextureView extends TextureView implements TextureView$SurfaceTextureListener	// class@001b14
{
    public final WeakReference b;
    public LiveGLTextureView$k c;
    public LiveGLTextureView$o d;
    public boolean e;
    public LiveGLTextureView$f f;
    public LiveGLTextureView$g g;
    public LiveGLTextureView$h h;
    public LiveGLTextureView$m i;
    public int j;
    public int k;
    public boolean l;
    public LiveGLTextureView$j m;
    public int n;
    public int o;
    public static final LiveGLTextureView$l p;

    static {
       LiveGLTextureView.p = new LiveGLTextureView$l(null);
    }
    public void LiveGLTextureView(Context p0){
       super(p0);
       this.b = new WeakReference(this);
       this.n = 0;
       this.o = 0;
       this.d();
    }
    public void LiveGLTextureView(Context p0,AttributeSet p1){
       super(p0, p1);
       this.b = new WeakReference(this);
       this.n = 0;
       this.o = 0;
       this.d();
    }
    public void a(){
       if (PatchProxy.applyVoid(null, this, LiveGLTextureView.class, "19")) {
          return;
       }
       Object[] objArray = new Object[0];
       a.C().t("LiveGLTextureView", "attach"+this, objArray);
       this.e();
       return;
    }
    public final void b(){
       if (PatchProxy.applyVoid(null, this, LiveGLTextureView.class, "30")) {
          return;
       }
       if (this.c == null) {
          return;
       }
       throw new IllegalStateException("setRenderer has already been called for this instance.");
    }
    public void c(){
       if (PatchProxy.applyVoid(null, this, LiveGLTextureView.class, "20")) {
          return;
       }
       Object[] objArray = new Object[0];
       a.C().t("LiveGLTextureView", "detach"+this, objArray);
       this.f();
       return;
    }
    public final void d(){
       if (PatchProxy.applyVoid(null, this, LiveGLTextureView.class, "2")) {
          return;
       }
       this.setSurfaceTextureListener(this);
       return;
    }
    public final void e(){
       if (PatchProxy.applyVoid(null, this, LiveGLTextureView.class, "21")) {
          return;
       }
       if (this.e != null && this.d != null) {
          LiveGLTextureView tc = this.c;
          int i = (tc != null)? tc.b(): 1;
          LiveGLTextureView$k ok = new LiveGLTextureView$k(this.b, this.n, this.o);
          this.c = ok;
          if (i != 1) {
             ok.f(i);
          }
          this.c.start();
       }
       this.e = false;
       return;
    }
    public final void f(){
       if (PatchProxy.applyVoid(null, this, LiveGLTextureView.class, "22")) {
          return;
       }
       LiveGLTextureView tc = this.c;
       if (tc != null) {
          tc.e();
       }
       this.e = true;
       return;
    }
    public void finalize(){
       if (PatchProxy.applyVoid(null, this, LiveGLTextureView.class, "1")) {
          return;
       }
       LiveGLTextureView tc = this.c;
       if (tc != null) {
          tc.e();
       }
       super.finalize();
       return;
    }
    public void g(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, LiveGLTextureView.class, "12")) {
          return;
       }
       LiveGLTextureView tc = this.c;
       Objects.requireNonNull(tc);
       if (!PatchProxy.applyVoid(objArray, tc, LiveGLTextureView$k.class, "8")) {
          LiveGLTextureView$l p = LiveGLTextureView.p;
          _monitor_enter(p);
          tc.q = true;
          p.notifyAll();
          _monitor_exit(p);
       }
       return;
    }
    public int getDebugFlags(){
       return this.j;
    }
    public boolean getPreserveEGLContextOnPause(){
       return this.l;
    }
    public int getRenderMode(){
       Object obj = PatchProxy.apply(null, this, LiveGLTextureView.class, "11");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return this.c.b();
    }
    public void h(int p0,int p1){
       boolean b;
       if (PatchProxy.isSupport(LiveGLTextureView.class) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), Integer.valueOf(p1), this, LiveGLTextureView.class, "15")) {
          return;
       }
       LiveGLTextureView tc = this.c;
       Objects.requireNonNull(tc);
       if (!PatchProxy.isSupport(LiveGLTextureView$k.class) || !PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), Integer.valueOf(p1), tc, LiveGLTextureView$k.class, "13")) {
          LiveGLTextureView$l p = LiveGLTextureView.p;
          _monitor_enter(p);
          tc.n = p0;
          tc.o = p1;
          tc.t = true;
          tc.q = true;
          tc.r = false;
          p.notifyAll();
          while (true) {
             if (tc.d == null && (tc.f == null && tc.r == null)) {
                a obj = PatchProxy.apply(null, tc, LiveGLTextureView$k.class, "6");
                if (obj != PatchProxyResult.class) {
                   b = obj.booleanValue();
                }else if(tc.j != null && (tc.k != null && tc.d())){
                   b = true;
                }else {
                   b = false;
                }
                if (b) {
                   obj = a.C();
                   String str = "Main thread";
                   String str1 = "onWindowResize waiting for render complete from tid="+tc.getId();
                   Object[] objArray = new Object[false];
                   try{
                      obj.w(str, str1, objArray);
                      LiveGLTextureView.p.wait();
                   }catch(java.lang.InterruptedException e0){
                      Thread.currentThread().interrupt();
                      goto label_004e ;
                   }
                }else {
                label_00af :
                   _monitor_exit(p);
                   break ;
                }
             }else {
                goto label_00af ;
             }
          }
       }
       this.n = p0;
       this.o = p1;
       return;
    }
    public void onAttachedToWindow(){
       if (PatchProxy.applyVoid(null, this, LiveGLTextureView.class, "23")) {
          return;
       }
       super.onAttachedToWindow();
       Object[] objArray = new Object[0];
       a.C().s("LiveGLTextureView", "onAttachedToWindow reattach ="+this.e, objArray);
       this.e();
       return;
    }
    public void onDetachedFromWindow(){
       if (PatchProxy.applyVoid(null, this, LiveGLTextureView.class, "24")) {
          return;
       }
       Object[] objArray = new Object[0];
       a.C().s("LiveGLTextureView", "onDetachedFromWindow", objArray);
       this.f();
       super.onDetachedFromWindow();
       return;
    }
    public void onSurfaceTextureAvailable(SurfaceTexture p0,int p1,int p2){
       if (PatchProxy.isSupport(LiveGLTextureView.class) && PatchProxy.applyVoidThreeRefs(p0, Integer.valueOf(p1), Integer.valueOf(p2), this, LiveGLTextureView.class, "26")) {
          return;
       }
       Object[] objArray = null;
       if (!PatchProxy.applyVoid(objArray, this, LiveGLTextureView.class, "13")) {
          LiveGLTextureView tc = this.c;
          Objects.requireNonNull(tc);
          if (!PatchProxy.applyVoid(objArray, tc, LiveGLTextureView$k.class, "9")) {
             LiveGLTextureView$l p = LiveGLTextureView.p;
             _monitor_enter(p);
             Object[] objArray1 = new Object[0];
             a.C().w("GLThread", "surfaceCreated tid="+tc.getId(), objArray1);
             tc.g = true;
             p.notifyAll();
             while (tc.i != null && tc.d == null) {
                try{
                   LiveGLTextureView.p.wait();
                }catch(java.lang.InterruptedException e0){
                   Thread.currentThread().interrupt();
                   goto label_0063 ;
                }
             }
             _monitor_exit(p);
          }
       }
       this.h(p1, p2);
       return;
    }
    public boolean onSurfaceTextureDestroyed(SurfaceTexture p0){
       p0 = PatchProxy.applyOneRefs(p0, this, LiveGLTextureView.class, "28");
       if (p0 != PatchProxyResult.class) {
          return p0.booleanValue();
       }
       Object[] objArray = null;
       if (!PatchProxy.applyVoid(objArray, this, LiveGLTextureView.class, "14")) {
          LiveGLTextureView tc = this.c;
          Objects.requireNonNull(tc);
          if (!PatchProxy.applyVoid(objArray, tc, LiveGLTextureView$k.class, "10")) {
             LiveGLTextureView$l p = LiveGLTextureView.p;
             _monitor_enter(p);
             Object[] objArray1 = new Object[0];
             a.C().w("GLThread", "surfaceDestroyed tid="+tc.getId(), objArray1);
             tc.g = false;
             p.notifyAll();
             while (tc.i == null && tc.d == null) {
                try{
                   LiveGLTextureView.p.wait();
                }catch(java.lang.InterruptedException e0){
                   Thread.currentThread().interrupt();
                   goto label_0058 ;
                }
             }
             _monitor_exit(p);
          }
       }
       return true;
    }
    public void onSurfaceTextureSizeChanged(SurfaceTexture p0,int p1,int p2){
       if (PatchProxy.isSupport(LiveGLTextureView.class) && PatchProxy.applyVoidThreeRefs(p0, Integer.valueOf(p1), Integer.valueOf(p2), this, LiveGLTextureView.class, "27")) {
          return;
       }
       this.h(p1, p2);
       return;
    }
    public void onSurfaceTextureUpdated(SurfaceTexture p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveGLTextureView.class, "29")) {
          return;
       }
       this.g();
       return;
    }
    public void setDebugFlags(int p0){
       this.j = p0;
    }
    public void setEGLConfigChooser(LiveGLTextureView$f p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveGLTextureView.class, "6")) {
          return;
       }
       this.b();
       this.f = p0;
       return;
    }
    public void setEGLConfigChooser(boolean p0){
       if (PatchProxy.isSupport(LiveGLTextureView.class) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, LiveGLTextureView.class, "7")) {
          return;
       }
       this.setEGLConfigChooser(new LiveGLTextureView$p(this, p0));
       return;
    }
    public void setEGLContextClientVersion(int p0){
       if (PatchProxy.isSupport(LiveGLTextureView.class) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, LiveGLTextureView.class, "9")) {
          return;
       }
       this.b();
       this.k = p0;
       return;
    }
    public void setEGLContextFactory(LiveGLTextureView$g p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveGLTextureView.class, "4")) {
          return;
       }
       this.b();
       this.g = p0;
       return;
    }
    public void setEGLWindowSurfaceFactory(LiveGLTextureView$h p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveGLTextureView.class, "5")) {
          return;
       }
       this.b();
       this.h = p0;
       return;
    }
    public void setErrorCallback(LiveGLTextureView$j p0){
       this.m = p0;
    }
    public void setGLWrapper(LiveGLTextureView$m p0){
       this.i = p0;
    }
    public void setPreserveEGLContextOnPause(boolean p0){
       this.l = p0;
    }
    public void setRenderMode(int p0){
       if (PatchProxy.isSupport(LiveGLTextureView.class) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, LiveGLTextureView.class, "10")) {
          return;
       }
       this.c.f(p0);
       return;
    }
    public void setRenderer(LiveGLTextureView$o p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveGLTextureView.class, "3")) {
          return;
       }
       this.b();
       if (this.f == null) {
          this.f = new LiveGLTextureView$p(this, true);
       }
       if (this.g == null) {
          this.g = new LiveGLTextureView$d(this);
       }
       if (this.h == null) {
          this.h = new LiveGLTextureView$e(null);
       }
       this.d = p0;
       LiveGLTextureView$k ok = new LiveGLTextureView$k(this.b);
       this.c = ok;
       ok.start();
       return;
    }
}
