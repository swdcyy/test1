package com.kuaishou.merchant.live.cart.onsale.audience.component.dynamic.LiveShopDynamicComponentPresenter$c;
import hu4.d;
import com.kuaishou.merchant.live.cart.onsale.audience.component.dynamic.LiveShopDynamicComponentPresenter;
import java.lang.Object;
import java.util.Map;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kuaishou.merchant.live.cart.MerchantCartLogBiz;
import p74.a;
import o74.a;
import com.kuaishou.merchant.live.cart.onsale.audience.model.ComponentData;

public final class LiveShopDynamicComponentPresenter$c implements d	// class@001936
{
    public final LiveShopDynamicComponentPresenter a;

    public void LiveShopDynamicComponentPresenter$c(LiveShopDynamicComponentPresenter p0){
       this.a = p0;
       super();
    }
    public final void a(Map p0){
       ComponentData data;
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveShopDynamicComponentPresenter$c.class, "1")) {
          return;
       }
       a.t(MerchantCartLogBiz.LIVE_AUDIENCE_ON_SALE, "LiveShopDynamicComponentPresenter", "onBind: addDataCallback", "data", p0);
       if (p0 != null) {
          LiveShopDynamicComponentPresenter v = this.a.v;
          if (v != null) {
             data = v.data;
             if (data != null) {
                data.putAll(p0);
             }
          }
       }
       return;
    }
}
