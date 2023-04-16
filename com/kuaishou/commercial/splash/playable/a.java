package com.kuaishou.commercial.splash.playable.a;
import android.view.View$OnClickListener;
import com.kuaishou.commercial.splash.playable.c;
import java.lang.Object;
import android.view.View;
import java.util.Objects;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.photoad.model.PhotoAdDataWrapper;
import com.kwai.framework.model.feed.BaseFeed;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import com.kuaishou.android.model.ads.SplashInfo$PlayablePopupInfo;
import com.kuaishou.android.model.ads.SplashInfo$SplashButtonClickUrls;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import android.app.Activity;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import com.yxcorp.gifshow.photoad.model.AdDataWrapper;
import com.yxcorp.gifshow.ad.AdProcessUtils;
import k59.b2;
import android.content.Context;
import mxb.c;
import java.io.Serializable;
import com.yxcorp.gifshow.webview.KwaiYodaWebViewActivity$c;
import android.content.Intent;
import com.yxcorp.gifshow.webview.c;
import bz.c;
import io.reactivex.subjects.PublishSubject;
import android.view.animation.ScaleAnimation;
import android.view.animation.Animation;
import android.widget.FrameLayout;
import android.view.animation.AlphaAnimation;
import ez.t;
import android.view.animation.Animation$AnimationListener;
import ez.r;
import java.lang.Runnable;
import ekd.k1;
import im8.f;
import ez.m;

public final class a implements View$OnClickListener	// class@0015b9
{
    public final c b;

    public void a(c p0){
       this.b = p0;
    }
    public final void onClick(View p0){
       boolean b1;
       a tb = this.b;
       Objects.requireNonNull(tb);
       c uoc = c.class;
       if (PatchProxy.applyVoidOneRefs(p0, tb, uoc, "8")) {
       }else if(tb.w != null){
          boolean b = true;
          tb.w = b;
          if (!PatchProxy.applyVoid(null, tb, uoc, "9")) {
             PhotoAdDataWrapper photoAdDataW = new PhotoAdDataWrapper(tb.p);
             b2 obj = PatchProxy.applyOneRefs(photoAdDataW, tb, uoc, "11");
             if (obj != PatchProxyResult.class) {
                b1 = obj.booleanValue();
             }else {
                SplashInfo$PlayablePopupInfo mSplashButto1 = tb.x.mSplashButtonClickUrls;
                b1 = (mSplashButto1 != null && (!TextUtils.x(mSplashButto1.mAppLink) && tb.getActivity() != null))? AdProcessUtils.o(tb.getActivity(), photoAdDataW, tb.x.mSplashButtonClickUrls.mAppLink): false;
             }
             if (!b1 && !PatchProxy.applyVoidOneRefs(photoAdDataW, tb, uoc, "12")) {
                SplashInfo$PlayablePopupInfo mSplashButto = tb.x.mSplashButtonClickUrls;
                if (mSplashButto != null && (!TextUtils.x(mSplashButto.mH5Url) && tb.getActivity() != null)) {
                   obj = new b2(tb.getActivity(), tb.x.mSplashButtonClickUrls.mH5Url).m(photoAdDataW);
                   obj.l(photoAdDataW.getAdPosition());
                   obj.n(c.X(photoAdDataW));
                   obj.g(photoAdDataW.getPhoto());
                   c.i(tb.getActivity(), obj.a());
                }
             }
          }
       label_00b4 :
          tb.u.onNext(new c(2, 4));
          ScaleAnimation scaleAnimati = new ScaleAnimation(0x3f800000, 0x3fe66666, 0x3f800000, 0x3fe66666, 1, 0x3f000000, 1, 0x3f000000);
          uoc.setDuration(1000);
          uoc.setFillAfter(b);
          tb.r.startAnimation(uoc);
          AlphaAnimation uAlphaAnimat = new AlphaAnimation(0x3f800000, 0);
          uAlphaAnimat.setDuration(800);
          uAlphaAnimat.setAnimationListener(new t(tb));
          tb.r.startAnimation(uoc);
          k1.r(new r(tb, uAlphaAnimat), 400);
          c v = tb.v;
          if (v != null && v.get() != null) {
             tb.v.get().e();
          }
       }
       return;
    }
}
