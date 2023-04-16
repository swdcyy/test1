package com.kwai.video.krtc.rtcengine.render.a;
import android.opengl.GLSurfaceView$Renderer;
import com.kwai.video.krtc.rtcengine.render.RtcEngineRenderer;
import java.lang.String;
import java.lang.Class;
import java.lang.Object;
import com.kwai.video.krtc.rtcengine.render.a$a;
import com.kwai.video.krtc.rtcengine.render.a$1;
import java.lang.StringBuilder;
import com.kwai.video.krtc.utils.Log;
import com.kwai.video.krtc.rtcengine.RtcEngineVideoFrame;
import com.kwai.robust.PatchProxy;
import android.os.Looper;
import android.os.Handler;
import com.kwai.video.krtc.render.GLDrawer;
import java.lang.Float;
import android.opengl.GLES20;
import java.lang.Integer;
import android.opengl.GLSurfaceView;
import com.kwai.video.krtc.rtcengine.RtcEngineGesture;
import android.os.HandlerThread;
import java.lang.Runnable;
import javax.microedition.khronos.opengles.GL10;
import com.kwai.video.krtc.GL.TextureBuffer;
import com.kwai.video.krtc.render.GLDrawer$GLDrawerFrame;
import javax.microedition.khronos.egl.EGLConfig;
import java.lang.Boolean;

public class a implements GLSurfaceView$Renderer, RtcEngineRenderer	// class@0008ad
{
    public boolean A;
    public boolean B;
    public float C;
    public float D;
    public float E;
    public int F;
    public boolean G;
    public float a;
    public int b;
    public float c;
    public float d;
    public int f;
    public int g;
    public int h;
    public RtcEngineVideoFrame i;
    public final Object j;
    public final Object k;
    public a$a l;
    public a$a m;
    public RtcEngineVideoFrame n;
    public RtcEngineGesture o;
    public int p;
    public Handler q;
    public GLSurfaceView r;
    public int s;
    public int t;
    public int u;
    public GLDrawer v;
    public int w;
    public int x;
    public int y;
    public int z;
    public static final String e;

    static {
       a.e = a.class.getName();
    }
    public void a(int p0,boolean p1){
       super();
       this.f = 0;
       this.g = 1;
       this.h = 0;
       this.i = null;
       this.j = new Object();
       this.k = new Object();
       this.l = new a$a(null);
       this.m = new a$a(null);
       this.n = null;
       this.o = null;
       this.r = null;
       this.s = 0;
       this.t = 0;
       this.u = 0;
       this.v = null;
       this.w = 0;
       this.x = 0;
       this.y = 0;
       this.z = 0;
       this.A = true;
       this.B = false;
       this.C = 0x3f800000;
       this.D = 0;
       this.E = 0;
       this.F = 0;
       this.a = 2.00f;
       this.b = 3;
       this.c = 0x3f800000;
       this.d = 0x3f99999a;
       Log.i(a.e, this+" RtcEngineSurfaceRender\("+p0+","+p1+"\)");
       this.p = p0;
       this.G = p1;
    }
    public void a(boolean p0){
       super(1, p0);
    }
    public static Object a(a p0){
       return p0.k;
    }
    public static RtcEngineVideoFrame b(a p0){
       return p0.i;
    }
    public static String b(){
       return a.e;
    }
    public static RtcEngineVideoFrame c(a p0){
       return p0.n;
    }
    public void a(){
       if (PatchProxy.applyVoid(null, this, a.class, "20")) {
          return;
       }
       Log.i(a.e, this+" release\(\), frames received: "+this.s+", frames rendered: "+this.t+", frames dropped: "+this.u);
       a tj = this.j;
       _monitor_enter(tj);
       a tq = this.q;
       if (tq != null) {
          tq.getLooper().quit();
          this.q = null;
       }
       _monitor_exit(tj);
       tj = this.v;
       if (tj != null) {
          tj.destroy();
          this.v = null;
       }
       tq = this.k;
       _monitor_enter(tq);
       tj = this.i;
       if (tj != null && this.n != tj) {
          tj.release();
          this.i = null;
       }
       _monitor_exit(tq);
       return;
    }
    public final void a(float p0,float p1,float p2,float p3){
       if (PatchProxy.isSupport(a.class) && PatchProxy.applyVoidFourRefs(Float.valueOf(p0), Float.valueOf(p1), Float.valueOf(p2), Float.valueOf(p3), this, a.class, "25")) {
          return;
       }
       GLES20.glClearColor(p0, p1, p2, p3);
       GLES20.glClear(0x4000);
       return;
    }
    public final void a(int p0){
       if (PatchProxy.isSupport(a.class) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, a.class, "21")) {
          return;
       }
       this.b(p0);
       if (!p0) {
          p0 = 10;
       }
       this.b(p0);
       return;
    }
    public void a(GLSurfaceView p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, a.class, "4")) {
          return;
       }
       Log.i(a.e, this+" setGLSurfaceView\(\)");
       this.r = p0;
       return;
    }
    public final void a(RtcEngineVideoFrame p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, a.class, "24")) {
          return;
       }
       a to = this.o;
       if (to != null) {
          RtcEngineVideoFrame width = p0.width;
          if (this.y != width || this.z != p0.height) {
             to.b(width, p0.height);
             this.y = p0.width;
             this.z = p0.height;
          }
       }
       return;
    }
    public final void b(int p0){
       if (PatchProxy.isSupport(a.class) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, a.class, "23")) {
          return;
       }
       a tj = this.j;
       _monitor_enter(tj);
       if (this.q == null) {
          HandlerThread handlerThrea = new HandlerThread("AryaVideoRender");
          handlerThrea.start();
          this.q = new Handler(handlerThrea.getLooper());
       }
       a tq = this.q;
       if (tq != null) {
          tq.postDelayed(new a$1(this, p0), (long)p0);
       }
       _monitor_exit(tj);
       return;
    }
    public final void c(){
       if (PatchProxy.applyVoid(null, this, a.class, "22")) {
          return;
       }
       a tn = this.n;
       if (tn != null) {
          tn.release();
          this.n = null;
       }
       return;
    }
    public void clear(){
       if (PatchProxy.applyVoid(null, this, a.class, "18")) {
          return;
       }
       this.clear(0, 0, 0, 0x3f800000);
       return;
    }
    public void clear(float p0,float p1,float p2,float p3){
       if (PatchProxy.isSupport(a.class) && PatchProxy.applyVoidFourRefs(Float.valueOf(p0), Float.valueOf(p1), Float.valueOf(p2), Float.valueOf(p3), this, a.class, "17")) {
          return;
       }
       Log.i(a.e, this+" clear\("+p0+","+p1+","+p2+","+p3+"\)");
       a tj = this.j;
       _monitor_enter(tj);
       a tk = this.k;
       _monitor_enter(tk);
       a ti = this.i;
       if (ti != null && this.n != ti) {
          ti.release();
       }
       this.i = null;
       this.c();
       ti = this.q;
       if (ti != null) {
          a tm = this.m;
          tm.a = p0;
          tm.b = p1;
          tm.c = p2;
          tm.d = p3;
          this.B = true;
       }
       _monitor_exit(tk);
       a tr = this.r;
       if (tr != null && ti != null) {
          tr.requestRender();
       }
       _monitor_exit(tj);
       return;
    }
    public void finalize(){
       if (PatchProxy.applyVoid(null, this, a.class, "19")) {
          return;
       }
       Log.i(a.e, this+" finalize\(\)");
       a tk = this.k;
       _monitor_enter(tk);
       this.c();
       _monitor_exit(tk);
       super.finalize();
       return;
    }
    public void onDrawFrame(GL10 p0){
       a m;
       a uoa;
       a uoa1;
       a uoa2;
       GLDrawer$GLDrawerFrame gLDrawerFram;
       RtcEngineVideoFrame rtcEngineVid = this;
       if (PatchProxy.applyVoidOneRefs(p0, rtcEngineVid, a.class, "3")) {
          return;
       }
       a k = rtcEngineVid.k;
       _monitor_enter(k);
       boolean b = false;
       if (rtcEngineVid.B != null) {
          this.c();
          m = rtcEngineVid.m;
          rtcEngineVid.a(m.a, m.b, m.c, m.d);
          rtcEngineVid.B = b;
          _monitor_exit(k);
          return;
       }else {
          m = rtcEngineVid.i;
          if (m == null) {
             _monitor_exit(k);
             return;
          }else if(rtcEngineVid.G != null && m != rtcEngineVid.n){
             this.c();
             rtcEngineVid.n = m;
          }
          rtcEngineVid.i = null;
          a w = rtcEngineVid.w;
          a x = rtcEngineVid.x;
          a d = rtcEngineVid.D;
          a e = rtcEngineVid.E;
          a c = rtcEngineVid.C;
          a l = rtcEngineVid.l;
          _monitor_exit(k);
          int i = 1;
          if (rtcEngineVid.v == null) {
             k = rtcEngineVid.k;
             _monitor_enter(k);
             if (rtcEngineVid.G == null || m != rtcEngineVid.n) {
                m.release();
             }
             _monitor_exit(k);
             rtcEngineVid.u = rtcEngineVid.u + i;
             return;
          }else {
             rtcEngineVid.a(l.a, l.b, l.c, l.d);
             k = rtcEngineVid.h;
             if (k == i) {
                b = 1;
             }
             boolean b1 = (k == null && m.isFrontCamera != null)? true: b;
             if (m.isTexture != null) {
                m.textureBuffer.waitSyncInGpu();
                uoa = c;
                uoa1 = e;
                uoa2 = d;
                gLDrawerFram = new GLDrawer$GLDrawerFrame(m.textureType, m.textureId, m.transformMatrix, m.rotation, m.width, m.height, 0, false, w, x, 0, b1);
             }else {
                uoa = c;
                uoa1 = e;
                uoa2 = d;
                gLDrawerFram = new GLDrawer$GLDrawerFrame(m.format, m.colorSpace, m.planes, m.strides, m.transformMatrix, m.rotation, m.width, m.height, 0, null, w, x, false, b1);
             }
             k.scaleMode = rtcEngineVid.f;
             k.shaderType = rtcEngineVid.p;
             k.translateX = uoa2;
             k.translateY = uoa1;
             k.scaleFactor = uoa;
             k.hqType = rtcEngineVid.g;
             k.hqThreshold = rtcEngineVid.a;
             k.blurSize = rtcEngineVid.b;
             k.blurSigma = rtcEngineVid.c;
             k.regressAlpha = rtcEngineVid.d;
             rtcEngineVid.v.draw(k);
             rtcEngineVid.a(m);
             rtcEngineVid.t = rtcEngineVid.t + 1;
             if (rtcEngineVid.G == null) {
                m.release();
             }
             return;
          }
       }
    }
    public void onSurfaceChanged(GL10 p0,int p1,int p2){
       if (PatchProxy.isSupport(a.class) && PatchProxy.applyVoidThreeRefs(p0, Integer.valueOf(p1), Integer.valueOf(p2), this, a.class, "2")) {
          return;
       }
       Log.i(a.e, this+" onSurfaceChanged\("+p1+","+p2+"\)");
       a tk = this.k;
       _monitor_enter(tk);
       this.w = p1;
       this.x = p2;
       _monitor_exit(tk);
       tk = this.o;
       if (tk != null) {
          tk.a(p1, p2);
       }
       if (this.G != null) {
          this.renderLastFrame();
       }
       return;
    }
    public void onSurfaceCreated(GL10 p0,EGLConfig p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, a.class, "1")) {
          return;
       }
       Log.i(a.e, this+" onSurfaceCreated\(\)");
       if (this.v == null) {
          this.v = new GLDrawer();
       }
       return;
    }
    public void renderFrame(RtcEngineVideoFrame p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, a.class, "12")) {
          return;
       }
       this.s = this.s + 1;
       a tk = this.k;
       _monitor_enter(tk);
       a ti = this.i;
       int i = (ti != null)? 1: 0;
       if (i && p0 != ti) {
          ti.release();
       }
       this.i = p0;
       a tr = this.r;
       if (tr != null) {
          tr.requestRender();
       }
       _monitor_exit(tk);
       if (i) {
          this.u = this.u + 1;
       }
       return;
    }
    public void renderLastFrame(){
       if (PatchProxy.applyVoid(null, this, a.class, "11")) {
          return;
       }
       a tk = this.k;
       _monitor_enter(tk);
       a tF = this.F;
       _monitor_exit(tk);
       if (this.A != null) {
          this.a(tF);
       }
       return;
    }
    public void setBackColor(float p0,float p1,float p2,float p3){
       if (PatchProxy.isSupport(a.class) && PatchProxy.applyVoidFourRefs(Float.valueOf(p0), Float.valueOf(p1), Float.valueOf(p2), Float.valueOf(p3), this, a.class, "16")) {
          return;
       }
       Log.i(a.e, this+" setBackColor\("+p0+","+p1+","+p2+","+p3+"\)");
       a tk = this.k;
       _monitor_enter(tk);
       a$a uoa = new a$a(null);
       uoa.a = p0;
       uoa.b = p1;
       uoa.c = p2;
       uoa.d = p3;
       this.l = uoa;
       _monitor_exit(tk);
       return;
    }
    public void setGesture(RtcEngineGesture p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, a.class, "13")) {
          return;
       }
       Log.i(a.e, this+" setGesture\("+p0+"\)");
       this.o = p0;
       if (p0 != null) {
          p0.a(this.w, this.x);
       }
       return;
    }
    public void setRedrawInfo(boolean p0,int p1){
       if (PatchProxy.isSupport(a.class) && PatchProxy.applyVoidTwoRefs(Boolean.valueOf(p0), Integer.valueOf(p1), this, a.class, "15")) {
          return;
       }
       Log.i(a.e, this+" setRedrawInfo\("+p0+","+p1+"\)");
       a tk = this.k;
       _monitor_enter(tk);
       this.A = p0;
       this.F = p1;
       _monitor_exit(tk);
       return;
    }
    public void setRenderMirrorMode(int p0){
       if (PatchProxy.isSupport(a.class) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, a.class, "10")) {
          return;
       }
       Log.i(a.e, this+" setRenderMirrorMode\("+p0+"\)");
       this.h = p0;
       return;
    }
    public void setRenderQuality(int p0){
       if (PatchProxy.isSupport(a.class) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, a.class, "5")) {
          return;
       }
       Log.i(a.e, this+" setRenderQuality\("+p0+"\)");
       this.p = p0;
       return;
    }
    public void setRenderScaleMode(int p0){
       if (PatchProxy.isSupport(a.class) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, a.class, "9")) {
          return;
       }
       Log.i(a.e, this+" setRenderScaleMode\("+p0+"\)");
       this.f = p0;
       return;
    }
    public void setTranslateXY(float p0,float p1,float p2){
       if (PatchProxy.isSupport(a.class) && PatchProxy.applyVoidThreeRefs(Float.valueOf(p0), Float.valueOf(p1), Float.valueOf(p2), this, a.class, "14")) {
          return;
       }
       a tk = this.k;
       _monitor_enter(tk);
       int i = (!this.D - p0 && (this.E - p1 || this.C - p2))? 1: 0;
       this.D = p0;
       this.E = p1;
       this.C = p2;
       _monitor_exit(tk);
       if (this.G != null && i) {
          this.a(0);
       }
       return;
    }
    public void setVideoRenderAgedSrParams(int p0,float p1,float p2){
       if (PatchProxy.isSupport(a.class) && PatchProxy.applyVoidThreeRefs(Integer.valueOf(p0), Float.valueOf(p1), Float.valueOf(p2), this, a.class, "8")) {
          return;
       }
       Log.i(a.e, this+" setVideoRenderAgedSrParams\("+p0+","+p1+","+p2+"\)");
       this.b = p0;
       this.c = p1;
       this.d = p2;
       return;
    }
    public void setVideoRenderHighQType(int p0){
       if (PatchProxy.isSupport(a.class) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, a.class, "6")) {
          return;
       }
       Log.i(a.e, this+" setVideoRenderHighQType\("+p0+"\)");
       this.g = p0;
       return;
    }
    public void setVideoRenderHighQType(int p0,float p1){
       if (PatchProxy.isSupport(a.class) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), Float.valueOf(p1), this, a.class, "7")) {
          return;
       }
       Log.i(a.e, this+" setVideoRenderHighQType\("+p0+","+p1+"\)");
       this.a = p1;
       this.g = p0;
       return;
    }
}
