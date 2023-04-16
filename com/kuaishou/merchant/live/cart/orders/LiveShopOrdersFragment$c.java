package com.kuaishou.merchant.live.cart.orders.LiveShopOrdersFragment$c;
import y8c.g;
import com.kuaishou.merchant.live.cart.orders.LiveShopOrdersFragment;
import android.view.ViewGroup;
import y8c.f;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.Object;
import java.lang.String;
import com.kwai.robust.PatchProxyResult;
import android.view.View;
import xm4.a;
import com.kuaishou.merchant.live.cart.orders.LiveShopOrdersFragment$b;
import ml8.c;

public class LiveShopOrdersFragment$c extends g	// class@0019ca
{
    public final LiveShopOrdersFragment w;

    public void LiveShopOrdersFragment$c(LiveShopOrdersFragment p0){
       this.w = p0;
       super();
    }
    public f h1(ViewGroup p0,int p1){
       LiveShopOrdersFragment$c uoc = LiveShopOrdersFragment$c.class;
       if (PatchProxy.isSupport(uoc)) {
          Object obj = PatchProxy.applyTwoRefs(p0, Integer.valueOf(p1), this, uoc, "1");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       return new f(a.e(p0, 0x7f0d0dc3), new LiveShopOrdersFragment$b(this.w));
    }
}
