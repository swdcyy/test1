package com.kwai.video.krtc.rtcengine.render.RtcEngineTextureView;
import com.kwai.video.krtc.rtcengine.render.RtcEngineRenderView;
import android.view.TextureView;
import java.lang.String;
import java.lang.Class;
import android.content.Context;
import android.util.AttributeSet;
import com.kwai.video.krtc.rtcengine.RtcEngineGesture$Config;
import com.kwai.video.krtc.rtcengine.render.RtcEngineTextureView$1;
import com.kwai.video.krtc.rtcengine.render.b;
import com.kwai.video.krtc.rtcengine.RtcEngineGesture;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import java.lang.Object;
import java.lang.StringBuilder;
import com.kwai.video.krtc.utils.Log;
import android.view.TextureView$SurfaceTextureListener;
import com.kwai.video.krtc.rtcengine.RtcEngineGesture$Listener;
import java.lang.Integer;
import com.kwai.robust.PatchProxyResult;
import android.view.View;
import java.lang.Float;
import com.kwai.video.krtc.rtcengine.render.RtcEngineRenderer;
import com.kwai.video.krtc.GL.EglBase$Context;
import com.kwai.video.krtc.EglContextHolder;
import com.kwai.video.krtc.GL.EglBase;
import android.view.MotionEvent;

public class RtcEngineTextureView extends TextureView implements RtcEngineRenderView	// class@0008a9
{
    public RtcEngineGesture$Config b;
    public int c;
    public RtcEngineGesture$Listener d;
    public b e;
    public RtcEngineGesture f;
    public boolean g;
    public int h;
    public int i;
    public boolean j;
    public TextureView$SurfaceTextureListener k;
    public static final String a;

    static {
       RtcEngineTextureView.a = RtcEngineTextureView.class.getName();
    }
    public void RtcEngineTextureView(Context p0){
       super(p0, null);
    }
    public void RtcEngineTextureView(Context p0,AttributeSet p1){
       super(p0, p1, true);
    }
    public void RtcEngineTextureView(Context p0,AttributeSet p1,boolean p2){
       super(p0, p1);
       this.b = new RtcEngineGesture$Config();
       this.c = 0;
       this.d = null;
       this.e = null;
       this.f = null;
       this.g = false;
       this.h = 0;
       this.i = 0;
       this.k = new RtcEngineTextureView$1(this);
       this.a(p0, p2);
       this.j = p2;
    }
    public static int a(RtcEngineTextureView p0,int p1){
       p0.h = p1;
       return p1;
    }
    public static b a(RtcEngineTextureView p0){
       return p0.e;
    }
    public static String a(){
       return RtcEngineTextureView.a;
    }
    public static int b(RtcEngineTextureView p0,int p1){
       p0.i = p1;
       return p1;
    }
    public static RtcEngineGesture b(RtcEngineTextureView p0){
       return p0.f;
    }
    public static boolean c(RtcEngineTextureView p0){
       return p0.j;
    }
    public final void a(Context p0,boolean p1){
       if (PatchProxy.isSupport(RtcEngineTextureView.class) && PatchProxy.applyVoidTwoRefs(p0, Boolean.valueOf(p1), this, RtcEngineTextureView.class, "1")) {
          return;
       }
       Log.i(RtcEngineTextureView.a, this+" init\(\) redraw: "+p1);
       this.e = new b(p1);
       this.setSurfaceTextureListener(this.k);
       return;
    }
    public final void b(){
       if (PatchProxy.applyVoid(null, this, RtcEngineTextureView.class, "21")) {
          return;
       }
       if (this.f == null) {
          RtcEngineGesture rtcEngineGes = new RtcEngineGesture(this.getContext(), this);
          this.f = rtcEngineGes;
          rtcEngineGes.a(this.b);
          this.f.c(this.c);
          this.f.a(this.h, this.i);
          this.f.a(this.d);
          RtcEngineTextureView te = this.e;
          if (te != null) {
             te.setGesture(this.f);
          }
       }
       return;
    }
    public boolean canScrollHorizontally(int p0){
       RtcEngineTextureView obj;
       if (PatchProxy.isSupport(RtcEngineTextureView.class)) {
          obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), this, RtcEngineTextureView.class, "16");
          if (obj != PatchProxyResult.class) {
             return obj.booleanValue();
          }
       }
       if (this.g != null) {
          obj = this.f;
          if (obj != null) {
             return obj.a(p0);
          }
       }
       return super.canScrollHorizontally(p0);
    }
    public boolean canScrollVertically(int p0){
       RtcEngineTextureView obj;
       if (PatchProxy.isSupport(RtcEngineTextureView.class)) {
          obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), this, RtcEngineTextureView.class, "17");
          if (obj != PatchProxyResult.class) {
             return obj.booleanValue();
          }
       }
       if (this.g != null) {
          obj = this.f;
          if (obj != null) {
             return obj.b(p0);
          }
       }
       return super.canScrollVertically(p0);
    }
    public void clear(){
       if (PatchProxy.applyVoid(null, this, RtcEngineTextureView.class, "15")) {
          return;
       }
       RtcEngineTextureView te = this.e;
       if (te != null) {
          te.clear();
       }
       return;
    }
    public void clear(float p0,float p1,float p2,float p3){
       if (PatchProxy.isSupport(RtcEngineTextureView.class) && PatchProxy.applyVoidFourRefs(Float.valueOf(p0), Float.valueOf(p1), Float.valueOf(p2), Float.valueOf(p3), this, RtcEngineTextureView.class, "14")) {
          return;
       }
       RtcEngineTextureView te = this.e;
       if (te != null) {
          te.clear(p0, p1, p2, p3);
       }
       return;
    }
    public RtcEngineRenderer getRenderer(){
       return this.e;
    }
    public void onAttachedToWindow(){
       if (PatchProxy.applyVoid(null, this, RtcEngineTextureView.class, "19")) {
          return;
       }
       Log.i(RtcEngineTextureView.a, this+" onAttachedToWindow\(\)");
       super.onAttachedToWindow();
       if (this.e != null) {
          this.e.a(EglContextHolder.sharedContext(), EglBase.CONFIG_PLAIN);
       }
       return;
    }
    public void onDetachedFromWindow(){
       if (PatchProxy.applyVoid(null, this, RtcEngineTextureView.class, "20")) {
          return;
       }
       Log.i(RtcEngineTextureView.a, this+" onDetachedFromWindow\(\)");
       super.onDetachedFromWindow();
       RtcEngineTextureView te = this.e;
       if (te != null) {
          te.setGesture(null);
       }
       te = this.f;
       if (te != null) {
          te.a(null);
          this.f.a();
          this.f = null;
       }
       te = this.e;
       if (te != null) {
          te.a();
       }
       return;
    }
    public boolean onTouchEvent(MotionEvent p0){
       RtcEngineTextureView obj = PatchProxy.applyOneRefs(p0, this, RtcEngineTextureView.class, "18");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (this.g != null) {
          obj = this.f;
          if (obj != null) {
             obj.a(p0);
             super.onTouchEvent(p0);
             return true;
          }
       }
       return super.onTouchEvent(p0);
    }
    public void setBackColor(float p0,float p1,float p2,float p3){
       if (PatchProxy.isSupport(RtcEngineTextureView.class) && PatchProxy.applyVoidFourRefs(Float.valueOf(p0), Float.valueOf(p1), Float.valueOf(p2), Float.valueOf(p3), this, RtcEngineTextureView.class, "13")) {
          return;
       }
       RtcEngineTextureView te = this.e;
       if (te != null) {
          te.setBackColor(p0, p1, p2, p3);
       }
       return;
    }
    public void setEnableGesture(boolean p0){
       if (PatchProxy.isSupport(RtcEngineTextureView.class) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, RtcEngineTextureView.class, "10")) {
          return;
       }
       this.g = p0;
       if (p0) {
          this.b();
       }
       return;
    }
    public void setGestureConfig(RtcEngineGesture$Config p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, RtcEngineTextureView.class, "8")) {
          return;
       }
       this.b = p0;
       RtcEngineTextureView tf = this.f;
       if (tf != null) {
          tf.a(p0);
       }
       return;
    }
    public void setGestureListener(RtcEngineGesture$Listener p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, RtcEngineTextureView.class, "9")) {
          return;
       }
       this.d = p0;
       RtcEngineTextureView tf = this.f;
       if (tf != null) {
          tf.a(p0);
       }
       return;
    }
    public void setMirrorMode(int p0){
       if (PatchProxy.isSupport(RtcEngineTextureView.class) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, RtcEngineTextureView.class, "7")) {
          return;
       }
       RtcEngineTextureView te = this.e;
       if (te != null) {
          te.setRenderMirrorMode(p0);
       }
       return;
    }
    public void setRedrawInfo(boolean p0,int p1){
       if (PatchProxy.isSupport(RtcEngineTextureView.class) && PatchProxy.applyVoidTwoRefs(Boolean.valueOf(p0), Integer.valueOf(p1), this, RtcEngineTextureView.class, "12")) {
          return;
       }
       RtcEngineTextureView te = this.e;
       if (te != null) {
          te.setRedrawInfo(p0, p1);
       }
       return;
    }
    public void setTranslateXY(float p0,float p1,float p2){
       if (PatchProxy.isSupport(RtcEngineTextureView.class) && PatchProxy.applyVoidThreeRefs(Float.valueOf(p0), Float.valueOf(p1), Float.valueOf(p2), this, RtcEngineTextureView.class, "11")) {
          return;
       }
       RtcEngineTextureView te = this.e;
       if (te != null) {
          te.setTranslateXY(p0, p1, p2);
       }
       return;
    }
    public void setVideoRenderAgedSrParams(int p0,float p1,float p2){
       if (PatchProxy.isSupport(RtcEngineTextureView.class) && PatchProxy.applyVoidThreeRefs(Integer.valueOf(p0), Float.valueOf(p1), Float.valueOf(p2), this, RtcEngineTextureView.class, "5")) {
          return;
       }
       RtcEngineTextureView te = this.e;
       if (te != null) {
          te.setVideoRenderAgedSrParams(p0, p1, p2);
       }
       return;
    }
    public void setVideoRenderHighQType(int p0){
       if (PatchProxy.isSupport(RtcEngineTextureView.class) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, RtcEngineTextureView.class, "3")) {
          return;
       }
       RtcEngineTextureView te = this.e;
       if (te != null) {
          te.setVideoRenderHighQType(p0);
       }
       return;
    }
    public void setVideoRenderHighQType(int p0,float p1){
       if (PatchProxy.isSupport(RtcEngineTextureView.class) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), Float.valueOf(p1), this, RtcEngineTextureView.class, "4")) {
          return;
       }
       RtcEngineTextureView te = this.e;
       if (te != null) {
          te.setVideoRenderHighQType(p0, p1);
       }
       return;
    }
    public void setVideoRenderQuality(int p0){
       if (PatchProxy.isSupport(RtcEngineTextureView.class) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, RtcEngineTextureView.class, "2")) {
          return;
       }
       RtcEngineTextureView te = this.e;
       if (te != null) {
          te.setRenderQuality(p0);
       }
       return;
    }
    public void setVideoScaleMode(int p0){
       if (PatchProxy.isSupport(RtcEngineTextureView.class) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, RtcEngineTextureView.class, "6")) {
          return;
       }
       this.c = p0;
       RtcEngineTextureView tf = this.f;
       if (tf != null) {
          tf.c(p0);
       }
       tf = this.e;
       if (tf != null) {
          tf.setRenderScaleMode(p0);
       }
       return;
    }
}
