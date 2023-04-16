package com.yxcorp.gifshow.widget.RatioExpandView$b;
import tyc.y4;
import com.yxcorp.gifshow.widget.RatioExpandView;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import android.widget.LinearLayout;
import android.view.View;
import com.yxcorp.gifshow.widget.RatioExpandView$RatioExpandItemView;
import android.animation.AnimatorSet;
import android.widget.FrameLayout;
import android.animation.ObjectAnimator;
import th0.e;
import android.animation.TimeInterpolator;
import com.yxcorp.gifshow.widget.z;
import android.animation.Animator$AnimatorListener;
import android.animation.ValueAnimator;
import android.widget.TextView;
import android.graphics.drawable.Drawable;
import tyc.d4;
import android.animation.ValueAnimator$AnimatorUpdateListener;
import com.yxcorp.gifshow.widget.a0;
import tyc.c4;
import android.animation.Animator;
import tyc.t3;
import tyc.x4;

public class RatioExpandView$b implements y4	// class@0018a8
{
    public final RatioExpandView a;

    public void RatioExpandView$b(RatioExpandView p0){
       this.a = p0;
       super();
    }
    public void a(int p0){
       RatioExpandView$b uob = RatioExpandView$b.class;
       if (PatchProxy.isSupport(uob) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, uob, "2")) {
          return;
       }
       this.a.setSelectIndex(p0);
       return;
    }
    public void b(){
       Object obj = this;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, obj, RatioExpandView$b.class, "1")) {
          return;
       }
       RatioExpandView$b a = obj.a;
       Objects.requireNonNull(a);
       if (!PatchProxy.applyVoid(objArray, a, RatioExpandView.class, "12")) {
          a.c = true;
          int childCount = a.j.getChildCount();
          int i = 0;
          long l = 300;
          int i1 = 2;
          while (i < childCount) {
             if (i < a.j.getChildCount()) {
                View childAt = a.j.getChildAt(i);
                if (childAt instanceof RatioExpandView$RatioExpandItemView) {
                   Objects.requireNonNull(childAt);
                   if (!PatchProxy.isSupport(RatioExpandView$RatioExpandItemView.class) || !PatchProxy.applyVoidOneRefs(Integer.valueOf(i), childAt, RatioExpandView$RatioExpandItemView.class, "7")) {
                      int i2 = (i == childAt.f.b)? 1: 0;
                      AnimatorSet uAnimatorSet = new AnimatorSet();
                      float[] uofloatArray = new float[i1];
                      uofloatArray[0] = childAt.getTranslationX();
                      uofloatArray[1] = 0;
                      ObjectAnimator objectAnimat = ObjectAnimator.ofFloat(childAt, "translationX", uofloatArray);
                      objectAnimat.setInterpolator(new e());
                      objectAnimat.addListener(new z(childAt));
                      float[] uofloatArray1 = new float[i1];
                      uofloatArray1[0] = 0;
                      uofloatArray1[1] = (float)RatioExpandView.G;
                      ValueAnimator valueAnimato = ValueAnimator.ofFloat(uofloatArray1);
                      valueAnimato.setDuration(l);
                      valueAnimato.setInterpolator(new e());
                      childAt.c.setTextSize((float)RatioExpandView.F);
                      childAt.c.setTextAlignment(4);
                      if (i2) {
                         childAt.setVisibility(0);
                         childAt.c.setCompoundDrawablePadding(0);
                         childAt.c.setCompoundDrawables(objArray, objArray, objArray, objArray);
                         childAt.c.setPadding(0, 0, 0, 0);
                         valueAnimato.addUpdateListener(new d4(childAt));
                         valueAnimato.addListener(new a0(childAt));
                      }else {
                         childAt.b.setAlpha(0);
                         childAt.setAlpha(0);
                         childAt.setVisibility(0);
                         valueAnimato.addUpdateListener(new c4(childAt));
                      }
                      Animator[] uAnimatorArr = new Animator[]{objectAnimat,valueAnimato};
                      uAnimatorSet.playTogether(uAnimatorArr);
                      uAnimatorSet.start();
                   }
                }
             }
             i = i + 1;
          }
          int[] ointArray = new int[]{RatioExpandView.u,a.k};
          ValueAnimator valueAnimato1 = ValueAnimator.ofInt(ointArray);
          valueAnimato1.setInterpolator(new e());
          valueAnimato1.setDuration(l);
          valueAnimato1.addUpdateListener(new t3(a));
          valueAnimato1.start();
       }
       RatioExpandView p = obj.a.p;
       if (p != null) {
          p.a(true);
       }
       return;
    }
}
