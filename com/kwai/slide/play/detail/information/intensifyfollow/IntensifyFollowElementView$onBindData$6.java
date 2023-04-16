package com.kwai.slide.play.detail.information.intensifyfollow.IntensifyFollowElementView$onBindData$6;
import msd.l;
import kotlin.jvm.internal.FunctionReferenceImpl;
import dr7.a;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import java.lang.Boolean;
import qrd.l1;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.CallableReference;
import java.util.Objects;
import com.kwai.robust.PatchProxyResult;
import android.animation.AnimatorSet;
import lnc.a1;
import android.animation.ValueAnimator;
import dr7.d;
import android.animation.ValueAnimator$AnimatorUpdateListener;
import dr7.e;
import kotlin.jvm.internal.a;
import bt7.c;
import android.animation.TimeInterpolator;
import android.animation.Animator;
import dr7.f;
import android.animation.Animator$AnimatorListener;
import dr7.a0;
import android.view.View;

public final class IntensifyFollowElementView$onBindData$6 extends FunctionReferenceImpl implements l	// class@0017eb
{

    public void IntensifyFollowElementView$onBindData$6(a p0){
       super(1, p0, a.class, "showButtons", "showButtons\(Z\)V", 0);
    }
    public Object invoke(Object p0){
       this.invoke(p0.booleanValue());
       return l1.a;
    }
    public final void invoke(boolean p0){
       a s;
       if (PatchProxy.isSupport(IntensifyFollowElementView$onBindData$6.class) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, IntensifyFollowElementView$onBindData$6.class, "1")) {
          return;
       }
       CallableReference treceiver = this.receiver;
       Objects.requireNonNull(treceiver);
       a uoa = a.class;
       if (!PatchProxy.isSupport(uoa) || !PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), treceiver, uoa, "10")) {
          int i = 0;
          if (p0) {
             AnimatorSet uAnimatorSet = PatchProxy.apply(null, treceiver, uoa, "15");
             if (uAnimatorSet != PatchProxyResult.class) {
             }else {
                uAnimatorSet = new AnimatorSet();
                int i1 = a1.e(40.00f);
                ValueAnimator valueAnimato = ValueAnimator.ofFloat(new float[2]{0,0x3f800000});
                valueAnimato.addUpdateListener(new d(treceiver, i1, a1.e(8.00f)));
                ValueAnimator valueAnimato1 = ValueAnimator.ofFloat(new float[2]{0,0x3f800000});
                valueAnimato1.addUpdateListener(new e(treceiver));
                a.o(valueAnimato1, "alpha");
                valueAnimato1.setDuration(280);
                a.o(valueAnimato, "progressAnim");
                valueAnimato.setInterpolator(new c(0x3f000000, 0, 0.30f, 0x3f800000));
                valueAnimato.setDuration(280);
                Animator[] uAnimatorArr = new Animator[]{valueAnimato1,valueAnimato};
                uAnimatorSet.playTogether(uAnimatorArr);
                uAnimatorSet.addListener(new f(treceiver, i1));
             }
             treceiver.s = uAnimatorSet;
             if (uAnimatorSet != null) {
                uAnimatorSet.addListener(new a0());
             }
             s = treceiver.s;
             if (s != null) {
                s.start();
             }
          }else {
             s = treceiver.m;
             if (s == null) {
                a.S("mIntensifyFollowContainer");
             }
             s.setVisibility(i);
          }
       }
       return;
    }
}
