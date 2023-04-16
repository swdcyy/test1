package com.yxcorp.gifshow.detail.slidev2.presenter.feature.guide.a;
import w4.n;
import com.yxcorp.gifshow.detail.slidev2.presenter.feature.guide.b;
import java.lang.Object;
import w4.e;
import android.view.View;
import android.view.View$OnTouchListener;
import com.yxcorp.gifshow.detail.slidev2.presenter.feature.guide.NasaFeatureGuideManager;
import com.airbnb.lottie.LottieAnimationView;
import android.widget.TextView;
import android.widget.ImageView;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.content.Context;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import android.graphics.PointF;
import com.yxcorp.utility.n;
import j8a.b;
import android.animation.ValueAnimator$AnimatorUpdateListener;
import android.animation.ValueAnimator;
import ekd.f;
import android.animation.AnimatorSet;
import android.animation.Animator;
import com.yxcorp.gifshow.detail.slidev2.presenter.feature.guide.c;
import android.animation.Animator$AnimatorListener;
import j8a.m;
import android.graphics.drawable.Drawable;
import lnc.a1;
import j8a.e;
import com.kwai.feature.api.feed.home.common.SlideGuideManager;

public final class a implements n	// class@001981
{
    public final b a;

    public void a(b p0){
       this.a = p0;
    }
    public final void a(e p0){
       Object obj = p0;
       a a = this.a;
       b uob = b.class;
       if (a.B == null && (a.s != null && a.r != null)) {
          b q = a.q;
          View$OnTouchListener onTouchListe = null;
          if (q != null) {
             q.setVisibility(8);
             a.q.setOnTouchListener(onTouchListe);
          }
          NasaFeatureGuideManager.f().q(false);
          a.s.q(false);
          a.r.setText(R.string.arg_RES_7f104871);
          float f = 0;
          a.r.setTranslationY(f);
          a.s.setTranslationY(f);
          if (!PatchProxy.applyVoid(onTouchListe, a, uob, "14") && (a.s != null && a.getContext() != null)) {
             PointF pointF = new PointF(f, f);
             PointF pointF1 = new PointF((float)n.c(a.getContext(), 46.00f), f);
             PointF pointF2 = a.V8(pointF, pointF1, 0x3ea8f5c3, f);
             PointF pointF3 = a.V8(pointF, pointF1, 0x3f28f5c3, 0x3f800000);
             ValueAnimator valueAnimato = f.c(pointF1, pointF3, pointF2, pointF, 600, new b(a));
             valueAnimato.setStartDelay(400);
             AnimatorSet uAnimatorSet = new AnimatorSet();
             a.A = uAnimatorSet;
             uAnimatorSet.setStartDelay(240);
             Animator[] uAnimatorArr = new Animator[]{f.c(pointF, pointF2, pointF3, pointF1, 520, new b(a)),valueAnimato};
             a.A.playSequentially(uAnimatorArr);
             a.A.addListener(new c(a));
          }
       label_00c5 :
          if (!PatchProxy.applyVoidOneRefs(obj, a, uob, "13")) {
             uob = a.s;
             if (uob != null) {
                uob.setComposition(obj);
                a.s.a(new m(a));
                a.F = 0;
                a.s.s();
             }
          }
          a.p.setBackground(a1.f(R.color.arg_RES_7f0619a3));
          a.p.setVisibility(false);
          a.p.setOnTouchListener(new e(a));
          SlideGuideManager.a().f(true);
       }
    label_0109 :
       return;
    }
}
