package com.yxcorp.gifshow.detail.slidev2.presenter.feature.guide.f;
import w4.n;
import com.yxcorp.gifshow.detail.slidev2.presenter.feature.guide.h;
import java.lang.Object;
import w4.e;
import android.view.View;
import android.view.View$OnTouchListener;
import oe6.a;
import android.widget.TextView;
import android.widget.ImageView;
import com.airbnb.lottie.LottieAnimationView;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.graphics.PointF;
import android.content.Context;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import com.yxcorp.utility.n;
import j8a.t;
import android.animation.ValueAnimator$AnimatorUpdateListener;
import android.animation.ValueAnimator;
import ekd.f;
import j8a.v;
import android.animation.AnimatorSet;
import android.animation.Animator;
import com.yxcorp.gifshow.detail.slidev2.presenter.feature.guide.i;
import android.animation.Animator$AnimatorListener;
import java.util.Objects;
import rf5.u;
import com.kwai.library.groot.framework.viewpager.GrootTouchViewPager;
import com.yxcorp.gifshow.widget.SwipeLayout;
import j8a.c0;
import j8a.w;
import com.kwai.feature.api.feed.home.common.SlideGuideManager;
import uw9.v3;

public final class f implements n	// class@00198d
{
    public final h a;

    public void f(h p0){
       this.a = p0;
    }
    public final void a(e p0){
       Object obj = p0;
       f a = this.a;
       h oh = h.class;
       if (a.E == null && (a.s != null && a.r != null)) {
          h q = a.q;
          View$OnTouchListener onTouchListe = null;
          if (q != null) {
             q.setVisibility(8);
             a.q.setOnTouchListener(onTouchListe);
          }
          a.e0(false);
          a.r.setVisibility(false);
          a.s.setVisibility(false);
          a.s.q(false);
          a.r.setText(R.string.arg_RES_7f104874);
          float f = 0;
          a.r.setTranslationY(f);
          a.s.setTranslationY(f);
          String str = "16";
          if (!PatchProxy.applyVoid(onTouchListe, a, oh, str) && a.s != null) {
             PointF pointF = new PointF(f, f);
             PointF pointF1 = new PointF((float)n.c(a.getContext(), 46.00f), f);
             PointF pointF2 = a.V8(pointF, pointF1, 0x3ea8f5c3, f);
             PointF pointF3 = a.V8(pointF, pointF1, 0x3f28f5c3, 0x3f800000);
             PointF pointF4 = pointF1;
             PointF pointF5 = pointF1;
             ValueAnimator valueAnimato = f.c(pointF, pointF2, pointF3, pointF4, 520, new t(a));
             ValueAnimator valueAnimato1 = f.c(pointF5, pointF3, pointF2, pointF, 600, new v(a));
             valueAnimato1.setStartDelay(400);
             AnimatorSet uAnimatorSet = new AnimatorSet();
             a.D = uAnimatorSet;
             uAnimatorSet.setStartDelay(240);
             Animator[] uAnimatorArr = new Animator[]{valueAnimato,valueAnimato1};
             a.D.playSequentially(uAnimatorArr);
             a.D.addListener(new i(a));
          }
          h z = a.z;
          Objects.requireNonNull(z);
          if (!PatchProxy.applyVoid(onTouchListe, z, u.class, str) && z.o()) {
             z.v = true;
             u q1 = z.q;
             if (q1 != null) {
                q1.c0(false, 6);
             }
             q1 = z.r;
             if (q1 != null) {
                q1.n(false, 3);
             }
          }
       label_00f3 :
          if (!PatchProxy.applyVoidOneRefs(obj, a, oh, "15")) {
             oh = a.s;
             if (oh != null) {
                oh.setComposition(obj);
                a.s.a(new c0(a));
                a.I = 0;
                a.s.s();
             }
          }
          a.p.setVisibility(false);
          w ow = new w(a);
          a.p.setOnTouchListener(ow);
          a.S8("t");
          SlideGuideManager.a().f(true);
          a.S.L = true;
       }
    label_0134 :
       return;
    }
}
