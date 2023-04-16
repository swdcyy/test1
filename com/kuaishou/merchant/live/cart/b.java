package com.kuaishou.merchant.live.cart.b;
import erd.g;
import java.lang.Object;
import java.lang.Throwable;
import com.kuaishou.merchant.live.cart.MerchantCartLogBiz;
import p74.a;
import java.lang.String;
import o74.a;

public final class b implements g	// class@0018fc
{
    public static final b b;

    static {
       b.b = new b();
    }
    public void b(){
       super();
    }
    public final void accept(Object p0){
       a.l(MerchantCartLogBiz.CART_WELFARE, "MerchantLiveCartPluginImpl", "welfare event upload failed", p0);
    }
}
