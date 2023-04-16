package com.google.android.material.bottomappbar.BottomAppBar;
import androidx.coordinatorlayout.widget.CoordinatorLayout$b;
import androidx.appcompat.widget.Toolbar;
import android.content.Context;
import android.util.AttributeSet;
import com.google.android.material.bottomappbar.BottomAppBar$g;
import ll8.c$b;
import android.content.res.TypedArray;
import ck.k;
import android.content.res.ColorStateList;
import ek.a;
import android.content.res.Resources;
import android.view.ViewGroup;
import cw9.c;
import tj.a;
import hk.e;
import hk.b;
import hk.c;
import android.graphics.Paint$Style;
import android.graphics.drawable.Drawable;
import androidx.core.graphics.drawable.a;
import android.view.View;
import a2.i0;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import android.animation.Animator$AnimatorListener;
import android.animation.Animator;
import java.util.List;
import android.animation.ValueAnimator;
import com.google.android.material.bottomappbar.BottomAppBar$f;
import android.animation.ValueAnimator$AnimatorUpdateListener;
import java.lang.Object;
import com.google.android.material.bottomappbar.BottomAppBar$b;
import java.lang.String;
import android.animation.ObjectAnimator;
import androidx.appcompat.widget.ActionMenuView;
import com.google.android.material.bottomappbar.BottomAppBar$d;
import android.animation.AnimatorSet;
import android.view.ViewParent;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import java.util.Iterator;
import android.graphics.Rect;
import android.widget.ImageButton;
import java.util.ArrayList;
import java.util.Collection;
import com.google.android.material.bottomappbar.BottomAppBar$e;
import com.google.android.material.bottomappbar.BottomAppBar$c;
import com.google.android.material.bottomappbar.BottomAppBar$a;
import androidx.coordinatorlayout.widget.CoordinatorLayout$Behavior;
import com.google.android.material.bottomappbar.BottomAppBar$Behavior;
import android.view.ViewGroup$LayoutParams;
import androidx.appcompat.widget.Toolbar$LayoutParams;
import androidx.appcompat.app.ActionBar$LayoutParams;
import java.lang.Math;
import android.os.Parcelable;
import com.google.android.material.bottomappbar.BottomAppBar$SavedState;
import androidx.customview.view.AbsSavedState;
import java.lang.CharSequence;

public class BottomAppBar extends Toolbar implements CoordinatorLayout$b	// class@001644
{
    public final int Q;
    public final c R;
    public final a S;
    public Animator T;
    public Animator U;
    public boolean U0;
    public Animator V;
    public boolean V0;
    public int W;
    public AnimatorListenerAdapter W0;

    public void BottomAppBar(Context p0){
       super(p0, null, 0);
    }
    public void BottomAppBar(Context p0,AttributeSet p1){
       super(p0, p1, 0x7f040162);
    }
    public void BottomAppBar(Context p0,AttributeSet p1,int p2){
       super(p0, p1, p2);
       this.V0 = true;
       this.W0 = new BottomAppBar$g(this);
       int[] ointArray = new int[0];
       TypedArray typedArray = k.h(p0, p1, c$b.B, p2, R.style.arg_RES_7f1104c3, ointArray);
       ColorStateList uColorStateL = a.a(p0, typedArray, 0);
       this.W = typedArray.getInt(true, 0);
       this.U0 = typedArray.getBoolean(5, 0);
       typedArray.recycle();
       this.Q = c.a(this.getResources(), 0x7f070b9d);
       a uoa = new a((float)typedArray.getDimensionPixelOffset(2, 0), (float)typedArray.getDimensionPixelOffset(3, 0), (float)typedArray.getDimensionPixelOffset(4, 0));
       this.S = uoa;
       e uoe = new e();
       uoe.i(uoa);
       c uoc = new c(uoe);
       this.R = uoc;
       uoc.q(true);
       uoc.p(Paint$Style.FILL);
       a.o(uoc, uColorStateL);
       i0.v0(this, uoc);
    }
    public void R(FloatingActionButton p0){
       this.g0(p0);
       p0.e(this.W0);
       p0.f(this.W0);
    }
    public final void S(){
       BottomAppBar tT = this.T;
       if (tT != null) {
          tT.cancel();
       }
       tT = this.V;
       if (tT != null) {
          tT.cancel();
       }
       tT = this.U;
       if (tT != null) {
          tT.cancel();
       }
       return;
    }
    public final void T(boolean p0,List p1){
       if (p0) {
          this.S.k(this.getFabTranslationX());
       }
       float[] uofloatArray = new float[2];
       uofloatArray[0] = this.R.h();
       int i = (p0)? 0x3f800000: 0;
       uofloatArray[1] = i;
       ValueAnimator valueAnimato = ValueAnimator.ofFloat(uofloatArray);
       valueAnimato.addUpdateListener(new BottomAppBar$f(this));
       valueAnimato.setDuration(300);
       p1.add(valueAnimato);
       return;
    }
    public final void U(int p0,List p1){
       if (this.V0 == null) {
          return;
       }
       float[] uofloatArray = new float[]{this.S.f(),(float)this.Z(p0)};
       ValueAnimator valueAnimato = ValueAnimator.ofFloat(uofloatArray);
       valueAnimato.addUpdateListener(new BottomAppBar$b(this));
       valueAnimato.setDuration(300);
       p1.add(valueAnimato);
       return;
    }
    public final void V(int p0,List p1){
       float[] uofloatArray = new float[]{(float)this.Z(p0)};
       ObjectAnimator objectAnimat = ObjectAnimator.ofFloat(this.Y(), "translationX", uofloatArray);
       objectAnimat.setDuration(300);
       p1.add(objectAnimat);
    }
    public final void W(boolean p0,List p1){
       FloatingActionButton uFloatingAct = this.Y();
       if (uFloatingAct == null) {
          return;
       }
       float[] uofloatArray = new float[]{this.a0(p0)};
       ObjectAnimator objectAnimat = ObjectAnimator.ofFloat(uFloatingAct, "translationY", uofloatArray);
       objectAnimat.setDuration(300);
       p1.add(objectAnimat);
       return;
    }
    public final void X(int p0,boolean p1,List p2){
       int i;
       ActionMenuView actionMenuVi = this.getActionMenuView();
       if (actionMenuVi == null) {
          return;
       }
       float[] uofloatArray = new float[]{i};
       i = 0x3f800000;
       String str = "alpha";
       ObjectAnimator objectAnimat = ObjectAnimator.ofFloat(actionMenuVi, str, uofloatArray);
       if (this.V0 != null || (p1 && (this.c0() && (this.W == 1 || p0 == 1)))) {
          float[] uofloatArray1 = new float[]{0};
          ObjectAnimator objectAnimat1 = ObjectAnimator.ofFloat(actionMenuVi, str, uofloatArray1);
          objectAnimat1.addListener(new BottomAppBar$d(this, actionMenuVi, p0, p1));
          AnimatorSet uAnimatorSet = new AnimatorSet();
          uAnimatorSet.setDuration(150);
          Animator[] uAnimatorArr = new Animator[]{objectAnimat1,objectAnimat};
          uAnimatorSet.playSequentially(uAnimatorArr);
          p2.add(uAnimatorSet);
       }else if(actionMenuVi.getAlpha() - i < 0){
          p2.add(objectAnimat);
       }
       return;
    }
    public FloatingActionButton Y(){
       View view;
       if (!this.getParent() instanceof CoordinatorLayout) {
          return null;
       }
       Iterator iterator = this.getParent().t(this).iterator();
       while (true) {
          if (!iterator.hasNext()) {
             return null;
          }
          view = iterator.next();
          if (view instanceof FloatingActionButton) {
             break ;
          }
       }
       return view;
    }
    public final int Z(int p0){
       BottomAppBar uBottomAppBa = null;
       int i = 1;
       int i1 = (i0.B(this) == i)? 1: 0;
       if (p0 == i) {
          p0 = (this.getMeasuredWidth() / 2) - this.Q;
          if (i1) {
             i = -1;
          }
          uBottomAppBa = p0 * i;
       }
       return uBottomAppBa;
    }
    public final float a0(boolean p0){
       FloatingActionButton uFloatingAct = this.Y();
       float f = 0;
       if (uFloatingAct == null) {
          return f;
       }
       Rect rect = new Rect();
       uFloatingAct.h(rect);
       float f1 = (float)rect.height();
       if (!f1 - f) {
          f1 = (float)uFloatingAct.getMeasuredHeight();
       }
       float f2 = ((- this.getCradleVerticalOffset()) + (f1 / 2.00f)) + (float)(uFloatingAct.getHeight() - rect.bottom);
       float f3 = (float)(uFloatingAct.getHeight() - rect.height()) - (float)uFloatingAct.getPaddingBottom();
       float f4 = (float)(- this.getMeasuredHeight());
       if (!p0) {
          f2 = f3;
       }
       return (f4 + f2);
    }
    public boolean b0(){
       boolean b;
       BottomAppBar tT = this.T;
       if (tT == null || !tT.isRunning()) {
          tT = this.V;
          if (tT == null || !tT.isRunning()) {
             tT = this.U;
             if (tT == null || !tT.isRunning()) {
                b = false;
             label_0021 :
                return b;
             }
          }
       }
       b = true;
       goto label_0021 ;
    }
    public final boolean c0(){
       FloatingActionButton uFloatingAct = this.Y();
       boolean b = (uFloatingAct != null && uFloatingAct.l())? true: false;
       return b;
    }
    public void d0(boolean p0){
       if (!i0.Y(this)) {
          return;
       }
       BottomAppBar tT = this.T;
       if (tT != null) {
          tT.cancel();
       }
       ArrayList uArrayList = new ArrayList();
       boolean b = (p0 && this.c0())? true: false;
       this.T(b, uArrayList);
       this.W(p0, uArrayList);
       AnimatorSet uAnimatorSet = new AnimatorSet();
       uAnimatorSet.playTogether(uArrayList);
       this.T = uAnimatorSet;
       uAnimatorSet.addListener(new BottomAppBar$e(this));
       this.T.start();
       return;
    }
    public void e0(int p0,boolean p1){
       if (!i0.Y(this)) {
          return;
       }
       BottomAppBar tV = this.V;
       if (tV != null) {
          tV.cancel();
       }
       ArrayList uArrayList = new ArrayList();
       if (!this.c0()) {
          p0 = 0;
          p1 = false;
       }
       this.X(p0, p1, uArrayList);
       AnimatorSet uAnimatorSet = new AnimatorSet();
       uAnimatorSet.playTogether(uArrayList);
       this.V = uAnimatorSet;
       uAnimatorSet.addListener(new BottomAppBar$c(this));
       this.V.start();
       return;
    }
    public final void f0(int p0){
       if (this.W != p0 && i0.Y(this)) {
          BottomAppBar tU = this.U;
          if (tU != null) {
             tU.cancel();
          }
          ArrayList uArrayList = new ArrayList();
          this.U(p0, uArrayList);
          this.V(p0, uArrayList);
          AnimatorSet uAnimatorSet = new AnimatorSet();
          uAnimatorSet.playTogether(uArrayList);
          this.U = uAnimatorSet;
          uAnimatorSet.addListener(new BottomAppBar$a(this));
          this.U.start();
       }
       return;
    }
    public final void g0(FloatingActionButton p0){
       p0.o(this.W0);
       p0.p(this.W0);
    }
    public final ActionMenuView getActionMenuView(){
       View childAt;
       int i = 0;
       while (true) {
          if (i >= this.getChildCount()) {
             return null;
          }
          childAt = this.getChildAt(i);
          if (childAt instanceof ActionMenuView) {
             break ;
          }else {
             i = i + 1;
          }
       }
       return childAt;
    }
    public ColorStateList getBackgroundTint(){
       return this.R.k();
    }
    public CoordinatorLayout$Behavior getBehavior(){
       return new BottomAppBar$Behavior();
    }
    public float getCradleVerticalOffset(){
       return this.S.b();
    }
    public int getFabAlignmentMode(){
       return this.W;
    }
    public float getFabCradleMargin(){
       return this.S.c();
    }
    public float getFabCradleRoundedCornerRadius(){
       return this.S.d();
    }
    public final float getFabTranslationX(){
       return (float)this.Z(this.W);
    }
    public float getFabTranslationY(){
       return this.a0(this.V0);
    }
    public boolean getHideOnScroll(){
       return this.U0;
    }
    public void h0(){
       this.S.k(this.getFabTranslationX());
       FloatingActionButton uFloatingAct = this.Y();
       BottomAppBar tR = this.R;
       float f = (this.V0 != null && this.c0())? 0x3f800000: 0;
       tR.o(f);
       if (uFloatingAct != null) {
          uFloatingAct.setTranslationY(this.getFabTranslationY());
          uFloatingAct.setTranslationX(this.getFabTranslationX());
       }
       ActionMenuView actionMenuVi = this.getActionMenuView();
       if (actionMenuVi != null) {
          actionMenuVi.setAlpha(0x3f800000);
          if (!this.c0()) {
             this.i0(actionMenuVi, 0, 0);
          }else {
             this.i0(actionMenuVi, this.W, this.V0);
          }
       }
       return;
    }
    public void i0(ActionMenuView p0,int p1,boolean p2){
       ViewGroup$LayoutParams layoutParams;
       int i = (i0.B(this) == 1)? 1: 0;
       int i1 = 0;
       int i2 = 0;
       while (i1 < this.getChildCount()) {
          View childAt = this.getChildAt(i1);
          if (childAt.getLayoutParams() instanceof Toolbar$LayoutParams) {
             int i3 = childAt.getLayoutParams().a & 0x800007;
             if (i3 == 0x800003) {
                layoutParams = 1;
             label_0033 :
                if (layoutParams) {
                   int left = (i)? childAt.getLeft(): childAt.getRight();
                   i2 = Math.max(i2, left);
                }
                i1 = i1 + 1;
             }
          }
          layoutParams = null;
          goto label_0033 ;
       }
       i = (i)? p0.getRight(): p0.getLeft();
       i2 = i2 - i;
       float f = (p1 == 1 && p2)? (float)i2: 0;
       p0.setTranslationX(f);
       return;
    }
    public void onLayout(boolean p0,int p1,int p2,int p3,int p4){
       super.onLayout(p0, p1, p2, p3, p4);
       this.S();
       this.h0();
    }
    public void onRestoreInstanceState(Parcelable p0){
       if (!p0 instanceof BottomAppBar$SavedState) {
          super.onRestoreInstanceState(p0);
          return;
       }else {
          super.onRestoreInstanceState(p0.a());
          this.W = p0.d;
          this.V0 = p0.e;
          return;
       }
    }
    public Parcelable onSaveInstanceState(){
       BottomAppBar$SavedState savedState = new BottomAppBar$SavedState(super.onSaveInstanceState());
       savedState.d = this.W;
       savedState.e = this.V0;
       return savedState;
    }
    public void setBackgroundTint(ColorStateList p0){
       a.o(this.R, p0);
    }
    public void setCradleVerticalOffset(float p0){
       if (p0 - this.getCradleVerticalOffset()) {
          this.S.g(p0);
          this.R.invalidateSelf();
       }
       return;
    }
    public void setFabAlignmentMode(int p0){
       this.f0(p0);
       this.e0(p0, this.V0);
       this.W = p0;
    }
    public void setFabCradleMargin(float p0){
       if (p0 - this.getFabCradleMargin()) {
          this.S.h(p0);
          this.R.invalidateSelf();
       }
       return;
    }
    public void setFabCradleRoundedCornerRadius(float p0){
       if (p0 - this.getFabCradleRoundedCornerRadius()) {
          this.S.i(p0);
          this.R.invalidateSelf();
       }
       return;
    }
    public void setFabDiameter(int p0){
       float f = (float)p0;
       if (f - this.S.e()) {
          this.S.j(f);
          this.R.invalidateSelf();
       }
       return;
    }
    public void setHideOnScroll(boolean p0){
       this.U0 = p0;
    }
    public void setSubtitle(CharSequence p0){
    }
    public void setTitle(CharSequence p0){
    }
}
