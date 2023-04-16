package com.yxcorp.gifshow.lelink.floatbutton.presenter.FloatButtonPresenter$mRunnable$1;
import msd.a;
import kotlin.jvm.internal.Lambda;
import com.yxcorp.gifshow.lelink.floatbutton.presenter.FloatButtonPresenter;
import java.lang.Object;
import qrd.l1;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.util.Objects;
import android.animation.AnimatorSet;
import android.view.View;
import android.animation.ObjectAnimator;
import kotlin.jvm.internal.a;
import android.content.Context;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import j75.e;
import android.animation.ValueAnimator;
import kotlin.jvm.internal.Ref$IntRef;
import a0b.a;
import android.animation.ValueAnimator$AnimatorUpdateListener;
import android.animation.Animator;
import com.yxcorp.gifshow.lelink.floatbutton.FloatButtonManager;
import com.yxcorp.gifshow.lelink.floatbutton.FloatButtonManager$a;
import java.lang.Integer;
import com.yxcorp.gifshow.lelink.floatbutton.FloatWindowView;

public final class FloatButtonPresenter$mRunnable$1 extends Lambda implements a	// class@001a47
{
    public final FloatButtonPresenter this$0;

    public void FloatButtonPresenter$mRunnable$1(FloatButtonPresenter p0){
       this.this$0 = p0;
       super(0);
    }
    public Object invoke(){
       this.invoke();
       return l1.a;
    }
    public final void invoke(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, FloatButtonPresenter$mRunnable$1.class, "1")) {
          return;
       }
       FloatButtonPresenter$mRunnable$1 tthis$0 = this.this$0;
       Objects.requireNonNull(tthis$0);
       if (!PatchProxy.applyVoid(objArray, tthis$0, FloatButtonPresenter.class, "4")) {
          tthis$0.C = new AnimatorSet();
          FloatButtonPresenter v = tthis$0.v;
          if (v != null) {
             v.setPivotX((float)v.getWidth());
          }
          int i = 2;
          ObjectAnimator objectAnimat = ObjectAnimator.ofFloat(tthis$0.y, "alpha", new float[i]{0x3f800000,0}).setDuration(180);
          a.o(objectAnimat, "ObjectAnimator.ofFloat\(m¡­       .setDuration\(180L\)");
          int[] ointArray = new int[i];
          ointArray[0] = e.b(tthis$0.getContext(), 70.00f);
          int i1 = 1;
          ointArray[i1] = 0;
          ValueAnimator valueAnimato = ValueAnimator.ofInt(ointArray).setDuration(410);
          Ref$IntRef intRef = new Ref$IntRef();
          intRef.element = e.b(tthis$0.getContext(), 70.00f);
          if (valueAnimato != null) {
             valueAnimato.addUpdateListener(new a(tthis$0, intRef));
          }
          FloatButtonPresenter c = tthis$0.C;
          if (c != null) {
             Animator[] uAnimatorArr = new Animator[i];
             uAnimatorArr[0] = valueAnimato;
             uAnimatorArr[i1] = objectAnimat;
             c.playTogether(uAnimatorArr);
          }
          FloatButtonPresenter c1 = tthis$0.C;
          if (c1 != null) {
             c1.start();
          }
          FloatButtonManager uFloatButton = FloatButtonManager.i.a();
          Ref$IntRef element = intRef.element;
          Objects.requireNonNull(uFloatButton);
          FloatButtonManager uFloatButton1 = FloatButtonManager.class;
          if (!PatchProxy.isSupport(uFloatButton1) || !PatchProxy.applyVoidOneRefs(Integer.valueOf(element), uFloatButton, uFloatButton1, "7")) {
             uFloatButton = uFloatButton.f;
             if (uFloatButton != null) {
                uFloatButton.setShrinkWidth(element);
             }
          }
       }
    label_00b9 :
       return;
    }
}
