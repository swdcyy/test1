package com.kuaishou.merchant.transaction.live.orderconfirmpanel.discountpanel.g;
import mm8.b;
import java.lang.Object;
import com.smile.gifshow.annotation.provider.v2.a;
import com.kuaishou.merchant.transaction.live.orderconfirmpanel.discountpanel.LiveAudienceDiscountPanelFragment$a;
import java.util.List;
import com.kuaishou.merchant.transaction.live.orderconfirmpanel.discountpanel.a;
import java.lang.Class;
import com.smile.gifshow.annotation.provider.v2.Accessor;
import com.kuaishou.merchant.transaction.live.orderconfirmpanel.discountpanel.b;
import java.lang.String;
import com.kuaishou.merchant.transaction.live.orderconfirmpanel.discountpanel.c;
import com.kuaishou.merchant.transaction.live.orderconfirmpanel.discountpanel.d;
import com.kuaishou.merchant.transaction.live.orderconfirmpanel.discountpanel.e;
import com.kuaishou.merchant.transaction.live.orderconfirmpanel.discountpanel.f;
import mm8.a;

public final class g implements b	// class@0007f3
{

    public void g(){
       super();
    }
    public void a(a p0,Object p1){
       p0.h(List.class, new a(this, p1));
       p0.i("LIVE_BASE_CONTEXT", new b(this, p1));
       p0.i("LIVE_AUDIENCE_CONFIRM_PANEL_BOTTOM_BAR_SERVICE", new c(this, p1));
       p0.i("ORDER_CONFIRM_RESPONSE", new d(this, p1));
       e uoe = new e(this, p1);
       String str = "discount_item_showed_set";
       try{
          p0.i(str, uoe);
          p0.h(LiveAudienceDiscountPanelFragment$a.class, new f(this, p1));
          return;
       }catch(java.lang.IllegalArgumentException e0){
       }
    }
    public a b(Object p0){
       return a.a(this, p0);
    }
    public b init(){
       return a.b(this);
    }
}
