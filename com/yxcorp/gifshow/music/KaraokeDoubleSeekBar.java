package com.yxcorp.gifshow.music.KaraokeDoubleSeekBar;
import android.view.View;
import android.content.Context;
import android.util.AttributeSet;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import ll8.c$b;
import android.content.res.TypedArray;
import android.content.res.Resources;
import cw9.c;
import java.lang.Float;
import java.lang.Integer;
import android.graphics.Paint;
import android.graphics.drawable.shapes.RoundRectShape;
import android.graphics.RectF;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.Shape;
import android.graphics.Paint$Style;
import lnc.a1;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.BlurMaskFilter;
import android.graphics.BlurMaskFilter$Blur;
import android.graphics.MaskFilter;
import android.widget.TextView;
import android.graphics.Typeface;
import ekd.d0;
import kob.l;
import java.lang.Runnable;
import com.yxcorp.gifshow.music.KaraokeDoubleSeekBar$a;
import android.graphics.Rect;
import com.yxcorp.utility.n;
import java.lang.StringBuilder;
import java.lang.CharSequence;
import com.kwai.robust.PatchProxyResult;
import android.widget.FrameLayout;
import android.graphics.Canvas;
import java.lang.Math;
import android.view.MotionEvent;
import java.lang.Boolean;
import java.lang.Number;
import android.widget.FrameLayout$LayoutParams;
import android.view.ViewGroup$LayoutParams;

public class KaraokeDoubleSeekBar extends View	// class@001fd1
{
    public Drawable b;
    public Drawable c;
    public Drawable d;
    public int e;
    public TextView f;
    public boolean g;
    public LayerDrawable h;
    public LayerDrawable i;
    public LayerDrawable j;
    public KaraokeDoubleSeekBar$a k;
    public int l;
    public int m;
    public int n;
    public int o;
    public boolean p;
    public int q;
    public int[] r;

    public void KaraokeDoubleSeekBar(Context p0){
       super(p0, null, 0);
    }
    public void KaraokeDoubleSeekBar(Context p0,AttributeSet p1){
       super(p0, p1, 0);
    }
    public void KaraokeDoubleSeekBar(Context p0,AttributeSet p1,int p2){
       float f1;
       int i2;
       int i3;
       int i = this;
       Object obj = p0;
       Drawable obj1 = p1;
       super(p0, p1, p2);
       i.e = 0;
       i.g = true;
       int i1 = 10;
       i.l = i1;
       i.p = false;
       i.q = 1;
       int[] ointArray = new int[2];
       i.r = ointArray;
       if (PatchProxy.applyVoidTwoRefs(obj, obj1, i, KaraokeDoubleSeekBar.class, "1")) {
       }else {
          TypedArray typedArray = obj.obtainStyledAttributes(obj1, c$b.u1);
          i.o = typedArray.getInt(0, 0);
          int color = typedArray.getColor(true, 0);
          int color1 = typedArray.getColor(i1, 0);
          typedArray.getColor(12, 0);
          i.q = typedArray.getColor(11, true);
          i.g = typedArray.getBoolean(4, 0);
          typedArray.getDimensionPixelSize(14, 0);
          typedArray.getDimensionPixelSize(13, c.a(p0.getResources(), R.dimen.arg_RES_7f070e62));
          int dimensionPix = typedArray.getDimensionPixelSize(7, 0);
          int dimensionPix1 = typedArray.getDimensionPixelSize(8, 0);
          int dimensionPix2 = typedArray.getDimensionPixelSize(9, 0);
          int dimensionPix3 = typedArray.getDimensionPixelSize(6, 0);
          i.n = typedArray.getInt(17, 100);
          i.l = typedArray.getDimensionPixelSize(5, 3);
          float f = (float)typedArray.getDimensionPixelSize(15, 0);
          if (PatchProxy.isSupport(KaraokeDoubleSeekBar.class)) {
             f1 = f;
             i2 = dimensionPix3;
             i3 = dimensionPix2;
             if (PatchProxy.applyVoidThreeRefs(Float.valueOf(f), Integer.valueOf(color), Integer.valueOf(color1), this, KaraokeDoubleSeekBar.class, "11")) {
             label_019d :
                int i4 = 16;
                i1 = 0x7f080800;
                try{
                   obj1 = typedArray.getDrawable(i4);
                   i.b = obj1;
                   if (obj1 == null) {
                      i.b = this.getResources().getDrawable(i1);
                   }
                }catch(java.lang.Exception e0){
                   i.b = this.getResources().getDrawable(i1);
                }
                i.c = typedArray.getDrawable(2);
                i.d = typedArray.getDrawable(3);
                i.setPadding((dimensionPix + (i.b.getIntrinsicWidth() / 2)), i3, (dimensionPix1 + (i.b.getIntrinsicWidth() / 2)), i2);
                typedArray.recycle();
                TextView textView = new TextView(this.getContext());
                i.f = textView;
                textView.setBackgroundResource(R.drawable.arg_RES_7f08103d);
                i.f.setGravity(17);
                i.f.setTextColor(this.getResources().getColor(R.color.arg_RES_7f0606da));
                i.f.setTypeface(d0.a("alte-din.ttf", obj));
                i.f.setTextSize(2, 20.00f);
             }
          }else {
             f1 = f;
             i2 = dimensionPix3;
             i3 = dimensionPix2;
             int i5 = 8;
             int i6 = 6;
          }
          float[] uofloatArray = new float[]{f1,f1,f1,f1,f1,f1,f1,f1};
          i.setLayerType(true, null);
          super(new RoundRectShape(uofloatArray, null, null));
          this.getPaint().setColor(color);
          this.getPaint().setStyle(Paint$Style.FILL);
          ShapeDrawable shapeDrawabl = new ShapeDrawable(new RoundRectShape(uofloatArray, null, null));
          shapeDrawabl.getPaint().setColor(0x14000000);
          shapeDrawabl.getPaint().setStyle(Paint$Style.STROKE);
          shapeDrawabl.getPaint().setStrokeWidth((float)a1.e(0x3f800000));
          Drawable[] uDrawableArr = new Drawable[]{this,shapeDrawabl};
          i.i = new LayerDrawable(uDrawableArr);
          super(new RoundRectShape(uofloatArray, null, null));
          this.getPaint().setColor(color1);
          this.getPaint().setStyle(Paint$Style.FILL);
          Drawable[] uDrawableArr1 = new Drawable[true];
          uDrawableArr1[0] = this;
          i.j = new LayerDrawable(uDrawableArr1);
          RoundRectShape roundRectSha = new RoundRectShape(uofloatArray, null, null);
          ShapeDrawable shapeDrawabl1 = new ShapeDrawable(roundRectSha);
          shapeDrawabl1.getPaint().setColor(0x1a000000);
          shapeDrawabl1.getPaint().setStyle(Paint$Style.FILL);
          shapeDrawabl1.getPaint().setMaskFilter(new BlurMaskFilter((float)a1.e(5.00f), BlurMaskFilter$Blur.OUTER));
          Drawable[] uDrawableArr2 = new Drawable[true];
          uDrawableArr2[0] = shapeDrawabl1;
          i.h = new LayerDrawable(uDrawableArr2);
          goto label_019d ;
       }
       i.post(new l(i));
       return;
    }
    public final int a(int p0){
       KaraokeDoubleSeekBar tn = this.n;
       if (p0 > tn) {
          return tn;
       }
       if (p0 < (- tn)) {
          p0 = - tn;
       }
       return p0;
    }
    public final int b(int p0,int p1,int p2){
       KaraokeDoubleSeekBar karaokeDoubl;
       KaraokeDoubleSeekBar tn = this.n;
       if (p2 > tn) {
          karaokeDoubl = tn;
       }else if(p2 < (- tn)){
          p2 = - tn;
       }
       return (p0 + (int)(((float)p1 / 2.00f) * ((float)karaokeDoubl / (float)tn)));
    }
    public void c(){
       if (PatchProxy.applyVoid(null, this, KaraokeDoubleSeekBar.class, "14")) {
          return;
       }
       KaraokeDoubleSeekBar tm = this.m;
       if (tm > (- this.n)) {
          this.m = this.a((tm - this.q));
          this.invalidate();
          tm = this.k;
          if (tm != null) {
             tm.b(this, this.m);
          }
       }
       return;
    }
    public void d(){
       if (PatchProxy.applyVoid(null, this, KaraokeDoubleSeekBar.class, "13")) {
          return;
       }
       KaraokeDoubleSeekBar tm = this.m;
       if (tm < this.n) {
          this.m = this.a((tm + this.q));
          this.invalidate();
          tm = this.k;
          if (tm != null) {
             tm.b(this, this.m);
          }
       }
       return;
    }
    public final void e(){
       if (PatchProxy.applyVoid(null, this, KaraokeDoubleSeekBar.class, "3")) {
          return;
       }
       this.f.setTranslationX((float)(((this.r[0] + this.b.getBounds().left) + (this.b.getIntrinsicWidth() / 2)) - (n.c(this.getContext(), 48.00f) / 2)));
       this.f.setText(this.m+"");
       return;
    }
    public int getDefaultIndicatorProgress(){
       return this.e;
    }
    public int getMaxProgress(){
       return this.n;
    }
    public int getProgress(){
       return this.m;
    }
    public Rect getThumbDrawableRect(){
       Object obj = PatchProxy.apply(null, this, KaraokeDoubleSeekBar.class, "12");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.b.getBounds();
    }
    public void onDetachedFromWindow(){
       if (PatchProxy.applyVoid(null, this, KaraokeDoubleSeekBar.class, "7")) {
          return;
       }
       super.onDetachedFromWindow();
       if (this.p != null) {
          this.getRootView().findViewById(0x1020002).removeView(this.f);
          this.p = false;
       }
       return;
    }
    public void onDraw(Canvas p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, KaraokeDoubleSeekBar.class, "5")) {
          return;
       }
       super.onDraw(p0);
       int i = (this.getWidth() - this.getPaddingLeft()) - this.getPaddingRight();
       int i1 = (i / 2) + this.getPaddingLeft();
       int i2 = this.getHeight() / 2;
       this.h.setBounds(this.getPaddingLeft(), (i2 - (this.l / 2)), (this.getWidth() - this.getPaddingRight()), ((this.l / 2) + i2));
       this.h.setVisible(true, true);
       this.h.draw(p0);
       this.i.setBounds(n.c(this.getContext(), 4.00f), (i2 - (this.l / 2)), (this.getWidth() - n.c(this.getContext(), 4.00f)), ((this.l / 2) + i2));
       this.i.setVisible(true, true);
       this.i.draw(p0);
       int i3 = this.b(i1, i, this.m);
       KaraokeDoubleSeekBar tm = this.m;
       int i4 = (tm > null)? i1: i3;
       if (tm <= null) {
          i3 = i1;
       }
       KaraokeDoubleSeekBar tl = this.l;
       this.j.setBounds(i4, (i2 - (tl / 2)), i3, (i2 + (tl / 2)));
       this.j.setVisible(true, true);
       this.j.draw(p0);
       KaraokeDoubleSeekBar tb = this.b;
       i = this.b(i1, i, this.m);
       if (!PatchProxy.isSupport(KaraokeDoubleSeekBar.class) || !PatchProxy.applyVoidThreeRefs(p0, tb, Integer.valueOf(i), this, KaraokeDoubleSeekBar.class, "9")) {
          tb.setBounds(new Rect((i - (tb.getIntrinsicWidth() / 2)), ((this.getHeight() / 2) - (tb.getIntrinsicHeight() / 2)), (i + (tb.getIntrinsicWidth() / 2)), ((this.getHeight() / 2) + (tb.getIntrinsicHeight() / 2))));
          tb.setVisible(true, true);
          tb.draw(p0);
       }
       return;
    }
    public void onMeasure(int p0,int p1){
       if (PatchProxy.isSupport(KaraokeDoubleSeekBar.class) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), Integer.valueOf(p1), this, KaraokeDoubleSeekBar.class, "6")) {
          return;
       }
       KaraokeDoubleSeekBar tb = this.b;
       int i = (tb == null)? 0: tb.getIntrinsicHeight();
       this.setMeasuredDimension(View.resolveSizeAndState(((this.getPaddingLeft() + this.getPaddingRight()) + 0), p0, 0), View.resolveSizeAndState((Math.max(i, this.l) + (this.getPaddingBottom() + this.getPaddingTop())), p1, 0));
       return;
    }
    public boolean onTouchEvent(MotionEvent p0){
       KaraokeDoubleSeekBar tk;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       KaraokeDoubleSeekBar obj = PatchProxy.applyOneRefs(p0, this, KaraokeDoubleSeekBar.class, "2");
       if (obj != patchProxyRe) {
          return obj.booleanValue();
       }
       int b = false;
       if (!this.isEnabled()) {
          return b;
       }
       int action = p0.getAction();
       int i = 8;
       if (action) {
          if (action != 1) {
             if (action == 2) {
                int i1 = (int)p0.getRawX();
                if (PatchProxy.isSupport(KaraokeDoubleSeekBar.class)) {
                   obj = PatchProxy.applyOneRefs(Integer.valueOf(i1), this, KaraokeDoubleSeekBar.class, "8");
                   if (obj != patchProxyRe) {
                      i1 = obj.intValue();
                   }else {
                   label_004e :
                      action = (this.getWidth() - this.getPaddingLeft()) - this.getPaddingRight();
                      b = this.r[b] + this.getPaddingLeft();
                      i = (action / 2) + b;
                      if (i1 >= (b + action)) {
                         tk = this.n;
                      }else if(i1 <= b){
                         i1 = - this.n;
                      }else {
                         i1 = (int)((float)(this.n * (i1 - i)) / ((float)action / 2.00f));
                         obj = this.q;
                         b = i1 % obj;
                         i = i1 - b;
                         action = (obj + i1) - b;
                         b = i1 - i;
                         if (b > (action - i1)) {
                            i = action;
                         }
                         i1 = this.a(i);
                      }
                      if (PatchProxy.isSupport(KaraokeDoubleSeekBar.class)) {
                         obj = PatchProxy.applyOneRefs(Integer.valueOf(tk), this, KaraokeDoubleSeekBar.class, "16");
                         if (obj != patchProxyRe) {
                            i1 = obj.intValue();
                         }
                      }
                      if (this.o > null) {
                         int defaultIndic = this.getDefaultIndicatorProgress();
                         if (defaultIndic >= 0 && (defaultIndic <= this.n && tk != defaultIndic)) {
                            obj = this.o;
                            if (tk > (defaultIndic - obj) && tk < (obj + defaultIndic)) {
                               i1 = defaultIndic;
                            }
                         }
                      }
                   }
                }else {
                   goto label_004e ;
                }
             label_00cc :
                this.m = i1;
                this.e();
                this.invalidate();
                tk = this.k;
                if (tk != null) {
                   tk.b(this, this.m);
                }
             }
          }else {
             n.Y(this.f, i, true);
             tk = this.k;
             if (tk != null) {
                tk.c(this, this.m);
             }
          }
       }else {
          float f = 20.00f;
          if (p0.getX() - ((float)this.b.getBounds().left - f) < 0 || p0.getX() - ((float)this.b.getBounds().right + f) > 0) {
             return b;
          }else if(this.g != null && this.p == null){
             if (!PatchProxy.applyVoid(null, this, KaraokeDoubleSeekBar.class, "4")) {
                this.getRootView().findViewById(0x1020002).addView(this.f, new FrameLayout$LayoutParams(n.c(this.getContext(), 48.00f), n.c(this.getContext(), 54.00f)));
                this.f.setY((float)((this.r[1] - this.getPaddingTop()) - n.c(this.getContext(), 54.00f)));
                this.f.setVisibility(i);
             }
             this.p = true;
          }
          this.e();
          n.Y(this.f, b, true);
          tk = this.k;
          if (tk != null) {
             tk.a(this, this.m);
          }
       }
       return true;
    }
    public void setOnSeekBarChangeListener(KaraokeDoubleSeekBar$a p0){
       this.k = p0;
    }
    public void setProgress(int p0){
       if (PatchProxy.isSupport(KaraokeDoubleSeekBar.class) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, KaraokeDoubleSeekBar.class, "15")) {
          return;
       }
       KaraokeDoubleSeekBar tn = this.n;
       if (p0 <= tn && p0 >= (- tn)) {
          this.m = p0;
          this.invalidate();
       }
       return;
    }
}
