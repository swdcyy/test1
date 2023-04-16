package com.kwai.library.widget.textview.KwaiMarqueeTextView;
import com.kwai.library.widget.textview.KwaiBaseTextView;
import lnc.a1;
import android.content.Context;
import h27.j;
import android.util.AttributeSet;
import android.animation.ValueAnimator;
import android.view.animation.LinearInterpolator;
import android.animation.TimeInterpolator;
import android.widget.TextView;
import java.lang.Math;
import h27.k;
import android.animation.Animator$AnimatorListener;
import h27.i;
import android.animation.ValueAnimator$AnimatorUpdateListener;
import java.lang.Object;
import android.view.View;
import android.graphics.Canvas;
import android.text.TextPaint;
import java.lang.String;
import android.graphics.Paint;
import androidx.appcompat.widget.AppCompatTextView;
import android.view.View$MeasureSpec;
import ll8.c$b;
import android.content.res.TypedArray;
import java.lang.CharSequence;
import android.text.TextUtils;
import android.view.ViewGroup$LayoutParams;
import java.lang.Runnable;

public class KwaiMarqueeTextView extends KwaiBaseTextView	// class@000a51
{
    public Runnable A;
    public int B;
    public int C;
    public float n;
    public boolean o;
    public int p;
    public String q;
    public float r;
    public float s;
    public int t;
    public int u;
    public float v;
    public ValueAnimator w;
    public boolean x;
    public long y;
    public long z;
    public static final int D;

    static {
       KwaiMarqueeTextView.D = a1.e(10.00f);
    }
    public void KwaiMarqueeTextView(Context p0){
       super(p0);
       this.t = a1.e(50.00f);
       this.u = a1.e(17.00f);
       this.v = 0x4f000000;
       this.y = 3000;
       this.z = 0;
       this.A = new j(this);
       this.B = Integer.MAX_VALUE;
       this.C = 0;
       this.u(p0, null);
    }
    public void KwaiMarqueeTextView(Context p0,AttributeSet p1){
       super(p0, p1);
       this.t = a1.e(50.00f);
       this.u = a1.e(17.00f);
       this.v = 0x4f000000;
       this.y = 3000;
       this.z = 0;
       this.A = new j(this);
       this.B = Integer.MAX_VALUE;
       this.C = 0;
       this.u(p0, p1);
    }
    public void KwaiMarqueeTextView(Context p0,AttributeSet p1,int p2){
       super(p0, p1, p2);
       this.t = a1.e(50.00f);
       this.u = a1.e(17.00f);
       this.v = 0x4f000000;
       this.y = 3000;
       this.z = 0;
       this.A = new j(this);
       this.B = Integer.MAX_VALUE;
       this.C = 0;
       this.u(p0, p1);
    }
    public static void t(KwaiMarqueeTextView p0){
       if (p0.x != null) {
       }else {
          float f = p0.r + p0.getEndStartPadding();
          float[] uofloatArray = new float[]{0,f};
          ValueAnimator valueAnimato = ValueAnimator.ofFloat(uofloatArray);
          p0.w = valueAnimato;
          valueAnimato.setInterpolator(new LinearInterpolator());
          if (!p0.z) {
             p0.z = (long)((Math.max(f, (float)p0.getWidth()) * 1000.00f) / (float)KwaiMarqueeTextView.D);
          }
          p0.w.setDuration(p0.z);
          p0.w.addListener(new k(p0));
          p0.w.addUpdateListener(new i(p0));
          p0.w.setTarget(p0);
          p0.w.start();
       }
       return;
    }
    public float getEndStartPadding(){
       KwaiMarqueeTextView tv = this.v;
       if (!tv - 0x4f000000) {
          tv = this.getTextSize();
       }
       return tv;
    }
    public int getMaxRepeatCount(){
       return this.B;
    }
    public void onAttachedToWindow(){
       super.onAttachedToWindow();
       this.x = false;
    }
    public void onDetachedFromWindow(){
       super.onDetachedFromWindow();
       this.y();
    }
    public void onDraw(Canvas p0){
       super.onDraw(p0);
       if (this.o != null) {
          float f = - this.s;
          while (f - (float)this.p < 0) {
             p0.drawText(this.q, f, this.n, this.getPaint());
             float f1 = this.r + this.getEndStartPadding();
             f = f + f1;
          }
       }
       return;
    }
    public void onLayout(boolean p0,int p1,int p2,int p3,int p4){
       super.onLayout(p0, p1, p2, p3, p4);
       this.n = (float)(int)((float)(this.getHeight() / 2) - ((this.getPaint().descent() + this.getPaint().ascent()) / 2.00f));
    }
    public void onMeasure(int p0,int p1){
       super.onMeasure(p0, p1);
       int mode = View$MeasureSpec.getMode(p0);
       p0 = View$MeasureSpec.getSize(p0);
       int mode1 = View$MeasureSpec.getMode(p1);
       p1 = View$MeasureSpec.getSize(p1);
       if (mode == Integer.MIN_VALUE && mode1 == Integer.MIN_VALUE) {
          this.setMeasuredDimension(this.t, this.u);
       }else if(mode == Integer.MIN_VALUE){
          this.setMeasuredDimension(this.t, p1);
       }else if(mode1 == Integer.MIN_VALUE){
          this.setMeasuredDimension(p0, this.u);
       }else {
          this.p = p0;
       }
       return;
    }
    public void setAnimStartDelayMs(long p0){
       this.y = p0;
    }
    public void setDuration(long p0){
       this.z = p0;
    }
    public void setEndStartPadding(float p0){
       this.v = p0;
    }
    public void setMaxRepeatCount(int p0){
       this.B = p0;
    }
    public void setText(String p0){
       this.v(p0, true);
    }
    public final void u(Context p0,AttributeSet p1){
       if (p1 != null) {
          TypedArray typedArray = p0.obtainStyledAttributes(p1, c$b.a2);
          this.y = (long)typedArray.getInteger(0, 3000);
          this.z = (long)typedArray.getInteger(1, 0);
          typedArray.recycle();
       }
       return;
    }
    public void v(String p0,boolean p1){
       if (TextUtils.isEmpty(p0)) {
          return;
       }
       int i = 0;
       this.C = i;
       super.setText("");
       this.q = p0;
       this.r = this.getPaint().measureText(this.q);
       ViewGroup$LayoutParams width = (this.getLayoutParams().width > null)? this.getLayoutParams().width: this.t;
       this.p = width;
       if (!this.x(p1)) {
          this.o = i;
          this.setGravity(17);
          this.y();
          super.setText(this.q);
          return;
       }else {
          this.o = true;
          this.setGravity(19);
          this.x = i;
          this.postDelayed(this.A, this.y);
          return;
       }
    }
    public void w(String p0,boolean p1,int p2){
       if (TextUtils.isEmpty(p0)) {
          return;
       }
       this.C = 0;
       super.setText("");
       this.q = p0;
       this.r = this.getPaint().measureText(this.q);
       ViewGroup$LayoutParams width = (this.getLayoutParams().width > null)? this.getLayoutParams().width: this.t;
       this.p = width;
       if (!this.x(p1)) {
          this.o = false;
          this.setGravity(p2);
          this.y();
          super.setText(this.q);
          return;
       }else {
          this.o = true;
          this.setGravity(p2);
          this.x = false;
          this.postDelayed(this.A, this.y);
          return;
       }
    }
    public final boolean x(boolean p0){
       boolean b = false;
       if (!p0) {
          return b;
       }
       if (this.r - (float)this.p > 0) {
          b = true;
       }
       return b;
    }
    public void y(){
       this.C = 0;
       this.x = true;
       KwaiMarqueeTextView tw = this.w;
       if (tw != null) {
          tw.cancel();
       }
       if (this.s) {
          this.s = 0;
          this.invalidate();
       }
       this.removeCallbacks(this.A);
       return;
    }
}
