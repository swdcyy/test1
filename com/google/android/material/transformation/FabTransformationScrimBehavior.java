package com.google.android.material.transformation.FabTransformationScrimBehavior;
import com.google.android.material.transformation.ExpandableTransformationBehavior;
import rj.i;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.animation.AnimatorSet;
import java.util.ArrayList;
import java.util.List;
import rj.b;
import com.google.android.material.transformation.FabTransformationScrimBehavior$a;
import android.animation.Animator$AnimatorListener;
import java.lang.Object;
import android.util.Property;
import android.animation.ObjectAnimator;
import android.animation.Animator;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import android.view.MotionEvent;
import androidx.coordinatorlayout.widget.CoordinatorLayout$Behavior;

public class FabTransformationScrimBehavior extends ExpandableTransformationBehavior	// class@0016f2
{
    public final i c;
    public final i d;

    public void FabTransformationScrimBehavior(){
       super();
       this.c = new i(75, 150);
       this.d = new i(0, 150);
    }
    public void FabTransformationScrimBehavior(Context p0,AttributeSet p1){
       super(p0, p1);
       this.c = new i(75, 150);
       this.d = new i(0, 150);
    }
    public AnimatorSet g(View p0,View p1,boolean p2,boolean p3){
       ArrayList uArrayList = new ArrayList();
       this.h(p1, p2, p3, uArrayList, new ArrayList());
       AnimatorSet uAnimatorSet = new AnimatorSet();
       b.a(uAnimatorSet, uArrayList);
       uAnimatorSet.addListener(new FabTransformationScrimBehavior$a(this, p2, p1));
       return uAnimatorSet;
    }
    public final void h(View p0,boolean p1,boolean p2,List p3,List p4){
       float[] uofloatArray;
       ObjectAnimator objectAnimat;
       FabTransformationScrimBehavior tc = (p1)? this.c: this.d;
       float f = 0;
       if (p1) {
          if (!p2) {
             p0.setAlpha(f);
          }
          uofloatArray = new float[]{0x3f800000};
          objectAnimat = ObjectAnimator.ofFloat(p0, View.ALPHA, uofloatArray);
       }else {
          uofloatArray = new float[]{f};
          objectAnimat = ObjectAnimator.ofFloat(p0, View.ALPHA, uofloatArray);
       }
       tc.a(objectAnimat);
       p3.add(objectAnimat);
       return;
    }
    public boolean layoutDependsOn(CoordinatorLayout p0,View p1,View p2){
       return p2 instanceof FloatingActionButton;
    }
    public boolean onTouchEvent(CoordinatorLayout p0,View p1,MotionEvent p2){
       return super.onTouchEvent(p0, p1, p2);
    }
}
