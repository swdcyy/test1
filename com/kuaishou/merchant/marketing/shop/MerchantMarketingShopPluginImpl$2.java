package com.kuaishou.merchant.marketing.shop.MerchantMarketingShopPluginImpl$2;
import java.util.ArrayList;
import com.kuaishou.merchant.marketing.shop.MerchantMarketingShopPluginImpl;
import ga4.a;
import java.lang.Object;
import com.kuaishou.merchant.marketing.shop.timediscount.anchor.LiveDynamicTimeDiscountAnchorPresenter;
import com.kwai.robust.PatchProxyResult;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import java.util.Objects;
import com.kuaishou.merchant.marketing.shop.timediscount.anchor.LiveDynamicTimeDiscountAnchorPresenter$a;
import tkd.b;
import tkd.d;
import fs3.a;
import h94.g;
import b94.m;
import a94.a;
import y84.n;

public class MerchantMarketingShopPluginImpl$2 extends ArrayList	// class@001b7a
{
    public final MerchantMarketingShopPluginImpl this$0;

    public void MerchantMarketingShopPluginImpl$2(MerchantMarketingShopPluginImpl p0){
       LiveDynamicTimeDiscountAnchorPresenter liveDynamicT;
       this.this$0 = p0;
       super();
       this.add(new a());
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       Object[] objArray = null;
       LiveDynamicTimeDiscountAnchorPresenter$a obj = PatchProxy.applyWithListener(objArray, objArray, LiveDynamicTimeDiscountAnchorPresenter.class, "6");
       if (obj != patchProxyRe) {
       }else {
          obj = LiveDynamicTimeDiscountAnchorPresenter.t;
          Objects.requireNonNull(obj);
          Object obj1 = PatchProxy.applyWithListener(objArray, obj, LiveDynamicTimeDiscountAnchorPresenter$a.class, "1");
          if (obj1 != patchProxyRe) {
             obj = obj1;
          }else if(d.a(-1432266865).Gd(2, "TimeDiscountAnchorPendant")){
             liveDynamicT = new LiveDynamicTimeDiscountAnchorPresenter();
          }else {
             liveDynamicT = new PresenterV2();
          }
          PatchProxy.onMethodExit(LiveDynamicTimeDiscountAnchorPresenter$a.class, "1");
          obj = liveDynamicT;
          PatchProxy.onMethodExit(LiveDynamicTimeDiscountAnchorPresenter.class, "6");
       }
       this.add(obj);
       this.add(new g());
       this.add(new m());
       this.add(new a());
       this.add(new n());
       return;
    }
}
