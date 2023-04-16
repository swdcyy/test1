package com.kuaishou.live.common.core.component.gift.domain.giftguide.view.LiveGuideGiftAnimationView;
import android.view.View;
import android.content.Context;
import android.util.AttributeSet;
import o56.c;
import o56.a;
import android.app.Application;
import android.content.res.Resources;
import android.graphics.RectF;
import android.graphics.Paint$FontMetricsInt;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import ll8.c$b;
import android.content.res.TypedArray;
import android.graphics.Paint;
import android.graphics.Paint$Cap;
import android.graphics.Paint$Style;
import android.graphics.Paint$Align;
import android.animation.AnimatorSet;
import java.util.ArrayList;
import android.animation.ValueAnimator;
import ij1.e;
import android.animation.ValueAnimator$AnimatorUpdateListener;
import com.kuaishou.live.common.core.component.gift.domain.giftguide.view.LiveGuideGiftAnimationView$a;
import android.animation.Animator$AnimatorListener;
import android.animation.Animator;
import android.animation.AnimatorSet$Builder;
import android.graphics.Canvas;
import java.lang.Float;
import java.lang.Boolean;
import java.lang.Integer;
import android.graphics.SweepGradient;
import android.graphics.Shader;
import com.kuaishou.live.common.core.component.gift.domain.giftguide.view.LiveGuideGiftAnimationView$b;

public class LiveGuideGiftAnimationView extends View	// class@001251
{
    public int[] b;
    public Paint c;
    public Paint d;
    public String e;
    public float f;
    public float g;
    public float h;
    public float i;
    public float j;
    public float k;
    public float l;
    public AnimatorSet m;
    public RectF n;
    public Paint$FontMetricsInt o;
    public LiveGuideGiftAnimationView$b p;
    public static final int q;

    public void LiveGuideGiftAnimationView(Context p0){
       super(p0, null);
    }
    public void LiveGuideGiftAnimationView(Context p0,AttributeSet p1){
       super(p0, p1, 0);
    }
    public void LiveGuideGiftAnimationView(Context p0,AttributeSet p1,int p2){
       super(p0, p1, p2);
       int[] ointArray = new int[]{a.a().a().getResources().getColor(0x7f060753),a.a().a().getResources().getColor(0x7f060753),a.a().a().getResources().getColor(0x7f060428),a.a().a().getResources().getColor(0x7f060753),a.a().a().getResources().getColor(0x7f060753)};
       this.b = ointArray;
       this.h = 0;
       this.n = new RectF();
       this.o = new Paint$FontMetricsInt();
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, LiveGuideGiftAnimationView.class, "1")) {
       }else {
          TypedArray typedArray = p0.obtainStyledAttributes(p1, c$b.b1);
          this.i = typedArray.getDimension(2, 8.00f);
          this.f = typedArray.getDimension(0, 40.00f);
          float dimension = typedArray.getDimension(1, 0x42f00000);
          this.j = dimension;
          this.g = dimension;
          typedArray.recycle();
          p0.obtainStyledAttributes(p1, new int[2]{0x10100f4,0x10100f5}).recycle();
          if (!PatchProxy.applyVoid(null, this, LiveGuideGiftAnimationView.class, "2")) {
             Paint paint = new Paint();
             this.c = paint;
             paint.setAntiAlias(1);
             this.c.setStrokeCap(Paint$Cap.ROUND);
             this.c.setStrokeWidth(this.i);
             this.c.setStyle(Paint$Style.STROKE);
             paint = new Paint();
             this.d = paint;
             paint.setColor(-1);
             this.d.setTextAlign(Paint$Align.CENTER);
             this.d.setTextSize(this.f);
          }
       }
       return;
    }
    public void a(){
       if (PatchProxy.applyVoid(null, this, LiveGuideGiftAnimationView.class, "10")) {
          return;
       }
       this.h = 0;
       LiveGuideGiftAnimationView tm = this.m;
       if (tm != null) {
          tm.removeAllListeners();
          this.m.end();
          this.m.cancel();
       }
       return;
    }
    public void b(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, LiveGuideGiftAnimationView.class, "9")) {
          return;
       }
       LiveGuideGiftAnimationView tm = this.m;
       if (tm != null) {
          tm.removeAllListeners();
          for (int i = 0; i < this.m.getChildAnimations().size(); i = i + 1) {
             this.m.getChildAnimations().get(i).removeAllUpdateListeners();
          }
          this.m.end();
          this.m.cancel();
          this.m = objArray;
       }
       this.h = 0;
       ValueAnimator valueAnimato = ValueAnimator.ofFloat(new float[2]{0x3f800000,0});
       valueAnimato.addUpdateListener(new e(this));
       valueAnimato.setDuration(3000);
       AnimatorSet uAnimatorSet = new AnimatorSet();
       this.m = uAnimatorSet;
       uAnimatorSet.addListener(new LiveGuideGiftAnimationView$a(this));
       this.m.play(valueAnimato);
       this.m.start();
       return;
    }
    public void onDraw(Canvas p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveGuideGiftAnimationView.class, "6")) {
          return;
       }
       super.onDraw(p0);
       LiveGuideGiftAnimationView th = this.h;
       if (!PatchProxy.isSupport(LiveGuideGiftAnimationView.class) || (!PatchProxy.applyVoidTwoRefs(p0, Float.valueOf(th), this, LiveGuideGiftAnimationView.class, "7") && th - 0x3f800000)) {
          float f = this.i / 2.00f;
          this.n.set((0 + f), (0 + f), ((this.g * 2.00f) - f), ((this.g * 2.00f) - f));
          p0.drawArc(this.n, 270.00f, (th * 360.00f), false, this.c);
       }
       return;
    }
    public void onLayout(boolean p0,int p1,int p2,int p3,int p4){
       if (PatchProxy.isSupport(LiveGuideGiftAnimationView.class)) {
          Object[] objArray = new Object[]{Boolean.valueOf(p0),Integer.valueOf(p1),Integer.valueOf(p2),Integer.valueOf(p3),Integer.valueOf(p4)};
          if (PatchProxy.applyVoid(objArray, this, LiveGuideGiftAnimationView.class, "5")) {
             return;
          }
       }
       super.onLayout(p0, p1, p2, p3, p4);
       this.k = (float)(this.getWidth() / 2);
       this.l = (float)(this.getHeight() / 2);
       this.c.setShader(new SweepGradient(this.k, this.l, this.b, null));
       return;
    }
    public void setAnimationFinishListener(LiveGuideGiftAnimationView$b p0){
       this.p = p0;
    }
    public void setCircleRadius(float p0){
       this.j = p0;
       this.g = p0;
    }
    public void setRingWidth(float p0){
       if (PatchProxy.isSupport(LiveGuideGiftAnimationView.class) && PatchProxy.applyVoidOneRefs(Float.valueOf(p0), this, LiveGuideGiftAnimationView.class, "3")) {
          return;
       }
       this.i = p0;
       this.c.setStrokeWidth(p0);
       this.invalidate();
       return;
    }
    public void setTextSize(float p0){
       if (PatchProxy.isSupport(LiveGuideGiftAnimationView.class) && PatchProxy.applyVoidOneRefs(Float.valueOf(p0), this, LiveGuideGiftAnimationView.class, "4")) {
          return;
       }
       this.f = p0;
       this.d.setTextSize(p0);
       return;
    }
}
