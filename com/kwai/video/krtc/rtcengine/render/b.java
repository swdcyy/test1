package com.kwai.video.krtc.rtcengine.render.b;
import com.kwai.video.krtc.rtcengine.render.RtcEngineRenderer;
import java.lang.Object;
import com.kwai.video.krtc.rtcengine.render.b$a;
import com.kwai.video.krtc.rtcengine.render.b$1;
import com.kwai.video.krtc.rtcengine.render.b$b;
import java.lang.StringBuilder;
import java.lang.String;
import com.kwai.video.krtc.utils.Log;
import com.kwai.video.krtc.GL.EglBase;
import com.kwai.video.krtc.render.GLDrawer;
import com.kwai.video.krtc.rtcengine.RtcEngineVideoFrame;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.util.concurrent.CountDownLatch;
import com.kwai.video.krtc.rtcengine.render.b$3;
import java.lang.Runnable;
import android.os.Handler;
import com.kwai.video.krtc.utils.e;
import android.os.Looper;
import java.lang.Float;
import android.opengl.GLES20;
import java.lang.Integer;
import android.view.Surface;
import com.kwai.video.krtc.GL.EglBase$Context;
import android.os.HandlerThread;
import com.kwai.video.krtc.rtcengine.RtcEngineGesture;
import java.lang.Boolean;
import com.kwai.video.krtc.rtcengine.render.b$5;
import com.kwai.video.krtc.rtcengine.render.b$4;
import com.kwai.video.krtc.rtcengine.render.b$6;
import com.kwai.video.krtc.GL.TextureBuffer;
import com.kwai.video.krtc.render.GLDrawer$GLDrawerFrame;
import com.kwai.video.krtc.rtcengine.render.b$2;

public class b implements RtcEngineRenderer	// class@0008b6
{
    public float A;
    public float B;
    public float C;
    public int D;
    public int E;
    public int F;
    public boolean G;
    public final b$b H;
    public float a;
    public int b;
    public float c;
    public float d;
    public int f;
    public int g;
    public int h;
    public final Object i;
    public final Object j;
    public RtcEngineVideoFrame k;
    public b$a l;
    public b$a m;
    public RtcEngineVideoFrame n;
    public RtcEngineGesture o;
    public int p;
    public Handler q;
    public int r;
    public int s;
    public int t;
    public EglBase u;
    public GLDrawer v;
    public int w;
    public int x;
    public boolean y;
    public boolean z;
    public static final String e = "com.kwai.video.krtc.rtcengine.render.b";

    public void b(int p0,boolean p1){
       super();
       this.f = 0;
       this.g = 2;
       this.h = 1;
       this.i = new Object();
       this.j = new Object();
       this.k = null;
       this.l = new b$a(null);
       this.m = new b$a(null);
       this.n = null;
       this.o = null;
       this.y = true;
       this.z = false;
       this.A = 0x3f800000;
       this.B = 0;
       this.C = 0;
       this.D = 0;
       this.E = 0;
       this.F = 0;
       this.a = 2.00f;
       this.b = 3;
       this.c = 0x3f800000;
       this.d = 0x3f99999a;
       this.H = new b$b(this, null);
       Log.i(b.e, this+" RtcEngineTextureRender\("+p0+","+p1+"\)");
       this.p = p0;
       this.G = p1;
       this.r = 0;
       this.s = 0;
       this.t = 0;
    }
    public void b(boolean p0){
       super(1, p0);
    }
    public static EglBase a(b p0){
       return p0.u;
    }
    public static EglBase a(b p0,EglBase p1){
       p0.u = p1;
       return p1;
    }
    public static GLDrawer a(b p0,GLDrawer p1){
       p0.v = p1;
       return p1;
    }
    public static String b(){
       return b.e;
    }
    public static void b(b p0){
       p0.c();
    }
    public static GLDrawer c(b p0){
       return p0.v;
    }
    public static Object d(b p0){
       return p0.j;
    }
    public static RtcEngineVideoFrame e(b p0){
       return p0.k;
    }
    public static RtcEngineVideoFrame f(b p0){
       return p0.n;
    }
    public void a(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, b.class, "22")) {
          return;
       }
       String e = b.e;
       Log.i(e, this+" release\(\), frames received: "+this.r+", frames rendered: "+this.s+", frames dropped: "+this.t);
       CountDownLatch uCountDownLa = new CountDownLatch(1);
       b ti = this.i;
       _monitor_enter(ti);
       b tq = this.q;
       if (tq == null) {
          Log.d(e, this+"already released");
          _monitor_exit(ti);
          return;
       }else {
          tq.postAtFrontOfQueue(new b$3(this, uCountDownLa));
          _monitor_exit(ti);
          e.a(uCountDownLa);
          Log.d(e, this+" egl resource released done");
          b ti1 = this.i;
          _monitor_enter(ti1);
          ti = this.q;
          if (ti != null) {
             ti.getLooper().quit();
             this.q = objArray;
          }
          _monitor_exit(ti1);
          Log.d(e, this+" render thread exit done");
          ti = this.j;
          _monitor_enter(ti);
          ti1 = this.k;
          if (ti1 != null && ti1 != this.n) {
             ti1.release();
             this.k = objArray;
          }
          _monitor_exit(ti);
          Log.i(e, this+" release done\(\)");
          return;
       }
    }
    public final void a(float p0,float p1,float p2,float p3){
       if (PatchProxy.isSupport(b.class) && PatchProxy.applyVoidFourRefs(Float.valueOf(p0), Float.valueOf(p1), Float.valueOf(p2), Float.valueOf(p3), this, b.class, "29")) {
          return;
       }
       GLES20.glClearColor(p0, p1, p2, p3);
       GLES20.glClear(0x4000);
       return;
    }
    public final void a(int p0){
       b uob = b.class;
       if (PatchProxy.isSupport(uob) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, uob, "25")) {
          return;
       }
       this.b(p0);
       if (!p0) {
          p0 = 10;
       }
       this.b(p0);
       return;
    }
    public void a(int p0,int p1){
       b uob = b.class;
       if (PatchProxy.isSupport(uob) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), Integer.valueOf(p1), this, uob, "5")) {
          return;
       }
       Log.i(b.e, this+" setViewPort\("+p0+","+p1+"\)");
       uob = this.j;
       _monitor_enter(uob);
       this.w = p0;
       this.x = p1;
       _monitor_exit(uob);
       return;
    }
    public void a(Surface p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, b.class, "2")) {
          return;
       }
       this.a(p0);
       return;
    }
    public void a(EglBase$Context p0,int[] p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, b.class, "1")) {
          return;
       }
       b ti = this.i;
       _monitor_enter(ti);
       HandlerThread handlerThrea = new HandlerThread("AryaVideoRender");
       handlerThrea.start();
       Handler handler = new Handler(handlerThrea.getLooper());
       this.q = handler;
       e.a(handler, new b$1(this, p0, p1));
       Log.i(b.e, this+" egl object ready done");
       this.q.post(this.H);
       _monitor_exit(ti);
       return;
    }
    public final void a(RtcEngineVideoFrame p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, b.class, "28")) {
          return;
       }
       b to = this.o;
       if (to != null) {
          RtcEngineVideoFrame width = p0.width;
          if (this.E != width || this.F != p0.height) {
             to.b(width, p0.height);
             this.E = p0.width;
             this.F = p0.height;
          }
       }
       return;
    }
    public void a(RtcEngineVideoFrame p0,boolean p1){
       b uob = b.class;
       if (PatchProxy.isSupport(uob) && PatchProxy.applyVoidTwoRefs(p0, Boolean.valueOf(p1), this, uob, "24")) {
          return;
       }
       this.r = this.r + 1;
       uob = this.i;
       _monitor_enter(uob);
       if (this.q == null) {
          if (p0 != null) {
             p0.release();
          }
          _monitor_exit(uob);
          return;
       }else {
          b tj = this.j;
          _monitor_enter(tj);
          b tk = this.k;
          int i = (tk != null)? 1: 0;
          if (i && p0 != tk) {
             tk.release();
          }
          this.k = p0;
          if (p1) {
             this.q.post(new b$5(this));
          }else {
             this.c();
          }
          _monitor_exit(tj);
          if (i) {
             this.t = this.t + 1;
          }
          _monitor_exit(uob);
          return;
       }
    }
    public final void a(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, b.class, "3")) {
          return;
       }
       this.H.a(p0);
       this.b(this.H);
       return;
    }
    public void a(Runnable p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, b.class, "23")) {
          return;
       }
       Log.i(b.e, this+" releaseEglSurface\(\)");
       this.H.a(null);
       b ti = this.i;
       _monitor_enter(ti);
       b tq = this.q;
       if (tq != null) {
          tq.removeCallbacks(this.H);
          this.q.postAtFrontOfQueue(new b$4(this, p0));
       }else {
          p0.run();
       }
       _monitor_exit(ti);
       return;
    }
    public final void b(int p0){
       b uob = b.class;
       if (PatchProxy.isSupport(uob) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, uob, "27")) {
          return;
       }
       uob = this.i;
       _monitor_enter(uob);
       b tq = this.q;
       if (tq != null) {
          tq.postDelayed(new b$6(this, p0), (long)p0);
       }
       _monitor_exit(uob);
       return;
    }
    public void b(Surface p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, b.class, "4")) {
          return;
       }
       Log.i(b.e, this+" setSurface\(surface\)");
       this.a(p0);
       return;
    }
    public final void b(Runnable p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, b.class, "30")) {
          return;
       }
       b ti = this.i;
       _monitor_enter(ti);
       b tq = this.q;
       if (tq != null) {
          tq.post(p0);
       }
       _monitor_exit(ti);
       return;
    }
    public final void c(){
       boolean b;
       b u;
       b uob;
       b uob1;
       b uob2;
       GLDrawer$GLDrawerFrame gLDrawerFram;
       RtcEngineVideoFrame rtcEngineVid = this;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, rtcEngineVid, b.class, "21")) {
          return;
       }
       b j = rtcEngineVid.j;
       _monitor_enter(j);
       b = false;
       if (rtcEngineVid.z != null) {
          this.d();
          u = rtcEngineVid.u;
          if (u != null && u.hasSurface()) {
             u = rtcEngineVid.m;
             rtcEngineVid.a(u.a, u.b, u.c, u.d);
             rtcEngineVid.u.swapBuffers();
          }
          rtcEngineVid.z = b;
          _monitor_exit(j);
          return;
       }else {
          u = rtcEngineVid.k;
          if (u == null) {
             _monitor_exit(j);
             return;
          }else if(rtcEngineVid.G != null && u != rtcEngineVid.n){
             this.d();
             rtcEngineVid.n = u;
          }
          rtcEngineVid.k = objArray;
          b w = rtcEngineVid.w;
          b x = rtcEngineVid.x;
          b b1 = rtcEngineVid.B;
          b c = rtcEngineVid.C;
          b a = rtcEngineVid.A;
          b l = rtcEngineVid.l;
          _monitor_exit(j);
          RtcEngineVideoFrame rtcEngineVid1 = 1;
          if (rtcEngineVid.v != null) {
             j = rtcEngineVid.u;
             if (j != null && j.hasSurface()) {
                rtcEngineVid.a(l.a, l.b, l.c, l.d);
                GLES20.glClear(0x4000);
                j = rtcEngineVid.g;
                if (j == rtcEngineVid1) {
                   b = 1;
                }
                boolean b2 = (j == null && u.isFrontCamera != null)? true: b;
                if (u.isTexture != null) {
                   u.textureBuffer.waitSyncInGpu();
                   uob = a;
                   uob1 = c;
                   uob2 = b1;
                   gLDrawerFram = new GLDrawer$GLDrawerFrame(u.textureType, u.textureId, u.transformMatrix, u.rotation, u.width, u.height, null, 0, w, x, false, b2);
                }else {
                   uob = a;
                   uob1 = c;
                   uob2 = b1;
                   gLDrawerFram = new GLDrawer$GLDrawerFrame(u.format, u.colorSpace, u.planes, u.strides, u.transformMatrix, u.rotation, u.width, u.height, 0, 0, w, x, false, b2);
                }
                j.scaleMode = rtcEngineVid.f;
                j.shaderType = rtcEngineVid.p;
                j.translateX = uob2;
                j.translateY = uob1;
                j.scaleFactor = uob;
                j.hqType = rtcEngineVid.h;
                j.hqThreshold = rtcEngineVid.a;
                j.blurSize = rtcEngineVid.b;
                j.blurSigma = rtcEngineVid.c;
                j.regressAlpha = rtcEngineVid.d;
                rtcEngineVid.v.draw(j);
                rtcEngineVid.u.swapBuffers();
                rtcEngineVid.a(u);
                rtcEngineVid.s = rtcEngineVid.s + 1;
                if (rtcEngineVid.G == null) {
                   u.release();
                }
                return;
             }
          }
          w = rtcEngineVid.j;
          _monitor_enter(w);
          if (rtcEngineVid.G == null || u != rtcEngineVid.n) {
             u.release();
          }
          _monitor_exit(w);
          rtcEngineVid.t = rtcEngineVid.t + 1;
          return;
       }
    }
    public void clear(){
       if (PatchProxy.applyVoid(null, this, b.class, "19")) {
          return;
       }
       this.clear(0, 0, 0, 0x3f800000);
       return;
    }
    public void clear(float p0,float p1,float p2,float p3){
       if (PatchProxy.isSupport(b.class) && PatchProxy.applyVoidFourRefs(Float.valueOf(p0), Float.valueOf(p1), Float.valueOf(p2), Float.valueOf(p3), this, b.class, "18")) {
          return;
       }
       Log.i(b.e, this+" clear\("+p0+","+p1+","+p2+","+p3+"\)");
       b ti = this.i;
       _monitor_enter(ti);
       b tj = this.j;
       _monitor_enter(tj);
       b tk = this.k;
       if (tk != null && this.n != tk) {
          tk.release();
       }
       this.k = null;
       this.d();
       tk = this.q;
       if (tk != null) {
          b tm = this.m;
          tm.a = p0;
          tm.b = p1;
          tm.c = p2;
          tm.d = p3;
          this.z = true;
       }
       _monitor_exit(tj);
       if (tk != null) {
          tk.post(new b$2(this));
       }
       _monitor_exit(ti);
       return;
    }
    public final void d(){
       if (PatchProxy.applyVoid(null, this, b.class, "26")) {
          return;
       }
       b tn = this.n;
       if (tn != null) {
          tn.release();
          this.n = null;
       }
       return;
    }
    public void finalize(){
       if (PatchProxy.applyVoid(null, this, b.class, "20")) {
          return;
       }
       Log.i(b.e, this+" finalize\(\)");
       b tj = this.j;
       _monitor_enter(tj);
       this.d();
       _monitor_exit(tj);
       super.finalize();
       return;
    }
    public void renderFrame(RtcEngineVideoFrame p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, b.class, "13")) {
          return;
       }
       this.a(p0, true);
       return;
    }
    public void renderLastFrame(){
       if (PatchProxy.applyVoid(null, this, b.class, "12")) {
          return;
       }
       b tj = this.j;
       _monitor_enter(tj);
       b tD = this.D;
       _monitor_exit(tj);
       if (this.y != null) {
          this.a(tD);
       }
       return;
    }
    public void setBackColor(float p0,float p1,float p2,float p3){
       if (PatchProxy.isSupport(b.class) && PatchProxy.applyVoidFourRefs(Float.valueOf(p0), Float.valueOf(p1), Float.valueOf(p2), Float.valueOf(p3), this, b.class, "17")) {
          return;
       }
       Log.i(b.e, this+" setBackColor\("+p0+","+p1+","+p2+","+p3+"\)");
       b tj = this.j;
       _monitor_enter(tj);
       b$a uoa = new b$a(null);
       uoa.a = p0;
       uoa.b = p1;
       uoa.c = p2;
       uoa.d = p3;
       this.l = uoa;
       _monitor_exit(tj);
       return;
    }
    public void setGesture(RtcEngineGesture p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, b.class, "14")) {
          return;
       }
       Log.i(b.e, this+" setGesture\("+p0+"\)");
       this.o = p0;
       return;
    }
    public void setRedrawInfo(boolean p0,int p1){
       b uob = b.class;
       if (PatchProxy.isSupport(uob) && PatchProxy.applyVoidTwoRefs(Boolean.valueOf(p0), Integer.valueOf(p1), this, uob, "16")) {
          return;
       }
       Log.i(b.e, this+" setRedrawInfo\("+p0+","+p1+"\)");
       uob = this.j;
       _monitor_enter(uob);
       this.y = p0;
       this.D = p1;
       _monitor_exit(uob);
       return;
    }
    public void setRenderMirrorMode(int p0){
       b uob = b.class;
       if (PatchProxy.isSupport(uob) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, uob, "11")) {
          return;
       }
       Log.i(b.e, this+" setRenderMirrorMode\("+p0+"\)");
       this.g = p0;
       return;
    }
    public void setRenderQuality(int p0){
       b uob = b.class;
       if (PatchProxy.isSupport(uob) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, uob, "6")) {
          return;
       }
       Log.i(b.e, this+" setRenderQuality\("+p0+"\)");
       this.p = p0;
       return;
    }
    public void setRenderScaleMode(int p0){
       b uob = b.class;
       if (PatchProxy.isSupport(uob) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, uob, "10")) {
          return;
       }
       Log.i(b.e, this+" setRenderScaleMode\("+p0+"\)");
       this.f = p0;
       return;
    }
    public void setTranslateXY(float p0,float p1,float p2){
       if (PatchProxy.isSupport(b.class) && PatchProxy.applyVoidThreeRefs(Float.valueOf(p0), Float.valueOf(p1), Float.valueOf(p2), this, b.class, "15")) {
          return;
       }
       b tj = this.j;
       _monitor_enter(tj);
       int i = (!this.B - p0 && (this.C - p1 || this.A - p2))? 1: 0;
       this.B = p0;
       this.C = p1;
       this.A = p2;
       _monitor_exit(tj);
       if (this.G != null && i) {
          this.a(0);
       }
       return;
    }
    public void setVideoRenderAgedSrParams(int p0,float p1,float p2){
       if (PatchProxy.isSupport(b.class) && PatchProxy.applyVoidThreeRefs(Integer.valueOf(p0), Float.valueOf(p1), Float.valueOf(p2), this, b.class, "9")) {
          return;
       }
       Log.i(b.e, this+" setVideoRenderAgedSrParams\("+p0+","+p1+","+p2+"\)");
       this.b = p0;
       this.c = p1;
       this.d = p2;
       return;
    }
    public void setVideoRenderHighQType(int p0){
       b uob = b.class;
       if (PatchProxy.isSupport(uob) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, uob, "7")) {
          return;
       }
       Log.i(b.e, this+" setVideoRenderHighQType\("+p0+"\)");
       this.h = p0;
       return;
    }
    public void setVideoRenderHighQType(int p0,float p1){
       b uob = b.class;
       if (PatchProxy.isSupport(uob) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), Float.valueOf(p1), this, uob, "8")) {
          return;
       }
       Log.i(b.e, this+" setVideoRenderHighQType\("+p0+","+p1+"\)");
       this.a = p1;
       this.h = p0;
       return;
    }
}
