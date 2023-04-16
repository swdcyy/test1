package com.kuaishou.merchant.live.cart.onsale.audience.preload.LiveAudienceShopPreloadPresenter;
import androidx.lifecycle.LifecycleObserver;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import com.kuaishou.merchant.live.cart.onsale.audience.preload.e;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.sdk.switchconfig.a;
import com.kuaishou.merchant.live.cart.onsale.audience.preload.LiveAudienceShopPreloadPresenter$b;
import com.kuaishou.merchant.live.cart.onsale.audience.preload.LiveAudienceShopPreloadPresenter$a;
import android.os.MessageQueue$IdleHandler;
import java.lang.Runnable;
import ekd.k1;
import android.os.Build$VERSION;
import android.os.Looper;
import android.os.MessageQueue;
import android.app.Activity;
import la4.b;
import crd.b;
import la4.l;

public class LiveAudienceShopPreloadPresenter extends PresenterV2 implements LifecycleObserver	// class@00196e
{
    public final Runnable p;
    public static boolean q;

    public void LiveAudienceShopPreloadPresenter(){
       super();
       this.p = e.b;
    }
    public void E8(){
       LiveAudienceShopPreloadPresenter liveAudience = LiveAudienceShopPreloadPresenter.class;
       if (PatchProxy.applyVoid(null, this, liveAudience, "3")) {
          return;
       }
       this.R8();
       if (!PatchProxy.applyVoid(null, this, liveAudience, "5") && a.t().d("isPreloadDetailv2ViewInCart", false)) {
          this.P8(new LiveAudienceShopPreloadPresenter$b(null));
       }
       return;
    }
    public void F8(){
       LiveAudienceShopPreloadPresenter liveAudience = LiveAudienceShopPreloadPresenter.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, liveAudience, "1")) {
          return;
       }
       if (!PatchProxy.applyVoid(objArray, this, liveAudience, "6") && a.t().d("paymentAlipayPromoControl", false)) {
          k1.r(this.p, 1000);
       }
       return;
    }
    public void H8(){
       if (PatchProxy.applyVoid(null, this, LiveAudienceShopPreloadPresenter.class, "2")) {
          return;
       }
       k1.m(this.p);
       return;
    }
    public final void P8(MessageQueue$IdleHandler p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveAudienceShopPreloadPresenter.class, "7")) {
          return;
       }
       if (Build$VERSION.SDK_INT >= 23) {
          Looper.getMainLooper().getQueue().addIdleHandler(p0);
       }
       return;
    }
    public final void R8(){
       if (PatchProxy.applyVoid(null, this, LiveAudienceShopPreloadPresenter.class, "4")) {
          return;
       }
       if (Build$VERSION.SDK_INT >= 23 && (a.t().d("MerchantPurchaseBundlePreload", false) && !LiveAudienceShopPreloadPresenter.q)) {
          LiveAudienceShopPreloadPresenter.q = true;
          l.e(this.getActivity(), new LiveAudienceShopPreloadPresenter$a(this), false);
       }
    label_0032 :
       return;
    }
}
