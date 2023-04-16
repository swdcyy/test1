package com.yxcorp.gifshow.widget.adpter.bottomSheet.c;
import kzc.d;
import android.app.Activity;
import android.view.View;
import android.animation.Animator;
import com.kwai.robust.PatchProxyResult;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import java.lang.Object;
import java.lang.String;
import android.view.ViewParent;
import android.view.ViewGroup;
import android.graphics.drawable.Drawable;
import com.yxcorp.gifshow.widget.adpter.bottomSheet.f;
import com.kwai.library.widget.popup.common.d;
import android.animation.AnimatorSet;
import java.util.ArrayList;
import android.animation.ValueAnimator;
import android.view.animation.Interpolator;
import c2.a;
import android.animation.TimeInterpolator;
import uyc.a;
import android.animation.ValueAnimator$AnimatorUpdateListener;
import java.lang.Math;
import u07.t;
import com.yxcorp.gifshow.widget.adpter.bottomSheet.a;
import com.kwai.library.widget.popup.common.PopupInterface$b;
import com.kwai.library.widget.popup.common.c$b;
import com.yxcorp.gifshow.widget.adpter.bottomSheet.b;
import com.kwai.library.widget.popup.common.c;

public class c extends d	// class@0018f0
{

    public void c(Activity p0){
       super(p0);
    }
    public static Animator d1(View p0,boolean p1){
       Drawable obj;
       Object obj1;
       ValueAnimator valueAnimato;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       if (PatchProxy.isSupport(c.class)) {
          obj = PatchProxy.applyTwoRefs(p0, Boolean.valueOf(p1), null, c.class, "2");
          if (obj != patchProxyRe) {
             return obj;
          }
       }
       obj = p0.getParent().getBackground();
       if (obj != null) {
          obj.setAlpha(0);
       }
       AnimatorSet uAnimatorSet = (p1)? d.b(f.b(p0)): d.a(f.b(p0));
       if (uAnimatorSet.getChildAnimations().size() < 2) {
          if (PatchProxy.isSupport(c.class)) {
             obj1 = PatchProxy.applyTwoRefs(p0, Boolean.valueOf(p1), null, c.class, "3");
             if (obj1 != patchProxyRe) {
             }else {
             label_0061 :
                ViewParent parent = p0.getParent();
                if (parent instanceof View) {
                   if (PatchProxy.isSupport(c.class)) {
                      obj1 = PatchProxy.applyTwoRefs(parent, Boolean.valueOf(p1), null, c.class, "5");
                      if (obj1 != patchProxyRe) {
                      }
                   }
                   Drawable background = parent.getBackground();
                   if (background != null) {
                      valueAnimato = (p1)? ValueAnimator.ofInt(new int[2]{'L',0}): ValueAnimator.ofInt(new int[2]{0,'L'});
                      valueAnimato.setInterpolator(a.b(0.05f, 0.20f, 0.20f, 0x3f800000));
                      valueAnimato.addUpdateListener(new a(background));
                   }else {
                      valueAnimato = null;
                   }
                   obj1 = valueAnimato;
                }else {
                   obj1 = null;
                }
             }
          }else {
             goto label_0061 ;
          }
          p0 = PatchProxy.applyTwoRefs(uAnimatorSet, obj1, null, c.class, "4");
          if (p0 != patchProxyRe) {
             uAnimatorSet = p0;
          }else if(obj1 == null){
             AnimatorSet uAnimatorSet1 = new AnimatorSet();
             uAnimatorSet1.setDuration(Math.max(uAnimatorSet.getDuration(), obj1.getDuration()));
             Animator[] uAnimatorArr = new Animator[]{uAnimatorSet,obj1};
             uAnimatorSet1.playTogether(uAnimatorArr);
             uAnimatorSet = uAnimatorSet1;
          }
       }
       return uAnimatorSet;
    }
    public t b0(){
       Object obj = PatchProxy.apply(null, this, c.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       this.G(a.a);
       this.O(b.a);
       return super.b0();
    }
    public c k(){
       return this.b0();
    }
}
