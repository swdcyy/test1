package com.yxcorp.gifshow.widget.textview.TextImageView;
import android.widget.TextView;
import android.content.Context;
import android.util.AttributeSet;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import ll8.c$b;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.ColorDrawable;
import android.text.TextPaint;
import java.lang.Integer;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Paint$Join;
import android.graphics.Paint$Style;
import android.view.MotionEvent;
import java.lang.Boolean;
import android.view.View;
import android.view.View$OnClickListener;
import java.lang.reflect.Field;
import android.content.res.Resources;
import java.lang.Float;

public class TextImageView extends TextView	// class@0019d2
{
    public float b;
    public float c;
    public float d;
    public float e;
    public float f;
    public boolean g;
    public int h;
    public Drawable i;
    public Drawable j;
    public View$OnClickListener k;
    public boolean l;
    public int m;
    public int n;
    public Paint o;

    public void TextImageView(Context p0){
       super(p0, null);
    }
    public void TextImageView(Context p0,AttributeSet p1){
       super(p0, p1);
       this.a(p0, p1);
    }
    public void TextImageView(Context p0,AttributeSet p1,int p2){
       super(p0, p1, p2);
       this.a(p0, p1);
    }
    public final void a(Context p0,AttributeSet p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, TextImageView.class, "11")) {
          return;
       }
       this.h = -1;
       TypedArray typedArray = p0.obtainStyledAttributes(p1, c$b.i4);
       this.i = typedArray.getDrawable(3);
       this.d = typedArray.getDimension(4, 0);
       int i = 0;
       this.c = typedArray.getDimension(i, 0);
       this.e = typedArray.getDimension(2, 0);
       this.f = typedArray.getDimension(8, 0);
       this.g = typedArray.getBoolean(1, i);
       TextImageView ti = this.i;
       if (ti != null) {
          ti.setBounds((int)(this.e + 0x3f000000), i, (int)(this.getDrawableWidth() + 0x3f000000), (int)(this.getDrawableHeight() + 0x3f000000));
          ColorDrawable uColorDrawab = new ColorDrawable();
          this.j = uColorDrawab;
          uColorDrawab.setBounds(i, i, (int)(this.getDrawableWidth() + 0x3f000000), (int)((this.getDrawableHeight() + 0x3f000000) + this.f));
       }
       this.l = typedArray.getBoolean(5, i);
       this.m = typedArray.getColor(6, i);
       this.n = typedArray.getColor(7, i);
       typedArray.recycle();
       this.o = this.getPaint();
       return;
    }
    public void b(Drawable p0,int p1,int p2){
       if (PatchProxy.isSupport(TextImageView.class) && PatchProxy.applyVoidThreeRefs(p0, Integer.valueOf(p1), Integer.valueOf(p2), this, TextImageView.class, "3")) {
          return;
       }
       this.i = p0;
       if (p0 != null) {
          this.d = (float)p1;
          this.c = (float)p2;
          float f = 0x3f000000;
          p0.setBounds(0, 0, (int)(this.getDrawableWidth() + f), (int)(this.getDrawableHeight() + f));
          if (this.j == null) {
             this.j = new ColorDrawable();
          }
          this.j.setBounds(0, 0, (int)(this.getDrawableWidth() + f), (int)((this.getDrawableHeight() + f) + this.f));
          if (this.i.isStateful()) {
             this.i.setState(this.getDrawableState());
          }
       }
       this.invalidate();
       return;
    }
    public void drawableStateChanged(){
       if (PatchProxy.applyVoid(null, this, TextImageView.class, "8")) {
          return;
       }
       super.drawableStateChanged();
       TextImageView ti = this.i;
       if (ti != null && ti.isStateful()) {
          this.i.setState(this.getDrawableState());
       }
       return;
    }
    public final float getDrawableHeight(){
       TextImageView obj = PatchProxy.apply(null, this, TextImageView.class, "9");
       if (obj != PatchProxyResult.class) {
          return obj.floatValue();
       }
       obj = this.i;
       float f = 0;
       if (obj == null) {
          return f;
       }
       TextImageView tc = this.c;
       if (!tc - f) {
          return (float)obj.getIntrinsicHeight();
       }
       return tc;
    }
    public final float getDrawableWidth(){
       TextImageView obj = PatchProxy.apply(null, this, TextImageView.class, "10");
       if (obj != PatchProxyResult.class) {
          return obj.floatValue();
       }
       obj = this.i;
       float f = 0;
       if (obj == null) {
          return f;
       }
       TextImageView td = this.d;
       if (!td - f) {
          return (float)obj.getIntrinsicWidth();
       }
       return td;
    }
    public int getStrokeSize(){
       return this.n;
    }
    public void onDraw(Canvas p0){
       float f2;
       if (PatchProxy.applyVoidOneRefs(p0, this, TextImageView.class, "7")) {
          return;
       }
       float f = 0;
       if (this.i != null) {
          p0.save();
          float f1 = 2.00f;
          if (this.g != null) {
             f2 = (float)this.getMeasuredWidth() - this.getDrawableWidth();
             if (f2 - f > 0) {
                f2 = f2 / f1;
             label_002a :
                p0.translate(((float)this.getPaddingLeft() + f2), (float)this.getPaddingTop());
                TextImageView tb = this.b;
                if (tb - f) {
                   p0.rotate(tb, (this.getDrawableWidth() / f1), (this.getDrawableHeight() / f1));
                }
                this.i.draw(p0);
                p0.restore();
                p0.translate(f, (this.getDrawableHeight() + this.f));
             }
          }
          f2 = 0;
          goto label_002a ;
       }
       if (this.l == null) {
          super.onDraw(p0);
          return;
       }else {
          this.setCurrentColor(this.m);
          this.o.setStrokeMiter(10.00f);
          this.o.setStrokeJoin(Paint$Join.ROUND);
          this.o.setStrokeWidth((float)this.n);
          this.o.setStyle(Paint$Style.FILL_AND_STROKE);
          super.onDraw(p0);
          this.setCurrentColor(this.getCurrentTextColor());
          this.o.setStyle(Paint$Style.FILL);
          this.o.setStrokeWidth(f);
          this.o.setFakeBoldText(false);
          super.onDraw(p0);
          return;
       }
    }
    public void onMeasure(int p0,int p1){
       if (PatchProxy.isSupport(TextImageView.class) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), Integer.valueOf(p1), this, TextImageView.class, "6")) {
          return;
       }
       TextImageView tj = this.j;
       if (tj != null) {
          this.setCompoundDrawables(null, tj, null, null);
       }
       super.onMeasure(p0, p1);
       if (this.j != null) {
          this.setCompoundDrawables(null, null, null, null);
       }
       return;
    }
    public boolean onTouchEvent(MotionEvent p0){
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       Object obj = PatchProxy.applyOneRefs(p0, this, TextImageView.class, "5");
       if (obj != patchProxyRe) {
          return obj.booleanValue();
       }
       if (!this.isEnabled()) {
          boolean b = true;
          if (p0.getActionMasked() == b && this.k != null) {
             obj = PatchProxy.applyOneRefs(p0, this, TextImageView.class, "15");
             if (obj != patchProxyRe) {
                b = obj.booleanValue();
             }else {
                float rawX = p0.getRawX();
                float rawY = p0.getRawY();
                int[] ointArray = new int[2];
                this.getLocationOnScreen(ointArray);
                if (rawX - (float)ointArray[0] < 0 || (rawX - (float)(ointArray[0] + this.getWidth()) > 0 || (rawY - (float)ointArray[b] < 0 || rawY - (float)(ointArray[b] + this.getHeight()) > 0))) {
                   b = false;
                }
             }
             if (b) {
                this.k.onClick(this);
             }
          }
       }
       return super.onTouchEvent(p0);
    }
    public void setClickListenerWithoutEnabled(View$OnClickListener p0){
       this.k = p0;
    }
    public final void setCurrentColor(int p0){
       if (PatchProxy.isSupport(TextImageView.class) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, TextImageView.class, "20")) {
          return;
       }
       try{
          Field declaredFiel = TextView.class.getDeclaredField("mCurTextColor");
          declaredFiel.setAccessible(true);
          declaredFiel.set(this, Integer.valueOf(p0));
          return;
       }catch(java.lang.NoSuchFieldException e0){
       }catch(java.lang.IllegalAccessException e0){
       }
    }
    public void setEnabledStroke(boolean p0){
       if (PatchProxy.isSupport(TextImageView.class) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, TextImageView.class, "13")) {
          return;
       }
       this.l = p0;
       this.invalidate();
       return;
    }
    public void setImageAlpha(int p0){
       if (PatchProxy.isSupport(TextImageView.class) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, TextImageView.class, "2")) {
          return;
       }
       p0 = p0 & 0x00ff;
       if (this.h != p0) {
          this.h = p0;
          TextImageView ti = this.i;
          if (ti != null) {
             Drawable uDrawable = ti.mutate();
             this.i = uDrawable;
             uDrawable.setAlpha(this.h);
          }
          this.invalidate();
       }
       return;
    }
    public void setImageDrawable(int p0){
       if (PatchProxy.isSupport(TextImageView.class) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, TextImageView.class, "18")) {
          return;
       }
       this.b(this.getResources().getDrawable(p0), (int)this.getDrawableWidth(), (int)this.getDrawableHeight());
       return;
    }
    public void setImageHeight(int p0){
       if (PatchProxy.isSupport(TextImageView.class) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, TextImageView.class, "16")) {
          return;
       }
       this.c = (float)p0;
       this.b(this.i, (int)this.getDrawableWidth(), (int)this.getDrawableHeight());
       return;
    }
    public void setImageHorizontalCenter(boolean p0){
       if (PatchProxy.isSupport(TextImageView.class) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, TextImageView.class, "19")) {
          return;
       }
       this.g = p0;
       this.invalidate();
       return;
    }
    public void setImageWidth(int p0){
       if (PatchProxy.isSupport(TextImageView.class) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, TextImageView.class, "17")) {
          return;
       }
       this.d = (float)p0;
       this.b(this.i, (int)this.getDrawableWidth(), (int)this.getDrawableHeight());
       return;
    }
    public void setRotation(float p0){
       if (PatchProxy.isSupport(TextImageView.class) && PatchProxy.applyVoidOneRefs(Float.valueOf(p0), this, TextImageView.class, "1")) {
          return;
       }
       this.b = p0;
       this.invalidate();
       return;
    }
    public void setStrokeColor(int p0){
       if (PatchProxy.isSupport(TextImageView.class) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, TextImageView.class, "12")) {
          return;
       }
       this.m = p0;
       this.invalidate();
       return;
    }
    public void setStrokeSize(int p0){
       if (PatchProxy.isSupport(TextImageView.class) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, TextImageView.class, "14")) {
          return;
       }
       this.n = p0;
       this.invalidate();
       return;
    }
    public void setTopDrawable(Drawable p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, TextImageView.class, "4")) {
          return;
       }
       this.b(p0, 0, 0);
       return;
    }
}
