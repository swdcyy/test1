package com.kuaishou.commercial.splash.view.RollingBallView;
import android.view.View;
import com.kuaishou.commercial.splash.view.RollingBallView$a;
import nsd.u;
import android.content.Context;
import android.util.AttributeSet;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import android.graphics.Paint;
import lnc.a1;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import android.graphics.Paint$Style;
import android.animation.ValueAnimator;
import android.view.animation.LinearInterpolator;
import android.animation.TimeInterpolator;
import mz.d;
import android.animation.ValueAnimator$AnimatorUpdateListener;
import qrd.l1;
import android.animation.Keyframe;
import android.animation.PropertyValuesHolder;
import mz.e;
import android.graphics.Canvas;
import java.lang.Float;
import java.lang.Boolean;
import android.graphics.RectF;
import java.lang.Integer;

public final class RollingBallView extends View	// class@001633
{
    public Paint b;
    public final float c;
    public ValueAnimator d;
    public ValueAnimator e;
    public float f;
    public float g;
    public float h;
    public float i;
    public float j;
    public boolean k;
    public HashMap l;
    public static final RollingBallView$a m;

    static {
       RollingBallView.m = new RollingBallView$a(null);
    }
    public void RollingBallView(Context p0){
       super(p0, null, 0, 6, null);
    }
    public void RollingBallView(Context p0,AttributeSet p1){
       super(p0, p1, 0, 4, null);
    }
    public void RollingBallView(Context p0,AttributeSet p1,int p2){
       a.p(p0, "context");
       super(p0, p1, p2);
       this.b = new Paint();
       float f = (float)a1.e(2.00f);
       this.c = f;
       float f1 = 0.44f;
       this.g = f1;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, RollingBallView.class, "1")) {
       }else {
          this.b.setColor(-1);
          this.b.setStyle(Paint$Style.STROKE);
          this.b.setStrokeWidth(f);
          this.b.setAntiAlias(1);
       }
       if (!PatchProxy.applyVoid(objArray, this, RollingBallView.class, "2")) {
          ValueAnimator valueAnimato = ValueAnimator.ofFloat(new float[2]{0,0x43b40000});
          valueAnimato.setDuration(1000);
          valueAnimato.setRepeatCount(-1);
          valueAnimato.setRepeatMode(1);
          valueAnimato.setInterpolator(new LinearInterpolator());
          valueAnimato.addUpdateListener(new d(this));
          valueAnimato.start();
          this.d = valueAnimato;
          Keyframe keyframe = Keyframe.ofFloat(0.25f, 0x3f800000);
          Keyframe[] keyframeArra = new Keyframe[]{Keyframe.ofFloat(0, f1),keyframe,keyframe,Keyframe.ofFloat(0x3f000000, f1),Keyframe.ofFloat(0x3f400000, 0.03f),Keyframe.ofFloat(0x3f800000, f1)};
          PropertyValuesHolder propertyValu = PropertyValuesHolder.ofKeyframe("", keyframeArra);
          a.o(propertyValu, "PropertyValuesHolder.ofK¡­ kf2, kf2, kf3, kf4, kf5\)");
          PropertyValuesHolder[] propertyValu1 = new PropertyValuesHolder[]{propertyValu};
          ValueAnimator valueAnimato1 = ValueAnimator.ofPropertyValuesHolder(propertyValu1);
          valueAnimato1.setDuration(1000);
          valueAnimato1.setRepeatCount(-1);
          valueAnimato1.setRepeatMode(1);
          valueAnimato1.setInterpolator(new LinearInterpolator());
          valueAnimato1.addUpdateListener(new e(this));
          valueAnimato1.start();
          this.e = valueAnimato1;
       }
       return;
    }
    public void RollingBallView(Context p0,AttributeSet p1,int p2,int p3,u p4){
       if (p3 & 0x02) {
          p1 = null;
       }
       if (p3 & 0x04) {
          p2 = 0;
       }
       super(p0, p1, p2);
       return;
    }
    public final void a(float p0,boolean p1,Canvas p2){
       float f;
       float f1;
       if (PatchProxy.isSupport(RollingBallView.class) && PatchProxy.applyVoidThreeRefs(Float.valueOf(p0), Boolean.valueOf(p1), p2, this, RollingBallView.class, "7")) {
          return;
       }
       int i = 2;
       if (p1) {
          f = (float)i;
          f1 = this.c / f;
          p2.drawOval(new RectF(f1, (this.i - (this.j * p0)), ((float)this.getMeasuredWidth() - (this.c / f)), (this.i + (this.j * p0))), this.b);
       }else {
          f = (float)i;
          f1 = this.c / f;
          float f2 = (float)1 - p0;
          p2.drawOval(new RectF(f1, (this.i - (this.j * f2)), ((float)this.getMeasuredWidth() - (this.c / f)), (this.i + (this.j * f2))), this.b);
       }
       return;
    }
    public void onDetachedFromWindow(){
       if (PatchProxy.applyVoid(null, this, RollingBallView.class, "8")) {
          return;
       }
       super.onDetachedFromWindow();
       RollingBallView td = this.d;
       if (td != null) {
          td.removeAllUpdateListeners();
       }
       td = this.d;
       if (td != null) {
          td.cancel();
       }
       td = this.e;
       if (td != null) {
          td.removeAllUpdateListeners();
       }
       td = this.e;
       if (td != null) {
          td.cancel();
       }
       return;
    }
    public void onDraw(Canvas p0){
       float f;
       RollingBallView tg;
       if (PatchProxy.applyVoidOneRefs(p0, this, RollingBallView.class, "4")) {
          return;
       }
       a.p(p0, "canvas");
       super.onDraw(p0);
       p0.drawCircle(this.h, this.i, this.j, this.b);
       boolean b = false;
       int i = 360;
       if (!PatchProxy.applyVoidOneRefs(p0, this, RollingBallView.class, "5")) {
          p0.save();
          f = (this.k != null)? (float)i - this.f: this.f;
          p0.rotate(f, this.h, this.i);
          tg = this.g;
          if ((double)tg - 0x3fe0000000000000 < 0) {
             this.a(tg, 1, p0);
          }else {
             this.a(((float)1 - tg), b, p0);
          }
          p0.restore();
       }
       if (!PatchProxy.applyVoidOneRefs(p0, this, RollingBallView.class, "6")) {
          p0.save();
          int i1 = 90;
          f = (this.k != null)? (float)i - this.f: this.f;
          p0.rotate((f - (float)i1), this.h, this.i);
          tg = this.g;
          if ((double)tg - 0x3fe0000000000000 < 0) {
             this.a(tg, b, p0);
          }else {
             this.a(((float)1 - tg), 1, p0);
          }
          p0.restore();
       }
       return;
    }
    public void onSizeChanged(int p0,int p1,int p2,int p3){
       if (PatchProxy.isSupport(RollingBallView.class) && PatchProxy.applyVoidFourRefs(Integer.valueOf(p0), Integer.valueOf(p1), Integer.valueOf(p2), Integer.valueOf(p3), this, RollingBallView.class, "3")) {
          return;
       }
       super.onSizeChanged(p0, p1, p2, p3);
       float f = (float)2;
       this.h = (float)this.getMeasuredWidth() / f;
       this.i = (float)this.getMeasuredHeight() / f;
       this.j = ((float)this.getMeasuredHeight() - this.c) / f;
       return;
    }
}
