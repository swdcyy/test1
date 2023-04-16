package com.kuaishou.live.core.basic.widget.LiveShimmerGradientTextView;
import androidx.appcompat.widget.AppCompatTextView;
import android.content.Context;
import android.util.AttributeSet;
import android.graphics.Matrix;
import ll8.c$b;
import android.content.res.TypedArray;
import lnc.a1;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.widget.TextView;
import android.view.View;
import android.graphics.Canvas;
import android.animation.ValueAnimator;
import android.text.TextPaint;
import android.graphics.Shader;
import java.lang.Float;
import android.graphics.LinearGradient;
import java.lang.Integer;
import android.graphics.Shader$TileMode;
import java.lang.Long;
import android.animation.Animator$AnimatorListener;
import com.kuaishou.live.core.basic.widget.LiveShimmerGradientTextView$a;
import d22.l;
import android.animation.ValueAnimator$AnimatorUpdateListener;

public class LiveShimmerGradientTextView extends AppCompatTextView	// class@000912
{
    public ValueAnimator f;
    public Animator$AnimatorListener g;
    public LinearGradient h;
    public final Matrix i;
    public int[] j;
    public float k;
    public boolean l;
    public long m;
    public static final int n;

    public void LiveShimmerGradientTextView(Context p0){
       super(p0, null);
    }
    public void LiveShimmerGradientTextView(Context p0,AttributeSet p1){
       super(p0, p1, 0);
    }
    public void LiveShimmerGradientTextView(Context p0,AttributeSet p1,int p2){
       super(p0, p1, p2);
       this.i = new Matrix();
       this.k = 0x41f00000;
       if (p1 != null) {
          TypedArray typedArray = p0.obtainStyledAttributes(p1, c$b.S2);
          int color = typedArray.getColor(1, a1.a(R.color.arg_RES_7f060186));
          int[] ointArray = new int[]{color,typedArray.getColor(0, a1.a(0x7f06060a)),color,color,color,color,color,color};
          this.j = ointArray;
          typedArray.recycle();
       }
       return;
    }
    public void onAttachedToWindow(){
       if (PatchProxy.applyVoid(null, this, LiveShimmerGradientTextView.class, "4")) {
          return;
       }
       super.onAttachedToWindow();
       if (this.l != null) {
          LiveShimmerGradientTextView tm = this.m;
          if (tm > 0) {
             this.p(tm, -1);
          }
       }
       return;
    }
    public void onDetachedFromWindow(){
       if (PatchProxy.applyVoid(null, this, LiveShimmerGradientTextView.class, "5")) {
          return;
       }
       super.onDetachedFromWindow();
       this.q();
       return;
    }
    public void onDraw(Canvas p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveShimmerGradientTextView.class, "1")) {
          return;
       }
       if (this.h != null) {
          LiveShimmerGradientTextView tf = this.f;
          if (tf != null && tf.isRunning()) {
             this.getPaint().setShader(this.h);
             this.i.reset();
             this.i.setRotate(this.k, ((float)this.getWidth() / 2.00f), ((float)this.getHeight() / 2.00f));
             this.i.setTranslate(this.f.getAnimatedValue().floatValue(), 0);
             this.h.setLocalMatrix(this.i);
          label_005f :
             super.onDraw(p0);
             return;
          }
       }
       this.getPaint().setShader(null);
       goto label_005f ;
    }
    public void onSizeChanged(int p0,int p1,int p2,int p3){
       if (PatchProxy.isSupport(LiveShimmerGradientTextView.class) && PatchProxy.applyVoidFourRefs(Integer.valueOf(p0), Integer.valueOf(p1), Integer.valueOf(p2), Integer.valueOf(p3), this, LiveShimmerGradientTextView.class, "2")) {
          return;
       }
       super.onSizeChanged(p0, p1, p2, p3);
       if (PatchProxy.applyVoid(null, this, LiveShimmerGradientTextView.class, "6") || (this.getMeasuredWidth() > 0 && this.getMeasuredHeight() > 0)) {
          LiveShimmerGradientTextView tj = this.j;
          if (tj != null && tj.length > 0) {
             LinearGradient linearGradie = new LinearGradient(0, 0, (float)this.getMeasuredWidth(), 0, this.j, null, Shader$TileMode.CLAMP);
             this.h = tj.length;
          }
       }
    label_005d :
       return;
    }
    public final void p(long p0,int p1){
       if (PatchProxy.isSupport(LiveShimmerGradientTextView.class) && PatchProxy.applyVoidTwoRefs(Long.valueOf(p0), Integer.valueOf(p1), this, LiveShimmerGradientTextView.class, "3")) {
          return;
       }
       this.q();
       float[] uofloatArray = new float[]{(float)(- this.getWidth()),(float)this.getWidth()};
       ValueAnimator valueAnimato = ValueAnimator.ofFloat(uofloatArray);
       this.f = valueAnimato;
       valueAnimato.setDuration(p0);
       LiveShimmerGradientTextView tg = this.g;
       if (tg != null) {
          this.f.addListener(tg);
       }
       this.f.setRepeatCount(p1);
       this.f.addListener(new LiveShimmerGradientTextView$a(this));
       this.f.addUpdateListener(new l(this));
       if (this.f.isRunning()) {
          this.f.cancel();
       }
       this.f.start();
       return;
    }
    public void q(){
       if (PatchProxy.applyVoid(null, this, LiveShimmerGradientTextView.class, "9")) {
          return;
       }
       LiveShimmerGradientTextView tf = this.f;
       if (tf != null) {
          tf.removeAllListeners();
          this.f.removeAllUpdateListeners();
          this.f.cancel();
          this.f = null;
       }
       return;
    }
    public void setAnimatorListener(Animator$AnimatorListener p0){
       this.g = p0;
    }
    public void setRotateAngle(float p0){
       this.k = p0;
    }
}
