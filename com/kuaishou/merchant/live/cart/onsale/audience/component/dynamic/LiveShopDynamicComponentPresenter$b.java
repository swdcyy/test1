package com.kuaishou.merchant.live.cart.onsale.audience.component.dynamic.LiveShopDynamicComponentPresenter$b;
import hu4.f;
import com.kuaishou.merchant.live.cart.onsale.audience.component.dynamic.LiveShopDynamicComponentPresenter;
import java.lang.Object;
import java.lang.Throwable;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kuaishou.merchant.live.cart.MerchantCartLogBiz;
import java.lang.StringBuilder;
import com.kuaishou.merchant.live.cart.onsale.audience.model.ComponentInfo;
import p74.a;
import o74.a;
import kotlin.jvm.internal.a;
import o34.i;
import o34.f$a;
import o34.f;
import android.view.ViewGroup;
import java.lang.Runnable;
import hu4.e;

public final class LiveShopDynamicComponentPresenter$b implements f	// class@001935
{
    public final LiveShopDynamicComponentPresenter a;

    public void LiveShopDynamicComponentPresenter$b(LiveShopDynamicComponentPresenter p0){
       this.a = p0;
       super();
    }
    public void a(Throwable p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveShopDynamicComponentPresenter$b.class, "2")) {
          return;
       }
       MerchantCartLogBiz lIVE_AUDIENC = MerchantCartLogBiz.LIVE_AUDIENCE_ON_SALE;
       StringBuilder str = "render onFailed, component=";
       LiveShopDynamicComponentPresenter u = this.a.u;
       String name = (u != null)? u.getName(): null;
       a.m(lIVE_AUDIENC, "LiveShopDynamicComponentPresenter", str+name, p0, "component", this.a.u);
       LiveShopDynamicComponentPresenter$b ta = this.a;
       LiveShopDynamicComponentPresenter u1 = ta.u;
       if (u1 != null) {
          LiveShopDynamicComponentPresenter s = ta.s;
          if (s == null) {
             a.S("commandService");
          }
          s.a(i.b(u1));
       }
       return;
    }
    public void b(ViewGroup p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveShopDynamicComponentPresenter$b.class, "1")) {
          return;
       }
       LiveShopDynamicComponentPresenter$b ta = this.a;
       ta.x = true;
       a.t(MerchantCartLogBiz.LIVE_AUDIENCE_ON_SALE, "LiveShopDynamicComponentPresenter", "onSuccess", "component", ta.u);
       LiveShopDynamicComponentPresenter y = this.a.y;
       if (y != null) {
          y.run();
       }
       y.y = null;
       return;
    }
    public void c(){
       e.a(this);
    }
}
