package com.yxcorp.gifshow.ad.award.presenter.webView.AwardVideoH5CountDownPresenter;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import com.yxcorp.gifshow.ad.award.presenter.webView.AwardVideoH5CountDownPresenter$mLifecycleObserver$1;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import mxb.c;
import java.util.Objects;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import com.kwai.framework.model.feed.BaseFeed;
import tl8.d;
import com.kuaishou.android.model.ads.PhotoAdvertisement;
import com.kuaishou.android.model.ads.PhotoAdvertisement$AdData;
import com.kuaishou.android.model.ads.PhotoAdvertisement$InspireAdInfo;
import com.kuaishou.android.model.ads.PhotoAdvertisement$InspireAction;
import kotlin.jvm.internal.a;
import android.widget.TextView;
import android.content.Context;
import android.widget.RelativeLayout$LayoutParams;
import lnc.a1;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.RelativeLayout;
import android.view.ViewGroup$LayoutParams;
import ekd.y0;
import android.os.Looper;
import iy8.a;
import java.lang.Runnable;
import android.app.Activity;
import com.yxcorp.gifshow.activity.GifshowActivity;
import androidx.lifecycle.Lifecycle;
import androidx.activity.ComponentActivity;
import androidx.lifecycle.LifecycleObserver;
import android.animation.AnimatorSet;
import g59.i0;
import mxb.j0;
import mxb.i0;
import com.yxcorp.gifshow.ad.award.presenter.webView.AwardVideoH5CountDownPresenter$a;
import erd.g;
import java.lang.CharSequence;
import android.animation.ValueAnimator;
import ky8.a;
import android.animation.TimeInterpolator;
import com.yxcorp.gifshow.ad.award.presenter.webView.AwardVideoH5CountDownPresenter$b;
import android.animation.ValueAnimator$AnimatorUpdateListener;
import android.animation.Animator;
import android.animation.AnimatorSet$Builder;

public final class AwardVideoH5CountDownPresenter extends PresenterV2	// class@001526
{
    public BaseFeed p;
    public TextView q;
    public int r;
    public int s;
    public y0 t;
    public boolean u;
    public AnimatorSet v;
    public boolean w;
    public final LifecycleObserver x;

    public void AwardVideoH5CountDownPresenter(){
       super();
       this.r = 15;
       this.s = 15;
       this.x = new AwardVideoH5CountDownPresenter$mLifecycleObserver$1(this);
    }
    public void E8(){
       int b;
       PhotoAdvertisement$InspireAction mAwardType;
       AwardVideoH5CountDownPresenter uAwardVideoH = AwardVideoH5CountDownPresenter.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, uAwardVideoH, "2")) {
          return;
       }
       c a = c.a;
       AwardVideoH5CountDownPresenter tp = this.p;
       Objects.requireNonNull(a);
       RelativeLayout$LayoutParams obj = PatchProxy.applyOneRefs(tp, a, c.class, "34");
       if (obj != PatchProxyResult.class) {
          b = obj.booleanValue();
       }else if(!c.R(tp)){
          PhotoAdvertisement photoAdverti = (tp != null)? tp.get("AD"): objArray;
          if (photoAdverti != null && photoAdverti.mConversionType == 2) {
             PhotoAdvertisement$AdData adData = photoAdverti.getAdData();
             if (adData != null) {
                adData = adData.mInspireAdInfo;
                if (adData != null) {
                   PhotoAdvertisement$InspireAdInfo mInspireActi = adData.mInspireAction;
                   if (mInspireActi != null) {
                      mAwardType = mInspireActi.mAwardType;
                   label_0055 :
                      b = a.g(mAwardType, "OPEN_H5");
                   }
                }
             }
             mAwardType = objArray;
             goto label_0055 ;
          }
       }
    label_002d :
       b = false;
       if (b) {
          b = c.u(this.p);
          this.r = b;
          this.s = b;
          if (!PatchProxy.applyVoid(objArray, this, uAwardVideoH, "4")) {
             this.q = new TextView(this.getContext());
             obj = new RelativeLayout$LayoutParams(a1.d(0x7f070273), -2);
             obj.topMargin = a1.d(0x7f07028d);
             obj.addRule(3, R.id.title_root);
             tp = this.q;
             if (tp != null) {
                tp.setGravity(0x800005);
             }
             tp = this.q;
             if (tp != null) {
                tp.setPaddingRelative(false, a1.d(R.dimen.arg_RES_7f07031b), a1.d(R.dimen.arg_RES_7f070271), a1.d(R.dimen.arg_RES_7f07031b));
             }
             tp = this.q;
             if (tp != null) {
                tp.setTextSize(false, (float)a1.e(14.00f));
             }
             tp = this.q;
             if (tp != null) {
                tp.setIncludeFontPadding(false);
             }
             tp = this.q;
             if (tp != null) {
                tp.setTextColor(a1.a(R.color.arg_RES_7f061be0));
             }
             tp = this.q;
             if (tp != null) {
                tp.setBackground(a1.f(R.drawable.arg_RES_7f080149));
             }
             if (this.m8() instanceof RelativeLayout) {
                View view = this.m8();
                Objects.requireNonNull(view, "null cannot be cast to non-null type android.widget.RelativeLayout");
                view.addView(this.q, obj);
             }
          }
          if (this.s <= null) {
             this.R8(false);
          }else if(PatchProxy.applyVoid(objArray, this, uAwardVideoH, "5")){
             uAwardVideoH = this.t;
             if (uAwardVideoH != null) {
                uAwardVideoH.e();
             }
             y0 oy0 = new y0(Looper.getMainLooper(), 1000, new a(this));
             this.t = oy0;
             oy0.d();
          }
          Activity activity = this.getActivity();
          Objects.requireNonNull(activity, "null cannot be cast to non-null type com.yxcorp.gifshow.activity.GifshowActivity");
          activity.getLifecycle().addObserver(this.x);
       }
       uAwardVideoH = this.v;
       if (uAwardVideoH != null) {
          uAwardVideoH.cancel();
       }
       return;
    }
    public void J8(){
       if (PatchProxy.applyVoid(null, this, AwardVideoH5CountDownPresenter.class, "3")) {
          return;
       }
       AwardVideoH5CountDownPresenter tt = this.t;
       if (tt != null) {
          tt.e();
       }
       Activity activity = this.getActivity();
       Objects.requireNonNull(activity, "null cannot be cast to non-null type com.yxcorp.gifshow.activity.GifshowActivity");
       activity.getLifecycle().removeObserver(this.x);
       i0.b(this.v);
       this.v = null;
       return;
    }
    public final void P8(){
       if (PatchProxy.applyVoid(null, this, AwardVideoH5CountDownPresenter.class, "7")) {
          return;
       }
       AwardVideoH5CountDownPresenter tp = this.p;
       if (tp != null && this.w == null) {
          this.w = true;
          i0.a().e(759, tp).d(new AwardVideoH5CountDownPresenter$a(this)).a();
       }
       return;
    }
    public final void R8(boolean p0){
       AwardVideoH5CountDownPresenter tq;
       AwardVideoH5CountDownPresenter uAwardVideoH = AwardVideoH5CountDownPresenter.class;
       if (PatchProxy.isSupport(uAwardVideoH) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, uAwardVideoH, "6")) {
          return;
       }
       uAwardVideoH = this.q;
       if (uAwardVideoH != null) {
          uAwardVideoH.setText(a1.p(R.string.arg_RES_7f10123b));
       }
       uAwardVideoH = this.q;
       ViewGroup$LayoutParams layoutParams = (uAwardVideoH != null)? uAwardVideoH.getLayoutParams(): null;
       int i = 0x7f070340;
       if (!p0) {
          if (layoutParams != null) {
             layoutParams.width = a1.d(i);
          }
          tq = this.q;
          if (tq != null) {
             tq.setLayoutParams(layoutParams);
          }
       }else {
          int[] ointArray = new int[]{a1.d(0x7f070273),a1.d(i)};
          ValueAnimator valueAnimato = ValueAnimator.ofInt(ointArray);
          a.o(valueAnimato, "widthAnimator");
          valueAnimato.setInterpolator(new a(0.25f, 0.10f, 0.25f, 0x3f800000));
          valueAnimato.addUpdateListener(new AwardVideoH5CountDownPresenter$b(this, layoutParams));
          valueAnimato.setDuration(200);
          AnimatorSet uAnimatorSet = new AnimatorSet();
          this.v = uAnimatorSet;
          uAnimatorSet.play(valueAnimato);
          tq = this.v;
          if (tq != null) {
             tq.start();
          }
       }
       return;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, AwardVideoH5CountDownPresenter.class, "1")) {
          return;
       }
       this.p = this.q8(BaseFeed.class);
       return;
    }
}
