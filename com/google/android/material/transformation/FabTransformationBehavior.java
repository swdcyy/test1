package com.google.android.material.transformation.FabTransformationBehavior;
import com.google.android.material.transformation.ExpandableTransformationBehavior;
import android.graphics.Rect;
import android.graphics.RectF;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.animation.AnimatorSet;
import com.google.android.material.transformation.FabTransformationBehavior$e;
import java.util.ArrayList;
import java.util.List;
import rj.b;
import com.google.android.material.transformation.FabTransformationBehavior$a;
import android.animation.Animator$AnimatorListener;
import java.lang.Object;
import android.view.ViewGroup;
import com.google.android.material.transformation.TransformationChildLayout;
import com.google.android.material.transformation.TransformationChildCard;
import rj.i;
import rj.j;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import java.lang.IllegalStateException;
import java.lang.String;
import rj.h;
import android.animation.TimeInterpolator;
import rj.a;
import androidx.coordinatorlayout.widget.CoordinatorLayout$LayoutParams;
import com.google.android.material.circularreveal.c;
import com.google.android.material.circularreveal.b;
import rj.d;
import java.lang.Float;
import android.util.Property;
import android.animation.ObjectAnimator;
import android.animation.Animator;
import com.google.android.material.circularreveal.c$d;
import rj.c;
import android.animation.TypeEvaluator;
import a2.i0;
import com.google.android.material.circularreveal.c$e;
import dk.a;
import com.google.android.material.circularreveal.a;
import com.google.android.material.transformation.FabTransformationBehavior$d;
import android.widget.ImageView;
import android.graphics.drawable.Drawable;
import rj.e;
import com.google.android.material.transformation.FabTransformationBehavior$b;
import android.animation.ValueAnimator$AnimatorUpdateListener;
import com.google.android.material.transformation.FabTransformationBehavior$c;
import android.view.ViewAnimationUtils;
import android.content.res.ColorStateList;

public abstract class FabTransformationBehavior extends ExpandableTransformationBehavior	// class@0016f0
{
    public final Rect c;
    public final RectF d;
    public final RectF e;
    public final int[] f;

    public void FabTransformationBehavior(){
       super();
       this.c = new Rect();
       this.d = new RectF();
       this.e = new RectF();
       int[] ointArray = new int[2];
       this.f = ointArray;
    }
    public void FabTransformationBehavior(Context p0,AttributeSet p1){
       super(p0, p1);
       this.c = new Rect();
       this.d = new RectF();
       this.e = new RectF();
       int[] ointArray = new int[2];
       this.f = ointArray;
    }
    public AnimatorSet g(View p0,View p1,boolean p2,boolean p3){
       FabTransformationBehavior this;
       boolean b = p2;
       FabTransformationBehavior$e uoe = this.y(p1.getContext(), b);
       ArrayList uArrayList = new ArrayList();
       ArrayList uArrayList1 = new ArrayList();
       this.r(p0, p1, p2, p3, uoe, uArrayList, uArrayList1);
       FabTransformationBehavior d = this.d;
       this = this;
       View view = p0;
       View view1 = p1;
       boolean b1 = p2;
       boolean b2 = p3;
       FabTransformationBehavior$e uoe1 = uoe;
       ArrayList uArrayList2 = uArrayList;
       ArrayList uArrayList3 = uArrayList1;
       this.w(view, view1, b1, b2, uoe1, uArrayList2, uArrayList3, d);
       float f = d.width();
       this.t(view, view1, b1, b2, uoe1, uArrayList2, uArrayList3);
       float f1 = f;
       this.s(view, view1, b1, b2, uoe1, f1, d.height(), uArrayList, uArrayList1);
       uArrayList2 = uArrayList;
       uArrayList3 = uArrayList1;
       this.q(view, view1, b1, b2, uoe1, uArrayList2, uArrayList3);
       this.p(view, view1, b1, b2, uoe1, uArrayList2, uArrayList3);
       super();
       b.a(this, uArrayList);
       this.addListener(new FabTransformationBehavior$a(this, b, p1, p0));
       int i1 = uArrayList1.size();
       for (int i = 0; i < i1; i = i + 1) {
          this.addListener(uArrayList1.get(i));
       }
       return this;
    }
    public final ViewGroup h(View p0){
       View view = p0.findViewById(R.id.mtrl_child_content_container);
       if (view != null) {
          return this.z(view);
       }
       if (p0 instanceof TransformationChildLayout || p0 instanceof TransformationChildCard) {
          return this.z(p0.getChildAt(0));
       }
       return this.z(p0);
    }
    public final void i(View p0,FabTransformationBehavior$e p1,i p2,i p3,float p4,float p5,float p6,float p7,RectF p8){
       FabTransformationBehavior tc = this.c;
       p0.getWindowVisibleDisplayFrame(tc);
       FabTransformationBehavior td = this.d;
       td.set(tc);
       tc = this.e;
       this.o(p0, tc);
       tc.offset(this.n(p1, p2, p4, p6), this.n(p1, p3, p5, p7));
       tc.intersect(td);
       p8.set(tc);
    }
    public final float j(View p0,View p1,j p2){
       FabTransformationBehavior td = this.d;
       FabTransformationBehavior te = this.e;
       this.o(p0, td);
       this.o(p1, te);
       te.offset((- this.l(p0, p1, p2)), 0);
       return (td.centerX() - te.left);
    }
    public final float k(View p0,View p1,j p2){
       FabTransformationBehavior td = this.d;
       FabTransformationBehavior te = this.e;
       this.o(p0, td);
       this.o(p1, te);
       te.offset(0, (- this.m(p0, p1, p2)));
       return (td.centerY() - te.top);
    }
    public final float l(View p0,View p1,j p2){
       float f;
       RectF right;
       RectF right1;
       FabTransformationBehavior td = this.d;
       FabTransformationBehavior te = this.e;
       this.o(p0, td);
       this.o(p1, te);
       int i = p2.a & 0x07;
       if (i != Float.MIN_VALUE) {
          if (i != 3) {
             if (i != 5) {
                f = 0;
             label_002c :
                return (f + p2.b);
             }else {
                right = te.right;
                right1 = td.right;
             }
          }else {
             right = te.left;
             right1 = td.left;
          }
       }else {
          right = te.centerX();
          right1 = td.centerX();
       }
       f = right - right1;
       goto label_002c ;
    }
    public boolean layoutDependsOn(CoordinatorLayout p0,View p1,View p2){
       if (p1.getVisibility() == 8) {
          throw new IllegalStateException("This behavior cannot be attached to a GONE view. Set the view to INVISIBLE instead.");
       }
       boolean b = false;
       if (p2 instanceof FloatingActionButton) {
          int expandedComp = p2.getExpandedComponentIdHint();
          if (!expandedComp || expandedComp == p1.getId()) {
             b = true;
          }
       }
       return b;
    }
    public final float m(View p0,View p1,j p2){
       float f;
       RectF bottom;
       RectF bottom1;
       FabTransformationBehavior td = this.d;
       FabTransformationBehavior te = this.e;
       this.o(p0, td);
       this.o(p1, te);
       int i = p2.a & 0x70;
       if (i != 0.00f) {
          if (i != 48) {
             if (i != 80) {
                f = 0;
             label_002f :
                return (f + p2.c);
             }else {
                bottom = te.bottom;
                bottom1 = td.bottom;
             }
          }else {
             bottom = te.top;
             bottom1 = td.top;
          }
       }else {
          bottom = te.centerY();
          bottom1 = td.centerY();
       }
       f = bottom - bottom1;
       goto label_002f ;
    }
    public final float n(FabTransformationBehavior$e p0,i p1,float p2,float p3){
       i oi = p0.a.e("expansion");
       return a.a(p2, p3, p1.e().getInterpolation(((float)(((oi.c() + oi.d()) + 17) - p1.c()) / (float)p1.d())));
    }
    public final void o(View p0,RectF p1){
       p1.set(0, 0, (float)p0.getWidth(), (float)p0.getHeight());
       FabTransformationBehavior tf = this.f;
       p0.getLocationInWindow(tf);
       p1.offsetTo((float)tf[0], (float)tf[1]);
       p1.offset((float)(int)(- p0.getTranslationX()), (float)(int)(- p0.getTranslationY()));
    }
    public void onAttachedToLayoutParams(CoordinatorLayout$LayoutParams p0){
       if (p0.h == null) {
          p0.h = 80;
       }
       return;
    }
    public final void p(View p0,View p1,boolean p2,boolean p3,FabTransformationBehavior$e p4,List p5,List p6){
       ObjectAnimator objectAnimat;
       if (!p1 instanceof ViewGroup) {
          return;
       }
       if (p1 instanceof c && !b.k) {
          return;
       }
       ViewGroup viewGroup = this.h(p1);
       if (viewGroup == null) {
          return;
       }
       float f = 0;
       if (p2) {
          if (!p3) {
             d.a.set(viewGroup, Float.valueOf(f));
          }
          float[] uofloatArray = new float[]{0x3f800000};
          objectAnimat = ObjectAnimator.ofFloat(viewGroup, d.a, uofloatArray);
       }else {
          float[] uofloatArray1 = new float[]{f};
          objectAnimat = ObjectAnimator.ofFloat(viewGroup, d.a, uofloatArray1);
       }
       p4.a.e("contentFade").a(objectAnimat);
       p5.add(objectAnimat);
       return;
    }
    public final void q(View p0,View p1,boolean p2,boolean p3,FabTransformationBehavior$e p4,List p5,List p6){
       ObjectAnimator objectAnimat;
       if (!p1 instanceof c) {
          return;
       }
       int i = this.x(p0);
       int i1 = 0xffffff & i;
       if (p2) {
          if (!p3) {
             p1.setCircularRevealScrimColor(i);
          }
          int[] ointArray = new int[]{i1};
          objectAnimat = ObjectAnimator.ofInt(p1, c$d.a, ointArray);
       }else {
          int[] ointArray1 = new int[]{i};
          objectAnimat = ObjectAnimator.ofInt(p1, c$d.a, ointArray1);
       }
       objectAnimat.setEvaluator(c.b());
       p4.a.e("color").a(objectAnimat);
       p5.add(objectAnimat);
       return;
    }
    public final void r(View p0,View p1,boolean p2,boolean p3,FabTransformationBehavior$e p4,List p5,List p6){
       float[] uofloatArray;
       ObjectAnimator objectAnimat;
       float f = i0.w(p1) - i0.w(p0);
       int i = 0;
       if (p2) {
          if (!p3) {
             p1.setTranslationZ((- f));
          }
          uofloatArray = new float[]{0};
          objectAnimat = ObjectAnimator.ofFloat(p1, View.TRANSLATION_Z, uofloatArray);
       }else {
          uofloatArray = new float[]{- f};
          objectAnimat = ObjectAnimator.ofFloat(p1, View.TRANSLATION_Z, uofloatArray);
       }
       p4.a.e("elevation").a(objectAnimat);
       p5.add(objectAnimat);
       return;
    }
    public final void s(View p0,View p1,boolean p2,boolean p3,FabTransformationBehavior$e p4,float p5,float p6,List p7,List p8){
       Animator uAnimator;
       FabTransformationBehavior uFabTransfor = this;
       View view = p0;
       View view1 = p1;
       FabTransformationBehavior$e uoe = p4;
       if (!view1 instanceof c) {
          return;
       }
       c uoc = view1;
       float f = uFabTransfor.j(view, view1, uoe.b);
       FloatingActionButton uFloatingAct = uFabTransfor.k(view, view1, uoe.b);
       view.h(uFabTransfor.c);
       float f1 = (float)uFabTransfor.c.width() / 2.00f;
       i oi = uoe.a.e("expansion");
       if (p2) {
          if (!p3) {
             uoc.setRevealInfo(new c$e(f, uFloatingAct, f1));
          }
          if (p3) {
             f1 = uoc.getRevealInfo().c;
          }
          uAnimator = a.a(uoc, f, uFloatingAct, a.b(f, uFloatingAct, 0, 0, p5, p6));
          uAnimator.addListener(new FabTransformationBehavior$d(uFabTransfor, uoc));
          this.v(p1, oi.c(), (int)f, (int)uFloatingAct, f1, p7);
       }else {
          int i = (int)f;
          int i1 = (int)uFloatingAct;
          View view2 = p1;
          int i2 = i;
          int i3 = i;
          this.v(view2, oi.c(), i2, i1, uoc.getRevealInfo().c, p7);
          int i4 = i1;
          this.u(view2, oi.c(), oi.d(), uoe.a.f(), i3, i4, f1, p7);
          uAnimator = a.a(uoc, f, uFloatingAct, f1);
       }
       oi.a(uAnimator);
       p7.add(uAnimator);
       p8.add(a.b(uoc));
       return;
    }
    public final void t(View p0,View p1,boolean p2,boolean p3,FabTransformationBehavior$e p4,List p5,List p6){
       int[] ointArray;
       ObjectAnimator objectAnimat;
       if (p1 instanceof c && p0 instanceof ImageView) {
          c uoc = p1;
          Drawable drawable = p0.getDrawable();
          if (drawable == null) {
             return;
          }else {
             drawable.mutate();
             if (p2) {
                if (!p3) {
                   drawable.setAlpha(255);
                }
                ointArray = new int[]{0};
                objectAnimat = ObjectAnimator.ofInt(drawable, e.b, ointArray);
             }else {
                ointArray = new int[]{255};
                objectAnimat = ObjectAnimator.ofInt(drawable, e.b, ointArray);
             }
             objectAnimat.addUpdateListener(new FabTransformationBehavior$b(this, p1));
             p4.a.e("iconFade").a(objectAnimat);
             p5.add(objectAnimat);
             p6.add(new FabTransformationBehavior$c(this, uoc, drawable));
          }
       }
       return;
    }
    public final void u(View p0,long p1,long p2,long p3,int p4,int p5,float p6,List p7){
       p1 = p1 + p2;
       if (p1 - p3 < 0) {
          Animator uAnimator = ViewAnimationUtils.createCircularReveal(p0, p4, p5, p6, p6);
          uAnimator.setStartDelay(p1);
          uAnimator.setDuration((p3 - p1));
          p7.add(uAnimator);
       }
       return;
    }
    public final void v(View p0,long p1,int p2,int p3,float p4,List p5){
       if (p1 > 0) {
          Animator uAnimator = ViewAnimationUtils.createCircularReveal(p0, p2, p3, p4, p4);
          uAnimator.setStartDelay(0);
          uAnimator.setDuration(p1);
          p5.add(uAnimator);
       }
       return;
    }
    public final void w(View p0,View p1,boolean p2,boolean p3,FabTransformationBehavior$e p4,List p5,List p6,RectF p7){
       i oi;
       i oi1;
       ObjectAnimator objectAnimat;
       ObjectAnimator objectAnimat1;
       FabTransformationBehavior uFabTransfor = this;
       View view = p0;
       View view1 = p1;
       FabTransformationBehavior$e uoe = p4;
       List list = p5;
       float f = uFabTransfor.l(view, view1, uoe.b);
       float f1 = uFabTransfor.m(view, view1, uoe.b);
       int i = 0;
       if (!f - i || !(v5 = f1 - i)) {
          oi = uoe.a.e("translationXLinear");
          oi1 = uoe.a.e("translationYLinear");
       }else if(!p2 || (f1 - i < 0 || (!p2 && v5 > 0))){
          oi = uoe.a.e("translationXCurveUpwards");
          oi1 = uoe.a.e("translationYCurveUpwards");
       }else {
          oi = uoe.a.e("translationXCurveDownwards");
          oi1 = uoe.a.e("translationYCurveDownwards");
       }
       i oi2 = oi;
       i oi3 = oi1;
       int i1 = 0;
       int i2 = 1;
       if (p2) {
          if (!p3) {
             view1.setTranslationX((- f));
             view1.setTranslationY((- f1));
          }
          float[] uofloatArray = new float[i2];
          uofloatArray[i1] = i;
          objectAnimat = ObjectAnimator.ofFloat(view1, View.TRANSLATION_X, uofloatArray);
          float[] uofloatArray1 = new float[i2];
          uofloatArray1[i1] = i;
          objectAnimat1 = ObjectAnimator.ofFloat(view1, View.TRANSLATION_Y, uofloatArray1);
          this.i(p1, p4, oi2, oi3, (- f), (- f1), 0, 0, p7);
       }else {
          float[] uofloatArray2 = new float[i2];
          uofloatArray2[i1] = - f;
          objectAnimat = ObjectAnimator.ofFloat(view1, View.TRANSLATION_X, uofloatArray2);
          float[] uofloatArray3 = new float[i2];
          uofloatArray3[i1] = - f1;
          objectAnimat1 = ObjectAnimator.ofFloat(view1, View.TRANSLATION_Y, uofloatArray3);
       }
       oi2.a(objectAnimat);
       oi3.a(objectAnimat1);
       list.add(objectAnimat);
       list.add(objectAnimat1);
       return;
    }
    public final int x(View p0){
       ColorStateList uColorStateL = i0.s(p0);
       if (uColorStateL != null) {
          return uColorStateL.getColorForState(p0.getDrawableState(), uColorStateL.getDefaultColor());
       }
       return 0;
    }
    public abstract FabTransformationBehavior$e y(Context p0,boolean p1);
    public final ViewGroup z(View p0){
       if (p0 instanceof ViewGroup) {
          return p0;
       }
       return null;
    }
}
