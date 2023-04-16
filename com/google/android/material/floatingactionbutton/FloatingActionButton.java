package com.google.android.material.floatingactionbutton.FloatingActionButton;
import a2.g0;
import e2.k;
import ak.a;
import com.google.android.material.internal.VisibilityAwareImageButton;
import android.content.Context;
import android.util.AttributeSet;
import android.graphics.Rect;
import ll8.c$b;
import android.content.res.TypedArray;
import ck.k;
import android.content.res.ColorStateList;
import ek.a;
import android.graphics.PorterDuff$Mode;
import ck.l;
import rj.h;
import w0.f;
import android.widget.ImageView;
import ak.c;
import ak.b;
import com.google.android.material.floatingactionbutton.a;
import android.widget.ImageView$ScaleType;
import android.widget.ImageButton;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.View$MeasureSpec;
import java.lang.IllegalArgumentException;
import java.lang.Math;
import android.animation.Animator$AnimatorListener;
import bk.a;
import com.google.android.material.floatingactionbutton.FloatingActionButton$b;
import gk.b;
import a2.i0;
import android.content.res.Resources;
import cw9.c;
import android.content.res.Configuration;
import com.google.android.material.floatingactionbutton.FloatingActionButton$a;
import com.google.android.material.floatingactionbutton.a$g;
import androidx.core.graphics.drawable.a;
import android.graphics.PorterDuffColorFilter;
import w0.d;
import android.graphics.ColorFilter;
import android.os.Parcelable;
import com.google.android.material.stateful.ExtendableSavedState;
import androidx.customview.view.AbsSavedState;
import java.lang.Object;
import androidx.collection.SimpleArrayMap;
import android.os.Bundle;
import android.view.MotionEvent;
import java.lang.String;

public class FloatingActionButton extends VisibilityAwareImageButton implements g0, k, a	// class@00168d
{
    public ColorStateList c;
    public PorterDuff$Mode d;
    public ColorStateList e;
    public PorterDuff$Mode f;
    public int g;
    public ColorStateList h;
    public int i;
    public int j;
    public int k;
    public int l;
    public boolean m;
    public final Rect n;
    public final Rect o;
    public final f p;
    public final c q;
    public a r;

    public void FloatingActionButton(Context p0){
       super(p0, null);
    }
    public void FloatingActionButton(Context p0,AttributeSet p1){
       super(p0, p1, 0x7f04039b);
    }
    public void FloatingActionButton(Context p0,AttributeSet p1,int p2){
       super(p0, p1, p2);
       this.n = new Rect();
       this.o = new Rect();
       int[] ointArray = new int[0];
       TypedArray typedArray = k.h(p0, p1, c$b.L0, p2, R.style.arg_RES_7f1104bd, ointArray);
       this.c = a.a(p0, typedArray, 0);
       this.d = l.b(typedArray.getInt(1, -1), null);
       this.h = a.a(p0, typedArray, 10);
       this.i = typedArray.getInt(5, -1);
       this.j = typedArray.getDimensionPixelSize(4, 0);
       this.g = typedArray.getDimensionPixelSize(2, 0);
       float dimension = typedArray.getDimension(3, 0);
       float dimension1 = typedArray.getDimension(7, 0);
       float dimension2 = typedArray.getDimension(9, 0);
       this.m = typedArray.getBoolean(12, 0);
       this.l = typedArray.getDimensionPixelSize(8, 0);
       h oh = h.b(p0, typedArray, 11);
       h oh1 = h.b(p0, typedArray, 6);
       typedArray.recycle();
       f uof = new f(this);
       this.p = uof;
       uof.f(p1, p2);
       this.q = new c(this);
       this.getImpl().H(this.c, this.d, this.h, this.g);
       this.getImpl().K(dimension);
       this.getImpl().M(dimension1);
       this.getImpl().P(dimension2);
       this.getImpl().O(this.l);
       this.getImpl().R(oh);
       this.getImpl().L(oh1);
       this.setScaleType(ImageView$ScaleType.MATRIX);
    }
    public static void d(FloatingActionButton p0,Drawable p1){
       super.setBackgroundDrawable(p1);
    }
    public static int q(int p0,int p1){
       int mode = View$MeasureSpec.getMode(p1);
       p1 = View$MeasureSpec.getSize(p1);
       if (mode != Integer.MIN_VALUE) {
          if (mode) {
             if (mode == 0x40000000) {
                p0 = p1;
             }else {
                throw new IllegalArgumentException();
             }
          }
       }else {
          p0 = Math.min(p0, p1);
       }
       return p0;
    }
    public boolean a(boolean p0){
       return this.q.f(p0);
    }
    public boolean b(){
       return this.q.c();
    }
    public void drawableStateChanged(){
       super.drawableStateChanged();
       this.getImpl().A(this.getDrawableState());
    }
    public void e(Animator$AnimatorListener p0){
       this.getImpl().a(p0);
    }
    public void f(Animator$AnimatorListener p0){
       this.getImpl().b(p0);
    }
    public final a g(){
       return new a(this, new FloatingActionButton$b(this));
    }
    public ColorStateList getBackgroundTintList(){
       return this.c;
    }
    public PorterDuff$Mode getBackgroundTintMode(){
       return this.d;
    }
    public float getCompatElevation(){
       return this.getImpl().l();
    }
    public float getCompatHoveredFocusedTranslationZ(){
       return this.getImpl().n();
    }
    public float getCompatPressedTranslationZ(){
       return this.getImpl().p();
    }
    public Drawable getContentBackground(){
       return this.getImpl().i();
    }
    public int getCustomSize(){
       return this.j;
    }
    public int getExpandedComponentIdHint(){
       return this.q.b();
    }
    public h getHideMotionSpec(){
       return this.getImpl().m();
    }
    public final a getImpl(){
       if (this.r == null) {
          this.r = this.g();
       }
       return this.r;
    }
    public int getRippleColor(){
       FloatingActionButton th = this.h;
       int defaultColor = (th != null)? th.getDefaultColor(): 0;
       return defaultColor;
    }
    public ColorStateList getRippleColorStateList(){
       return this.h;
    }
    public h getShowMotionSpec(){
       return this.getImpl().q();
    }
    public int getSize(){
       return this.i;
    }
    public int getSizeDimension(){
       return this.j(this.i);
    }
    public ColorStateList getSupportBackgroundTintList(){
       return this.getBackgroundTintList();
    }
    public PorterDuff$Mode getSupportBackgroundTintMode(){
       return this.getBackgroundTintMode();
    }
    public ColorStateList getSupportImageTintList(){
       return this.e;
    }
    public PorterDuff$Mode getSupportImageTintMode(){
       return this.f;
    }
    public boolean getUseCompatPadding(){
       return this.m;
    }
    public boolean h(Rect p0){
       if (!i0.Y(this)) {
          return 0;
       }
       p0.set(0, 0, this.getWidth(), this.getHeight());
       this.m(p0);
       return true;
    }
    public void i(Rect p0){
       p0.set(0, 0, this.getMeasuredWidth(), this.getMeasuredHeight());
       this.m(p0);
    }
    public final int j(int p0){
       FloatingActionButton tj = this.j;
       if (tj != null) {
          return tj;
       }
       Resources resources = this.getResources();
       if (p0 != -1) {
          if (p0 != 1) {
             return c.b(resources, 0x7f0701ae);
          }else {
             return c.b(resources, 0x7f0701ad);
          }
       }else if(Math.max(resources.getConfiguration().screenWidthDp, resources.getConfiguration().screenHeightDp) < 470){
          p0 = this.j(1);
       }else {
          p0 = this.j(0);
       }
       return p0;
    }
    public void jumpDrawablesToCurrentState(){
       super.jumpDrawablesToCurrentState();
       this.getImpl().u();
    }
    public void k(FloatingActionButton$a p0,boolean p1){
       this.getImpl().r(null, p1);
    }
    public boolean l(){
       return this.getImpl().t();
    }
    public final void m(Rect p0){
       FloatingActionButton tn = this.n;
       p0.left = p0.left + tn.left;
       p0.top = p0.top + tn.top;
       p0.right = p0.right - tn.right;
       p0.bottom = p0.bottom - tn.bottom;
    }
    public final void n(){
       Drawable drawable = this.getDrawable();
       if (drawable == null) {
          return;
       }
       FloatingActionButton te = this.e;
       if (te == null) {
          a.c(drawable);
          return;
       }else {
          int colorForStat = te.getColorForState(this.getDrawableState(), 0);
          FloatingActionButton tf = this.f;
          if (tf == null) {
             tf = PorterDuff$Mode.SRC_IN;
          }
          drawable.mutate().setColorFilter(d.d(colorForStat, tf));
          return;
       }
    }
    public void o(Animator$AnimatorListener p0){
       this.getImpl().E(p0);
    }
    public void onAttachedToWindow(){
       super.onAttachedToWindow();
       this.getImpl().x();
    }
    public void onDetachedFromWindow(){
       super.onDetachedFromWindow();
       this.getImpl().z();
    }
    public void onMeasure(int p0,int p1){
       int sizeDimensio = this.getSizeDimension();
       this.k = (sizeDimensio - this.l) / 2;
       this.getImpl().W();
       p0 = Math.min(FloatingActionButton.q(sizeDimensio, p0), FloatingActionButton.q(sizeDimensio, p1));
       FloatingActionButton tn = this.n;
       this.setMeasuredDimension(((tn.left + p0) + tn.right), ((p0 + tn.top) + tn.bottom));
    }
    public void onRestoreInstanceState(Parcelable p0){
       if (!p0 instanceof ExtendableSavedState) {
          super.onRestoreInstanceState(p0);
          return;
       }else {
          super.onRestoreInstanceState(p0.a());
          this.q.d(p0.d.get("expandableWidgetHelper"));
          return;
       }
    }
    public Parcelable onSaveInstanceState(){
       ExtendableSavedState uExtendableS = new ExtendableSavedState(super.onSaveInstanceState());
       uExtendableS.d.put("expandableWidgetHelper", this.q.e());
       return uExtendableS;
    }
    public boolean onTouchEvent(MotionEvent p0){
       if (!p0.getAction() && (this.h(this.o) && !this.o.contains((int)p0.getX(), (int)p0.getY()))) {
          return false;
       }
       return super.onTouchEvent(p0);
    }
    public void p(Animator$AnimatorListener p0){
       this.getImpl().F(p0);
    }
    public void r(FloatingActionButton$a p0,boolean p1){
       this.getImpl().T(null, p1);
    }
    public void setBackgroundColor(int p0){
    }
    public void setBackgroundDrawable(Drawable p0){
    }
    public void setBackgroundResource(int p0){
    }
    public void setBackgroundTintList(ColorStateList p0){
       if (this.c != p0) {
          this.c = p0;
          this.getImpl().I(p0);
       }
       return;
    }
    public void setBackgroundTintMode(PorterDuff$Mode p0){
       if (this.d != p0) {
          this.d = p0;
          this.getImpl().J(p0);
       }
       return;
    }
    public void setCompatElevation(float p0){
       this.getImpl().K(p0);
    }
    public void setCompatElevationResource(int p0){
       this.setCompatElevation(this.getResources().getDimension(p0));
    }
    public void setCompatHoveredFocusedTranslationZ(float p0){
       this.getImpl().M(p0);
    }
    public void setCompatHoveredFocusedTranslationZResource(int p0){
       this.setCompatHoveredFocusedTranslationZ(this.getResources().getDimension(p0));
    }
    public void setCompatPressedTranslationZ(float p0){
       this.getImpl().P(p0);
    }
    public void setCompatPressedTranslationZResource(int p0){
       this.setCompatPressedTranslationZ(this.getResources().getDimension(p0));
    }
    public void setCustomSize(int p0){
       if (p0 < 0) {
          throw new IllegalArgumentException("Custom size must be non-negative");
       }
       this.j = p0;
       return;
    }
    public void setExpandedComponentIdHint(int p0){
       this.q.g(p0);
    }
    public void setHideMotionSpec(h p0){
       this.getImpl().L(p0);
    }
    public void setHideMotionSpecResource(int p0){
       this.setHideMotionSpec(h.c(this.getContext(), p0));
    }
    public void setImageDrawable(Drawable p0){
       super.setImageDrawable(p0);
       this.getImpl().V();
    }
    public void setImageResource(int p0){
       this.p.g(p0);
    }
    public void setRippleColor(int p0){
       this.setRippleColor(ColorStateList.valueOf(p0));
    }
    public void setRippleColor(ColorStateList p0){
       if (this.h != p0) {
          this.h = p0;
          this.getImpl().Q(this.h);
       }
       return;
    }
    public void setShowMotionSpec(h p0){
       this.getImpl().R(p0);
    }
    public void setShowMotionSpecResource(int p0){
       this.setShowMotionSpec(h.c(this.getContext(), p0));
    }
    public void setSize(int p0){
       this.j = 0;
       if (p0 != this.i) {
          this.i = p0;
          this.requestLayout();
       }
       return;
    }
    public void setSupportBackgroundTintList(ColorStateList p0){
       this.setBackgroundTintList(p0);
    }
    public void setSupportBackgroundTintMode(PorterDuff$Mode p0){
       this.setBackgroundTintMode(p0);
    }
    public void setSupportImageTintList(ColorStateList p0){
       if (this.e != p0) {
          this.e = p0;
          this.n();
       }
       return;
    }
    public void setSupportImageTintMode(PorterDuff$Mode p0){
       if (this.f != p0) {
          this.f = p0;
          this.n();
       }
       return;
    }
    public void setUseCompatPadding(boolean p0){
       if (this.m != p0) {
          this.m = p0;
          this.getImpl().y();
       }
       return;
    }
}
