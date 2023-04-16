package com.kuaishou.merchant.live.cart.onsale.audience.component.dynamic.LiveShopDynamicComponentPresenter$e;
import java.lang.Runnable;
import com.kuaishou.merchant.live.cart.onsale.audience.component.dynamic.LiveShopDynamicComponentPresenter;
import java.util.HashMap;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.view.View;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import java.util.Map;
import hu4.h;

public final class LiveShopDynamicComponentPresenter$e implements Runnable	// class@001938
{
    public final LiveShopDynamicComponentPresenter b;
    public final HashMap c;

    public void LiveShopDynamicComponentPresenter$e(LiveShopDynamicComponentPresenter p0,HashMap p1){
       this.b = p0;
       this.c = p1;
       super();
    }
    public final void run(){
       if (PatchProxy.applyVoid(null, this, LiveShopDynamicComponentPresenter$e.class, "1")) {
          return;
       }
       LiveShopDynamicComponentPresenter$e tb = this.b;
       LiveShopDynamicComponentPresenter w = tb.w;
       if (w != null) {
          Map[] mapArray = new Map[]{this.c};
          w.n(tb.m8(), mapArray);
       }
       return;
    }
}
