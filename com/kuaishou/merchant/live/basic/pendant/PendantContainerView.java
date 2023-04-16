package com.kuaishou.merchant.live.basic.pendant.PendantContainerView;
import androidx.core.widget.NestedScrollView;
import com.kuaishou.merchant.live.basic.pendant.PendantContainerView$b;
import nsd.u;
import lnc.a1;
import android.content.Context;
import android.util.AttributeSet;
import android.animation.LayoutTransition;
import android.animation.PropertyValuesHolder;
import android.view.View;
import android.util.Property;
import java.lang.Object;
import android.animation.ObjectAnimator;
import android.animation.Animator;
import qrd.l1;
import bld.b;
import com.yxcorp.widget.KwaiRadiusStyles;
import bld.c;
import android.graphics.drawable.Drawable;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import com.kuaishou.merchant.live.basic.pendant.PendantContainerView$a;
import androidx.core.widget.NestedScrollView$b;
import java.lang.Runnable;
import java.util.Objects;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.String;
import android.view.MotionEvent;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import msd.l;
import android.view.ViewGroup;
import java.lang.Number;
import android.view.ViewParent;
import android.view.ViewGroup$LayoutParams;
import android.view.ViewGroup$MarginLayoutParams;
import android.view.View$MeasureSpec;

public final class PendantContainerView extends NestedScrollView	// class@0018a1
{
    public int b;
    public int c;
    public Runnable d;
    public final LayoutTransition e;
    public l f;
    public HashMap g;
    public static final int h;
    public static final PendantContainerView$b i;

    static {
       PendantContainerView.i = new PendantContainerView$b(null);
       PendantContainerView.h = a1.d(0x7f0702ac);
    }
    public void PendantContainerView(Context p0,AttributeSet p1){
       super(p0, p1, 0);
    }
    public void PendantContainerView(Context p0,AttributeSet p1,int p2){
       super(p0, p1, p2);
       LayoutTransition layoutTransi = new LayoutTransition();
       PropertyValuesHolder[] propertyValu = new PropertyValuesHolder[]{PropertyValuesHolder.ofFloat(View.SCALE_X, new float[2]{0,0x3f800000}),PropertyValuesHolder.ofFloat(View.SCALE_Y, new float[2]{0,0x3f800000})};
       layoutTransi.setAnimator(2, ObjectAnimator.ofPropertyValuesHolder(null, propertyValu));
       propertyValu = new PropertyValuesHolder[]{PropertyValuesHolder.ofFloat(View.SCALE_X, new float[2]{0x3f800000,0}),PropertyValuesHolder.ofFloat(View.SCALE_Y, new float[2]{0x3f800000,0})};
       layoutTransi.setAnimator(3, ObjectAnimator.ofPropertyValuesHolder(null, propertyValu));
       this.e = layoutTransi;
       b uob = new b();
       uob.g(KwaiRadiusStyles.R6);
       uob.v(a1.a(R.color.arg_RES_7f061d68));
       this.setBackground(uob.a());
       LinearLayout linearLayout = new LinearLayout(this.getContext());
       linearLayout.setOrientation(1);
       linearLayout.setGravity(5);
       this.addView(linearLayout);
       this.setOnScrollChangeListener(new PendantContainerView$a(this));
    }
    public static void k(PendantContainerView p0,View p1,int p2,int p3,int p4,int p5,Object p6){
       if (p5 & 0x02) {
          p2 = p0.getPendantCount();
       }
       if (p5 & 0x04) {
          p3 = 0;
       }
       if (p5 & 0x08) {
          p4 = 0;
       }
       p0.j(p1, p2, p3, p4);
       return;
    }
    public static void n(PendantContainerView p0,int p1,Runnable p2,int p3,Object p4){
       Objects.requireNonNull(p0);
       if (!PatchProxy.isSupport(PendantContainerView.class) || !PatchProxy.applyVoidTwoRefs(Integer.valueOf(p1), null, p0, PendantContainerView.class, "12")) {
          if (p1 < p0.getPendantCount()) {
             p0.m(p0.l().getChildAt(p1), null);
          }else {
             p0.m(p0.l().getChildAt((p0.getPendantCount() - 1)), null);
          }
       }
       return;
    }
    public boolean dispatchTouchEvent(MotionEvent p0){
       PendantContainerView obj = PatchProxy.applyOneRefs(p0, this, PendantContainerView.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (p0 != null) {
          obj = this.f;
          if (obj != null) {
             obj.invoke(p0);
          }
       }
       return super.dispatchTouchEvent(p0);
    }
    public final int getMMaxHeight(){
       return this.b;
    }
    public final l getMTouchListener(){
       return this.f;
    }
    public final int getPendantCount(){
       Object obj = PatchProxy.apply(null, this, PendantContainerView.class, "9");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return this.l().getChildCount();
    }
    public final void j(View p0,int p1,int p2,int p3){
       ViewGroup$MarginLayoutParams marginLayout;
       if (PatchProxy.isSupport(PendantContainerView.class) && PatchProxy.applyVoidFourRefs(p0, Integer.valueOf(p1), Integer.valueOf(p2), Integer.valueOf(p3), this, PendantContainerView.class, "3")) {
          return;
       }
       if (p1 > this.getPendantCount()) {
          return;
       }
       ViewParent parent = p0.getParent();
       if (!parent instanceof ViewGroup) {
          parent = null;
       }
       if (parent != null) {
          parent.removeView(p0);
       }
       LinearLayout linearLayout = this.l();
       if (PatchProxy.isSupport(PendantContainerView.class)) {
          marginLayout = PatchProxy.applyThreeRefs(p0, Integer.valueOf(p2), Integer.valueOf(p3), this, PendantContainerView.class, "18");
          if (marginLayout != PatchProxyResult.class) {
          label_0082 :
             linearLayout.addView(p0, p1, marginLayout);
             return;
          }
       }
       ViewGroup$LayoutParams layoutParams = p0.getLayoutParams();
       if (p2 <= 0) {
          ViewGroup$MarginLayoutParams marginLayout1 = -2;
       }
       if (p3 <= 0) {
          p3 = -2;
       }
       marginLayout = (layoutParams instanceof ViewGroup$MarginLayoutParams)? new ViewGroup$MarginLayoutParams(layoutParams): new ViewGroup$MarginLayoutParams(p2, p3);
       p2 = PendantContainerView.h;
       marginLayout.topMargin = p2;
       marginLayout.bottomMargin = p2;
       goto label_0082 ;
    }
    public final LinearLayout l(){
       View obj = PatchProxy.apply(null, this, PendantContainerView.class, "19");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.getChildAt(0);
       Objects.requireNonNull(obj, "null cannot be cast to non-null type android.widget.LinearLayout");
       return obj;
    }
    public final void m(View p0,Runnable p1){
       boolean b;
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, PendantContainerView.class, "14")) {
          return;
       }
       if (p0 != null) {
          Object obj = PatchProxy.apply(null, this, PendantContainerView.class, "16");
          if (obj != PatchProxyResult.class) {
             b = obj.booleanValue();
          }else if(this.l().getMeasuredHeight() > this.getMeasuredHeight()){
             b = true;
          }else {
             b = false;
          }
          if (b) {
             int i = p0.getBottom() - (this.getMeasuredHeight() / 2);
             this.c = i;
             this.d = p1;
             this.smoothScrollTo(0, i);
          }else if(p1 != null){
             p1.run();
          }
       }
       return;
    }
    public void onMeasure(int p0,int p1){
       if (PatchProxy.isSupport(PendantContainerView.class) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), Integer.valueOf(p1), this, PendantContainerView.class, "1")) {
          return;
       }
       if (View$MeasureSpec.getMode(p1) != 0x40000000) {
          PendantContainerView tb = this.b;
          if (tb > null) {
             p1 = View$MeasureSpec.makeMeasureSpec(tb, Integer.MIN_VALUE);
          }
       }
       super.onMeasure(p0, p1);
       return;
    }
    public final void setLayoutAnimated(boolean p0){
       if (PatchProxy.isSupport(PendantContainerView.class) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, PendantContainerView.class, "17")) {
          return;
       }
       if (p0 && this.l().getLayoutTransition() != null) {
          return;
       }
       LinearLayout linearLayout = this.l();
       PendantContainerView te = (p0)? this.e: null;
       linearLayout.setLayoutTransition(te);
       return;
    }
    public final void setMMaxHeight(int p0){
       this.b = p0;
    }
    public final void setMTouchListener(l p0){
       this.f = p0;
    }
    public final void setMaxHeight(int p0){
       if (PatchProxy.isSupport(PendantContainerView.class) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, PendantContainerView.class, "11")) {
          return;
       }
       if (p0 == this.b) {
          return;
       }
       this.b = p0;
       this.requestLayout();
       return;
    }
}
