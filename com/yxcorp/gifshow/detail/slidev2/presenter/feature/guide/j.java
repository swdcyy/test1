package com.yxcorp.gifshow.detail.slidev2.presenter.feature.guide.j;
import w4.j;
import com.yxcorp.gifshow.detail.slidev2.presenter.feature.guide.k;
import java.lang.Object;
import w4.e;
import android.view.View$OnTouchListener;
import android.view.View;
import java.lang.String;
import lnc.a1;
import java.lang.CharSequence;
import android.widget.TextView;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.library.groot.api.viewmodel.SlidePlayViewModel;
import android.graphics.PointF;
import android.content.Context;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import com.yxcorp.utility.n;
import j8a.h0;
import android.animation.ValueAnimator$AnimatorUpdateListener;
import android.animation.ValueAnimator;
import ekd.f;
import j8a.l0;
import android.animation.AnimatorSet;
import android.animation.Animator;
import com.yxcorp.gifshow.detail.slidev2.presenter.feature.guide.l;
import android.animation.Animator$AnimatorListener;
import com.airbnb.lottie.LottieAnimationView;
import j8a.v0;
import android.widget.ImageView;
import j8a.m0;
import com.kwai.feature.api.feed.home.common.SlideGuideManager;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ElementPackage;
import lnc.i3;
import y85.a;
import w85.a;
import java.util.Objects;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import com.yxcorp.gifshow.nasa.NasaSlideParam;
import com.kwai.feature.api.feed.detail.router.biz.nasa.NasaBizParam;
import kotlin.jvm.internal.a;
import com.kuaishou.client.log.content.packages.nano.ClientContent$ContentPackage;
import com.yxcorp.gifshow.entity.QPhoto;
import com.kwai.framework.model.feed.BaseFeed;
import com.kuaishou.client.log.content.packages.nano.ClientContent$PhotoPackage;
import kp.w1;
import k2b.u1;
import com.yxcorp.gifshow.detail.slidev2.presenter.feature.guide.NasaFeatureGuideManager;

public final class j implements j	// class@001994
{
    public final k a;
    public final int b;

    public void j(k p0,int p1){
       super();
       this.a = p0;
       this.b = p1;
    }
    public final void onResult(Object p0){
       k k;
       String obj1;
       boolean b2;
       j oj = this;
       j a = oj.a;
       j b = oj.b;
       i3 obj = p0;
       k ok = k.class;
       if (a.N == null) {
          k = a.K;
          if (k != null && (a.q != null && a.r != null)) {
             View$OnTouchListener onTouchListe = null;
             k.setOnTouchListener(onTouchListe);
             a.K.setVisibility(8);
             a.j9();
             k = a.q;
             k g = a.G;
             if (g == null) {
                obj1 = a1.p(R.string.arg_RES_7f104868);
             }
             k.setText(g);
             boolean b1 = true;
             if (!PatchProxy.applyVoid(onTouchListe, a, ok, "20") && a.r != null) {
                k = a.Y;
                int i = (k != null)? k.Z0(): 0;
                a.L = i;
                k = a.Y;
                i = (k != null)? k.a1(): 0;
                a.M = i;
                PointF pointF = new PointF(0, 0);
                PointF pointF1 = new PointF(0, (float)n.c(a.getContext(), 150.00f));
                PointF pointF2 = a.W8(pointF, pointF1, 0x3ea8f5c3, 0);
                PointF pointF3 = a.W8(pointF, pointF1, 0x3f28f5c3, 0x3f800000);
                ValueAnimator valueAnimato = f.c(pointF1, pointF3, pointF2, pointF, 400, new l0(a));
                valueAnimato.setStartDelay(400);
                AnimatorSet uAnimatorSet = new AnimatorSet();
                a.S = uAnimatorSet;
                uAnimatorSet.setStartDelay(200);
                Animator[] uAnimatorArr = new Animator[]{f.c(pointF, pointF2, pointF3, pointF1, 520, new h0(a)),valueAnimato};
                a.S.playSequentially(uAnimatorArr);
                a.S.addListener(new l(a));
             }
             if (!PatchProxy.applyVoidOneRefs(obj, a, ok, "23")) {
                k = a.r;
                if (k != null) {
                   k.q(0);
                   a.r.setComposition(obj);
                   a.r.a(new v0(a));
                   a.r.s();
                }
             }
             a.p.setVisibility(0);
             a.r.setVisibility(0);
             a.q.setVisibility(0);
             a.p.setOnTouchListener(new m0(a));
             SlideGuideManager.a().f(b1);
             if (b == b1) {
                a.h9("t");
             }
             if (!PatchProxy.applyVoid(onTouchListe, a, ok, "28")) {
                ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
                uElementPack.action2 = "GESTURE_GUIDANCE_CARD";
                obj = i3.f();
                String str = "gesture_type";
                obj.d(str, "SLIDE_UP_TO_PHOTO");
                uElementPack.params = obj.e();
                a uoa = a.B.h();
                Objects.requireNonNull(uoa);
                obj1 = PatchProxy.apply(onTouchListe, uoa, a.class, "6");
                if (obj1 != PatchProxyResult.class) {
                   b2 = obj1.booleanValue();
                }else if(uoa.j != null){
                   b2 = uoa.f;
                }else {
                   NasaSlideParam nasaSlidePar = uoa.m.getNasaSlideParam();
                   a.o(nasaSlidePar, "nasaBizParam.nasaSlideParam");
                   b2 = nasaSlidePar.isLocalForceShowGuide();
                }
                if (b2) {
                   onTouchListe = new ClientContent$ContentPackage();
                   onTouchListe.photoPackage = w1.f(a.A.mEntity);
                   obj = i3.f();
                   obj.d(str, "SLIDE_UP_TO_PHOTO");
                   k q = a.q;
                   String str1 = (q != null)? q.getText().toString(): "";
                   obj.d("tips_content", str1);
                   uElementPack.params = obj.e();
                }
                u1.u0(10, uElementPack, onTouchListe);
             }
          }
       }
    label_01ad :
       NasaFeatureGuideManager.f().s(0);
       return;
    }
}
