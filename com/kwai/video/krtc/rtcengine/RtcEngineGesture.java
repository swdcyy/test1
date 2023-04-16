package com.kwai.video.krtc.rtcengine.RtcEngineGesture;
import android.content.Context;
import com.kwai.video.krtc.rtcengine.render.RtcEngineRenderView;
import java.lang.Object;
import com.kwai.video.krtc.rtcengine.RtcEngineGesture$1;
import com.kwai.video.krtc.rtcengine.RtcEngineGesture$2;
import java.lang.StringBuilder;
import java.lang.String;
import com.kwai.video.krtc.utils.Log;
import android.view.ScaleGestureDetector;
import android.view.ScaleGestureDetector$OnScaleGestureListener;
import android.view.GestureDetector;
import android.view.GestureDetector$OnGestureListener;
import com.kwai.video.krtc.rtcengine.RtcEngineGesture$Config;
import com.kwai.video.krtc.rtcengine.RtcEngineGesture$Listener;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Float;
import java.lang.Integer;
import android.view.MotionEvent;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import java.lang.Math;

public class RtcEngineGesture	// class@000843
{
    public int b;
    public ScaleGestureDetector c;
    public boolean d;
    public boolean e;
    public RtcEngineRenderView f;
    public GestureDetector g;
    public RtcEngineGesture$Listener h;
    public boolean i;
    public boolean j;
    public boolean k;
    public boolean l;
    public float m;
    public float n;
    public float o;
    public int p;
    public int q;
    public int r;
    public int s;
    public RtcEngineGesture$Config t;
    public ScaleGestureDetector$OnScaleGestureListener u;
    public GestureDetector$OnGestureListener v;
    public static final String a = "com.kwai.video.krtc.rtcengine.RtcEngineGesture";

    public void RtcEngineGesture(Context p0,RtcEngineRenderView p1){
       super();
       this.b = 0;
       this.c = null;
       this.d = true;
       this.e = true;
       this.f = null;
       this.g = null;
       this.h = null;
       this.i = false;
       this.j = false;
       this.k = false;
       this.l = false;
       this.m = 0x3f800000;
       this.n = 0;
       this.o = 0;
       this.p = 0;
       this.q = 0;
       this.r = 0;
       this.s = 0;
       this.t = null;
       this.u = new RtcEngineGesture$1(this);
       this.v = new RtcEngineGesture$2(this);
       Log.i(RtcEngineGesture.a, this+" RtcEngineGesture\("+p0+","+p1+"\)");
       this.f = p1;
       this.c = new ScaleGestureDetector(p0, this.u);
       this.g = new GestureDetector(p0, this.v);
    }
    public static float a(RtcEngineGesture p0){
       return p0.m;
    }
    public static float a(RtcEngineGesture p0,float p1){
       p0.m = p1;
       return p1;
    }
    public static void a(RtcEngineGesture p0,float p1,float p2){
       p0.a(p1, p2);
    }
    public static RtcEngineGesture$Config b(RtcEngineGesture p0){
       return p0.t;
    }
    public static float c(RtcEngineGesture p0){
       return p0.n;
    }
    public static float d(RtcEngineGesture p0){
       return p0.o;
    }
    public static int e(RtcEngineGesture p0){
       return p0.p;
    }
    public static int f(RtcEngineGesture p0){
       return p0.q;
    }
    public static RtcEngineGesture$Listener g(RtcEngineGesture p0){
       return p0.h;
    }
    public static void h(RtcEngineGesture p0){
       p0.b();
    }
    public void a(){
       this.f = null;
       this.g = null;
       this.c = null;
    }
    public final void a(float p0,float p1){
       float f4;
       float f5;
       float f6;
       float f7;
       float f8;
       float f9;
       float f10;
       RtcEngineGesture rtcEngineGes = this;
       RtcEngineGesture p = rtcEngineGes.p;
       RtcEngineGesture q = rtcEngineGes.q;
       RtcEngineGesture r = rtcEngineGes.r;
       RtcEngineGesture s = rtcEngineGes.s;
       if (r <= null || (s <= null || (p > null && q > null))) {
          float f = 0x3f800000;
          float f1 = ((float)(r * q) * f) / (float)(s * p);
          s = rtcEngineGes.b;
          RtcEngineGesture m = rtcEngineGes.m;
          boolean b = true;
          float f2 = 0;
          float f3 = 0xbf800000;
          if (rtcEngineGes.d != null) {
             f4 = (float)p;
             if (s == null) {
                if (f1 - f >= 0) {
                label_0038 :
                   f5 = f4 * f1;
                   f6 = f1 * f3;
                   f7 = f1 * f;
                label_0044 :
                   f5 = f5 * m;
                   if ((int)f5 > p) {
                      if (((p0 + f6) * m) - f3 > 0) {
                         f8 = (f3 / m) - f6;
                      }else if(((p0 + f7) * m) - f < 0){
                         f8 = (f / m) - f7;
                      }else {
                         f8 = p0;
                      }
                      f5 = ((f5 - f4) / f4) / m;
                   }else {
                      f8 = 0;
                      f5 = 0;
                   }
                   boolean b1 = (f8 - f5 >= 0)? true: false;
                   rtcEngineGes.i = b1;
                   b1 = (f8 - (- f5) <= 0)? true: false;
                   rtcEngineGes.j = b1;
                }
             }else if(f1 - f < 0){
                goto label_0038 ;
             }
             f5 = f4;
             f6 = 0xbf800000;
             f7 = 0x3f800000;
             goto label_0044 ;
          }else {
             f8 = p0;
          }
          if (rtcEngineGes.e != null) {
             f4 = (float)q;
             if (s == null) {
                if (f1 - f < 0) {
                label_008f :
                   f9 = f4 / f1;
                   f5 = f3 / f1;
                   f1 = f / f1;
                label_009b :
                   f9 = f9 * m;
                   if ((int)f9 > q) {
                      if (((p1 + f5) * m) - f3 > 0) {
                         f10 = (f3 / m) - f5;
                      }else if(((p1 + f1) * m) - f < 0){
                         f10 = (f / m) - f1;
                      }else {
                         f10 = p1;
                      }
                      f2 = ((f9 - f4) / f4) / m;
                   }else {
                      f10 = 0;
                   }
                   boolean b2 = (f10 - (- f2) <= 0)? true: false;
                   rtcEngineGes.k = b2;
                   if (f10 - f2 < 0) {
                      b = false;
                   }
                   rtcEngineGes.l = b;
                }
             }else if(f1 - f >= 0){
                goto label_008f ;
             }
             f9 = f4;
             f1 = 0x3f800000;
             f5 = 0xbf800000;
             goto label_009b ;
          }else {
             f10 = p1;
          }
          rtcEngineGes.n = f8;
          rtcEngineGes.o = f10;
       }
    label_00d9 :
       return;
    }
    public void a(float p0,float p1,float p2){
       if (PatchProxy.isSupport(RtcEngineGesture.class) && PatchProxy.applyVoidThreeRefs(Float.valueOf(p0), Float.valueOf(p1), Float.valueOf(p2), this, RtcEngineGesture.class, "7")) {
          return;
       }
       RtcEngineGesture tf = this.f;
       if (tf != null) {
          tf.setTranslateXY(p0, p1, p2);
       }
       return;
    }
    public void a(int p0,int p1){
       RtcEngineGesture rtcEngineGes = RtcEngineGesture.class;
       if (PatchProxy.isSupport(rtcEngineGes) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), Integer.valueOf(p1), this, rtcEngineGes, "4")) {
          return;
       }
       Log.i(RtcEngineGesture.a, "setViewPort\("+p0+","+p1+"\)");
       this.p = p0;
       this.q = p1;
       return;
    }
    public void a(MotionEvent p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, RtcEngineGesture.class, "3")) {
          return;
       }
       RtcEngineGesture tc = this.c;
       if (tc != null) {
          tc.onTouchEvent(p0);
       }
       tc = this.g;
       if (tc != null) {
          tc.onTouchEvent(p0);
       }
       return;
    }
    public void a(RtcEngineGesture$Config p0){
       this.t = p0;
    }
    public void a(RtcEngineGesture$Listener p0){
       this.h = p0;
    }
    public boolean a(int p0){
       RtcEngineGesture rtcEngineGes = RtcEngineGesture.class;
       if (PatchProxy.isSupport(rtcEngineGes)) {
          Object obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), this, rtcEngineGes, "1");
          if (obj != PatchProxyResult.class) {
             return obj.booleanValue();
          }
       }
       if (Math.abs((this.m - 0x3f800000)) - 0x3c23d70a < 0) {
          return false;
       }else if(p0 < 0){
          return (this.i ^ 0x01);
       }else {
          return (this.j ^ 0x01);
       }
    }
    public final void b(){
       this.n = 0;
       this.o = 0;
       this.m = 0x3f800000;
    }
    public void b(int p0,int p1){
       RtcEngineGesture rtcEngineGes = RtcEngineGesture.class;
       if (PatchProxy.isSupport(rtcEngineGes) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), Integer.valueOf(p1), this, rtcEngineGes, "5")) {
          return;
       }
       Log.i(RtcEngineGesture.a, "setFrameSize\("+p0+","+p1+"\)");
       this.r = p0;
       this.s = p1;
       return;
    }
    public boolean b(int p0){
       RtcEngineGesture rtcEngineGes = RtcEngineGesture.class;
       if (PatchProxy.isSupport(rtcEngineGes)) {
          Object obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), this, rtcEngineGes, "2");
          if (obj != PatchProxyResult.class) {
             return obj.booleanValue();
          }
       }
       if (Math.abs((this.m - 0x3f800000)) - 0x3c23d70a < 0) {
          return false;
       }else if(p0 < 0){
          return (this.k ^ 0x01);
       }else {
          return (this.l ^ 0x01);
       }
    }
    public void c(int p0){
       RtcEngineGesture rtcEngineGes = RtcEngineGesture.class;
       if (PatchProxy.isSupport(rtcEngineGes) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, rtcEngineGes, "6")) {
          return;
       }
       Log.i(RtcEngineGesture.a, "setVideoScaleMode\("+p0+"\)");
       this.b = p0;
       return;
    }
}
