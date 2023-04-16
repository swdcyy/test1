package com.yxcorp.gifshow.detail.slidev2.presenter.feature.guide.n;
import w4.j;
import com.yxcorp.gifshow.detail.slidev2.presenter.feature.guide.o;
import java.lang.String;
import java.lang.Object;
import w4.e;
import android.view.View$OnTouchListener;
import android.view.View;
import java.lang.CharSequence;
import android.widget.TextView;
import fv5.a;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.library.groot.api.viewmodel.SlidePlayViewModel;
import android.graphics.PointF;
import android.content.Context;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import com.yxcorp.utility.n;
import j8a.f1;
import android.animation.ValueAnimator$AnimatorUpdateListener;
import android.animation.ValueAnimator;
import ekd.f;
import j8a.g1;
import android.animation.AnimatorSet;
import android.animation.Animator;
import com.yxcorp.gifshow.detail.slidev2.presenter.feature.guide.p;
import android.animation.Animator$AnimatorListener;
import com.airbnb.lottie.LottieAnimationView;
import j8a.o1;
import android.widget.ImageView;
import j8a.h1;
import com.kwai.feature.api.feed.home.common.SlideGuideManager;
import com.yxcorp.gifshow.log.model.ShowMetaData;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ElementPackage;
import k2b.u1;

public final class n implements j	// class@00199e
{
    public final o a;
    public final String b;

    public void n(o p0,String p1){
       super();
       this.a = p0;
       this.b = p1;
    }
    public final void onResult(Object p0){
       o r;
       n on = this;
       n a = on.a;
       n b = on.b;
       Object obj = p0;
       if (a.F == null) {
          o c = a.C;
          if (c != null && (a.q != null && a.r != null)) {
             c.setOnTouchListener(null);
             a.C.setVisibility(8);
             a.q.setText(b);
             a.O.f(1);
             if (!PatchProxy.applyVoid(null, a, o.class, "13") && a.r != null) {
                r = a.N;
                int i = (r != null)? r.Z0(): 0;
                a.D = i;
                r = a.N;
                i = (r != null)? r.a1(): 0;
                a.E = i;
                PointF pointF = new PointF(0, 0);
                PointF pointF1 = new PointF(0, (float)n.c(a.getContext(), 150.00f));
                PointF pointF2 = a.S8(pointF, pointF1, 0x3ea8f5c3, 0);
                PointF pointF3 = a.S8(pointF, pointF1, 0x3f28f5c3, 0x3f800000);
                ValueAnimator valueAnimato = f.c(pointF1, pointF3, pointF2, pointF, 400, new g1(a));
                valueAnimato.setStartDelay(400);
                AnimatorSet uAnimatorSet = new AnimatorSet();
                a.K = uAnimatorSet;
                uAnimatorSet.setStartDelay(200);
                Animator[] uAnimatorArr = new Animator[]{f.c(pointF, pointF2, pointF3, pointF1, 520, new f1(a)),valueAnimato};
                a.K.playSequentially(uAnimatorArr);
                a.K.addListener(new p(a));
             }
             if (!PatchProxy.applyVoidOneRefs(obj, a, o.class, "16")) {
                r = a.r;
                if (r != null) {
                   r.q(0);
                   a.r.setComposition(obj);
                   a.r.a(new o1(a));
                   a.r.s();
                }
             }
             a.p.setVisibility(0);
             a.r.setVisibility(0);
             a.q.setVisibility(0);
             a.p.setOnTouchListener(new h1(a));
             SlideGuideManager.a().f(1);
             if (!PatchProxy.applyVoid(null, a, o.class, "22")) {
                ShowMetaData showMetaData = new ShowMetaData();
                ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
                uElementPack.action2 = "GUIDE_BUBBLE";
                showMetaData.setElementPackage(uElementPack);
                u1.B0(showMetaData);
             }
          }
       }
    label_012a :
       return;
    }
}
