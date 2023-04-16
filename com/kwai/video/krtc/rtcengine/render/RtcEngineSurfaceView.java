package com.kwai.video.krtc.rtcengine.render.RtcEngineSurfaceView;
import com.kwai.video.krtc.rtcengine.render.RtcEngineRenderView;
import com.kwai.video.krtc.rtcengine.render.SafeGLSurfaceView;
import java.lang.String;
import java.lang.Class;
import android.content.Context;
import android.util.AttributeSet;
import com.kwai.video.krtc.rtcengine.RtcEngineGesture$Config;
import java.lang.Object;
import android.opengl.GLSurfaceView;
import com.kwai.video.krtc.rtcengine.render.RtcEngineSurfaceView$1;
import android.opengl.GLSurfaceView$EGLContextFactory;
import com.kwai.video.krtc.rtcengine.render.a;
import android.opengl.GLSurfaceView$Renderer;
import java.lang.StringBuilder;
import com.kwai.video.krtc.utils.Log;
import com.kwai.robust.PatchProxy;
import com.kwai.video.krtc.rtcengine.RtcEngineGesture;
import com.kwai.video.krtc.rtcengine.RtcEngineGesture$Listener;
import java.lang.Integer;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import android.view.View;
import java.lang.Float;
import com.kwai.video.krtc.rtcengine.render.RtcEngineRenderer;
import android.view.MotionEvent;

public class RtcEngineSurfaceView extends SafeGLSurfaceView implements RtcEngineRenderView	// class@0008a6
{
    public RtcEngineGesture$Config c;
    public int d;
    public RtcEngineGesture$Listener e;
    public final Object f;
    public a g;
    public RtcEngineGesture h;
    public boolean i;
    public boolean j;
    public static final String b;

    static {
       RtcEngineSurfaceView.b = RtcEngineSurfaceView.class.getName();
    }
    public void RtcEngineSurfaceView(Context p0){
       super(p0, null);
    }
    public void RtcEngineSurfaceView(Context p0,AttributeSet p1){
       super(p0, null, true);
    }
    public void RtcEngineSurfaceView(Context p0,AttributeSet p1,boolean p2){
       super(p0, p1);
       this.c = new RtcEngineGesture$Config();
       this.d = 0;
       this.e = null;
       this.f = new Object();
       this.g = null;
       this.h = null;
       this.i = false;
       this.setEGLContextClientVersion(2);
       this.setEGLContextFactory(new RtcEngineSurfaceView$1(this));
       a uoa = new a(p2);
       this.g = uoa;
       this.setRenderer(uoa);
       this.setRenderMode(0);
       this.g.a(this);
       this.j = p2;
       Log.i(RtcEngineSurfaceView.b, this+" RtcEngineSurfaceView\(\) done");
    }
    public static String a(){
       return RtcEngineSurfaceView.b;
    }
    public static void a(RtcEngineSurfaceView p0){
       p0.c();
    }
    public final void b(){
       if (PatchProxy.applyVoid(null, this, RtcEngineSurfaceView.class, "20")) {
          return;
       }
       if (this.h == null) {
          RtcEngineGesture rtcEngineGes = new RtcEngineGesture(this.getContext(), this);
          this.h = rtcEngineGes;
          rtcEngineGes.a(this.c);
          this.h.c(this.d);
          this.h.a(this.e);
          RtcEngineSurfaceView tg = this.g;
          if (tg != null) {
             tg.setGesture(this.h);
          }
       }
       return;
    }
    public final void c(){
       if (PatchProxy.applyVoid(null, this, RtcEngineSurfaceView.class, "21")) {
          return;
       }
       RtcEngineSurfaceView tf = this.f;
       _monitor_enter(tf);
       RtcEngineSurfaceView tg = this.g;
       if (tg != null) {
          tg.setGesture(null);
       }
       tg = this.h;
       if (tg != null) {
          tg.a(null);
          this.h.a();
          this.h = null;
       }
       tg = this.g;
       if (tg != null) {
          tg.a();
       }
       _monitor_exit(tf);
       return;
    }
    public boolean canScrollHorizontally(int p0){
       RtcEngineSurfaceView obj;
       if (PatchProxy.isSupport(RtcEngineSurfaceView.class)) {
          obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), this, RtcEngineSurfaceView.class, "15");
          if (obj != PatchProxyResult.class) {
             return obj.booleanValue();
          }
       }
       if (this.i != null) {
          obj = this.h;
          if (obj != null) {
             return obj.a(p0);
          }
       }
       return super.canScrollHorizontally(p0);
    }
    public boolean canScrollVertically(int p0){
       RtcEngineSurfaceView obj;
       if (PatchProxy.isSupport(RtcEngineSurfaceView.class)) {
          obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), this, RtcEngineSurfaceView.class, "16");
          if (obj != PatchProxyResult.class) {
             return obj.booleanValue();
          }
       }
       if (this.i != null) {
          obj = this.h;
          if (obj != null) {
             return obj.b(p0);
          }
       }
       return super.canScrollVertically(p0);
    }
    public void clear(){
       if (PatchProxy.applyVoid(null, this, RtcEngineSurfaceView.class, "14")) {
          return;
       }
       RtcEngineSurfaceView tg = this.g;
       if (tg != null) {
          tg.clear();
       }
       return;
    }
    public void clear(float p0,float p1,float p2,float p3){
       if (PatchProxy.isSupport(RtcEngineSurfaceView.class) && PatchProxy.applyVoidFourRefs(Float.valueOf(p0), Float.valueOf(p1), Float.valueOf(p2), Float.valueOf(p3), this, RtcEngineSurfaceView.class, "13")) {
          return;
       }
       RtcEngineSurfaceView tg = this.g;
       if (tg != null) {
          tg.clear(p0, p1, p2, p3);
       }
       return;
    }
    public RtcEngineRenderer getRenderer(){
       return this.g;
    }
    public void onAttachedToWindow(){
       if (PatchProxy.applyVoid(null, this, RtcEngineSurfaceView.class, "18")) {
          return;
       }
       Log.i(RtcEngineSurfaceView.b, this+" onAttachedToWindow\(\)");
       super.onAttachedToWindow();
       return;
    }
    public void onDetachedFromWindow(){
       if (PatchProxy.applyVoid(null, this, RtcEngineSurfaceView.class, "19")) {
          return;
       }
       Log.i(RtcEngineSurfaceView.b, this+" onDetachedFromWindow\(\)");
       super.onDetachedFromWindow();
       this.c();
       return;
    }
    public boolean onTouchEvent(MotionEvent p0){
       RtcEngineSurfaceView obj = PatchProxy.applyOneRefs(p0, this, RtcEngineSurfaceView.class, "17");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (this.i != null) {
          obj = this.h;
          if (obj != null) {
             obj.a(p0);
             super.onTouchEvent(p0);
             return true;
          }
       }
       return super.onTouchEvent(p0);
    }
    public void setBackColor(float p0,float p1,float p2,float p3){
       if (PatchProxy.isSupport(RtcEngineSurfaceView.class) && PatchProxy.applyVoidFourRefs(Float.valueOf(p0), Float.valueOf(p1), Float.valueOf(p2), Float.valueOf(p3), this, RtcEngineSurfaceView.class, "12")) {
          return;
       }
       RtcEngineSurfaceView tg = this.g;
       if (tg != null) {
          tg.setBackColor(p0, p1, p2, p3);
       }
       return;
    }
    public void setEnableGesture(boolean p0){
       if (PatchProxy.isSupport(RtcEngineSurfaceView.class) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, RtcEngineSurfaceView.class, "9")) {
          return;
       }
       this.i = p0;
       if (p0) {
          this.b();
       }
       return;
    }
    public void setGestureConfig(RtcEngineGesture$Config p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, RtcEngineSurfaceView.class, "7")) {
          return;
       }
       this.c = p0;
       RtcEngineSurfaceView th = this.h;
       if (th != null) {
          th.a(p0);
       }
       return;
    }
    public void setGestureListener(RtcEngineGesture$Listener p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, RtcEngineSurfaceView.class, "8")) {
          return;
       }
       this.e = p0;
       RtcEngineSurfaceView th = this.h;
       if (th != null) {
          th.a(p0);
       }
       return;
    }
    public void setMirrorMode(int p0){
       if (PatchProxy.isSupport(RtcEngineSurfaceView.class) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, RtcEngineSurfaceView.class, "6")) {
          return;
       }
       RtcEngineSurfaceView tg = this.g;
       if (tg != null) {
          tg.setRenderMirrorMode(p0);
       }
       return;
    }
    public void setRedrawInfo(boolean p0,int p1){
       if (PatchProxy.isSupport(RtcEngineSurfaceView.class) && PatchProxy.applyVoidTwoRefs(Boolean.valueOf(p0), Integer.valueOf(p1), this, RtcEngineSurfaceView.class, "11")) {
          return;
       }
       RtcEngineSurfaceView tg = this.g;
       if (tg != null) {
          tg.setRedrawInfo(p0, p1);
       }
       return;
    }
    public void setTranslateXY(float p0,float p1,float p2){
       if (PatchProxy.isSupport(RtcEngineSurfaceView.class) && PatchProxy.applyVoidThreeRefs(Float.valueOf(p0), Float.valueOf(p1), Float.valueOf(p2), this, RtcEngineSurfaceView.class, "10")) {
          return;
       }
       RtcEngineSurfaceView tg = this.g;
       if (tg != null) {
          tg.setTranslateXY(p0, p1, p2);
       }
       return;
    }
    public void setVideoRenderAgedSrParams(int p0,float p1,float p2){
       if (PatchProxy.isSupport(RtcEngineSurfaceView.class) && PatchProxy.applyVoidThreeRefs(Integer.valueOf(p0), Float.valueOf(p1), Float.valueOf(p2), this, RtcEngineSurfaceView.class, "4")) {
          return;
       }
       RtcEngineSurfaceView tg = this.g;
       if (tg != null) {
          tg.setVideoRenderAgedSrParams(p0, p1, p2);
       }
       return;
    }
    public void setVideoRenderHighQType(int p0){
       if (PatchProxy.isSupport(RtcEngineSurfaceView.class) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, RtcEngineSurfaceView.class, "2")) {
          return;
       }
       RtcEngineSurfaceView tg = this.g;
       if (tg != null) {
          tg.setVideoRenderHighQType(p0);
       }
       return;
    }
    public void setVideoRenderHighQType(int p0,float p1){
       if (PatchProxy.isSupport(RtcEngineSurfaceView.class) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), Float.valueOf(p1), this, RtcEngineSurfaceView.class, "3")) {
          return;
       }
       RtcEngineSurfaceView tg = this.g;
       if (tg != null) {
          tg.setVideoRenderHighQType(p0, p1);
       }
       return;
    }
    public void setVideoRenderQuality(int p0){
       if (PatchProxy.isSupport(RtcEngineSurfaceView.class) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, RtcEngineSurfaceView.class, "1")) {
          return;
       }
       RtcEngineSurfaceView tg = this.g;
       if (tg != null) {
          tg.setRenderQuality(p0);
       }
       return;
    }
    public void setVideoScaleMode(int p0){
       if (PatchProxy.isSupport(RtcEngineSurfaceView.class) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, RtcEngineSurfaceView.class, "5")) {
          return;
       }
       this.d = p0;
       RtcEngineSurfaceView th = this.h;
       if (th != null) {
          th.c(p0);
       }
       th = this.g;
       if (th != null) {
          th.setRenderScaleMode(p0);
       }
       return;
    }
}
