package com.kuaishou.merchant.live.cart.salemanager.b;
import android.view.View$OnClickListener;
import java.lang.Object;
import android.view.View;
import com.kuaishou.merchant.live.cart.salemanager.LiveAnchorShopFragment;
import com.kuaishou.merchant.live.cart.MerchantCartLogBiz;
import p74.a;
import java.lang.String;
import o74.a;

public final class b implements View$OnClickListener	// class@0019d4
{
    public static final b b;

    static {
       b.b = new b();
    }
    public void b(){
       super();
    }
    public final void onClick(View p0){
       a.s(MerchantCartLogBiz.LIVE_SALE_MANAGER, "LiveAnchorShopFragment", "ignore root clicked");
    }
}
