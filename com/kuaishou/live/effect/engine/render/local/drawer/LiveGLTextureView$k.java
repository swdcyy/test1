package com.kuaishou.live.effect.engine.render.local.drawer.LiveGLTextureView$k;
import java.lang.Thread;
import java.lang.ref.WeakReference;
import com.kwai.sdk.switchconfig.a;
import java.lang.String;
import io7.c;
import java.util.ArrayList;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kuaishou.live.effect.engine.render.local.drawer.LiveGLTextureView$i;
import pp.a;
import java.lang.StringBuilder;
import q87.c;
import android.opengl.GLES20;
import com.kuaishou.live.effect.engine.render.local.drawer.LiveGLTextureView;
import javax.microedition.khronos.opengles.GL10;
import com.kuaishou.live.effect.engine.render.local.drawer.LiveGLTextureView$o;
import java.lang.Runnable;
import com.kuaishou.live.effect.engine.render.local.drawer.LiveGLTextureView$l;
import java.lang.Exception;
import com.kuaishou.live.effect.engine.render.local.drawer.LiveGLTextureView$j;
import javax.microedition.khronos.opengles.GL;
import javax.microedition.khronos.egl.EGLConfig;
import java.lang.Integer;
import java.lang.IllegalArgumentException;
import java.util.Objects;

public class LiveGLTextureView$k extends Thread	// class@001b0e
{
    public final boolean b;
    public boolean c;
    public boolean d;
    public boolean e;
    public boolean f;
    public boolean g;
    public boolean h;
    public boolean i;
    public boolean j;
    public boolean k;
    public boolean l;
    public boolean m;
    public int n;
    public int o;
    public int p;
    public boolean q;
    public boolean r;
    public ArrayList s;
    public boolean t;
    public LiveGLTextureView$i u;
    public WeakReference v;

    public void LiveGLTextureView$k(WeakReference p0){
       super(p0, 0, 0);
    }
    public void LiveGLTextureView$k(WeakReference p0,int p1,int p2){
       super();
       this.b = a.t().u("SOURCE_LIVE").d("liveGLTextureViewOpt", false);
       this.s = new ArrayList();
       this.t = true;
       this.n = p1;
       this.o = p2;
       this.q = true;
       this.p = 1;
       this.v = p0;
       if (p1 > 0 && p2 > 0) {
          this.g = true;
       }
       return;
    }
    public final void a(){
       if (PatchProxy.applyVoid(null, this, LiveGLTextureView$k.class, "2")) {
          return;
       }
       LiveGLTextureView$k tu = this.u;
       if (tu.c != null && tu.d != null) {
          Object[] objArray = new Object[0];
          a.C().t("LiveGLTextureView", "clearSurface"+Thread.currentThread().getId(), objArray);
          GLES20.glClearColor(0, 0, 0, 0);
          GLES20.glClear(0x4000);
          this.u.h();
       }
       return;
    }
    public int b(){
       LiveGLTextureView$l p = LiveGLTextureView.p;
       _monitor_enter(p);
       _monitor_exit(p);
       return this.p;
    }
    public final void c(){
       LiveGLTextureView liveGLTextur;
       LiveGLTextureView$l p1;
       Object[] objArray5;
       LiveGLTextureView$k ok1;
       GL gL;
       String str1;
       Object[] objArray8;
       GL gL1;
       String str2;
       Object[] objArray9;
       int i7;
       a uoa;
       boolean b1;
       LiveGLTextureView$i oi = this;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, oi, LiveGLTextureView$k.class, "5")) {
          return;
       }
       oi.u = new LiveGLTextureView$i(oi.v);
       boolean b = false;
       oi.j = b;
       oi.k = b;
       Object[] objArray1 = objArray;
       Object[] objArray2 = objArray1;
       LiveGLTextureView$k ok = null;
       String str = null;
       Object[] objArray3 = null;
       int i = 0;
       Object[] objArray4 = null;
       int i1 = 0;
       int i2 = 0;
       int i3 = 0;
       int i4 = 0;
       int i5 = 0;
    label_0028 :
       LiveGLTextureView$l p = LiveGLTextureView.p;
       _monitor_enter(p);
       while (oi.c == null) {
          if (!oi.s.isEmpty()) {
             objArray2 = oi.s.remove(0);
             objArray5 = objArray1;
          }else {
             LiveGLTextureView$k e = oi.e;
             if (oi.f != e) {
                oi.f = e;
                LiveGLTextureView.p.notifyAll();
                ok1 = e;
                objArray5 = objArray1;
                str2 = str;
                objArray9 = objArray3;
                objArray3 = new Object[0];
                a.C().w("GLThread", "mPaused is now "+oi.f+" tid="+this.getId(), objArray3);
             }else {
                objArray5 = objArray1;
                str2 = str;
                objArray9 = objArray3;
                ok1 = null;
             }
             if (oi.l != null) {
                i7 = 0;
                objArray3 = new Object[i7];
                a.C().w("GLThread", "releasing EGL context because asked to tid="+this.getId(), objArray3);
                this.h();
                this.g();
                oi.l = i7;
                i4 = 1;
             }
             if (ok != null) {
                this.h();
                this.g();
                uoa = null;
             }else {
                uoa = ok;
             }
             if (ok1 != null && oi.k != null) {
                objArray3 = new Object[0];
                a.C().w("GLThread", "releasing EGL surface because paused tid="+this.getId(), objArray3);
                this.h();
             }
             if (ok1 != null && oi.j != null) {
                liveGLTextur = oi.v.get();
                LiveGLTextureView$l ol = (liveGLTextur != null && liveGLTextur.l != null)? 1: null;
                if (!ol || LiveGLTextureView.p.d()) {
                   this.g();
                   objArray3 = new Object[0];
                   a.C().w("GLThread", "releasing EGL context because paused tid="+this.getId(), objArray3);
                }
             }
          label_016c :
             if (ok1 != null && LiveGLTextureView.p.e()) {
                oi.u.d();
                objArray3 = new Object[0];
                a.C().w("GLThread", "terminating EGL because paused tid="+this.getId(), objArray3);
             }
             if (oi.g == null && oi.i == null) {
                objArray3 = new Object[0];
                a.C().w("GLThread", "noticed surfaceView surface lost tid="+this.getId(), objArray3);
                if (oi.k != null) {
                   this.h();
                }
                oi.i = true;
                oi.h = false;
                LiveGLTextureView.p.notifyAll();
             }
             if (oi.g != null && oi.i != null) {
                i7 = 0;
                objArray3 = new Object[i7];
                a.C().w("GLThread", "noticed surfaceView surface acquired tid="+this.getId(), objArray3);
                oi.i = i7;
                LiveGLTextureView.p.notifyAll();
             }
             if (i3) {
                objArray3 = new Object[0];
                a.C().w("GLThread", "sending render notification tid="+this.getId(), objArray3);
                oi.r = true;
                LiveGLTextureView.p.notifyAll();
                i3 = 0;
                i5 = 0;
             }
             if (this.d()) {
                if (oi.j == null) {
                   if (i4) {
                      str = str2;
                      i4 = 0;
                   }else if(LiveGLTextureView.p.g(oi)){
                      try{
                         oi.u.g();
                      label_0251 :
                         b1 = true;
                         oi.j = b1;
                         LiveGLTextureView.p.notifyAll();
                         str = 1;
                      }catch(java.lang.RuntimeException e0){
                         LiveGLTextureView.p.c(oi);
                         if (oi.v.get() != null && oi.v.get().m != null) {
                            oi.v.get().m.a(e0);
                            goto label_0251 ;
                         }else {
                            goto label_0251 ;
                         }
                      }
                   }else {
                   label_0284 :
                      str = str2;
                   }
                }else {
                   goto label_0284 ;
                }
                if (oi.j != null && oi.k == null) {
                   oi.k = true;
                   objArray3 = 1;
                   i = 1;
                   objArray4 = 1;
                }else {
                   objArray3 = objArray9;
                }
                if (oi.k != null) {
                   if (oi.t != null) {
                      Object[] objArray10 = new Object[0];
                      a.C().w("GLThread", "noticing that we want render notification tid="+this.getId(), objArray10);
                      oi.t = false;
                      i1 = oi.n;
                      i2 = oi.o;
                      b1 = false;
                      objArray3 = 1;
                      objArray4 = 1;
                      i5 = 1;
                   }else {
                      b1 = false;
                   }
                   oi.q = b1;
                   LiveGLTextureView.p.notifyAll();
                   ok = uoa;
                }else {
                   objArray1 = null;
                }
             }else {
                str = str2;
                objArray3 = objArray9;
             }
             LiveGLTextureView.p.wait();
             ok = uoa;
             objArray1 = objArray5;
             b = 0;
          }
          _monitor_exit(p);
          if (objArray2) {
             objArray2.run();
             objArray1 = objArray5;
             b = 0;
             objArray2 = 0;
             goto label_0028 ;
          }else if(objArray3 != null){
             ok1 = ok;
             Object[] objArray6 = new Object[0];
             a.C().A("GLThread", "egl createSurface", objArray6);
             if (!oi.u.b()) {
                p1 = LiveGLTextureView.p;
                _monitor_enter(p1);
                oi.h = true;
                p1.notifyAll();
                _monitor_exit(p1);
                ok = ok1;
                objArray1 = objArray5;
             label_030b :
                b = 0;
                LiveGLTextureView$k ok2 = null;
                goto label_0028 ;
             }else {
                objArray3 = null;
             }
          }else {
             ok1 = ok;
          }
          if (i) {
             gL = oi.u.a();
             LiveGLTextureView.p.a(gL);
             i = 0;
          }else {
             gL = objArray5;
          }
          if (str != null) {
             Object[] objArray7 = new Object[0];
             a.C().A("GLThread", "onSurfaceCreated", objArray7);
             liveGLTextur = oi.v.get();
             if (liveGLTextur != null) {
                liveGLTextur.d.onSurfaceCreated(gL, oi.u.e);
                oi.m = true;
             }
             str = null;
          }
          if (oi.m != null && oi.g == null) {
             str1 = str;
             objArray8 = new Object[0];
             a.C().A("GLThread", "onSurfaceDestroyed", objArray8);
             liveGLTextur = oi.v.get();
             if (liveGLTextur != null) {
                liveGLTextur = liveGLTextur.d;
                if (liveGLTextur != null) {
                   liveGLTextur.a(gL);
                   oi.m = false;
                }
             }
          }else {
             str1 = str;
          }
          if (objArray4 != null) {
             objArray4 = new Object[0];
             a.C().A("GLThread", "onSurfaceChanged\("+i1+", "+i2+"\)", objArray4);
             liveGLTextur = oi.v.get();
             if (liveGLTextur != null) {
                liveGLTextur.d.onSurfaceChanged(gL, i1, i2);
             }
             objArray4 = null;
          }
          liveGLTextur = oi.v.get();
          if (oi.b != null) {
             if (oi.c == null && liveGLTextur != null) {
                liveGLTextur.d.onDrawFrame(gL);
             }
          }else if(liveGLTextur != null){
             liveGLTextur.d.onDrawFrame(gL);
          }
          int i6 = oi.u.h();
          if (i6 != 0x3000) {
             if (i6 != 0x300e) {
                LiveGLTextureView$i.f("GLThread", "eglSwapBuffers", i6);
                p1 = LiveGLTextureView.p;
                _monitor_enter(p1);
                oi.h = true;
                p1.notifyAll();
                _monitor_exit(p1);
             }else {
                gL1 = gL;
                objArray8 = new Object[0];
                a.C().w("GLThread", "egl context lost tid="+this.getId(), objArray8);
                ok = 1;
             label_0427 :
                if (i5) {
                   i3 = 1;
                }
                gL = gL1;
                str = str1;
                goto label_030b ;
             }
          }
          gL1 = gL;
          ok = ok1;
          goto label_0427 ;
       }
       if (oi.m != null) {
          this.a();
          objArray3 = new Object[b];
          a.C().A("GLThread", "onSurfaceDestroyed", objArray3);
          liveGLTextur = oi.v.get();
          if (liveGLTextur != null) {
             liveGLTextur = liveGLTextur.d;
             if (liveGLTextur != null) {
                liveGLTextur.a(objArray1);
                oi.m = b;
             }
          }
       }
       _monitor_exit(p);
       p1 = LiveGLTextureView.p;
       _monitor_enter(p1);
       this.h();
       this.g();
       _monitor_exit(p1);
       return;
    }
    public final boolean d(){
       boolean b = true;
       if (this.f != null || (this.g == null || (this.h != null || (this.n <= null || (this.o <= null || (this.q == null && this.p != b)))))) {
          b = false;
       }
       return b;
    }
    public void e(){
       if (PatchProxy.applyVoid(null, this, LiveGLTextureView$k.class, "14")) {
          return;
       }
       LiveGLTextureView$l p = LiveGLTextureView.p;
       _monitor_enter(p);
       this.s.clear();
       this.c = true;
       p.notifyAll();
       while (this.d == null) {
          try{
             LiveGLTextureView.p.wait(4000);
          }catch(java.lang.Exception e0){
             Thread.currentThread().interrupt();
          }
       }
       _monitor_exit(e0);
       return;
    }
    public void f(int p0){
       if (PatchProxy.isSupport(LiveGLTextureView$k.class) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, LiveGLTextureView$k.class, "7")) {
          return;
       }
       if (p0 < 0 || p0 > 1) {
          throw new IllegalArgumentException("renderMode");
       }
       LiveGLTextureView$l p = LiveGLTextureView.p;
       _monitor_enter(p);
       this.p = p0;
       p.notifyAll();
       _monitor_exit(p);
       return;
    }
    public final void g(){
       if (PatchProxy.applyVoid(null, this, LiveGLTextureView$k.class, "4")) {
          return;
       }
       if (this.j != null) {
          this.u.d();
          this.j = false;
          LiveGLTextureView.p.c(this);
       }
       return;
    }
    public final void h(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, LiveGLTextureView$k.class, "3")) {
          return;
       }
       if (this.k != null) {
          boolean b = false;
          this.k = b;
          LiveGLTextureView$k tu = this.u;
          Objects.requireNonNull(tu);
          if (!PatchProxy.applyVoid(objArray, tu, LiveGLTextureView$i.class, "5")) {
             Object[] objArray1 = new Object[b];
             a.C().A("EglHelper", "destroySurface\(\)  tid="+Thread.currentThread().getId(), objArray1);
             tu.c();
          }
       }
       return;
    }
    public void run(){
       if (PatchProxy.applyVoid(null, this, LiveGLTextureView$k.class, "1")) {
          return;
       }
       this.setName("LGLThread "+this.getId());
       a uoa = a.C();
       String str = "starting tid="+this.getId();
       Object[] objArray = new Object[0];
       try{
          uoa.w("LGLThread", str, objArray);
          this.c();
          LiveGLTextureView.p.f(this);
          return;
       }catch(java.lang.InterruptedException e0){
       }
    }
}
