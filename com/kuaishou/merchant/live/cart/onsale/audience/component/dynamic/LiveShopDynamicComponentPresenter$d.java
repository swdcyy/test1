package com.kuaishou.merchant.live.cart.onsale.audience.component.dynamic.LiveShopDynamicComponentPresenter$d;
import erd.g;
import com.kuaishou.merchant.live.cart.onsale.audience.component.dynamic.LiveShopDynamicComponentPresenter;
import java.lang.Object;
import p14.c;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.util.Objects;
import com.kuaishou.merchant.live.cart.onsale.audience.model.ComponentInfo;
import zsd.u;
import android.view.View;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import fg6.a;
import a44.b;
import a44.c;
import com.google.gson.Gson;
import hu4.h;

public final class LiveShopDynamicComponentPresenter$d implements g	// class@001937
{
    public final LiveShopDynamicComponentPresenter b;

    public void LiveShopDynamicComponentPresenter$d(LiveShopDynamicComponentPresenter p0){
       this.b = p0;
       super();
    }
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveShopDynamicComponentPresenter$d.class, "1")) {
       }else {
          LiveShopDynamicComponentPresenter$d tb = this.b;
          Objects.requireNonNull(tb);
          if (!PatchProxy.applyVoidOneRefs(p0, tb, LiveShopDynamicComponentPresenter.class, "3")) {
             LiveShopDynamicComponentPresenter u = tb.u;
             if (u != null && u.q2(u.getId(), p0.b, false, 2, null)) {
                u = tb.w;
                if (u != null) {
                   u.h(tb.m8(), "receivePopCommodityEvent", a.a.q(c.a(p0)));
                }
             }
          }
       }
       return;
    }
}
