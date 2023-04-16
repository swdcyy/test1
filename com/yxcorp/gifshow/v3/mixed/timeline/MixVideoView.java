package com.yxcorp.gifshow.v3.mixed.timeline.MixVideoView;
import ml8.d;
import com.yxcorp.gifshow.v3.mixed.timeline.InjectableFrameLayout;
import android.content.Context;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.Object;
import java.lang.String;
import java.util.Objects;
import com.yxcorp.gifshow.v3.mixed.timeline.MixTimeline;
import com.yxcorp.gifshow.v3.mixed.model.b;
import com.yxcorp.gifshow.v3.mixed.model.DragStatus;
import hwc.a;
import com.yxcorp.gifshow.v3.mixed.timeline.i;
import com.yxcorp.gifshow.widget.adv.VideoSDKPlayerView;
import java.util.List;
import com.yxcorp.gifshow.v3.mixed.timeline.MixTranslationIndicators;
import android.view.View;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import com.yxcorp.gifshow.v3.mixed.model.MixVideoTrack;
import hwc.b;
import java.lang.Math;
import android.graphics.Canvas;
import gwc.a;
import android.graphics.RectF;
import android.graphics.Path;
import android.graphics.Path$Direction;
import android.view.MotionEvent;
import com.yxcorp.gifshow.v3.mixed.model.MixStatus;

public class MixVideoView extends InjectableFrameLayout implements d	// class@001562
{
    public b c;
    public MixTimelineScroller d;
    public MixTimeline e;
    public MixVideoTrack f;
    public a g;
    public int[] h;
    public int i;
    public double j;
    public boolean k;
    public static final int l;

    public void MixVideoView(Context p0,AttributeSet p1){
       super(p0, p1);
       int[] ointArray = new int[2];
       this.h = ointArray;
       this.j = 57.50f;
       this.k = true;
       this.setWillNotDraw(false);
    }
    public void a(boolean p0,int p1){
       if (PatchProxy.isSupport(MixVideoView.class) && PatchProxy.applyVoidTwoRefs(Boolean.valueOf(p0), Integer.valueOf(p1), this, MixVideoView.class, "11")) {
          return;
       }
       this.requestLayout();
       MixVideoView te = this.e;
       Objects.requireNonNull(te);
       if (!PatchProxy.isSupport(MixTimeline.class) || !PatchProxy.applyVoidThreeRefs(this, Boolean.valueOf(p0), Integer.valueOf(p1), te, MixTimeline.class, "10")) {
          te.d(te.b.e);
          te.k = (p0)? p1: a.a;
          MixTimeline o = te.o;
          Objects.requireNonNull(o);
          if (!PatchProxy.applyVoidOneRefs(this, o, i.class, "11")) {
             o.r.seekTo(this.getDraggingTime());
             o.G.C0();
             o.y.b(o.B);
          }
       }
       return;
    }
    public void doBindView(View p0){
    }
    public int getContentLeftInParent(){
       Object obj = PatchProxy.apply(null, this, MixVideoView.class, "15");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return ((this.getLeft() + a.l) + a.h);
    }
    public int getContentLeftInScreen(){
       Object obj = PatchProxy.apply(null, this, MixVideoView.class, "13");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       this.getLocationOnScreen(this.h);
       return (this.h[0] + a.h);
    }
    public int getContentRightInParent(){
       Object obj = PatchProxy.apply(null, this, MixVideoView.class, "16");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return ((this.getRight() + a.l) - a.h);
    }
    public int getContentRightInScreen(){
       Object obj = PatchProxy.apply(null, this, MixVideoView.class, "14");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       this.getLocationOnScreen(this.h);
       return ((this.h[0] + this.getWidth()) - a.h);
    }
    public MixVideoTrack getData(){
       return this.f;
    }
    public double getDraggingTime(){
       Object obj = PatchProxy.apply(null, this, MixVideoView.class, "17");
       if (obj != PatchProxyResult.class) {
          return obj.doubleValue();
       }
       double d = b.d((this.e.j - (double)this.getContentLeftInScreen()));
       if (this.c.e.mIsDragging == null) {
          return (this.f.mBaseOffsetIgnoreSpeed + d);
       }
       MixVideoView tf = this.f;
       return ((tf.mBaseOffsetIgnoreSpeed + tf.mClipStart) + d);
    }
    public int getTooLongDurationLeft(){
       MixVideoView obj = PatchProxy.apply(null, this, MixVideoView.class, "18");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       obj = this.f;
       MixVideoView tj = this.j;
       if ((obj.mBaseOffsetWithSpeed + obj.getDurationWithSpeed()) - tj > 0) {
          return b.b((Math.max(0, (tj - this.f.mBaseOffsetWithSpeed)) * this.f.mSpeed));
       }
       return -1;
    }
    public void onDraw(Canvas p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, MixVideoView.class, "7")) {
          return;
       }
       if (this.f != null) {
          MixVideoView tg = this.g;
          if (tg != null) {
             tg.a(p0);
          }
       }
       return;
    }
    public void onFinishInflate(){
       if (PatchProxy.applyVoid(null, this, MixVideoView.class, "4")) {
          return;
       }
       super.onFinishInflate();
       this.doBindView(this);
       return;
    }
    public void onLayout(boolean p0,int p1,int p2,int p3,int p4){
       if (PatchProxy.isSupport(MixVideoView.class)) {
          Object[] objArray = new Object[]{Boolean.valueOf(p0),Integer.valueOf(p1),Integer.valueOf(p2),Integer.valueOf(p3),Integer.valueOf(p4)};
          if (PatchProxy.applyVoid(objArray, this, MixVideoView.class, "6")) {
             return;
          }
       }
       super.onLayout(p0, p1, p2, p3, p4);
       if (this.f != null) {
          MixVideoView tg = this.g;
          if (tg != null) {
             Objects.requireNonNull(tg);
             if (!PatchProxy.applyVoid(null, tg, a.class, "8")) {
                p2 = a.h;
                float f = (float)p2;
                tg.a.set(f, 0, (float)(tg.j.getWidth() - p2), (float)tg.j.getHeight());
                tg.b.reset();
                tg.b.addRoundRect(tg.a, tg.e, tg.e, Path$Direction.CCW);
             }
          }
       }
       return;
    }
    public void onMeasure(int p0,int p1){
       if (PatchProxy.isSupport(MixVideoView.class) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), Integer.valueOf(p1), this, MixVideoView.class, "5")) {
          return;
       }
       MixVideoView tf = this.f;
       if (tf == null) {
          this.setMeasuredDimension(0, 0);
          return;
       }else {
          this.setMeasuredDimension((b.b((tf.mClipEnd - tf.mClipStart)) + (a.h * 2)), a.d);
          return;
       }
    }
    public boolean onTouchEvent(MotionEvent p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, MixVideoView.class, "19");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (!p0.getAction() && this.c.F0() == MixStatus.PREVIEWING) {
          this.c.q0();
       }
       return super.onTouchEvent(p0);
    }
    public void setMaxTotalDuration(double p0){
       this.j = p0;
    }
}
