package com.kuaishou.merchant.transaction.purchase.d0;
import mm8.b;
import java.lang.Object;
import com.smile.gifshow.annotation.provider.v2.a;
import com.kuaishou.merchant.transaction.purchase.MerchantPurchaseFragment$a;
import com.kuaishou.merchant.transaction.purchase.k;
import java.lang.String;
import com.smile.gifshow.annotation.provider.v2.Accessor;
import com.kuaishou.merchant.transaction.purchase.v;
import com.kuaishou.merchant.transaction.purchase.w;
import com.kuaishou.merchant.transaction.purchase.x;
import com.kuaishou.merchant.transaction.purchase.y;
import com.kuaishou.merchant.transaction.purchase.z;
import em4.a;
import com.kuaishou.merchant.transaction.purchase.a0;
import java.lang.Class;
import com.kuaishou.merchant.transaction.purchase.b0;
import com.kuaishou.merchant.transaction.purchase.c0;
import com.kuaishou.merchant.transaction.purchase.a;
import com.kuaishou.merchant.transaction.purchase.b;
import com.kuaishou.merchant.transaction.purchase.c;
import com.kuaishou.merchant.transaction.purchase.d;
import com.kuaishou.merchant.transaction.purchase.e;
import com.kuaishou.merchant.transaction.purchase.f;
import com.kuaishou.merchant.transaction.purchase.g;
import com.kuaishou.merchant.transaction.purchase.h;
import com.kuaishou.merchant.transaction.purchase.i;
import com.kuaishou.merchant.transaction.purchase.j;
import com.kuaishou.merchant.transaction.purchase.l;
import com.kuaishou.merchant.transaction.purchase.m;
import com.kuaishou.merchant.transaction.purchase.n;
import com.kuaishou.merchant.transaction.purchase.o;
import com.kuaishou.merchant.transaction.purchase.p;
import com.kuaishou.merchant.transaction.purchase.q;
import com.kuaishou.merchant.transaction.purchase.r;
import com.kuaishou.merchant.transaction.purchase.s;
import com.kuaishou.merchant.transaction.purchase.t;
import com.kuaishou.merchant.transaction.purchase.u;
import mm8.a;

public final class d0 implements b	// class@0008f8
{

    public void d0(){
       super();
    }
    public void a(a p0,Object p1){
       p0.i("address_id", new k(this, p1));
       p0.i("agreementV2", new v(this, p1));
       p0.i("announcement_info", new w(this, p1));
       p0.i("bottom_bar_prompt", new x(this, p1));
       p0.i("buy_button", new y(this, p1));
       p0.i("payment_method_info_list", new z(this, p1));
       p0.h(a.class, new a0(this, p1));
       p0.i("cross_border", new b0(this, p1));
       p0.i("follow_info", new c0(this, p1));
       p0.i("FRAGMENT", new a(this, p1));
       p0.i("can_sale", new b(this, p1));
       p0.i("is_pay_method_panel_fold", new c(this, p1));
       p0.i("LOG_PAGE_SERVICE", new d(this, p1));
       p0.i("bottom_bar_price_info", new e(this, p1));
       p0.i("notification", new f(this, p1));
       p0.i("notificationType", new g(this, p1));
       p0.i("ID_PAGE_IDENTIFY_KEY", new h(this, p1));
       p0.i("page_info_json", new i(this, p1));
       p0.i("page_module_info", new j(this, p1));
       p0.i("page_params", new l(this, p1));
       p0.i("poi_info", new m(this, p1));
       p0.i("product_info", new n(this, p1));
       p0.i("promotion_log_params", new o(this, p1));
       p0.i("recharge_config_list", new p(this, p1));
       p0.i("retention_msg", new q(this, p1));
       p0.i("show_provider_size", new r(this, p1));
       p0.i("transfer_params", new s(this, p1));
       t ot = new t(this, p1);
       String str = "upgrade_address_info";
       try{
          p0.i(str, ot);
          p0.h(MerchantPurchaseFragment$a.class, new u(this, p1));
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
