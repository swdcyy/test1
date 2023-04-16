package com.kuaishou.merchant.transaction.live.orderconfirmpanel.a0;
import mm8.b;
import java.lang.Object;
import com.smile.gifshow.annotation.provider.v2.a;
import com.kuaishou.merchant.transaction.live.orderconfirmpanel.MerchantLivePurchasePanelFragment$b;
import com.kuaishou.merchant.transaction.live.orderconfirmpanel.o;
import java.lang.String;
import com.smile.gifshow.annotation.provider.v2.Accessor;
import com.kuaishou.merchant.transaction.live.orderconfirmpanel.s;
import com.kuaishou.merchant.transaction.live.orderconfirmpanel.t;
import com.kuaishou.merchant.transaction.live.orderconfirmpanel.u;
import com.kuaishou.merchant.transaction.live.orderconfirmpanel.v;
import com.kuaishou.merchant.transaction.live.orderconfirmpanel.w;
import com.kuaishou.merchant.transaction.base.purchasepanel.model.OrderConfirmCommodity;
import com.kuaishou.merchant.transaction.live.orderconfirmpanel.x;
import java.lang.Class;
import com.kuaishou.merchant.transaction.live.orderconfirmpanel.y;
import com.kuaishou.merchant.transaction.live.orderconfirmpanel.z;
import kk4.e;
import com.kuaishou.merchant.transaction.live.orderconfirmpanel.e;
import com.kuaishou.merchant.transaction.live.orderconfirmpanel.f;
import com.kuaishou.merchant.transaction.live.orderconfirmpanel.g;
import com.kuaishou.merchant.transaction.live.orderconfirmpanel.h;
import com.kuaishou.merchant.transaction.live.orderconfirmpanel.i;
import com.kuaishou.merchant.transaction.live.orderconfirmpanel.j;
import com.kuaishou.merchant.transaction.live.orderconfirmpanel.k;
import com.kuaishou.merchant.transaction.live.orderconfirmpanel.l;
import com.kuaishou.merchant.transaction.live.orderconfirmpanel.m;
import com.kuaishou.merchant.transaction.base.purchasepanel.model.MerchantLivePurchasePanelResponse;
import com.kuaishou.merchant.transaction.live.orderconfirmpanel.n;
import com.kuaishou.merchant.transaction.live.orderconfirmpanel.p;
import kk4.i;
import com.kuaishou.merchant.transaction.live.orderconfirmpanel.q;
import com.kuaishou.merchant.transaction.live.orderconfirmpanel.r;
import mm8.a;

public final class a0 implements b	// class@0007e6
{

    public void a0(){
       super();
    }
    public void a(a p0,Object p1){
       p0.i("LIVE_AUDIENCE_ORDER_CONFIRM_BOTTOM_ACTIVITY_TIP", new o(this, p1));
       p0.i("ID_ADDRESS_SERVICE_SUPPLIER", new s(this, p1));
       p0.i("LIVE_AUDIENCE_ORDER_CONFIRM_BOTTOM_ADDRESS_TIP_POSITION", new t(this, p1));
       p0.i("LIVE_AUDIENCE_ORDER_CONFIRM_BOTTOM_ADDRESS_TIP", new u(this, p1));
       p0.i("LIVE_AUDIENCE_ORDER_BOTTOM_BAR_SERVICE_MEDIA", new v(this, p1));
       p0.i("LIVE_BASE_CONTEXT", new w(this, p1));
       p0.h(OrderConfirmCommodity.class, new x(this, p1));
       p0.i("LIVE_AUDIENCE_ORDER_CONFIRM_PANEL_NUMBER_MEDIA", new y(this, p1));
       p0.i("LIVE_AUDIENCE_ORDER_CONFIRM_PANEL_FRAGMENT", new z(this, p1));
       p0.h(e.class, new e(this, p1));
       p0.i("LIVE_AUDIENCE_ORDER_CONFIRM_HIDE_BACK_ICON", new f(this, p1));
       p0.i("LIVE_AUDIENCE_CONFIRM_PANEL_FORCE_CLOSE", new g(this, p1));
       p0.i("LIVE_AUDIENCE_ORDER_CONFIRM_LOCAL_REFRESH", new h(this, p1));
       p0.i("LIVE_AUDIENCE_ORDER_CONFIRM_PART_REFRESH", new i(this, p1));
       p0.i("MERCHANT_FRAGMENT", new j(this, p1));
       p0.i("LIVE_AUDIENCE_ORDER_CONFIRM_SERVICE", new k(this, p1));
       p0.i("ID_PAGE_IDENTIFY_KEY", new l(this, p1));
       p0.i("REFRESH_PAGE_SINGLE_TASK_MANAGER", new m(this, p1));
       p0.h(MerchantLivePurchasePanelResponse.class, new n(this, p1));
       p0.i("LIVE_AUDIENCE_SKU_MANAGER", new p(this, p1));
       i oi = i.class;
       q oq = new q(this, p1);
       try{
          p0.h(oi, oq);
          p0.h(MerchantLivePurchasePanelFragment$b.class, new r(this, p1));
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
