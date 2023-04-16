package com.yxcorp.gifshow.detail.view.FeaturedSeekBar;
import android.view.View;
import android.content.Context;
import android.util.AttributeSet;
import n9a.h;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.Object;
import java.lang.String;
import android.graphics.Paint;
import android.graphics.RectF;
import android.view.ViewConfiguration;
import ll8.c$b;
import android.content.res.TypedArray;
import com.yxcorp.utility.n;
import java.lang.Float;
import com.yxcorp.gifshow.detail.view.FeaturedSeekBar$a;
import android.graphics.Canvas;
import android.view.MotionEvent;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import java.lang.Math;
import java.lang.Runnable;
import ekd.k1;
import android.view.ViewParent;

public class FeaturedSeekBar extends View	// class@001a41
{
    public Paint b;
    public RectF c;
    public RectF d;
    public float e;
    public int f;
    public int g;
    public int h;
    public int i;
    public int j;
    public int k;
    public int l;
    public boolean m;
    public int n;
    public float o;
    public int p;
    public boolean q;
    public boolean r;
    public FeaturedSeekBar$a s;
    public boolean t;
    public final Runnable u;

    public void FeaturedSeekBar(Context p0){
       super(p0, null);
    }
    public void FeaturedSeekBar(Context p0,AttributeSet p1){
       super(p0, p1, 0);
    }
    public void FeaturedSeekBar(Context p0,AttributeSet p1,int p2){
       super(p0, p1, p2);
       this.o = 0x3f800000;
       this.u = new h(this);
       int i = 0;
       if (!PatchProxy.isSupport(FeaturedSeekBar.class) || !PatchProxy.applyVoidFourRefs(p0, p1, Integer.valueOf(p2), Integer.valueOf(i), this, FeaturedSeekBar.class, "1")) {
          this.b = new Paint(5);
          this.c = new RectF();
          this.d = new RectF();
          this.n = ViewConfiguration.get(this.getContext()).getScaledTouchSlop();
          TypedArray typedArray = p0.obtainStyledAttributes(p1, c$b.F0, p2, i);
          this.e = typedArray.getFloat(1, 0);
          this.f = typedArray.getInt(3, 100);
          this.g = typedArray.getDimensionPixelSize(5, i);
          this.i = typedArray.getColor(6, -1);
          this.h = typedArray.getColor(2, 0xff000000);
          this.j = typedArray.getColor(7, -1);
          this.p = n.c(p0, 3.00f);
          typedArray.recycle();
       }
       return;
    }
    public final void a(float p0,int p1){
       if (PatchProxy.isSupport(FeaturedSeekBar.class) && PatchProxy.applyVoidTwoRefs(Float.valueOf(p0), Integer.valueOf(p1), this, FeaturedSeekBar.class, "14")) {
          return;
       }
       if (this.e - p0) {
          FeaturedSeekBar ts = this.s;
          if (ts != null) {
             ts.a(p0, (int)((float)this.f * p0), p1);
          }
       }
       return;
    }
    public int getCurrentProgress(){
       return (int)((float)this.f * this.e);
    }
    public float getCurrentRation(){
       return this.e;
    }
    public void onDraw(Canvas p0){
       FeaturedSeekBar tb;
       FeaturedSeekBar tj;
       if (PatchProxy.applyVoidOneRefs(p0, this, FeaturedSeekBar.class, "2")) {
          return;
       }
       float f = 2.00f;
       if (!PatchProxy.applyVoid(null, this, FeaturedSeekBar.class, "10")) {
          float f1 = (float)this.getMeasuredWidth();
          int i = (int)((float)this.g * this.o);
          this.k = i / 2;
          int i1 = (int)(((float)(this.getMeasuredHeight() - i) / f) + 0x3f000000);
          i = i + i1;
          float f2 = (float)i1;
          float f3 = (float)i;
          this.c.set(0, f2, (float)(int)(this.e * f1), f3);
          this.d.set(0, f2, f1, f3);
       }
       if (!PatchProxy.applyVoidOneRefs(p0, this, FeaturedSeekBar.class, "7")) {
          this.b.setColor(this.h);
          p0.drawRoundRect(this.d, (float)this.k, (float)this.k, this.b);
       }
       if (!PatchProxy.applyVoidOneRefs(p0, this, FeaturedSeekBar.class, "8")) {
          tb = this.b;
          tj = (this.r != null)? this.j: this.i;
          tb.setColor(tj);
          p0.drawRoundRect(this.c, (float)this.k, (float)this.k, this.b);
       }
       if (this.r != null && !PatchProxy.applyVoidOneRefs(p0, this, FeaturedSeekBar.class, "9")) {
          tb = this.b;
          tj = (this.r != null)? this.j: this.i;
          tb.setColor(tj);
          tb = this.c;
          p0.drawCircle(tb.right, ((tb.top + tb.bottom) / f), (float)this.p, this.b);
       }
       return;
    }
    public boolean onTouchEvent(MotionEvent p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, FeaturedSeekBar.class, "11");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (this.q == null) {
          return super.onTouchEvent(p0);
       }
       int actionMasked = p0.getActionMasked();
       String str = 1;
       if (actionMasked) {
          if (actionMasked != str) {
             if (actionMasked != 2) {
                if (actionMasked == 3) {
                label_007f :
                   if (!PatchProxy.applyVoid(null, this, FeaturedSeekBar.class, "12")) {
                      this.l = 0;
                      this.m = false;
                      this.invalidate();
                      k1.r(this.u, 3000);
                   }
                   this.t = false;
                }
             }else if(this.t == null || PatchProxy.applyVoidOneRefs(p0, this, FeaturedSeekBar.class, "13")){
                int i = (int)(p0.getX() + 0x3f000000);
                actionMasked = this.l - i;
                if (this.m == null && Math.abs(actionMasked) >= this.n) {
                   this.m = str;
                   this.o = 2.00f;
                   this.r = str;
                }
                if (this.m != null) {
                   float f = ((float)i * 0x3f800000) / (float)this.getMeasuredWidth();
                   this.a(f, false);
                   if (this.e - f) {
                      this.invalidate();
                      this.e = f;
                   }
                }
                k1.m(this.u);
             }
          }else {
             goto label_007f ;
          }
       }else {
          this.getParent().requestDisallowInterceptTouchEvent(str);
          this.l = (int)p0.getX();
          this.t = str;
       }
    label_00ac :
       return this.t;
    }
    public void setEnableSeek(boolean p0){
       this.q = p0;
    }
    public void setMaxProgress(int p0){
       this.f = p0;
    }
    public void setOnProgressChangeListener(FeaturedSeekBar$a p0){
       this.s = p0;
    }
    public void setProgress(int p0){
       if (PatchProxy.isSupport(FeaturedSeekBar.class) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, FeaturedSeekBar.class, "4")) {
          return;
       }
       if (p0 < 0) {
          return;
       }
       this.setRation((((float)Math.min(p0, this.f) * 0x3f800000) / (float)this.f));
       return;
    }
    public void setRation(float p0){
       if (PatchProxy.isSupport(FeaturedSeekBar.class) && PatchProxy.applyVoidOneRefs(Float.valueOf(p0), this, FeaturedSeekBar.class, "3")) {
          return;
       }
       if (this.e - p0) {
          this.invalidate();
          this.e = p0;
       }
       this.a(p0, 1);
       return;
    }
}
