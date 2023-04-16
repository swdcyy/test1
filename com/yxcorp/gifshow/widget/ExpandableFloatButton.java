package com.yxcorp.gifshow.widget.ExpandableFloatButton;
import androidx.appcompat.widget.AppCompatTextView;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.content.Context;
import android.util.AttributeSet;
import tyc.p5;
import android.view.View;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import ll8.c$b;
import android.content.res.TypedArray;
import android.animation.Animator;
import ekd.f;
import java.lang.Integer;
import android.widget.TextView;
import com.yxcorp.gifshow.widget.ExpandableFloatButton$c;
import android.animation.ValueAnimator;
import android.view.View$MeasureSpec;
import android.util.Property;
import android.animation.ObjectAnimator;
import android.animation.TimeInterpolator;
import com.yxcorp.gifshow.widget.ExpandableFloatButton$a;
import android.animation.Animator$AnimatorListener;
import com.yxcorp.gifshow.widget.n;
import android.animation.ValueAnimator$AnimatorUpdateListener;
import com.yxcorp.gifshow.widget.ExpandableFloatButton$b;
import com.yxcorp.gifshow.widget.o;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import android.view.animation.Interpolator;

public class ExpandableFloatButton extends AppCompatTextView	// class@001840
{
    public int f;
    public ValueAnimator g;
    public ValueAnimator h;
    public int i;
    public Interpolator j;
    public ExpandableFloatButton$c k;
    public Animator$AnimatorListener l;
    public Animator$AnimatorListener m;
    public ValueAnimator$AnimatorUpdateListener n;
    public ValueAnimator$AnimatorUpdateListener o;
    public p5 p;
    public int q;
    public int r;
    public int s;
    public int t;
    public boolean u;
    public static final Interpolator v;

    static {
       ExpandableFloatButton.v = new AccelerateDecelerateInterpolator();
    }
    public void ExpandableFloatButton(Context p0){
       super(p0, null);
    }
    public void ExpandableFloatButton(Context p0,AttributeSet p1){
       super(p0, p1, 0);
    }
    public void ExpandableFloatButton(Context p0,AttributeSet p1,int p2){
       super(p0, p1, p2);
       this.f = 1;
       this.u = false;
       this.p = new p5(this);
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, ExpandableFloatButton.class, "1")) {
       }else {
          TypedArray typedArray = p0.obtainStyledAttributes(p1, c$b.A0);
          this.q = typedArray.getDimensionPixelSize(2, false);
          this.r = typedArray.getDimensionPixelSize(false, false);
          this.s = typedArray.getDimensionPixelSize(1, false);
          typedArray.recycle();
       }
       this.p();
       return;
    }
    public void onDetachedFromWindow(){
       if (PatchProxy.applyVoid(null, this, ExpandableFloatButton.class, "8")) {
          return;
       }
       super.onDetachedFromWindow();
       f.a(this.h);
       f.a(this.g);
       return;
    }
    public void onVisibilityChanged(View p0,int p1){
       if (PatchProxy.isSupport(ExpandableFloatButton.class) && PatchProxy.applyVoidTwoRefs(p0, Integer.valueOf(p1), this, ExpandableFloatButton.class, "7")) {
          return;
       }
       super.onVisibilityChanged(p0, p1);
       ExpandableFloatButton tk = this.k;
       if (tk != null) {
          tk.a(this.getWindowVisibility(), this.getVisibility());
       }
       return;
    }
    public void onWindowVisibilityChanged(int p0){
       if (PatchProxy.isSupport(ExpandableFloatButton.class) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, ExpandableFloatButton.class, "6")) {
          return;
       }
       super.onWindowVisibilityChanged(p0);
       ExpandableFloatButton tk = this.k;
       if (tk != null) {
          tk.a(this.getWindowVisibility(), this.getVisibility());
       }
       return;
    }
    public void p(){
       Interpolator v;
       if (PatchProxy.applyVoid(null, this, ExpandableFloatButton.class, "2")) {
          return;
       }
       ExpandableFloatButton tg = this.g;
       if (tg != null) {
          tg.cancel();
          this.g.removeAllListeners();
       }
       tg = this.h;
       if (tg != null) {
          tg.cancel();
          this.h.removeAllListeners();
       }
       this.measure(View$MeasureSpec.makeMeasureSpec(0x20000000, Integer.MIN_VALUE), View$MeasureSpec.makeMeasureSpec(0x20000000, Integer.MIN_VALUE));
       int paddingLeft = this.getPaddingLeft();
       int paddingRight = this.getPaddingRight();
       int i = paddingLeft - this.r;
       int i1 = paddingRight - this.s;
       int measuredWidt = this.getMeasuredWidth();
       this.t = measuredWidt;
       Property b = p5.b;
       int i2 = 2;
       int[] ointArray = new int[i2];
       ointArray[0] = this.q;
       ointArray[1] = measuredWidt;
       ObjectAnimator objectAnimat = ObjectAnimator.ofInt(this.p, b, ointArray);
       this.g = objectAnimat;
       ExpandableFloatButton ti = this.i;
       long l = 300;
       long l1 = (ti <= null)? l: (long)ti;
       objectAnimat.setDuration(l1);
       tg = this.g;
       ti = this.j;
       if (ti == null) {
          v = ExpandableFloatButton.v;
       }
       tg.setInterpolator(v);
       this.g.addListener(new ExpandableFloatButton$a(this));
       this.g.addUpdateListener(new n(this, i, i1));
       int[] ointArray1 = new int[i2];
       ointArray1[0] = this.t;
       ointArray1[1] = this.q;
       objectAnimat = ObjectAnimator.ofInt(this.p, b, ointArray1);
       this.h = objectAnimat;
       ti = this.i;
       if (ti > null) {
          l = (long)ti;
       }
       objectAnimat.setDuration(l);
       tg = this.h;
       ti = this.j;
       if (ti == null) {
          v = ExpandableFloatButton.v;
       }
       tg.setInterpolator(v);
       this.h.addListener(new ExpandableFloatButton$b(this));
       o oo = new o(this, paddingLeft, i, paddingRight, i1);
       this.h.addUpdateListener(v);
       this.f = 1;
       this.u = true;
       return;
    }
    public boolean q(){
       boolean b = (this.f == 2)? true: false;
       return b;
    }
    public boolean r(){
       boolean b = true;
       if (this.f == b) {
       }else {
          b = false;
       }
       return b;
    }
    public boolean s(){
       Object obj = PatchProxy.apply(null, this, ExpandableFloatButton.class, "9");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = (this.h.isRunning() || this.g.isRunning())? true: false;
       return b;
    }
    public void setBtnText(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, ExpandableFloatButton.class, "10")) {
          return;
       }
       if (TextUtils.n(p0, this.getText())) {
          return;
       }
       this.setText(p0);
       if (this.getVisibility()) {
          return;
       }
       ExpandableFloatButton tf = this.f;
       this.t(0);
       if (tf == 2 || tf == 4) {
          this.p.c(this.q);
          this.f = 2;
       }
       return;
    }
    public void setCollapseAnimatorListener(Animator$AnimatorListener p0){
       this.m = p0;
    }
    public void setCollapseAnimatorUpdateListener(ValueAnimator$AnimatorUpdateListener p0){
       this.o = p0;
    }
    public void setDuration(int p0){
       this.i = p0;
    }
    public void setExpandAnimatorListener(Animator$AnimatorListener p0){
       this.l = p0;
    }
    public void setExpandAnimatorUpdateListener(ValueAnimator$AnimatorUpdateListener p0){
       this.n = p0;
    }
    public void setInterpolator(Interpolator p0){
       this.j = p0;
    }
    public void setOnVisibleListener(ExpandableFloatButton$c p0){
       this.k = p0;
    }
    public final void t(int p0){
       if (PatchProxy.isSupport(ExpandableFloatButton.class) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, ExpandableFloatButton.class, "3")) {
          return;
       }
       int i = 0;
       if (p0) {
          int i1 = 1;
          if (p0 != i1) {
             int i2 = 3;
             int i3 = 2;
             if (p0 != i3) {
                if (p0 != i2) {
                   if (p0 != 4) {
                      if (p0 == 5 && (!PatchProxy.applyVoid(null, this, ExpandableFloatButton.class, "5") && (!this.q() || this.getVisibility()))) {
                         if (this.getVisibility()) {
                            this.setVisibility(i);
                         }
                         this.h.end();
                         this.f = i3;
                      }
                   }else if(PatchProxy.applyVoid(null, this, ExpandableFloatButton.class, "4") || (this.r() && !this.getVisibility())){
                      if (this.getVisibility()) {
                         this.setVisibility(i);
                      }
                      this.g.end();
                      this.f = i1;
                   }
                }else if(!this.q() && !this.s()){
                   this.h.start();
                   this.f = 4;
                }
             }else if(!this.r() && !this.s()){
                this.g.start();
                this.f = i2;
             }
          }else {
             this.setVisibility(8);
          }
       }else {
          this.setVisibility(i);
          this.p();
          if (this.r()) {
             this.p.c(this.t);
          }
       }
       return;
    }
}
