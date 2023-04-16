package com.kuaishou.commercial.splash.view.FlashingPlateView;
import android.view.View;
import com.kuaishou.commercial.splash.view.FlashingPlateView$a;
import nsd.u;
import android.content.Context;
import android.util.AttributeSet;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import android.graphics.Paint;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import android.animation.Keyframe;
import android.animation.PropertyValuesHolder;
import android.animation.ValueAnimator;
import android.view.animation.LinearInterpolator;
import android.animation.TimeInterpolator;
import mz.a;
import android.animation.ValueAnimator$AnimatorUpdateListener;
import qrd.l1;
import mz.b;
import java.lang.Float;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import lnc.a1;
import android.graphics.Canvas;
import java.lang.Boolean;
import android.graphics.RectF;
import android.graphics.PorterDuffXfermode;
import android.graphics.PorterDuff$Mode;
import android.graphics.Xfermode;
import android.graphics.Paint$Style;
import android.graphics.Paint$Cap;
import android.graphics.PathEffect;
import android.graphics.DashPathEffect;
import java.lang.Integer;

public final class FlashingPlateView extends View	// class@00162f
{
    public Paint b;
    public float c;
    public ValueAnimator d;
    public ValueAnimator e;
    public float f;
    public float g;
    public float h;
    public float i;
    public float j;
    public HashMap k;
    public static final FlashingPlateView$a l;

    static {
       FlashingPlateView.l = new FlashingPlateView$a(null);
    }
    public void FlashingPlateView(Context p0){
       super(p0, null, 0, 6, null);
    }
    public void FlashingPlateView(Context p0,AttributeSet p1){
       super(p0, p1, 0, 4, null);
    }
    public void FlashingPlateView(Context p0,AttributeSet p1,int p2){
       a.p(p0, "context");
       super(p0, p1, p2);
       this.b = new Paint();
       this.c = this.a(2.00f);
       float f = 0.20f;
       this.f = f;
       float f1 = 0x3f19999a;
       this.g = f1;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, FlashingPlateView.class, "1")) {
       }else {
          this.b.setColor(-1);
          this.b.setStrokeWidth(this.c);
          this.b.setAntiAlias(1);
       }
       if (!PatchProxy.applyVoid(objArray, this, FlashingPlateView.class, "2")) {
          Keyframe[] keyframeArra = new Keyframe[]{Keyframe.ofFloat(0, f),Keyframe.ofFloat(0x3f266666, 0x3f333333),Keyframe.ofFloat(0x3f800000, f)};
          PropertyValuesHolder propertyValu = PropertyValuesHolder.ofKeyframe("", keyframeArra);
          a.o(propertyValu, "PropertyValuesHolder.ofK¡­e1, kfCircle2, kfCircle3\)");
          PropertyValuesHolder[] propertyValu1 = new PropertyValuesHolder[]{propertyValu};
          ValueAnimator valueAnimato = ValueAnimator.ofPropertyValuesHolder(propertyValu1);
          valueAnimato.setDuration(1000);
          valueAnimato.setRepeatCount(-1);
          valueAnimato.setRepeatMode(1);
          valueAnimato.setInterpolator(new LinearInterpolator());
          valueAnimato.addUpdateListener(new a(this));
          valueAnimato.start();
          this.d = valueAnimato;
          Keyframe[] keyframeArra1 = new Keyframe[]{Keyframe.ofFloat(0, f1),Keyframe.ofFloat(0.35f, f),Keyframe.ofFloat(0x3f800000, f1)};
          PropertyValuesHolder propertyValu2 = PropertyValuesHolder.ofKeyframe("", keyframeArra1);
          a.o(propertyValu2, "PropertyValuesHolder.ofK¡­row1, kfArrow2, kfArrow3\)");
          PropertyValuesHolder[] propertyValu3 = new PropertyValuesHolder[]{propertyValu2};
          ValueAnimator valueAnimato1 = ValueAnimator.ofPropertyValuesHolder(propertyValu3);
          valueAnimato1.setDuration(1000);
          valueAnimato1.setRepeatCount(-1);
          valueAnimato1.setRepeatMode(1);
          valueAnimato1.setInterpolator(new LinearInterpolator());
          valueAnimato1.addUpdateListener(new b(this));
          valueAnimato1.start();
          this.e = valueAnimato1;
       }
       return;
    }
    public void FlashingPlateView(Context p0,AttributeSet p1,int p2,int p3,u p4){
       if (p3 & 0x02) {
          p1 = null;
       }
       if (p3 & 0x04) {
          p2 = 0;
       }
       super(p0, p1, p2);
       return;
    }
    public final float a(float p0){
       if (PatchProxy.isSupport(FlashingPlateView.class)) {
          Object obj = PatchProxy.applyOneRefs(Float.valueOf(p0), this, FlashingPlateView.class, "8");
          if (obj != PatchProxyResult.class) {
             return obj.floatValue();
          }
       }
       return (float)a1.e(p0);
    }
    public final void b(Canvas p0,boolean p1,boolean p2){
       if (PatchProxy.isSupport(FlashingPlateView.class) && PatchProxy.applyVoidThreeRefs(p0, Boolean.valueOf(p1), Boolean.valueOf(p2), this, FlashingPlateView.class, "7")) {
          return;
       }
       FlashingPlateView tb = this.b;
       float f = (float)255;
       float f1 = (p2)? (float)1 - this.g: this.g;
       tb.setAlpha((int)(f * f1));
       p0.save();
       int i = p0.saveLayer(0, 0, (float)this.getMeasuredWidth(), (float)this.getMeasuredHeight(), null);
       f = 13.00f;
       f1 = 52.00f;
       if (p1) {
          if (!p2) {
             f = 0;
          }
          p0.translate(this.a((f + f1)), this.i);
          p0.rotate(-45.00f);
          p0.drawRoundRect(new RectF(0, 0, this.a(9.00f), this.a(3.00f)), this.a(0.40f), this.a(0.40f), this.b);
          this.b.setXfermode(new PorterDuffXfermode(PorterDuff$Mode.SRC));
          p0.drawRoundRect(new RectF(0, 0, this.a(3.00f), this.a(9.00f)), this.a(0.40f), this.a(0.40f), this.b);
       }else {
          float f2 = (float)this.getMeasuredWidth();
          if (!p2) {
             f = 0;
          }
          p0.translate((f2 - this.a((f + f1))), this.i);
          p0.rotate(45.00f);
          p0.drawRoundRect(new RectF((- this.a(9.00f)), 0, 0, this.a(3.00f)), this.a(0.40f), this.a(0.40f), this.b);
          this.b.setXfermode(new PorterDuffXfermode(PorterDuff$Mode.SRC));
          p0.drawRoundRect(new RectF((- this.a(3.00f)), 0, 0, this.a(9.00f)), this.a(0.40f), this.a(0.40f), this.b);
       }
       this.b.setXfermode(null);
       p0.restoreToCount(i);
       p0.restore();
       return;
    }
    public final float getBallTransX(){
       return (this.h - this.i);
    }
    public void onDetachedFromWindow(){
       if (PatchProxy.applyVoid(null, this, FlashingPlateView.class, "9")) {
          return;
       }
       super.onDetachedFromWindow();
       FlashingPlateView td = this.d;
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
       if (PatchProxy.applyVoidOneRefs(p0, this, FlashingPlateView.class, "3")) {
          return;
       }
       a.p(p0, "canvas");
       super.onDraw(p0);
       int i = 0;
       int i1 = 1;
       if (!PatchProxy.applyVoidOneRefs(p0, this, FlashingPlateView.class, "5")) {
          this.b.setStyle(Paint$Style.FILL);
          this.b.setStrokeCap(Paint$Cap.BUTT);
          this.b.setPathEffect(null);
          this.b(p0, i1, i1);
          this.b(p0, i1, i);
          this.b(p0, i, i1);
          this.b(p0, i, i);
       }
       if (!PatchProxy.applyVoidOneRefs(p0, this, FlashingPlateView.class, "6")) {
          this.b.setAlpha((int)((float)255 * this.f));
          this.b.setStyle(Paint$Style.STROKE);
          this.b.setStrokeCap(Paint$Cap.ROUND);
          float[] uofloatArray = new float[]{this.a(4.00f),this.a(4.00f)};
          this.b.setPathEffect(new DashPathEffect(uofloatArray, 0));
          p0.save();
          p0.rotate(90.00f, this.i, this.i);
          p0.drawCircle(this.i, this.i, this.j, this.b);
          p0.restore();
          p0.save();
          FlashingPlateView ti = this.i;
          p0.rotate(90.00f, ((float)this.getMeasuredWidth() - ti), ti);
          FlashingPlateView ti1 = this.i;
          p0.drawCircle(((float)this.getMeasuredWidth() - ti1), ti1, this.j, this.b);
          p0.restore();
       }
       return;
    }
    public void onSizeChanged(int p0,int p1,int p2,int p3){
       if (PatchProxy.isSupport(FlashingPlateView.class) && PatchProxy.applyVoidFourRefs(Integer.valueOf(p0), Integer.valueOf(p1), Integer.valueOf(p2), Integer.valueOf(p3), this, FlashingPlateView.class, "4")) {
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
