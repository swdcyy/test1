package com.kuaishou.live.common.core.component.gift.domain.giftbox.view.LiveGradientRotateButton;
import androidx.appcompat.widget.AppCompatTextView;
import android.content.Context;
import android.util.AttributeSet;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import ll8.c$b;
import android.content.res.TypedArray;
import lnc.a1;
import android.animation.ValueAnimator;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import zi1.l;
import android.animation.ValueAnimator$AnimatorUpdateListener;
import android.view.animation.LinearInterpolator;
import android.animation.TimeInterpolator;
import android.widget.TextView;
import android.view.View;
import android.graphics.Canvas;
import java.lang.Math;
import android.graphics.Path$Direction;
import android.graphics.PathMeasure;
import android.graphics.LinearGradient;
import android.graphics.Shader$TileMode;
import android.graphics.Shader;
import java.lang.Boolean;
import java.lang.Float;

public class LiveGradientRotateButton extends AppCompatTextView	// class@00122c
{
    public int f;
    public int g;
    public int h;
    public int i;
    public Paint j;
    public PathMeasure k;
    public Path l;
    public float m;
    public boolean n;
    public RectF o;
    public float p;
    public final float[] q;
    public final float[] r;
    public ValueAnimator s;
    public static final int t;

    public void LiveGradientRotateButton(Context p0){
       super(p0, null);
    }
    public void LiveGradientRotateButton(Context p0,AttributeSet p1){
       super(p0, p1, 0);
    }
    public void LiveGradientRotateButton(Context p0,AttributeSet p1,int p2){
       super(p0, p1, p2);
       this.f = 0;
       this.g = 0;
       this.h = 0;
       this.i = 0;
       this.j = new Paint();
       this.m = 0;
       this.n = false;
       float[] uofloatArray = new float[2];
       this.q = uofloatArray;
       uofloatArray = new float[2];
       this.r = uofloatArray;
       this.l = new Path();
       this.o = new RectF();
       TypedArray typedArray = p0.obtainStyledAttributes(p1, c$b.A2);
       this.f = typedArray.getColor(2, a1.a(0x7f06212b));
       this.g = typedArray.getColor(2, a1.a(0x7f060540));
       this.h = typedArray.getColor(2, a1.a(0x7f06053f));
       this.i = typedArray.getDimensionPixelOffset(3, a1.d(0x7f0702b8));
    }
    public final ValueAnimator getGradientRotateAnimator(){
       ValueAnimator obj = PatchProxy.apply(null, this, LiveGradientRotateButton.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (this.s == null) {
          obj = ValueAnimator.ofFloat(new float[2]{0,0x3f800000});
          this.s = obj;
          obj.addUpdateListener(new l(this));
          this.s.setRepeatCount(-1);
          this.s.setDuration(5000);
          this.s.setInterpolator(new LinearInterpolator());
       }
       return this.s;
    }
    public void onAttachedToWindow(){
       if (PatchProxy.applyVoid(null, this, LiveGradientRotateButton.class, "4")) {
          return;
       }
       super.onAttachedToWindow();
       if (this.isEnabled() && this.n == null) {
          this.getGradientRotateAnimator().start();
       }
       return;
    }
    public void onDetachedFromWindow(){
       if (PatchProxy.applyVoid(null, this, LiveGradientRotateButton.class, "7")) {
          return;
       }
       super.onDetachedFromWindow();
       this.getGradientRotateAnimator().removeAllUpdateListeners();
       this.getGradientRotateAnimator().removeAllUpdateListeners();
       this.getGradientRotateAnimator().cancel();
       this.s = null;
       return;
    }
    public void onDraw(Canvas p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveGradientRotateButton.class, "2")) {
          return;
       }
       boolean b = false;
       if (this.isEnabled() && this.n == null) {
          float f = (float)this.getWidth();
          float f1 = (float)this.getHeight();
          if (!this.m) {
             this.m = (float)(Math.sqrt((double)((f * f) + (f1 * f1))) / 2.00f);
          }
          this.m = this.m / 2.00f;
          this.l.reset();
          this.l.addCircle((f / 2.00f), (f1 / 2.00f), this.m, Path$Direction.CCW);
          if (this.k == null) {
             this.k = new PathMeasure(this.l, b);
          }
          LiveGradientRotateButton tk = this.k;
          tk.getPosTan((tk.getLength() * this.p), this.q, this.r);
          tk = this.q;
          LiveGradientRotateButton tq = this.q;
          int[] ointArray = new int[]{this.f,this.g,this.h};
          LinearGradient linearGradie = new LinearGradient(tq[b], tq[1], (f - tk[b]), (f1 - tk[1]), ointArray, null, Shader$TileMode.CLAMP);
          this.j.setShader(tk);
          this.o.set(0, 0, f, f1);
          LiveGradientRotateButton ti = this.i;
          f1 = (float)ti;
          p0.drawRoundRect(this.o, f1, (float)ti, this.j);
       }else {
          p0.drawColor(b);
       }
       super.onDraw(p0);
       return;
    }
    public void setEffectDisabled(boolean p0){
       if (PatchProxy.isSupport(LiveGradientRotateButton.class) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, LiveGradientRotateButton.class, "6")) {
          return;
       }
       this.n = p0;
       this.invalidate();
       return;
    }
    public void setEnabled(boolean p0){
       if (PatchProxy.isSupport(LiveGradientRotateButton.class) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, LiveGradientRotateButton.class, "3")) {
          return;
       }
       super.setEnabled(p0);
       if (this.n != null) {
          return;
       }
       if (this.isEnabled() != p0) {
          if (p0) {
             this.getGradientRotateAnimator().start();
          }else {
             this.getGradientRotateAnimator().cancel();
          }
       }
       this.invalidate();
       return;
    }
    public void setProgress(float p0){
       if (PatchProxy.isSupport(LiveGradientRotateButton.class) && PatchProxy.applyVoidOneRefs(Float.valueOf(p0), this, LiveGradientRotateButton.class, "1")) {
          return;
       }
       this.p = p0;
       this.invalidate();
       return;
    }
}
