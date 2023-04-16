package com.yxcorp.gifshow.ad.dislike.thanosdetail.presenter.ThanosDislikeVisiblePresenter$onBind$2;
import msd.l;
import kotlin.jvm.internal.Lambda;
import com.yxcorp.gifshow.ad.dislike.thanosdetail.presenter.ThanosDislikeVisiblePresenter;
import java.lang.Object;
import fy8.b;
import qrd.l1;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import java.util.Objects;
import n29.k;
import j19.a;
import android.view.View;
import android.animation.AnimatorSet;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.animation.TimeInterpolator;
import android.util.Property;
import android.animation.ObjectAnimator;
import lnc.a1;
import android.animation.Animator$AnimatorListener;
import android.animation.Animator;
import android.animation.AnimatorSet$Builder;
import com.kwai.robust.PatchProxyResult;
import com.yxcorp.gifshow.entity.QPhoto;
import com.kuaishou.android.model.ads.PhotoAdvertisement$NegativeMenuInfo;
import mxb.c;
import java.lang.Integer;
import android.app.Activity;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import com.kwai.component.photo.detail.slide.negative.operation.NewPlayerFeedbackPanel;
import mf5.s0;
import m29.c;
import java.util.List;
import com.yxcorp.gifshow.ad.dislike.thanosdetail.DislikeViewModel;
import trd.t;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;
import com.kwai.component.photo.detail.slide.negative.operation.NewPlayerFeedbackPanel$a;
import n29.n;
import android.content.DialogInterface$OnDismissListener;
import android.app.Dialog;
import n29.o;
import android.content.DialogInterface$OnCancelListener;
import kf5.l;
import kf5.x;
import mf5.v0;
import m29.a;
import n29.l;
import n29.m;
import com.yxcorp.gifshow.share.widget.d;

public final class ThanosDislikeVisiblePresenter$onBind$2 extends Lambda implements l	// class@001753
{
    public final ThanosDislikeVisiblePresenter this$0;

    public void ThanosDislikeVisiblePresenter$onBind$2(ThanosDislikeVisiblePresenter p0){
       this.this$0 = p0;
       super(1);
    }
    public Object invoke(Object p0){
       this.invoke(p0);
       return l1.a;
    }
    public final void invoke(b p0){
       b a;
       ThanosDislikeVisiblePresenter$onBind$2 tthis$0;
       float[] uofloatArray;
       ObjectAnimator objectAnimat1;
       Activity activity;
       ThanosDislikeVisiblePresenter s;
       ThanosDislikeVisiblePresenter r;
       ThanosDislikeVisiblePresenter p;
       ThanosDislikeVisiblePresenter p1;
       ThanosDislikeVisiblePresenter thanosDislik = ThanosDislikeVisiblePresenter.class;
       if (PatchProxy.applyVoidOneRefs(p0, this, ThanosDislikeVisiblePresenter$onBind$2.class, "1")) {
          return;
       }
       String str = "it";
       a.p(p0, str);
       a = p0.a;
       if (a != null) {
          int i = 1;
          if (a != i) {
             AccelerateDecelerateInterpolator uAccelerateD = 3;
             int i1 = 2;
             Object[] objArray = null;
             if (a != i1) {
                if (a == uAccelerateD) {
                   tthis$0 = this.this$0;
                   Objects.requireNonNull(tthis$0);
                   if (!PatchProxy.applyVoid(objArray, tthis$0, thanosDislik, "16")) {
                      thanosDislik = tthis$0.y;
                      if (thanosDislik != null) {
                         k ok = new k(tthis$0);
                         if (!PatchProxy.applyVoidOneRefs(ok, thanosDislik, a.class, "2")) {
                            float translationY = thanosDislik.b.getTranslationY();
                            AnimatorSet uAnimatorSet = new AnimatorSet();
                            uAnimatorSet.setDuration(150);
                            uAnimatorSet.setInterpolator(new AccelerateDecelerateInterpolator());
                            ObjectAnimator objectAnimat = ObjectAnimator.ofFloat(thanosDislik.a, View.ALPHA, new float[i1]{0x3f800000,0});
                            int i2 = 0x7f07030d;
                            if (thanosDislik.c != null) {
                               uofloatArray = new float[i1];
                               uofloatArray[0] = translationY;
                               uofloatArray[i] = translationY - (float)a1.d(i2);
                               objectAnimat1 = ObjectAnimator.ofFloat(thanosDislik.b, View.TRANSLATION_Y, uofloatArray);
                            }else {
                               uofloatArray = new float[i1];
                               uofloatArray[0] = translationY;
                               uofloatArray[i] = translationY + (float)a1.d(i2);
                               objectAnimat1 = ObjectAnimator.ofFloat(thanosDislik.b, View.TRANSLATION_Y, uofloatArray);
                            }
                            uAnimatorSet.addListener(ok);
                            uAnimatorSet.play(objectAnimat1).with(objectAnimat);
                            uAnimatorSet.start();
                         }
                      }
                   }
                }
             }else {
                ThanosDislikeVisiblePresenter$onBind$2 tthis$01 = this.this$0;
                Objects.requireNonNull(tthis$01);
                ThanosDislikeVisiblePresenter thanosDislik1 = PatchProxy.apply(objArray, tthis$01, thanosDislik, "6");
                String str1 = "mPhoto";
                if (thanosDislik1 != PatchProxyResult.class) {
                }else {
                   thanosDislik1 = tthis$01.r;
                   if (thanosDislik1 == null) {
                      a.S(str1);
                   }
                }
                PhotoAdvertisement$NegativeMenuInfo negativeMenu = c.v(thanosDislik1);
                Integer integer = (negativeMenu != null)? Integer.valueOf(negativeMenu.negativeStyle): objArray;
                thanosDislik1 = 4;
                String str2 = "mDislikeViewModel";
                String str3 = "mFragment";
                if (integer != null && integer.intValue() == thanosDislik1) {
                   tthis$0 = this.this$0;
                   Objects.requireNonNull(tthis$0);
                   if (!PatchProxy.applyVoid(objArray, tthis$0, thanosDislik, "12") && !tthis$0.R8()) {
                      activity = tthis$0.getActivity();
                      if (activity != null) {
                         NewPlayerFeedbackPanel$a e1 = NewPlayerFeedbackPanel.e1;
                         a.o(activity, str);
                         s = tthis$0.s;
                         if (s == null) {
                            a.S(str3);
                         }
                         thanosDislik1 = tthis$0.r;
                         if (thanosDislik1 == null) {
                            a.S(str1);
                         }
                         r = tthis$0.r;
                         if (r == null) {
                            a.S(str1);
                         }
                         p = tthis$0.p;
                         if (p == null) {
                            a.S(str2);
                         }
                         p1 = tthis$0.p;
                         if (p1 == null) {
                            a.S(str2);
                         }
                         NewPlayerFeedbackPanel newPlayerFee = e1.a(activity, s, thanosDislik1, new s0(t.k(new c(r, activity, p, p1.e()))));
                         newPlayerFee.setOnDismissListener(new n(tthis$0));
                         newPlayerFee.setOnCancelListener(new o(tthis$0));
                         newPlayerFee.show();
                      }
                   }
                }else if(integer != null && integer.intValue() == uAccelerateD){
                   tthis$0 = this.this$0;
                   Objects.requireNonNull(tthis$0);
                   if (!PatchProxy.applyVoid(objArray, tthis$0, thanosDislik, "13") && !tthis$0.R8()) {
                      activity = tthis$0.getActivity();
                      if (activity != null) {
                         a.o(activity, str);
                         s = tthis$0.s;
                         if (s == null) {
                            a.S(str3);
                         }
                         thanosDislik1 = tthis$0.r;
                         if (thanosDislik1 == null) {
                            a.S(str1);
                         }
                         r = tthis$0.r;
                         if (r == null) {
                            a.S(str1);
                         }
                         p = tthis$0.p;
                         if (p == null) {
                            a.S(str2);
                         }
                         p1 = tthis$0.p;
                         if (p1 == null) {
                            a.S(str2);
                         }
                         x ox = new x(activity, s, thanosDislik1, new v0(t.k(new a(r, activity, p, p1.e()))));
                         ox.setOnDismissListener(new l(tthis$0));
                         ox.setOnCancelListener(new m(tthis$0));
                         ox.show();
                      }
                   }
                }else {
                   this.this$0.S8(p0.a);
                }
             }
          }else {
             this.this$0.S8(a);
          }
       }else {
          this.this$0.S8(a);
       }
    label_01dd :
       return;
    }
}
