package com.kuaishou.merchant.live.cart.salemanager.f;
import erd.g;
import com.kuaishou.merchant.live.cart.salemanager.LiveAnchorShopFragment$a;
import java.lang.Object;
import java.lang.Throwable;
import o54.j;
import com.kuaishou.merchant.live.cart.salemanager.LiveAnchorShopFragment;
import java.lang.Runnable;
import ekd.k1;
import com.yxcorp.retrofit.model.KwaiException;
import java.lang.CharSequence;
import e17.i;
import com.kuaishou.merchant.live.cart.MerchantCartLogBiz;
import p74.a;
import java.lang.String;
import o74.a;

public final class f implements g	// class@0019db
{
    public final LiveAnchorShopFragment$a b;

    public void f(LiveAnchorShopFragment$a p0){
       this.b = p0;
    }
    public final void accept(Object p0){
       f tb = this.b;
       k1.p(new j(tb.r), tb);
       if (p0 instanceof KwaiException) {
          i.d(R.style.arg_RES_7f11066a, p0.mErrorMessage);
       }
       a.l(MerchantCartLogBiz.LIVE_SALE_MANAGER, "LiveAnchorShopFragment", "choose module error", p0);
       return;
    }
}
