package com.kwai.library.widget.shadow.KwaiShadowLayout;
import android.view.ViewGroup;
import android.content.Context;
import android.util.AttributeSet;
import nsd.u;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import android.graphics.Rect;
import android.graphics.Paint;
import ll8.c$b;
import android.content.res.TypedArray;
import androidx.core.content.ContextCompat;
import android.graphics.drawable.Drawable;
import java.lang.Math;
import android.graphics.Paint$Style;
import android.graphics.drawable.RippleDrawable;
import android.content.res.ColorStateList;
import android.view.ViewGroup$LayoutParams;
import com.kwai.library.widget.shadow.KwaiShadowLayout$LayoutParams;
import android.graphics.Canvas;
import android.view.View;
import android.graphics.Path;
import x17.a;
import android.view.Gravity;
import java.lang.CharSequence;
import android.widget.FrameLayout;
import java.lang.Class;
import java.lang.Integer;
import kotlin.collections.ArraysKt___ArraysKt;
import java.util.Objects;
import android.view.ViewGroup$MarginLayoutParams;
import android.view.View$MeasureSpec;
import java.lang.RuntimeException;
import android.graphics.drawable.Drawable$Callback;

public final class KwaiShadowLayout extends ViewGroup	// class@0009f9
{
    public final int b;
    public int c;
    public int d;
    public Drawable e;
    public final Rect f;
    public final Rect g;
    public int h;
    public boolean i;
    public boolean j;
    public final Paint k;
    public int l;
    public int m;
    public int n;
    public float o;
    public float p;
    public float q;
    public float r;
    public float s;
    public float t;
    public float u;
    public int v;
    public int w;
    public int x;
    public int y;
    public HashMap z;

    public void KwaiShadowLayout(Context p0){
       super(p0, null, 0, 6, null);
    }
    public void KwaiShadowLayout(Context p0,AttributeSet p1){
       super(p0, p1, 0, 4, null);
    }
    public void KwaiShadowLayout(Context p0,AttributeSet p1,int p2){
       a.p(p0, "context");
       super(p0, p1, p2);
       this.b = 0x800033;
       this.c = -1;
       this.f = new Rect();
       this.g = new Rect();
       this.h = 119;
       this.i = true;
       Paint paint = new Paint();
       this.k = paint;
       TypedArray typedArray = this.getContext().obtainStyledAttributes(p1, c$b.g2, p2, 0);
       a.o(typedArray, "getContext\(\).obtainStyle…,\n        defStyleInt, 0\)");
       this.setShadowColor(typedArray.getColor(14, ContextCompat.getColor(p0, R.color.arg_RES_7f06214d)));
       this.setForegroundColor(typedArray.getColor(7, ContextCompat.getColor(p0, R.color.arg_RES_7f06214e)));
       this.setBackgroundClr(typedArray.getColor(true, -1));
       this.setShadowDx((float)typedArray.getDimensionPixelSize(15, 0));
       this.setShadowDy((float)typedArray.getDimensionPixelSize(16, 0));
       this.setShadowBlur((float)typedArray.getDimensionPixelSize(13, this.d));
       this.setForeground(typedArray.getDrawable(0));
       int dimensionPix = typedArray.getDimensionPixelSize(8, (int)(Math.max(this.q, this.p) + this.getShadowBlur()));
       if (dimensionPix >= 0) {
          this.setShadowMarginTop(dimensionPix);
          this.setShadowMarginLeft(dimensionPix);
          this.setShadowMarginRight(dimensionPix);
          this.setShadowMarginBottom(dimensionPix);
       }else {
          this.setShadowMarginTop(typedArray.getDimensionPixelSize(12, this.d));
          this.setShadowMarginLeft(typedArray.getDimensionPixelSize(10, this.d));
          this.setShadowMarginRight(typedArray.getDimensionPixelSize(11, this.d));
          this.setShadowMarginBottom(typedArray.getDimensionPixelSize(9, this.d));
       }
       float f = (float)typedArray.getDimensionPixelSize(2, this.c);
       if (f - (float)0 >= 0) {
          this.r = f;
          this.s = f;
          this.t = f;
          this.u = f;
       }else {
          this.r = (float)typedArray.getDimensionPixelSize(5, this.d);
          this.s = (float)typedArray.getDimensionPixelSize(6, this.d);
          this.t = (float)typedArray.getDimensionPixelSize(3, this.d);
          this.u = (float)typedArray.getDimensionPixelSize(4, this.d);
       }
       typedArray.recycle();
       paint.setColor(this.n);
       paint.setAntiAlias(true);
       paint.setStyle(Paint$Style.FILL);
       this.setLayerType(true, null);
       this.setWillNotDraw(0);
       this.setBackground(null);
       return;
    }
    public void KwaiShadowLayout(Context p0,AttributeSet p1,int p2,int p3,u p4){
       if (p3 & 0x02) {
          p1 = null;
       }
       if (p3 & 0x04) {
          p2 = 0;
       }
       super(p0, p1, p2);
       return;
    }
    public final void a(float p0,float p1,float p2,float p3){
       this.r = p0;
       this.s = p1;
       this.u = p2;
       this.t = p3;
       this.invalidate();
    }
    public final void b(){
       KwaiShadowLayout te = this.e;
       if (te != null) {
          te.setColor(ColorStateList.valueOf(this.m));
       }
       return;
    }
    public final void c(){
       this.d(this.getShadowBlur(), this.p, this.q, this.l);
    }
    public boolean checkLayoutParams(ViewGroup$LayoutParams p0){
       a.p(p0, "p");
       return p0 instanceof KwaiShadowLayout$LayoutParams;
    }
    public final void d(float p0,float p1,float p2,int p3){
       this.k.setShadowLayer(p0, p1, p2, p3);
       this.invalidate();
    }
    public void draw(Canvas p0){
       super.draw(p0);
       if (p0 != null) {
          p0.save();
          p0.clipPath(a.a((float)this.w, (float)this.v, (float)(this.getMeasuredWidth() - this.x), (float)(this.getMeasuredHeight() - this.y), this.r, this.s, this.u, this.t));
          KwaiShadowLayout te = this.e;
          if (te != null) {
             if (this.j != null) {
                boolean b = false;
                this.j = b;
                int i = this.getRight() - this.getLeft();
                int i1 = this.getBottom() - this.getTop();
                if (this.i != null) {
                   this.f.set(b, b, i, i1);
                }else {
                   this.f.set(this.getPaddingLeft(), this.getPaddingTop(), (i - this.getPaddingRight()), (i1 - this.getPaddingBottom()));
                }
                Gravity.apply(this.h, te.getIntrinsicWidth(), te.getIntrinsicHeight(), this.f, this.g);
                te.setBounds(this.g);
             }
             te.draw(p0);
          }
          p0.restore();
       }
       return;
    }
    public void drawableHotspotChanged(float p0,float p1){
       super.drawableHotspotChanged(p0, p1);
       KwaiShadowLayout te = this.e;
       if (te != null) {
          te.setHotspot(p0, p1);
       }
       return;
    }
    public void drawableStateChanged(){
       super.drawableStateChanged();
       KwaiShadowLayout te = this.e;
       if (te != null) {
          if (!te.isStateful()) {
             te = null;
          }
          if (te != null) {
             te.setState(this.getDrawableState());
          }
       }
       return;
    }
    public ViewGroup$LayoutParams generateLayoutParams(AttributeSet p0){
       a.p(p0, "attrs");
       Context context = this.getContext();
       a.o(context, "context");
       return new KwaiShadowLayout$LayoutParams(context, p0);
    }
    public ViewGroup$LayoutParams generateLayoutParams(ViewGroup$LayoutParams p0){
       a.p(p0, "lp");
       return new KwaiShadowLayout$LayoutParams(p0);
    }
    public CharSequence getAccessibilityClassName(){
       String name = FrameLayout.class.getName();
       a.o(name, "FrameLayout::class.java.name");
       return name;
    }
    public final int getBackgroundClr(){
       return this.n;
    }
    public Drawable getForeground(){
       return this.e;
    }
    public final int getForegroundColor(){
       return this.m;
    }
    public int getForegroundGravity(){
       return this.h;
    }
    public final int getPaddingBottomWithForeground(){
       return this.getPaddingBottom();
    }
    public final int getPaddingLeftWithForeground(){
       return this.getPaddingLeft();
    }
    public final int getPaddingRightWithForeground(){
       return this.getPaddingRight();
    }
    public final int getPaddingTopWithForeground(){
       return this.getPaddingTop();
    }
    public final float getShadowBlur(){
       float shadowMargin = (this.o - this.getShadowMarginMax() > 0 && this.getShadowMarginMax())? this.getShadowMarginMax(): this.o;
       return shadowMargin;
    }
    public final int getShadowColor(){
       return this.l;
    }
    public final float getShadowDx(){
       return this.p;
    }
    public final float getShadowDy(){
       return this.q;
    }
    public final int getShadowMarginBottom(){
       return this.y;
    }
    public final int getShadowMarginLeft(){
       return this.w;
    }
    public final float getShadowMarginMax(){
       int[] ointArray = new int[]{this.w,this.v,this.x,this.y};
       Integer integer = ArraysKt___ArraysKt.xi(ointArray);
       float f = (integer != null)? (float)integer.intValue(): 0;
       return f;
    }
    public final int getShadowMarginRight(){
       return this.x;
    }
    public final int getShadowMarginTop(){
       return this.v;
    }
    public void jumpDrawablesToCurrentState(){
       super.jumpDrawablesToCurrentState();
       KwaiShadowLayout te = this.e;
       if (te != null) {
          te.jumpToCurrentState();
       }
       return;
    }
    public void onDraw(Canvas p0){
       super.onDraw(p0);
       if (p0 != null) {
          Path path = a.a((float)this.w, (float)this.v, (float)(this.getMeasuredWidth() - this.x), (float)(this.getMeasuredHeight() - this.y), this.r, this.s, this.u, this.t);
          p0.drawPath(path, this.k);
          p0.clipPath(path);
       }
       return;
    }
    public void onLayout(boolean p0,int p1,int p2,int p3,int p4){
       KwaiShadowLayout$LayoutParams a;
       KwaiShadowLayout tw;
       KwaiShadowLayout tv;
       int paddingLeftW = this.getPaddingLeftWithForeground();
       p3 = (p3 - p1) - this.getPaddingRightWithForeground();
       p1 = this.getPaddingTopWithForeground();
       p4 = (p4 - p2) - this.getPaddingBottomWithForeground();
       View childAt = this.getChildAt(0);
       a.o(childAt, "child");
       if (childAt.getVisibility() != 8) {
          ViewGroup$LayoutParams layoutParams = childAt.getLayoutParams();
          Objects.requireNonNull(layoutParams, "null cannot be cast to non-null type com.kwai.library.widget.shadow.KwaiShadowLayout.LayoutParams");
          int measuredWidt = childAt.getMeasuredWidth();
          int measuredHeig = childAt.getMeasuredHeight();
          a = layoutParams.a;
          if (a == -1) {
             a = this.b;
          }
          int i = a & 0x70;
          int i1 = Gravity.getAbsoluteGravity(a, this.getLayoutDirection()) & 0x07;
          if (i1 != 1) {
             if (i1 != 3) {
                if (i1 != 5) {
                   paddingLeftW = paddingLeftW + layoutParams.leftMargin;
                   tw = this.w;
                }else {
                   p3 = ((p3 - measuredWidt) - layoutParams.rightMargin) - this.x;
                }
             }else {
                paddingLeftW = paddingLeftW + layoutParams.leftMargin;
                tw = this.w;
             }
             tw = tw + paddingLeftW;
          }else {
             p3 = ((((paddingLeftW + (((p3 - paddingLeftW) - measuredWidt) / 2)) + layoutParams.leftMargin) - layoutParams.rightMargin) + this.w) - this.x;
          }
          if (i != 16) {
             if (i != 48) {
                if (i != 80) {
                   p1 = p1 + layoutParams.topMargin;
                   tv = this.v;
                }else {
                   p4 = ((p4 - measuredHeig) - layoutParams.bottomMargin) - this.y;
                }
             }else {
                p1 = p1 + layoutParams.topMargin;
                tv = this.v;
             }
             tv = tv + p1;
          }else {
             p4 = ((((p1 + (((p4 - p1) - measuredHeig) / 2)) + layoutParams.topMargin) - layoutParams.bottomMargin) + this.v) - this.y;
          }
          childAt.layout(tw, tv, (measuredWidt + tw), (measuredHeig + tv));
       }
       if (p0) {
          this.j = p0;
       }
       return;
    }
    public void onMeasure(int p0,int p1){
       ViewGroup$LayoutParams this;
       int i5;
       int i6;
       int i = 1;
       if (this.getChildCount() > i) {
          throw new RuntimeException("KwaiShadowView 只能包含一个ChildView，暂时不支持多个ChildView!");
       }
       int i1 = 0;
       this.setMeasuredDimension(ViewGroup.getDefaultSize(i1, p0), ViewGroup.getDefaultSize(i1, p1));
       int i2 = -1;
       int i3 = (this.getLayoutParams().width == i2)? 1: 0;
       if (this.getLayoutParams().height != i2) {
          i = 0;
       }
       i2 = 0x40000000;
       int i4 = (i3)? View$MeasureSpec.makeMeasureSpec(((this.getMeasuredWidth() - this.x) - this.w), i2): p0;
       i2 = (i)? View$MeasureSpec.makeMeasureSpec(((this.getMeasuredHeight() - this.v) - this.y), i2): p1;
       View childAt = this.getChildAt(i1);
       a.o(childAt, "child");
       if (childAt.getVisibility() != 8) {
          this.measureChildWithMargins(childAt, i4, 0, i2, 0);
          this = childAt.getLayoutParams();
          Objects.requireNonNull(this, "null cannot be cast to non-null type com.kwai.library.widget.shadow.KwaiShadowLayout.LayoutParams");
          i5 = (i3)? Math.max(i1, ((childAt.getMeasuredWidth() + this.leftMargin) + this.rightMargin)): Math.max(i1, ((((childAt.getMeasuredWidth() + this.w) + this.x) + this.leftMargin) + this.rightMargin));
          i6 = (i)? Math.max(i1, ((childAt.getMeasuredHeight() + this.topMargin) + this.bottomMargin)): Math.max(i1, ((((childAt.getMeasuredHeight() + this.v) + this.y) + this.topMargin) + this.bottomMargin));
          i5 = View.combineMeasuredStates(i1, childAt.getMeasuredState());
          i1 = i5;
       }else {
          i6 = 0;
          i5 = 0;
       }
       i6 = Math.max((i6 + (this.getPaddingTop() + this.getPaddingBottom())), this.getSuggestedMinimumHeight());
       i1 = Math.max((i1 + (this.getPaddingLeft() + this.getPaddingRight())), this.getSuggestedMinimumWidth());
       Drawable foreground = this.getForeground();
       if (foreground != null) {
          i6 = Math.max(i6, foreground.getMinimumHeight());
          i1 = Math.max(i1, foreground.getMinimumWidth());
       }
       if (!i3) {
          p0 = i4;
       }
       p0 = View.resolveSizeAndState(i1, p0, i5);
       if (!i) {
          p1 = i2;
       }
       this.setMeasuredDimension(p0, View.resolveSizeAndState(i6, p1, (i5 << 16)));
       return;
    }
    public void onSizeChanged(int p0,int p1,int p2,int p3){
       super.onSizeChanged(p0, p1, p2, p3);
       this.j = true;
    }
    public final void setBackgroundClr(int p0){
       this.n = p0;
       this.invalidate();
    }
    public final void setCornerRadius(float p0){
       this.r = p0;
       this.s = p0;
       this.u = p0;
       this.t = p0;
       this.invalidate();
    }
    public final void setCornerRadiusBL(float p0){
       this.t = p0;
       this.invalidate();
    }
    public final void setCornerRadiusBR(float p0){
       this.u = p0;
       this.invalidate();
    }
    public final void setCornerRadiusTL(float p0){
       this.r = p0;
       this.invalidate();
    }
    public final void setCornerRadiusTR(float p0){
       this.s = p0;
       this.invalidate();
    }
    public void setForeground(Drawable p0){
       KwaiShadowLayout te = this.e;
       if (te != null) {
          if (te != null) {
             te.setCallback(null);
          }
          this.unscheduleDrawable(this.e);
       }
       this.e = p0;
       this.b();
       if (p0 != null) {
          this.setWillNotDraw(false);
          p0.setCallback(this);
          if (p0.isStateful()) {
             p0.setState(this.getDrawableState());
          }
          if (this.h == 119) {
             p0.getPadding(new Rect());
          }
       }
       this.requestLayout();
       this.invalidate();
       return;
    }
    public final void setForegroundColor(int p0){
       this.m = p0;
       this.b();
    }
    public void setForegroundGravity(int p0){
       if (this.h != p0) {
          if (!(0x800007 & p0)) {
             p0 = p0 | 0x800003;
          }
          if (!(p0 & 0x70)) {
             p0 = p0 | 0x30;
          }
          this.h = p0;
          if (p0 == 119 && this.e != null) {
             Rect rect = new Rect();
             KwaiShadowLayout te = this.e;
             if (te != null) {
                te.getPadding(rect);
             }
          }
          this.requestLayout();
       }
       return;
    }
    public final void setShadowBlur(float p0){
       float shadowMargin = (p0 - this.getShadowMarginMax() > 0 && this.getShadowMarginMax() - null)? this.getShadowMarginMax(): p0;
       this.o = p0;
       this.d(shadowMargin, this.p, this.q, this.l);
       return;
    }
    public final void setShadowColor(int p0){
       this.l = p0;
       this.d(this.getShadowBlur(), this.p, this.q, p0);
    }
    public final void setShadowDx(float p0){
       this.p = p0;
       this.d(this.getShadowBlur(), p0, this.q, this.l);
    }
    public final void setShadowDy(float p0){
       this.q = p0;
       this.d(this.getShadowBlur(), this.p, p0, this.l);
    }
    public final void setShadowMarginBottom(int p0){
       this.y = p0;
       this.c();
    }
    public final void setShadowMarginLeft(int p0){
       this.w = p0;
       this.c();
    }
    public final void setShadowMarginRight(int p0){
       this.x = p0;
       this.c();
    }
    public final void setShadowMarginTop(int p0){
       this.v = p0;
       this.c();
    }
    public boolean shouldDelayChildPressedState(){
       return false;
    }
    public boolean verifyDrawable(Drawable p0){
       a.p(p0, "who");
       boolean b = (super.verifyDrawable(p0) || p0 == this.e)? true: false;
       return b;
    }
}
