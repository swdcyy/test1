package com.kwai.slide.play.detail.information.intensifyfollow.IntensifyFollowElementView$onBindData$7;
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
import android.animation.Animator;
import android.view.animation.DecelerateInterpolator;
import android.animation.TimeInterpolator;
import dr7.g;
import android.animation.Animator$AnimatorListener;
import dr7.c0;
import kotlin.jvm.internal.a;
import lnc.a1;
import java.lang.CharSequence;
import android.widget.TextView;
import android.view.View;

public final class IntensifyFollowElementView$onBindData$7 extends FunctionReferenceImpl implements l	// class@0017ec
{

    public void IntensifyFollowElementView$onBindData$7(a p0){
       super(1, p0, a.class, "showGuideFollowButtons", "showGuideFollowButtons\(Z\)V", 0);
    }
    public Object invoke(Object p0){
       this.invoke(p0.booleanValue());
       return l1.a;
    }
    public final void invoke(boolean p0){
       a q;
       if (PatchProxy.isSupport(IntensifyFollowElementView$onBindData$7.class) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, IntensifyFollowElementView$onBindData$7.class, "1")) {
          return;
       }
       CallableReference treceiver = this.receiver;
       Objects.requireNonNull(treceiver);
       a uoa = a.class;
       if (!PatchProxy.isSupport(uoa) || !PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), treceiver, uoa, "13")) {
          if (p0) {
             AnimatorSet uAnimatorSet = PatchProxy.apply(null, treceiver, uoa, "18");
             if (uAnimatorSet != PatchProxyResult.class) {
             }else {
                uAnimatorSet = new AnimatorSet();
                Animator uAnimator = treceiver.H();
                uAnimator.setDuration(400);
                uAnimator.setInterpolator(new DecelerateInterpolator(0x3fc00000));
                Animator[] uAnimatorArr = new Animator[]{uAnimator,treceiver.E()};
                uAnimatorSet.playTogether(uAnimatorArr);
                uAnimatorSet.addListener(new g(treceiver));
             }
             treceiver.s = uAnimatorSet;
             if (uAnimatorSet != null) {
                uAnimatorSet.addListener(new c0());
             }
             q = treceiver.q;
             if (q == null) {
                a.S("mIntensifyFollowBtn");
             }
             q.setText(a1.p(R.string.arg_RES_7f101024));
             q = treceiver.s;
             if (q != null) {
                q.start();
             }
          }else {
             q = treceiver.m;
             if (q == null) {
                a.S("mIntensifyFollowContainer");
             }
             q.setVisibility(0);
          }
       }
       return;
    }
}
